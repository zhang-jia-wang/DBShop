package com_changjing_fanlimei;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.VersionInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Changjing1 {
	//共有httpclient
	CloseableHttpClient httpClient = null;
	//成员变量
	public int id;
	public String receiverName;
	public String cellPhone;
	public String province;
	public String city;
	public String area;
	public String addressDetail;
	public double transportFee;
	public String id_address_detail;
	
	@BeforeClass
	public void startUp() {
		httpClient = HttpClients.createDefault();
	}

	@AfterClass
	public void tearDown() throws Exception {
		httpClient.close();
	}
	//get方法
	public String doGet(String url) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(url);
		get.addHeader("Content-Type", "application/json");
		CloseableHttpResponse response = httpClient.execute(get);
		HttpEntity entity = response.getEntity();
		String result= EntityUtils.toString(entity, "utf-8");
		EntityUtils.consume(entity);
		response.close();
		return result;
	}
	//post方法
	public void doPost(String url, JSONObject json) throws Exception{
		HttpPost httpPost = new HttpPost(url);
		httpPost.setHeader("Content-Type", "application/json");
		httpPost.addHeader("csrfToken", "csrfToken");
		HttpEntity entity = new StringEntity(json.toString());
		httpPost.setEntity(entity);
		CloseableHttpResponse response = httpClient.execute(httpPost);
		HttpEntity httpEntity = response.getEntity();
		String content = EntityUtils.toString(httpEntity,"utf-8");		
		System.out.println("执行结果：" + content);
		EntityUtils.consume(entity);
		response.close();
		
	}
	//登录
	@Test
	public void test01() throws Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		this.doPost("http://study-perf.qa.netease.com/common/fgadmin/login", user);
	}
	//获取地址
	@Test
	public void test02() throws ClientProtocolException, IOException {
		String result_address= this.doGet("http://study-perf.qa.netease.com/fgadmin/address/list");
		JSONObject json=JSONObject.fromObject(result_address);
		JSONObject address_list=json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
		
		province=address_list.getString("province");
		city=address_list.getString("city");
		area=address_list.getString("area");
		
		receiverName=address_list.getString("receiverName");
		cellPhone=address_list.getString("cellPhone");
		addressDetail=address_list.getString("addressDetail");
		id=address_list.getInt("id");
		
		id_address_detail="id="+id+"&addressDetail="+province+"_"+city+"_"+area+"&tm=1545203479533";
		System.out.println("收货地址信息:"+id_address_detail);
	}
	//获取运费
	@Test
	public void test03() throws ClientProtocolException, IOException {
		String result_fee= this.doGet("http://study-perf.qa.netease.com/common/getTransportFee?"+this.id_address_detail);
		JSONObject json = JSONObject.fromObject(result_fee);
		transportFee=json.getInt("result");
		System.out.println("运费:"+transportFee);
	}
	//提交
	@Test
	public void test04() throws Exception {
		JSONObject json_submit=new JSONObject();
		json_submit.element("skuIds","2,3");
		json_submit.element("skuNumbers","1,1");
		json_submit.element("stockIds","74966312,74966313");
		json_submit.element("receiverName",this.receiverName);
		json_submit.element("cellPhone",this.cellPhone);
		json_submit.element("addressDetail",this.addressDetail);
		json_submit.element("province",this.province);
		json_submit.element("city",this.city);
		json_submit.element("area",this.area);
		json_submit.element("voiceStatus",0);
		json_submit.element("needInvoice",0);
		json_submit.element("invoiceHead","");
		json_submit.element("transportFee",this.transportFee);
		json_submit.element("logisticsCompanyId",1);
		json_submit.element("accessSource","noSource");
		json_submit.element("accessDevice",0);	
		this.doPost("http://study-perf.qa.netease.com/fgadmin/orders/submit", json_submit);

	}

}

