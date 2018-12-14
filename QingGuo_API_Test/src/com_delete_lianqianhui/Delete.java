package com_delete_lianqianhui;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;
import net.sf.json.JSONObject;

public class Delete {
	@Test
	public void Delete_Test() throws IOException, Exception {
			CookieStore cookie = Common.getLoginCookie(null, null);
			JSONObject dele=new JSONObject();
			dele.element("id","82316007");//id 只能手动获取
			String result=HttpDriver.doPost("http://study-perf.qa.netease.com/fgadmin/address/delete", dele, cookie);
			JSONObject json=JSONObject.fromObject(result);
			assertEquals(json.getString("message"),"success");

	}
}
