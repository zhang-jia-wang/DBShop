package com_addressList_mengyuxuan;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.test.Common;
import com.edu.utils.ReadPro;

public class addressList {
	public void addressListTest() throws Exception, Exception {
		String url="/fgadmin/address/list/";
		CookieStore cookie=Common.getLoginCookie("20000000009", "netease123");
		String result=HttpDriver.doGet(ReadPro.getPropValue("URL")+url,cookie);
		System.out.println(result);
	}
	
	//查看地址列表
	@Test
	public void testSuccess() throws Exception {
		addressListTest();
	}
}
