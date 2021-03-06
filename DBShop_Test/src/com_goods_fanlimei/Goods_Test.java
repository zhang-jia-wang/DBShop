/**
 * 
 */
package com_goods_fanlimei;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/**
 * @author 张家旺
 *
 */
public class Goods_Test extends BaseTest {
	
	@BeforeClass
	// ---------------------------登录界面（完成）-----------------------------
	public void login() throws Exception 
	{
		webtest.open("http://10.7.1.9:8686/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "123456");
		webtest.click("xpath=//button[@type='submit']");		
	}
	
	
	@AfterClass
	public void quit() {
		webtest.quit();
	}

	@Test
	// ---------------------------管理商品（完成）-------------------------------
	public void test01()throws Exception
	{		
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		// 管理商品
		webtest.click("xpath=//a[contains(.,'管理商品')]");
		// 添加商品
		webtest.click("xpath=//a[contains(.,'添加商品')]");
		webtest.type("name=goods_name", "酸奶");
		webtest.type("name=goods_shop_price", "10");
		webtest.type("name=goods_type", "实物商品");
		webtest.click("xpath=//button[contains(.,' 保存商品')]");
		// 提交操作
		webtest.click("xpath=//input[@value='10']");
		webtest.type("name=allEdit", "删除");
		webtest.click("xpath=//button[contains(.,' 提交操作')]");
		webtest.getAlert();
		webtest.alertAccept();
		// 搜索功能
		webtest.click("name=goods_name");
		webtest.type("name=goods_name", "酸奶");
		webtest.tapClick();
		webtest.click("xpath=//button[@type='submit']");
	}
	
	@Test
	//---------------------------------- 管理分类（完成）------------------------------------
	public void test02() throws Exception 
	{	
		//商品分类
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理分类')]");
		webtest.click("xpath=//a[contains(.,'商品分类')]");
		webtest.click("xpath=//a[contains(.,' 添加分类')]");
		webtest.type("name=class_name", "零食类");
		webtest.type("name=class_state", "启用");
		webtest.click("xpath=//button[@type='submit']");
		//前台侧边设置
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理分类')]");
		webtest.click("xpath=//a[contains(.,'前台侧边设置')]");
		webtest.click("xpath=//a[contains(.,' 添加侧边显示')]");
		webtest.type("name=frontside_name", "零食类");
		webtest.click("xpath=//button[@type='submit']");
	}	
	
	@Test
	//--------------------------- -------商品属性(完成）-------------------------------
	public void test03() throws Exception 
	{	
		//属性分组
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'商品属性')]");
		webtest.click("xpath=//a[contains(.,'属性分组')]");
		webtest.click("xpath=//a[contains(.,' 添加属性组')]");
		webtest.type("name=attribute_group_name", "尺寸");
		webtest.click("xpath=//button[@type='submit']");
		//属性
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'商品属性')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/goods/attribute']");
		webtest.click("xpath=//a[contains(.,' 添加属性')]");
		webtest.type("name=attribute_group_id", "尺寸");
		webtest.type("name=attribute_group_id", "单选");
		webtest.type("name=attribute_name", "均码");
		webtest.click("xpath=//button[@type='submit']");
	}	
		
	@Test
	// ----------------------------------商品品牌（完成）-------------------------------	
	public void test04()throws Exception
	{	
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/goods/brand']");
		webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
		webtest.type("name=brand_name", "DELL");
		webtest.click("xpath=//button[@type='submit']");
		
	}
		
	@Test
	// ----------------------------------商品评价（完成）-------------------------------
	public void test05()throws Exception
	{	
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.click("xpath=//a[contains(.,'商品评价')]");
	}
		
	
	@Test
	//---------------------------------- 商品咨询（完成）------------------------------
	public void test06()throws Exception
	{	
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.click("xpath=//a[contains(.,'商品咨询')]");
	}	
		
	
	@Test
	//---------------------------------- 商品标签（完成）------------------------------
	public void test07() throws Exception
	{
		//商品标签分组
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'商品标签')]");
		webtest.click("xpath=//a[contains(.,'商品标签分组')]");
		webtest.click("xpath=//a[contains(.,' 添加标签组')]");
		webtest.type("name=tag_group_name", "新品推荐");
		webtest.click("xpath=//button[@type='submit']");
		//特定商品标签
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'商品标签')]");
		webtest.click("xpath=//a[contains(.,'特定商品标签')]");
		webtest.click("xpath=//a[contains(.,' 添加特定商品标签')]");
		webtest.type("name=tag_type", "手机端首页商品");
		webtest.type("name=tag_name", "热卖品");
		webtest.click("xpath=//button[@type='submit']");
//		driver.findElement(By.xpath("//label[contains(.,'请选择标签类型')]"));
		assertTrue(webtest.ifContains("请选择标签类型"));
		//普通商品标签
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'商品标签')]");
		webtest.click("xpath=//a[contains(.,'普通商品标签')]");
		webtest.click("xpath=//a[contains(.,' 添加普通商品标签')]");
		webtest.type("name=tag_group_id", "尺码");
		webtest.type("name=tag_name", "S码");
		webtest.click("xpath=//button[@type='submit']");	
	}

	@Test
	// ----------------------------------商品索引(完成)-------------------------------
	public void test08()throws Exception
	{	
		webtest.click("xpath=//a[contains(.,'商品管理 ')]");
		webtest.click("xpath=//a[contains(.,'商品索引')]");
		webtest.click("xpath=//input[@name='goods_index']");
		webtest.click("xpath=//button[contains(.,'点击更新商品索引')]");
		webtest.click("xpath=//button[contains(.,' 保存索引设置')]");
		webtest.alertAccept();
	}
}
