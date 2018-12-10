package com_analysis_lianqianhui;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Analysis_Test extends BaseTest{

	@Test(priority=0)
	public void testlogin() throws InterruptedException {
		webtest.open("http://localhost:8032/DBShop/admin");
//		webtest.click("xpath=//a[contains(.,'登录')]");
		
		webtest.type("name=user_name","admin");
		webtest.type("name=user_passwd","111111");
		webtest.click("xpath=//button[contains(.,'后台登录')]");
		Thread.sleep(5000);
		}
	@Test(priority=1)
	public void test1() throws InterruptedException{
		System.out.println("开始执行");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'客户统计')]");
		System.out.println("结束执行");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void test2() throws InterruptedException {
		//客户排行
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'客户排行')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");

		webtest.type("name=group_id", "普通会员");
		
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		//订单统计
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'订单统计')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.type("name=group_id", "普通会员");
		
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void test4() throws InterruptedException {
		//销售概括（订单走势图）
		
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'销售概况')]");
		webtest.click("xpath=//a[contains(.,'订单走势图')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");   
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.type("name=group_id", "普通会员");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
		//销售走势图
		webtest.click("xpath=//a[contains(.,'销售额走势图')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.type("name=group_id", "普通会员");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
		
	}
	
	@Test(priority=5)
	public void test5() throws InterruptedException {
		//销售明细
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'销售明细')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.type("name=group_id", "普通会员");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public void test6() throws InterruptedException {
		//销售排行
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'销售排行')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.type("name=group_id", "普通会员");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void test7() throws InterruptedException {
		//分类销售分析
		webtest.click("xpath=//a[contains(.,'统计分析')]");
		webtest.click("xpath=//a[contains(.,'分类销售分析')]");
		webtest.click("xpath=//a[contains(.,'最近7天')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'最近30天')]");
		webtest.click("xpath=//select[@name='class_id']");
		webtest.click("xpath=//option[contains(.,'零食')]");
		webtest.type("name=group_id", "普通会员");
		Thread.sleep(3000);
		//日期范围在七天以内
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围在30天以内
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'查看')]");
		//日期范围大于30天
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'查看')]");
		Thread.sleep(3000);
			}
		}
