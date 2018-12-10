package com_sell_zhangjiawang;
import com.webtest.core.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sell_Test extends BaseTest {
	@BeforeClass
	//��¼
	public void login() throws Exception {
	webtest.open("http://localhost:8032/DBShop/admin");
	webtest.type("name=user_name","admin");
	webtest.type("name=user_passwd","111111");
	webtest.click("xpath=//button[@class='btn']");
	}
	@AfterClass
	public void quit() {
		webtest.quit();
	}
	//click����
	public void click() throws Exception {
		webtest.click("xpath=//a[contains(.,'���۹��� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");	
	}
	public void search(String a ,String b,String c,String d,String e,String f,String g) throws Exception{
		webtest.type("xpath=//input[@class='span11']",a);
		webtest.type("xpath=//input[@name='buyer_name']",b);
		webtest.type("xpath=//input[@name='delivery_name']",c);
		webtest.click("xpath=//select[@id='order_state']");
		webtest.click("xpath=//option[contains(.,'������')]");
		webtest.type("xpath=//input[@id='order_start_price']",d );
		webtest.type("xpath=//input[@id='order_end_price']",e);
		webtest.type("xpath=//input[@id='search_start_time']" ,f);
		webtest.type("xpath=//input[@id='search_end_time']",g);
		webtest.click("xpath=//button[@class='btn btn-small btn-primary']");
	}
	@Test
	public void test01() throws Exception {
		click();
		search("123","��","��","10","100","2018-12-09","2018-12-20");
	}
	@Test
	public void test02() throws Exception {
		click();
		search("123","","��","10","100","2018-12-09","2018-12-20");
	}
	@Test
	public void test03() throws Exception {
		click();
		search("123","��","","10","100","2018-12-09","2018-12-20");
	}
	@Test
	public void test04() throws Exception {
		click();
		search("123","��","��","","100","2018-12-09","2018-12-20");
	}
	@Test
	public void test05() throws Exception{
		click();
		search("123","��","��","10","","2018-12-09","2018-12-20");
	}
	@Test
	public void test06() throws Exception {
		click();
		search("123","��","��","10","100","","2018-12-20");
	}
	@Test
	public void test07() throws Exception{
		click();
		search("123","��","��","10","100","2018-12-09","");
	}

	//���ٵ���������
	public void click1() throws Exception {
		webtest.click("xpath=//a[contains(.,'���۹��� ')]");
		webtest.click("xpath=//a[contains(.,'������')]");
	}
	
	public void imp(String h,String i) throws Exception {
		webtest.click("xpath=//a[@class='btn btn-primary btn-small']");
		webtest.type("xpath=//input[@id='export_start_time']", h);
		webtest.type("xpath=//input[@id='export_end_time']", i);
		webtest.click("xpath=//select[@id='express_id']");
		webtest.click("xpath=//option[contains(.,'ȫ����ʽ')]");
		webtest.click("xpath=//select[@id='order_ship_state']");
		webtest.click("xpath=//option[contains(.,'ȫ��״̬')]");
		webtest.click("xpath=//button[@class='btn btn-small btn-primary']");
	}
@Test
public void test08() throws Exception {
		click1();
		imp("2018-12-09","2018-12-12");
}
@Test
public void test09() throws Exception {
		click1();
		imp("","2018-12-12");
}
@Test
public void test10() throws Exception {
		click1();
		imp("2018-12-09","");
}
@Test
public void test11() throws Exception {
		click1();
		imp("","");
}

//��ѯ֧����¼
public void payhistory() throws Exception {
	webtest.click("xpath=//a[contains(.,'���۹��� ')]");
	webtest.click("xpath=//a[contains(.,'֧����¼')]");	
}
//��������


@Test
public void test12() throws Exception {
	payhistory();
}
//�˻�����
public void click3() throws Exception {
webtest.click("xpath=//a[contains(.,'���۹��� ')]");
webtest.click("xpath=//a[contains(.,'�˻�����')]");
}
public void retry(String a,String b,String c,String d,String e,String f,String g) throws Exception {
webtest.type("xpath=//input[@class='span11']",a);
webtest.click("xpath=//select[@name='refund_type']");
webtest.click(b);
webtest.click("xpath=//select[@name='refund_state']");
webtest.click(c);
webtest.type("xpath=//input[@id='start_refund_time']",d);
webtest.type("xpath=//input[@id='end_refund_time']",e);
webtest.type("xpath=//input[@id='start_finish_refund_time']",f);
webtest.type("xpath=//input[@id='end_finish_refund_time']",g);
webtest.click("xpath=//button[@class='btn btn-small btn-primary']");
}
@Test
public void test13() throws Exception {
	click3();
	retry("123","xpath=//option[contains(.,'�˿�˻����')]","xpath=//option[contains(.,'�ȴ�����')]","2018-12-09","2018-12-12","2018-12-09","2018-12-12");
}
@Test
public void test14() throws Exception {
	click3();
	retry("123","xpath=//option[contains(.,'�˿����')]","xpath=//option[contains(.,'�ȴ�����')]","2018-12-09","2018-12-12","2018-12-09","2018-12-12");
}
@Test
public void test15() throws Exception {
	click3();
	retry("123","xpath=//option[contains(@value,'3')]","xpath=//option[contains(.,'�ȴ�����')]","2018-12-09","2018-12-12","2018-12-09","2018-12-12");
}
@Test
public void test16() throws Exception {
	click3();
	retry("123","xpath=//option[contains(.,'�˿�˻����')]","//option[contains(.,'�˿�ɹ�')]","2018-12-09","2018-12-12","2018-12-09","2018-12-12");
}
@Test
public void test17() throws Exception {
	click3();
	retry("123","xpath=//option[contains(.,'�˿�˻����')]","xpath=//option[contains(.,'�˿�ܾ�')]","2018-12-09","2018-12-12","2018-12-09","2018-12-12");
}

}
