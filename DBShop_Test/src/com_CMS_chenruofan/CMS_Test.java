package com_CMS_chenruofan;

import java.util.Date;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CMS_Test extends BaseTest {
	Date date = new Date();

	// ================================= �� ¼(��)====================================
	@BeforeClass
	public void login() throws Exception {
		webtest.open("http://localhost:8032/DBShop/admin");
		webtest.type("id=user_name", "admin");
		webtest.type("id=user_passwd", "111111");
		webtest.click("class=btn");
		webtest.click("xpath=//a[text()='CMS���� ']");
		webtest.click("xpath=//a[text()='��������']");
	}

	@AfterClass
	public void quit() {
		webtest.quit();
	}

	// ===============================��������(��)=======================================
	@Test
	public void Search_Txt() throws Exception {
		webtest.type("xpath=//input[@name='start_article_id']", "1");
		webtest.type("xpath=//input[@name='end_article_id']", "10");
		webtest.type("xpath=//select[@name='article_class_id']", "����1");
		webtest.click("xpath=//button[contains(.,' ����')]");
	}

	// ===============================�༭����(��)=======================================
	@Test
	public void Edit_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[1]");
		webtest.click("xpath=//input[@id='article_title']");
		webtest.deleteContent("xpath=//input[@id='article_title']");
		webtest.type("xpath=//input[@id='article_title']", "�޸Ĺ���Ĳ��Ա���" + date);
		webtest.click("xpath=//button[contains(.,' ����������Ϣ')]");
	}

	// ===============================ɾ������(��)=======================================
	@Test
	public void Delete_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[2]");
		webtest.alertAccept();
	}

	// ===============================Ԥ������(��)=======================================
	@Test
	public void View_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[3]");
		// �л�Ϊԭ�����
	}

	// ===============================�¼�����()=======================================
	@Test
	public void Add_Arc() throws Exception {
		webtest.click("xpath=//a[contains(.,' �������')]");
		webtest.type("xpath=//input[@id='article_title']", "�����������µı���1" + date);
		webtest.type("xpath=//select[@id='article_class_id']", "����1");
		webtest.click("xpath=//button[contains(.,' ����������Ϣ')]");
	}

	// ===============================�������(��)=============================================
	@Test
	public void Add_Child() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[1]");
		webtest.type("xpath=//input[@id='article_class_name']", "����������ӵķ�������" + date);
		webtest.type("xpath=//select[@id='article_class_state']", "����");
		webtest.click("xpath=//button[contains(.,' �������')]");
	}

	// ===============================����༭(��)=============================================
	@Test
	public void Edit_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[2]");
		webtest.click("xpath=//input[@id='article_class_name']");
		webtest.deleteContent("xpath=//input[@id='article_class_name']");
		webtest.type("xpath=//input[@id='article_class_name']", "����������ӵķ�������" + date);
		webtest.click("xpath=//button[contains(.,' �������')][2]");
	}

	// ===============================ɾ���༭(��)=============================================
	@Test
	public void Delete_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[3]");
		Thread.sleep(2000);
		try {
			webtest.alertCancel();
		} catch (NoAlertPresentException e) {
			System.out.println("===================������=======================");
		}

	}

	// ===============================�������(��)=============================================
	@Test
	public void Add_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[4]");
		webtest.type("xpath=//input[@id='article_title']", "�����������±���2" + date);
		webtest.type("xpath=//select[@id='article_class_id']", "����1");
		webtest.enterFrame("ueditor_0");
		webtest.click("xpath=//body[contains(@class,view)]");
		webtest.type("xpath=//body[contains(@class,view)]", "�������һЩ������Ϊ�����˳�㴫��ͼƬ��");
		webtest.leaveFrame();
		webtest.click("xpath=//button[contains(.,' ����������Ϣ')]");
	}

	// ===============================����Ԥ��(��)=============================================
	@Test
	public void View_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[5]");
		Thread.sleep(2000);
		webtest.switchWindow(0);
		// webtest.changeWindows("DBShop�����̨");
		webtest.click("xpath=//table/tbody/tr[3]/td[5]/a[5]");
		webtest.switchWindow(0);
	}

	// ===============================��ӷ���(��)=============================================
	@Test
	public void Add_Type() throws Exception {
		webtest.click("xpath=//a[contains(.,' ��ӷ���')]");
		webtest.type("xpath=//input[@id='article_class_name']", "�Ǳ����Ǳ����Ǳ���" + date);
		webtest.click("xpath=//button[contains(.,' �������')]");
	}

	// ===============================��ҳ���±༭(��)=============================================
	@Test
	public void Edit_Piece_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[1]");
		webtest.click("xpath=//input[@id='single_article_title']");
		webtest.deleteContent("xpath=//input[@id='single_article_title']");
		webtest.type("xpath=//input[@id='single_article_title']", "��������������" + date);
		webtest.click("xpath=//button[contains(.,' ���浥ҳ������Ϣ')]");
	}

	// ===============================��ҳ����ɾ��(��)=============================================
	@Test
	public void Delete_Piece_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[2]");
		webtest.alertAccept();
	}

	// ===============================����Ԥ��(��)=============================================
	@Test
	public void View_Piece_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[3]");
	}

	// ===============================��ӵ�ҳ����(��)=============================================
	@Test
	public void Add_Piece_Type() throws Exception {
		webtest.click("xpath=//a[contains(.,' ��ӵ�ҳ����')]");
		webtest.type("xpath=//input[@id='single_article_title']", "�Ǳ����Ǳ����Ǳ���111" + date);
		webtest.click("xpath=//button[contains(.,' ���浥ҳ������Ϣ')]");
	}
}
