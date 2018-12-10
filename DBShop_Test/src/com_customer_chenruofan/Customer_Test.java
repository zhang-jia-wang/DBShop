package com_customer_chenruofan;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Customer_Test extends BaseTest {
	// ================================= �� ¼
	// (��)=========================================================
	@BeforeClass
	public void login() throws Exception {
		webtest.open("http://localhost:8032/DBShop/admin");
		webtest.type("id=user_name", "admin");
		webtest.type("id=user_passwd", "111111");
		webtest.click("class=btn");
		webtest.click("xpath=//a[text()='�ͻ����� ']");
		webtest.click("xpath=//a[text()='����ͻ�']");
		assertTrue(webtest.ifContains("�˳�ϵͳ"));
	}

	@AfterClass
	public void quit() {
		webtest.quit();
	}

	// =================================�����ͻ�(��)========================================================
	@Test
	public void search_Customer() throws Exception {
		webtest.type("xpath=//input[@name='user_start_id']", "1");
		webtest.type("xpath=//input[@name='user_end_id']", "10");
		webtest.type("xpath=//input[@name='user_name']", "�����û�2");
		webtest.type("xpath=//input[@name='user_email']", "1111111112@qq.com");
		webtest.type("id=user_state", "����");
		webtest.type("id=search_start_time", "2018-11-20");
		webtest.type("id=search_end_time", "2018-11-29");
		webtest.click("xpath=//button[contains(.,' ����')]");
	}

	// =================================�༭�ͻ�(��)========================================================
	@Test
	public void edit_Customer() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[1]");// td��1��ʼ����tr��0��ʼ��a��1��ʼ��
		webtest.click("xpath=//input[@id='user_email']");
		webtest.deleteContent("xpath=//input[@id='user_email']");
		webtest.type("xpath=//input[@id='user_email']", "1111@qq.com");
		webtest.click("xpath=//button[contains(.,' ����ͻ���Ϣ')][2]");
	}

	// =================================����ֵ(��)========================================================
	@Test
	public void balance_Recharge() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[2]");
		webtest.type("id=money_change_num", "50");
		webtest.type("id=money_pay_info", "��ע");
		webtest.click("xpath=//button[contains(.,'�ύ��ֵ')]");
	}

	// =================================���ֵ���========================================================
	@Test
	public void score_Adjust() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[3]");
		webtest.type("xpath=//input[@id='change_user_integral_num']", "10");
		webtest.type("xpath=//textarea[@id='integral_log_info']", "��ע��Ϣ");
		webtest.click("xpath=//button[contains(.,'�ύ����')]");
	}

	// =================================ɾ���û�========================================================
	@Test
	public void delete_Customer() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[2]/td[10]/a[4]");
			webtest.alertCancel();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}

	}

	// =================================ȫѡ����(ģ�ⰴ������Ч)========================================================
	@Test
	public void select_All() throws Exception {
		try {
			webtest.click("xpath=//input[@id='select_checkbox_state_1']");
			webtest.type("id=allEdit", "ɾ���ͻ�");
			webtest.click("xpath=//button[@onclick='return editAllUser();']");
			webtest.alertCancel();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================�¼ӿͻ�(��)========================================================
	@Test(dataProvider = "excel_add_customer", dataProviderClass = NSDataProvider.class)
	public void add_Customer(String group_id, String user_name, String user_sex, String user_email, String password)
			throws Exception {
		webtest.click("xpath=//a[contains(.,' ����¿ͻ�')]");
		webtest.type("id=group_id", group_id);
		webtest.type("id=user_name", user_name);
		webtest.type("id=user_sex", user_sex);
		webtest.type("id=user_email", user_email);
		webtest.type("id=user_password", password);
		webtest.type("id=user_password_con", password);
		webtest.click("xpath=//button[contains(.,' ����ͻ���Ϣ')]");
		Thread.sleep(2000);
	}

	// =================================�༭�ͻ���չ��Ϣ(��)========================================================
	@Test
	public void edit_ExtendManage() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[7]/a[1]");
		webtest.click("id=field_title");
		webtest.deleteContent("id=field_title");
		webtest.type("id=field_title", "��ַ");
		webtest.click("xpath=//button[contains(.,' ����ͻ���չ��Ϣ')]");
	}

	// =================================ɾ���ͻ���չ��Ϣ(��)========================================================
	@Test
	public void delete_ExtendManage() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[1]/td[7]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================�¼ӿͻ���չ��Ϣ(��)========================================================
	@Test
	public void add_ExtendManage() throws Exception {
		webtest.click("xpath=//a[contains(.,' �����չ��Ϣ')]");
		webtest.type("id=field_name", "testcase1");
		webtest.type("id=field_title", "��������1");
		webtest.type("xpath=//select[@class='span2']", "�����ı���");
		webtest.click("xpath=//button[contains(.,' ����ͻ���չ��Ϣ')]");
	}

	// =================================�༭�ͻ�����Ϣ(��)========================================================
	@Test
	public void edit_CustomerGroup() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[1]");
		webtest.click("id=user_group_name");
		webtest.deleteContent("id=user_group_name");
		webtest.type("id=user_group_name", "***");
		webtest.click("xpath=//button[contains(.,' ����ͻ�����Ϣ')]");
	}

	// =================================ɾ���ͻ�����Ϣ(��)========================================================
	@Test
	public void delete_CustomerGroup() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
	
	}

	// =================================�¼ӿͻ�����Ϣ(��)========================================================
	@Test
	public void add_CustomerGroup() throws Exception {
		webtest.click("xpath=//a[contains(.,' ��ӿͻ���')]");
		webtest.type("id=field_name", "testcase1");
		webtest.type("id=user_group_name", "���������ͻ���1");
		webtest.type("id=integral_num_start", "300");
		webtest.type("id=integral_num_end", "500");
		webtest.click("xpath=//button[contains(.,' ����ͻ�����Ϣ')]");
	}

	// =================================������ֵ��¼(��)==========================================
	@Test
	public void search_Charge() throws Exception {
		webtest.type("id=paycheck_start_time", "2018-11-27");
		webtest.type("id=paycheck_end_time", "2018-12-04");
		webtest.type("id=pay_state", "��ֵ���");
		webtest.type("xpath=//input[@name='user_name']", "�����û�3");
		webtest.type("xpath=//input[@name='admin_name']", "admin");
		webtest.click("xpath=//button[contains(.,' ����')]");
	}

	// =================================ɾ����ֵ��¼(��)==========================================
	@Test
	public void delete_Charge() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[6]/td[8]/a[1]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
		
	}

	// =================================��������¼(��)==========================================
	@Test
	public void search_Yue() throws Exception {
		webtest.type("id=money_start_change_time", "2018-11-27");
		webtest.type("id=money_end_change_time", "2018-12-04");
		webtest.type("id=money_pay_type", "��ֵ");
		webtest.type("xpath=//input[@name='user_name']", "�ǳ¾�����");
		webtest.click("xpath=//button[contains(.,' ����')]");
	}

	// ================================�༭��������(��)==================================================
	@Test
	public void edit_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[4]/a[1]");
		webtest.click("xpath=//input[@id='integral_currency_con']");
		webtest.deleteContent("xpath=//input[@id='integral_currency_con']");
		webtest.type("xpath=//input[@id='integral_currency_con']", "2");
		webtest.click("xpath=//button[contains(.,' �����������')]");
		webtest.click("xpath=//a[contains(.,' ���ػ��������б�')]");
	}

	// =================================�༭����(��)========================================================
	@Test
	public void edit_Regular() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[1]");
		webtest.click("xpath=//div[contains(@class,'tabs-left')]/ul[1]/li[3]/a[1]");
		webtest.click("id=shopping_amount");
		webtest.deleteContent("id=shopping_amount");
		webtest.type("id=shopping_amount", "400");
		webtest.click("xpath=//button[contains(.,' ������ֹ���')][2]");
	}

	// =================================ɾ������(��)========================================================
	@Test
	public void delete_Regular() throws Exception {
		try {
			webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[2]");
			webtest.alertAccept();
		}catch(NoAlertPresentException e) {
			System.out.println("NoAlertPresentException");
		}
	}

	// =================================�¼ӹ���(��)========================================================
	@Test
	public void add_Regular() throws Exception {
		webtest.click("xpath=//a[contains(.,' ����¹���')]");
		webtest.type("id=integral_rule_name", "��������1");
		webtest.click("xpath=//div[contains(@class,'tabs-left')]/ul[1]/li[3]/a[1]");
		webtest.type("id=shopping_amount", "1");
		webtest.type("id=integral_num", "2");
		webtest.click("xpath=//button[contains(.,' ������ֹ���')]");
	}
}
