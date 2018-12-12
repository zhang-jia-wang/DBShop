package com_login_mengyuxuan;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.ReadPro;

import net.sf.json.JSONObject;

public class login{
	public void loginTest(String number,String pwd) {
		String url="/common/fgadmin/login";
		JSONObject user=new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", number);
		user.element("password",pwd);
		String result=HttpDriver.doPost(ReadPro.getPropValue("URL")+url, user);
		System.out.print(result);	
	}
	@Test
	public void test1() {
		this.loginTest("20000000009", "netease123");
	}
	
	
}
