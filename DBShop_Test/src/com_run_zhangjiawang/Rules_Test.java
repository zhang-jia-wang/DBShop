package com_run_zhangjiawang;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Rules_Test extends BaseTest{
	@BeforeClass
	//登录
	public void login() throws InterruptedException {
	webtest.open("http://localhost:8032/DBShop/admin");
	webtest.type("name=user_name","admin");
	webtest.type("name=user_passwd","123456");
	webtest.click("xpath=//button[@class='btn']");
	}
	
//信息
	public void information(String a,String b,String c) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'运营管理 ')]");
	webtest.click("xpath=//a[contains(.,'优惠促销规则')]");
	webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
	webtest.type("class=span3",a);
	webtest.type("class=span6" ,b);
	webtest.type("xpath=//input[@id='promotions_start_time']","2018-11-30");
	webtest.type("xpath=//input[@id='promotions_end_time']","2018-12-9");
	webtest.click("xpath=//select[@id='rule_state']");
	webtest.click("name=coupon_state");	
	webtest.click(c);	
	}
	//促销规则
	public void cu(String d) throws InterruptedException {
		webtest.click("xpath=//a[@href='#promotions_c']");	
		webtest.type("xpath=//input[@class='span2']","100");
		webtest.type("xpath=//input[@class='span1']","10");
		webtest.click("xpath=//select[@class='span1']");
		webtest.click(d);
		}
	//优惠客户组
	public void group(String e,String f) throws InterruptedException {
	webtest.click("xpath=//a[@href='#promotions_b']");
	webtest.click("xpath=//select[@id='promotions_user_type']");
	webtest.click(e);
	webtest.click(f);
	}
	//优惠商品
			public void goods(String g,String h) throws InterruptedException {
			webtest.click("xpath=//a[@href='#promotions_d']");
			webtest.click("xpath=//select[@id='promotions_goods_type']");
			webtest.click(g);
			webtest.click(h);
			}
	//保存
			public void save() throws InterruptedException {
			webtest.click("xpath=//button[@class='btn btn-small btn-primary']");
			}
	//删除
			public void delete() throws InterruptedException {
		     webtest.click("xpath=//table/tbody/tr[last()]/td[5]/a[contains(.,'删除')]");//找到最后一个删除，对应删除的行，对应的列，删除，都是/
			 webtest.alertAccept();
			 Thread.sleep(4000);
			}
	@Test	
	public void test1() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'开启')]");
		cu("xpath=//option[contains(.,'%')]");
		group("xpath=//option[@value='all_user']","");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
	
}
	@Test	
	public void test2() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'关闭')]");
		cu("xpath=//option[contains(.,'元')]");
		group("xpath=//option[@value='all_user']","");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
}
	@Test	
	public void test3() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'开启')]");
		cu("xpath=//option[contains(.,'元')]");
		group("xpath=//option[@value='user_group']","xpath=//label[contains(.,'普通会员')]");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
}
	@Test	
	public void test4() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'开启')]");
		cu("xpath=//option[contains(.,'元')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[@value='class_goods']","xpath=//label[contains(.,'零食')]"); 
		save();
		delete();
}
	@Test	
	public void test5() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'开启')]");
		cu("xpath=//option[contains(.,'元')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[contains(.,'商品品牌')]","xpath=//label[contains(.,'阿迪达斯')]"); 
		save();
		delete();
}
	@Test	
	public void test6() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'开启')]");
		cu("xpath=//option[contains(.,'元')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[contains(.,'商品品牌')]","xpath=//label[contains(.,'耐克')]"); 
		save();
		delete();
}

	
	//优惠券的使用
