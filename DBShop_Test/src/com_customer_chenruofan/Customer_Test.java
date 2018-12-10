package com_customer_chenruofan;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Customer_Test extends BaseTest {
	// ================================= 登 录
	// (√)=========================================================
	@BeforeClass
	public void login() throws Exception {
		webtest.open("http://localhost:8032/DBShop/admin");
		webtest.type("id=user_name", "admin");
		webtest.type("id=user_passwd", "111111");
		webtest.click("class=btn");
		webtest.click("xpath=//a[text()='客户管理 ']");
		webtest.click("xpath=//a[text()='管理客户']");
		assertTrue(webtest.ifContains("退出系统"));
	}

	@AfterClass
	public void quit() {
		webtest.quit();
	}

	// =================================搜索客户(√)========================================================
	@Test
	public void search_Customer() throws Exception {
		webtest.type("xpath=//input[@name='user_start_id']", "1");
		webtest.type("xpath=//input[@name='user_end_id']", "10");
		webtest.type("xpath=//input[@name='user_name']", "测试用户2");
		webtest.type("xpath=//input[@name='user_email']", "1111111112@qq.com");
		webtest.type("id=user_state", "开启");
		webtest.type("id=search_start_time", "2018-11-20");
		webtest.type("id=search_end_time", "2018-11-29");
		webtest.click("xpath=//button[contains(.,' 搜索')]");
	}

	// =================================编辑客户(√)========================================================
	@Test
	public void edit_Customer() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[1]");// td从1开始数，tr从0开始数a从1开始数
		webtest.click("xpath=//input[@id='user_email']");
		webtest.deleteContent("xpath=//input[@id='user_email']");
		webtest.type("xpath=//input[@id='user_email']", "1111@qq.com");
		webtest.click("xpath=//button[contains(.,' 保存客户信息')][2]");
	}

	// =================================余额充值(√)========================================================
	@Test
	public void balance_Recharge() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[2]");
		webtest.type("id=money_change_num", "50");
		webtest.type("id=money_pay_info", "备注");
		webtest.click("xpath=//button[contains(.,'提交充值')]");
	}

	// =================================积分调整========================================================
	@Test
	public void score_Adjust() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[3]");
		webtest.type("xpath=//input[@id='change_user_integral_num']", "10");
		webtest.type("xpath=//textarea[@id='integral_log_info']", "备注信息");
		webtest.click("xpath=//button[contains(.,'提交调整')]");
	}

	// =================================删除用户========================================================
	@Test
	public void delete_Customer() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[4]");
			webtest.alertCancel();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}

	}

	// =================================全选操作(模拟按键不生效)========================================================
	@Test
	public void select_All() throws Exception {
		try {
			webtest.click("xpath=//input[@id='select_checkbox_state_1']");
			webtest.type("id=allEdit", "删除客户");
			webtest.click("xpath=//button[@onclick='return editAllUser();']");
			webtest.alertCancel();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================新加客户(√)========================================================
	@Test(dataProvider = "excel_add_customer", dataProviderClass = NSDataProvider.class)
	public void add_Customer(String group_id, String user_name, String user_sex, String user_email, String password)
			throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加新客户')]");
		webtest.type("id=group_id", group_id);
		webtest.type("id=user_name", user_name);
		webtest.type("id=user_sex", user_sex);
		webtest.type("id=user_email", user_email);
		webtest.type("id=user_password", password);
		webtest.type("id=user_password_con", password);
		webtest.click("xpath=//button[contains(.,' 保存客户信息')]");
		Thread.sleep(2000);
	}

	// =================================编辑客户扩展信息(√)========================================================
	@Test
	public void edit_ExtendManage() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[7]/a[1]");
		webtest.click("id=field_title");
		webtest.deleteContent("id=field_title");
		webtest.type("id=field_title", "地址");
		webtest.click("xpath=//button[contains(.,' 保存客户扩展信息')]");
	}

	// =================================删除客户扩展信息(√)========================================================
	@Test
	public void delete_ExtendManage() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[1]/td[7]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================新加客户扩展信息(√)========================================================
	@Test
	public void add_ExtendManage() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加扩展信息')]");
		webtest.type("id=field_name", "testcase1");
		webtest.type("id=field_title", "测试用例1");
		webtest.type("xpath=//select[@class='span2']", "多行文本表单");
		webtest.click("xpath=//button[contains(.,' 保存客户扩展信息')]");
	}

	// =================================编辑客户组信息(√)========================================================
	@Test
	public void edit_CustomerGroup() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[1]");
		webtest.click("id=user_group_name");
		webtest.deleteContent("id=user_group_name");
		webtest.type("id=user_group_name", "***");
		webtest.click("xpath=//button[contains(.,' 保存客户组信息')]");
	}

	// =================================删除客户组信息(√)========================================================
	@Test
	public void delete_CustomerGroup() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
	
	}

	// =================================新加客户组信息(√)========================================================
	@Test
	public void add_CustomerGroup() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加客户组')]");
		webtest.type("id=field_name", "testcase1");
		webtest.type("id=user_group_name", "测试用例客户组1");
		webtest.type("id=integral_num_start", "300");
		webtest.type("id=integral_num_end", "500");
		webtest.click("xpath=//button[contains(.,' 保存客户组信息')]");
	}

	// =================================搜索充值记录(√)==========================================
	@Test
	public void search_Charge() throws Exception {
		webtest.type("id=paycheck_start_time", "2018-11-27");
		webtest.type("id=paycheck_end_time", "2018-12-04");
		webtest.type("id=pay_state", "充值完成");
		webtest.type("xpath=//input[@name='user_name']", "测试用户3");
		webtest.type("xpath=//input[@name='admin_name']", "admin");
		webtest.click("xpath=//button[contains(.,' 搜索')]");
	}

	// =================================删除充值记录(√)==========================================
	@Test
	public void delete_Charge() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[6]/td[8]/a[1]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================搜索余额记录(√)==========================================
	@Test
	public void search_Yue() throws Exception {
		webtest.type("id=money_start_change_time", "2018-11-27");
		webtest.type("id=money_end_change_time", "2018-12-04");
		webtest.type("id=money_pay_type", "充值");
		webtest.type("xpath=//input[@name='user_name']", "是陈静静啊");
		webtest.click("xpath=//button[contains(.,' 搜索')]");
	}

	// ================================编辑积分类型(√)==================================================
	@Test
	public void edit_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[4]/a[1]");
		webtest.click("xpath=//input[@id='integral_currency_con']");
		webtest.deleteContent("xpath=//input[@id='integral_currency_con']");
		webtest.type("xpath=//input[@id='integral_currency_con']", "2");
		webtest.click("xpath=//button[contains(.,' 保存积分类型')]");
		webtest.click("xpath=//a[contains(.,' 返回积分类型列表')]");
	}

	// =================================编辑规则(√)========================================================
	@Test
	public void edit_Regular() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[1]");
		webtest.click("xpath=//div[contains(@class,'tabs-left')]/ul[1]/li[3]/a[1]");
		webtest.click("id=shopping_amount");
		webtest.deleteContent("id=shopping_amount");
		webtest.type("id=shopping_amount", "400");
		webtest.click("xpath=//button[contains(.,' 保存积分规则')][2]");
	}

	// =================================删除规则(√)========================================================
	@Test
	public void delete_Regular() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
	}

	// =================================新加规则(√)========================================================
	@Test
	public void add_Regular() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加新规则')]");
		webtest.type("id=integral_rule_name", "测试用例1");
		webtest.click("xpath=//div[contains(@class,'tabs-left')]/ul[1]/li[3]/a[1]");
		webtest.type("id=shopping_amount", "1");
		webtest.type("id=integral_num", "2");
		webtest.click("xpath=//button[contains(.,' 保存积分规则')]");
	}
}
