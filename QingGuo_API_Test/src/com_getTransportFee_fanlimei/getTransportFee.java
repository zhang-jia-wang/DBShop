package com_getTransportFee_fanlimei;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;

import net.sf.json.JSONObject;

public class getTransportFee {
	public double transportFee;
	@Test
	public void getTransportFeeTest1() throws Exception {
//		String url=" /common/getTransportFee";
			String result_fee= HttpDriver.doGet("http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=%E6%B1%9F%E8%8B%8F%E7%9C%81_%E5%8D%97%E4%BA%AC%E5%B8%82_%E9%BC%93%E6%A5%BC%E5%8C%BA&tm=1540950077650");
			JSONObject json = JSONObject.fromObject(result_fee);
			transportFee=json.getInt("result");
			System.out.println("тк╥я:"+transportFee);		
	}
	
	@Test
	public void getTransportFeeTest2() throws Exception {
			String result_fee= HttpDriver.doGet("http://study-perf.qa.netease.com/common/getTransportFee?id=null&addressDetail=%E6%B1%9F%E8%8B%8F%E7%9C%81_%E5%8D%97%E4%BA%AC%E5%B8%82_%E9%BC%93%E6%A5%BC%E5%8C%BA&tm=1540950077650");
			System.out.println(result_fee);
			
	}
	
	@Test
	public void getTransportFeeTest3() throws Exception {
			String result_fee= HttpDriver.doGet("http://study-perf.qa.netease.com/common/getTransportFee?addressDetail=%E6%B1%9F%E8%8B%8F%E7%9C%81_%E5%8D%97%E4%BA%AC%E5%B8%82_%E9%BC%93%E6%A5%BC%E5%8C%BA&tm=1540950077650");
			System.out.println(result_fee);
			
	}
}
