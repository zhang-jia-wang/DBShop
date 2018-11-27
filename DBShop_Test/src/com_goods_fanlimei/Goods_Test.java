/**
 * 
 */
package com_goods_fanlimei;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/**
 * @author 张家旺
 *
 */
public class Goods_Test extends BaseTest {
	@Test
	public void goods_test() {
// 登录界面
		webtest.open("http://10.7.1.9:8686/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
// 商品管理
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
		webtest.click("xpath=//input[@value='16']");
		webtest.type("name=allEdit", "删除");
		webtest.click("xpath=//button[contains(.,' 提交操作')]");
		webtest.getAlert();
		webtest.alertAccept();
		// 搜索功能
		webtest.click("name=goods_name");
		webtest.type("name=goods_name", "酸奶");
		webtest.tapClick();
		webtest.click("xpath=//button[@type='submit']");


// 管理分类
		//商品分类
//		webtest.click("xpath=//a[@href='/DBShop/admin/goods/class']");
//		webtest.click("xpath=//a[contains(.,'管理分类')]/a[contains(.,'商品分类')]");

// 商品属性
// 商品品牌
// 商品评价
		// 商品咨询
		// 商品标签
		// 商品索引
	}
}
