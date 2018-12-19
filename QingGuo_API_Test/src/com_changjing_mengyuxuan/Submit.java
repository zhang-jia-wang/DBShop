package com.edu.changjing_mengyuxuan;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.test.Common;
import com.edu.utils.ReadPro;

import com_changjing.Port;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class Submit {
	Port port = new Port();

	public String address;
	public String province;
	public String city;
	public String area;
	public String addressDetail;
	public String receiverName;
	public String cellPhone;
	public int id;
	public String feeResult = null;
	JSONObject fee;
	CloseableHttpClient  httpClient=null;
	CloseableHttpResponse response = null;
	@BeforeClass
	public void http() {
	  httpClient = HttpClients.createDefault();		
	}
	
	@Test(priority=0)
	public void login() throws Exception {
		HttpPost httpPost = new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
		httpPost.addHeader("Content-Type", "application/json");
		StringEntity entity = new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000008\",\"password\":\"netease123\"}"
				,"utf-8");
		httpPost.setEntity(entity);
		response=httpClient.execute(httpPost);
		HttpEntity httpEntity = response.getEntity();
		System.out.println("登陆是："+EntityUtils.toString(httpEntity));
//		response.close();
		}
	
	@Test(priority=1)
	public void getAddress() throws Exception {
		HttpGet get = new HttpGet("http://study-perf.qa.netease.com/fgadmin/address/list");
		get.addHeader("Content-Type", "application/json");
		response = httpClient.execute(get);
		HttpEntity entity = response.getEntity();
		if(response!=null) {
			address = EntityUtils.toString(entity, "utf-8");
		}
		EntityUtils.consume(entity);
		System.out.println("收货地址信息："+address);


	}
	
	@Test(priority=2)
	public void getFee() throws Exception {
		JSONObject json = JSONObject.fromObject(this.address);
		JSONObject result = json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
		province = result.getString("province");
		city = result.getString("city");
		area = result.getString("area");
		addressDetail = result.getString("addressDetail");
		receiverName = result.getString("receiverName");
		cellPhone = result.getString("cellPhone");
		id=result.getInt("id");
		address = province+"_"+city+"_"+area;
		System.out.println(address);
//		String url = String.format("http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=%E6%B5%99%E6%B1%9F%E7%9C%81_%E6%9D%AD%E5%B7%9E%E5%B8%82_%E6%BB%A8%E6%B1%9F%E5%8C%BA&tm=1545124403726", id, addressDetail);
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail="+address;
		HttpGet get = new HttpGet(url);
		get.addHeader("Content-Type", "application/json");
		response = httpClient.execute(get);
		HttpEntity entity = response.getEntity();	
		if(entity!=null) {
			feeResult = EntityUtils.toString(entity, "UTF-8"); 
			fee = JSONObject.fromObject(feeResult);	
			
		}
		
		EntityUtils.consume(entity);
		System.out.println("运费："+feeResult);
		System.out.println(fee.getString("result"));
	
/*		int age=20;
		String hobby="sport";
		String.format("这个学生年龄%d，爱好是%s", age,hobby);*/
	}
	@Test(priority=3)
	public void submit() throws Exception {
		HttpPost httpPost = new HttpPost("http://study-perf.qa.netease.com/fgadmin/orders/submit");
		httpPost.addHeader("Content-Type", "application/json");
	
		
		JSONObject user1 = new JSONObject();
		user1.element("accessDevice", 0);
		user1.element("skuIds", "2,3");
		user1.element("skuNumbers", "1,1");
		user1.element("stockIds", "74966312,74966313");
		user1.element("receiverName", receiverName);
		user1.element("cellPhone", cellPhone);
		user1.element("addressDetail", addressDetail);
		user1.element("province", province);
		user1.element("city", city);
		user1.element("area", area);
		user1.element("voiceStatus", 0);
		user1.element("needInvoice", 0);
		user1.element("invoiceHead", "");
		user1.element("transportFee", fee.getString("result"));
		user1.element("logisticsCompanyId", 1);
		user1.element("accessSource", "noSource");
		
		StringEntity entity = new StringEntity(user1.toString(),"utf-8");
		httpPost.setEntity(entity);
		httpPost.addHeader("csrfToken", "csrfToken");
		response=httpClient.execute(httpPost);
		HttpEntity httpEntity = response.getEntity();
		System.out.println("提交结果是："+EntityUtils.toString(httpEntity));
	}

  
}
