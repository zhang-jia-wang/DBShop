package com_submit_songxiaoqian;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.test.Common;
import com.edu.utils.ReadPro;

import net.sf.json.JSONObject;

public class submit {
	public void submitTest() throws Exception {
		String url="/fgadmin/orders/submit";
		CookieStore cookie=Common.getLoginCookie("20000000009", "netease123");
		JSONObject user=new JSONObject();
		user.element("skuIds", "2,3");
		user.element("skuNumbers", "1,1");
		user.element("stockIds", "74966312,74966313");
		user.element("receiverName", "111");
		user.element("cellPhone", "11111111111");
		user.element("addressDetail", "1 �� �� 3 �� Ԫ");
		user.element("province", "�㽭ʡ");
		user.element("city", "������");
		user.element("area", "ԣ����");
		user.element("voiceStatus", "0");
		user.element("needInvoice", "0");
		user.element("invoiceHead", "");
		user.element("transportFee", "6.0");
		user.element("logisticsCompanyId", "1");
		user.element("accessSource", "noSource");
		user.element("accessDevice", "0");
		String result=HttpDriver.doPost(ReadPro.getPropValue("URL")+url, user, cookie);
		System.out.println(result);
	}
	@Test
	public void test7() throws Exception {
		this.submitTest();
	}
}