//基本信息
	public void message(String g,String h) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'运营管理 ')]");
	webtest.click("xpath=//a[@href='/DBShop/admin/goods/coupon']");
	webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
	webtest.type("xpath=//input[@class='span3']",g);
	webtest.type("xpath=//input[@class='span6']", h);
	webtest.click("xpath=//select[@id='coupon_state']");
	webtest.click("xpath=//option[contains(.,'开启')]");	
}
//使用规则
public void rule(String i,String j) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'优惠规则')]");
	webtest.type("xpath=//input[@id='shopping_amount']",i);
	webtest.type("xpath=//input[@class='span1']",j);
	Thread.sleep(1000);
}
//获取规则
public void getrule(String k,String l,String m) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'获取规则')]");
	webtest.type("xpath=//input[@id='get_coupon_start_time']",k);
	webtest.type("xpath=//input[@id='get_coupon_end_time']",l);
	webtest.click("xpath=//select[@id='get_coupon_type']");
	webtest.click("xpath=//option[@value='buy']");
	Thread.sleep(2000);
	webtest.type("xpath=//input[@id='get_shopping_amount']",m);
	webtest.click("xpath=//select[@id='get_user_type']");
	webtest.click("xpath=//option[@value='all_user']");
	Thread.sleep(2000);
	webtest.click("xpath=//select[@id='get_goods_type']");
	webtest.click("xpath=//option[@value='all_goods']");
	Thread.sleep(2000);
}
//使用规则
public void userule(String n,String o) throws InterruptedException {
	webtest.click("xpath=//a[@href='#coupon_d']");
	webtest.type("xpath=//input[@id='coupon_start_time']",n);
	webtest.type("xpath=//input[@id='coupon_end_time']",o);
	webtest.click("xpath=//select[@id='coupon_goods_type']");
}	
//保存
public void sav() throws InterruptedException {
	webtest.click("xpath=//button[@type='submit']");
}
//删除
public void del() throws InterruptedException {
    webtest.click("xpath=//table/tbody/tr[last()-1]/td[10]/a[contains(.,'删除')]");//找到最后一个删除，对应删除的行，对应的列，删除，都是/
	 webtest.alertAccept();
	 Thread.sleep(4000);
	}
@Test
public void test7() throws InterruptedException {
	message("毛衣","这个毛衣很暖的");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test8() throws InterruptedException {
	message("!!!!","这个毛衣很暖的");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}

@Test
public void test9() throws InterruptedException {
	message("毛衣","这个毛衣很暖的");
	rule("10","100");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test10() throws InterruptedException {
	message("毛衣","");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test11() throws InterruptedException {
	message("毛衣","");
	rule("100","10");
	getrule("2018-12-12","2018-12-9","100");
	userule("2018-12-12","2018-12-9");
	sav();
	del();
}

@Test
public void test12() throws InterruptedException {
	message("毛衣","这个毛衣很暖的");
	rule("100","10");
	getrule("","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}


//专题设置
//点击按钮操作
public void click() throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'运营管理 ')]");
	webtest.mouseoverElement("xpath=//a[contains(.,'专题管理')]");
	webtest.click("xpath=//a[contains(.,'专题设置')]");
	webtest.click("xpath=//i[@class='icon-plus icon-white']");
}
//信息
public void inf(String a,String b) throws InterruptedException {
	webtest.type("xpath=//input[@class='span10']",a);
	webtest.type("xpath=//input[@class='span5']",b);
	webtest.click("xpath=//select[@class='span4']");
	webtest.click("xpath=//option[@value='default']");
	Thread.sleep(2000);
	webtest.click("xpath=//select[@class='span2']");
	webtest.click("xpath=//option[@value='1']");
}
//搜索引擎
public void search(String c,String d,String e) throws InterruptedException {
	webtest.click("xpath=//a[@href='#theme_c']");
	webtest.type("xpath=//input[@class='span12']",c);
	webtest.type("xpath=//textarea[@id='theme_keywords']",d);
	webtest.type("xpath=//textarea[@id='theme_description']",e);
}
//保存
public void sa() throws InterruptedException {
	webtest.click("xpath=//button[@type='submit']");
}
//删除
public void de() throws InterruptedException {
	    webtest.click("xpath=//table/tbody/tr[last()-1]/td[7]/a[contains(.,'删除')]");//找到最后一个删除，对应删除的行，对应的列，删除，都是/
		 webtest.alertAccept();
		 Thread.sleep(4000);		
}
@Test
public void test13() throws InterruptedException {
	click();
	inf("双1212","促销活动");
	search("优惠","打折","双12疯狂来袭");
	sa();
	de();
}
@Test
public void test14() throws InterruptedException {
	click();
	inf("!!!!!!","促销");
	search("优惠","打折","双12疯狂来袭");
	sa();
	de();
}





}

	

