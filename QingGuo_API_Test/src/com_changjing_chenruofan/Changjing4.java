package com_changjing_chenruofan;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.test.Common;

import net.sf.json.JSONObject;
public class Changjing4 {
			CloseableHttpClient httpClient = null;
			@BeforeClass
			public void startUp() {
				httpClient = HttpClients.createDefault();
			}
			@AfterClass
			public void tearDown() throws Exception {
				httpClient.close();
			}
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
			@Test
			public void changjing_4() throws Exception {
				String skulisturl = "http://study-perf.qa.netease.com/common/skuList/";	
				String feeurl = "http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=江苏省_南京市_鼓楼区&tm=1540950833079";
				String result = HttpDriver.doGet(skulisturl);
				String response = HttpDriver.doGet(feeurl);
				JSONObject json = JSONObject.fromObject(response);
				int free = json.getInt("result");
				System.out.println("运费："+free);
				//提交订单
				JSONObject user1 = new JSONObject();
				user1.element("skuIds", "2,3");
				user1.element("skuNumbers", "1,1");
				user1.element("stockIds", "74966312,74966313");
				user1.element("receiverName", "111");
				user1.element("cellPhone", "11111111111");
				user1.element("addressDetail", "1 栋 栋 3 单 元");
				user1.element("province", "浙江省");
				user1.element("city", "杭州市");
				user1.element("area", "裕华区");
				user1.element("voiceStatus", "0");
				user1.element("needInvoice", "0");
				user1.element("invoiceHead", "");
				user1.element("transportFee", "6.0");
				user1.element("logisticsCompanyId", "1");
				user1.element("accessSource", "noSource");
				user1.element("accessDevice", "0");
				String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
				CookieStore cookieStore = Common.getLoginCookie("20000000000", "netease123");
				HttpDriver.doPost(url, user1, cookieStore);
				System.out.println("--------上面执行的是Testsubmit--------");
			}
	}


