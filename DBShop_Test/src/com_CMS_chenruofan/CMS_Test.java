package com_CMS_chenruofan;

import java.util.Date;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CMS_Test extends BaseTest {
	Date date = new Date();

	// ================================= 登 录(√)====================================
	@BeforeClass
	public void login() throws Exception {
		webtest.open("http://localhost:8032/DBShop/admin");
		webtest.type("id=user_name", "admin");
		webtest.type("id=user_passwd", "111111");
		webtest.click("class=btn");
		webtest.click("xpath=//a[text()='CMS管理 ']");
		webtest.click("xpath=//a[text()='管理文章']");
	}

	@AfterClass
	public void quit() {
		webtest.quit();
	}

	// ===============================搜索文章(√)=======================================
	@Test
	public void Search_Txt() throws Exception {
		webtest.type("xpath=//input[@name='start_article_id']", "1");
		webtest.type("xpath=//input[@name='end_article_id']", "10");
		webtest.type("xpath=//select[@name='article_class_id']", "分类1");
		webtest.click("xpath=//button[contains(.,' 搜索')]");
	}

	// ===============================编辑文章(√)=======================================
	@Test
	public void Edit_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[1]");
		webtest.click("xpath=//input[@id='article_title']");
		webtest.deleteContent("xpath=//input[@id='article_title']");
		webtest.type("xpath=//input[@id='article_title']", "修改过后的测试标题" + date);
		webtest.click("xpath=//button[contains(.,' 保存文章信息')]");
	}

	// ===============================删除文章(√)=======================================
	@Test
	public void Delete_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[2]");
		webtest.alertAccept();
	}

	// ===============================预览文章(√)=======================================
	@Test
	public void View_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[7]/a[3]");
		// 切换为原来句柄
	}

	// ===============================新加文章()=======================================
	@Test
	public void Add_Arc() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加文章')]");
		webtest.type("xpath=//input[@id='article_title']", "测试用例文章的标题1" + date);
		webtest.type("xpath=//select[@id='article_class_id']", "分类1");
		webtest.click("xpath=//button[contains(.,' 保存文章信息')]");
	}

	// ===============================添加子类(√)=============================================
	@Test
	public void Add_Child() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[1]");
		webtest.type("xpath=//input[@id='article_class_name']", "测试用例添加的分类子类" + date);
		webtest.type("xpath=//select[@id='article_class_state']", "启用");
		webtest.click("xpath=//button[contains(.,' 保存分类')]");
	}

	// ===============================分类编辑(√)=============================================
	@Test
	public void Edit_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[2]");
		webtest.click("xpath=//input[@id='article_class_name']");
		webtest.deleteContent("xpath=//input[@id='article_class_name']");
		webtest.type("xpath=//input[@id='article_class_name']", "测试用例添加的分类子类" + date);
		webtest.click("xpath=//button[contains(.,' 保存分类')][2]");
	}

	// ===============================删除编辑(√)=============================================
	@Test
	public void Delete_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[3]");
		Thread.sleep(2000);
		try {
			webtest.alertCancel();
		} catch (NoAlertPresentException e) {
			System.out.println("===================喵喵喵=======================");
		}

	}

	// ===============================文章添加(√)=============================================
	@Test
	public void Add_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[4]");
		webtest.type("xpath=//input[@id='article_title']", "测试用例文章标题2" + date);
		webtest.type("xpath=//select[@id='article_class_id']", "分类1");
		webtest.enterFrame("ueditor_0");
		webtest.click("xpath=//body[contains(@class,view)]");
		webtest.type("xpath=//body[contains(@class,view)]", "随便输入一些内容作为标题吧顺便传个图片吧");
		webtest.leaveFrame();
		webtest.click("xpath=//button[contains(.,' 保存文章信息')]");
	}

	// ===============================分类预览(√)=============================================
	@Test
	public void View_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[2]/td[5]/a[5]");
		Thread.sleep(2000);
		webtest.switchWindow(0);
		// webtest.changeWindows("DBShop管理后台");
		webtest.click("xpath=//table/tbody/tr[3]/td[5]/a[5]");
		webtest.switchWindow(0);
	}

	// ===============================添加分类(√)=============================================
	@Test
	public void Add_Type() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加分类')]");
		webtest.type("xpath=//input[@id='article_class_name']", "是标题是标题是标题" + date);
		webtest.click("xpath=//button[contains(.,' 保存分类')]");
	}

	// ===============================单页文章编辑(√)=============================================
	@Test
	public void Edit_Piece_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[1]");
		webtest.click("xpath=//input[@id='single_article_title']");
		webtest.deleteContent("xpath=//input[@id='single_article_title']");
		webtest.type("xpath=//input[@id='single_article_title']", "哈哈哈哈哈哈哈" + date);
		webtest.click("xpath=//button[contains(.,' 保存单页文章信息')]");
	}

	// ===============================单页文章删除(√)=============================================
	@Test
	public void Delete_Piece_Type() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[2]");
		webtest.alertAccept();
	}

	// ===============================分类预览(√)=============================================
	@Test
	public void View_Piece_Txt() throws Exception {
		webtest.click("xpath=//table/tbody/tr[1]/td[5]/a[3]");
	}

	// ===============================添加单页文章(√)=============================================
	@Test
	public void Add_Piece_Type() throws Exception {
		webtest.click("xpath=//a[contains(.,' 添加单页文章')]");
		webtest.type("xpath=//input[@id='single_article_title']", "是标题是标题是标题111" + date);
		webtest.click("xpath=//button[contains(.,' 保存单页文章信息')]");
	}
}
