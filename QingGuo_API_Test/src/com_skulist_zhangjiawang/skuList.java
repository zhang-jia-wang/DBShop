package com_skulist_zhangjiawang;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.Checker;
import com.edu.utils.ReadPro;

public class skuList {
	public void skuListTest() throws Exception{
		String url="/common/skuList/";
		String result=HttpDriver.doGet(ReadPro.getPropValue("URL")+url);
		Checker cherker=new Checker(result);
		System.out.println(result);
	}
	@Test
	public void test() throws Exception {
		skuListTest();
	}
}
