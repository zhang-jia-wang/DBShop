package com_login_mengyuxuan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.ReadPro;
import com.webtest.sendEmail.WebTestListener2;

import net.sf.json.JSONObject;

//@Listeners(WebTestListener2.class)
public class LoginTest {
	String subUrl = "/common/fgadmin/login";
	String result=null;
	public String loginTest(String phoneNumber,String password) throws Exception {		
		JSONObject user1 = new JSONObject();
		user1.element("phoneArea", "86");
		user1.element("phoneNumber",phoneNumber);
		user1.element("password", password);
		result = HttpDriver.doPost(ReadPro.getPropValue("URL")+subUrl,user1);
		System.out.println(result);
		return result;
	}

	@Test
	//�ɹ���¼
	public void TestLoginSuccess() throws Exception {
		loginTest("20000000000","netease123");
	}

	@Test
	//ʧ�ܵ�¼���������
	public void TestLoginFailed1() throws Exception {
		loginTest("20000000000","netease1232");
	}
	
	@Test
	//ʧ�ܵ�¼���������
	public void TestLoginFailed2() throws Exception {
		loginTest("20000000000","    ");
	}

	@Test
	//ʧ�ܵ�¼���˺ſ���
	public void TestLoginFailed3() throws Exception {
		loginTest("  ","netease123");
	}
	
	@Test
	//ʧ�ܵ�¼���˺Ŵ���
	public void TestLoginFailed4() throws Exception {
		loginTest("200000000171","netease123");
	}
}
