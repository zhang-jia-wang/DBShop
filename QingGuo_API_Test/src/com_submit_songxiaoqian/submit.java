package com_submit_songxiaoqian;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.test.Common;
import com.edu.utils.Checker;
import com.edu.utils.ReadPro;

import net.sf.json.JSONObject;

public class submit {
	Checker check;
	String result=null;
	public String submitTest(String skuIds,String skuNumbers,String stockIds,String receiverName,String cellPhone,
			String addressDetail,String province,String city,String area,String voiceStatus,String needInvoice,
			String invoiceHead,String transportFee,String logisticsCompanyId,String accessSource,String accessDevice) throws Exception {
		String url="/fgadmin/orders/submit";
		CookieStore cookie=Common.getLoginCookie("20000000009", "netease123");
		JSONObject user=new JSONObject();
		user.element("skuIds", skuIds);
		user.element("skuNumbers", skuNumbers);
		user.element("stockIds", stockIds);
		user.element("receiverName", receiverName);
		user.element("cellPhone", cellPhone);
		user.element("addressDetail", addressDetail);
		user.element("province", province);
		user.element("city", city);
		user.element("area", area);
		user.element("voiceStatus", voiceStatus);
		user.element("needInvoice", needInvoice);
		user.element("invoiceHead", invoiceHead);
		user.element("transportFee", transportFee);
		user.element("logisticsCompanyId", logisticsCompanyId);
		user.element("accessSource", accessSource);
		user.element("accessDevice", accessDevice);
		result=HttpDriver.doPost(ReadPro.getPropValue("URL")+url, user, cookie);
		check=new Checker(result);
		System.out.println("------------提交操作------------");
		System.out.println(result);
		return result;
	}
	@Test
	public void test01() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test02() throws Exception {
		result=this.submitTest("","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test03() throws Exception {
		result=this.submitTest("2,3","","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test04() throws Exception {
		result=this.submitTest("2,3","1,1","","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test05() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test06() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test07() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test08() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test09() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test10() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","","0","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test11() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","","0","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test12() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","","","6.0","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test13() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","","1","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test14() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","","noSource","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test15() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","","0");
		check.verifyTextPresent("message");
	}
	@Test
	public void test16() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","");
		check.verifyTextPresent("message");
	}
	@Test
	public void test17() throws Exception {
		result=this.submitTest("2,3","1,1","74966312,74966313","AA","12345678912","1 栋 栋 3 单 元","浙江省","杭州市","滨江区","0","0","","6.0","1","noSource","0");
		check.verifyXpath("message", "success");
	}
	
}
