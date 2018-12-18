package com_changjing;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.ReadPro;


public class SkuListTest {
	Checker check;
	String subUrl = "/common/skuList/";
	String result=null;

	public String skuList() throws Exception {
		 result = HttpDriver.doGet(ReadPro.getPropValue("URL")+subUrl);
		check = new Checker(result);
		System.out.println(result);
		return result;
	}
	
	public String skuListById(String goodsId) throws Exception {
	
		Map map = new HashMap();
		map.put("goodsId", goodsId);
		map.put("addressDetail", "");
		String result = HttpDriver.doGet(ReadPro.getPropValue("URL")+subUrl,map);
		check = new Checker(result);
		System.out.println(result);
		return result;
	}
	
//	获取所有商品的sku列表成功
	@Test
	public void TestSkuList1() throws Exception {
		result = skuList();
		check.verifyTextPresent("message");
	}

	@Test
	public void TestSkuList2() throws Exception {
		result = skuList();
		check.verifyXpath("message", "success");
	}
	
	
//	获取goodsId=1的商品sku信息成功
	@Test
	public void TestSkuListById1() throws Exception {
		result=this.skuListById("1");
		check.verifyXpath("message", "success");
	}
//	获取goodsId=2的商品sku信息成功	
	@Test
	public void TestSkuListById2() throws Exception {
		result=this.skuListById("2");
		check.verifyXpath("message", "success");
	}
//	获取goodsId=3的商品sku信息成功	
	@Test
	public void TestSkuListById3() throws Exception {
		result=this.skuListById("3");
		check.verifyXpath("message", "success");
	}
	
	/*@Test
	public void TestSkuListByWrongIdType() throws Exception {
		String goodsId=URLEncoder.encode("\"1\"","UTF-8");
		 result=this.skuListById(goodsId);
		check.verifyXpath("message", "Failed");
	}*/

}
