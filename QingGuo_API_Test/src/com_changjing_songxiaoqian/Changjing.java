package com_changjing_songxiaoqian;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.ReadPro;
public class Changjing {

	public class changjing1 {
		String url="/common/skuList/";
		Checker cherker;
		public void skuListTest() throws Exception{	
			String result=HttpDriver.doGet(ReadPro.getPropValue("URL")+url);
			cherker=new Checker(result);
			System.out.println(result);
		}
		public void skuListById(String goodsId) throws Exception {
			Map map=new HashMap();
			map.put("goodsId", goodsId);
			map.put("addressDetail", "");
			String result=HttpDriver.doGet(ReadPro.getPropValue("URL")+url,map);
			cherker=new Checker(result);
			System.out.println(result);
		}
		@Test
		public void test1() throws Exception {
			skuListTest();
		}
		@Test
		public void test2() throws Exception {
			this.skuListById("1");
		}
		@Test
		public void test3() throws Exception {
			this.skuListById("2");
		}
		@Test
		public void test4() throws Exception {
			this.skuListById("3");
		}
	}

}
