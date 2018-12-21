package com_changjing_lianqianhui;
import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;
import com.edu.core.HttpDriver;
import com.edu.test.Common;
import net.sf.json.JSONObject;

public class Changjing {
	public double transportFee;
	public int id;
	public String receiverName;
	public String cellPhone;
	public String province;
	public String city;
	public String area;
	public String addressDetail;
	public String skuIds;
	public String skuNumbers;
	public String stockIds;
	@Test
	public void test1_login() {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000009");
		user.element("password", "netease123");
		
		String result=HttpDriver.doPost("http://study-perf.qa.netease.com/common/fgadmin/login", user);
		JSONObject json=JSONObject.fromObject(result);
		
	}
	@Test
	public void test2_list() throws Exception {

		CookieStore cookie=Common.getLoginCookie(null,null);
		String url = "http://study-perf.qa.netease.com/fgadmin/address/list";
		String result=HttpDriver.doGet(url,cookie);
		
		
		JSONObject json=JSONObject.fromObject(result);
	}
	@Test
	public void test3_news() throws Exception {
		CookieStore cookie = Common.getLoginCookie(null, null);
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";

		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "重庆市");
		address.element("city", "万州区");
		address.element("area", "");
		address.element("addressDetail", "中山路125号");
		String result = HttpDriver.doPost(url, address,cookie);
		System.out.println(result);
	}
	@Test
	public void test4_Fee() throws Exception {
		String result_fee= HttpDriver.doGet("http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=%3F%3F%3F_%3F%3F%3F_&tm=1540949547854");
		JSONObject json = JSONObject.fromObject(result_fee);
		transportFee=json.getInt("result");
		System.out.println("运费:"+transportFee);
	}
	@Test
	public void test5_submit() throws Exception {
		CookieStore cookieStore=Common.getLoginCookie(null, null);
		JSONObject jsonPost=new JSONObject();
		jsonPost.element("skuIds", skuIds);
		jsonPost.element("skuNumbers", skuNumbers);
		jsonPost.element("stockIds", stockIds);
		jsonPost.element("receiverName", receiverName);
		jsonPost.element("cellPhone", cellPhone);
		jsonPost.element("addressDetail", addressDetail);
		jsonPost.element("province", province);
		jsonPost.element("city", city);
		jsonPost.element("voiceStatus", 0);
		jsonPost.element("needInvoice", 1);
		jsonPost.element("invoiceHead", "");
		jsonPost.element("transportFee", 0);
		jsonPost.element("logisticsCompanyId", "1");
		jsonPost.element("accessSource", "noSource");
		jsonPost.element("accessDevice", "0");
		HttpDriver.doPost("http://study-perf.qa.netease.com/fgadmin/orders/submit", jsonPost, cookieStore);
	}
}

