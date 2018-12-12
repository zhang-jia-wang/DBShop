package com_system_songxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class System11_Test extends BaseTest {
	@BeforeClass
	public void admin() throws Exception {
		webtest.open("http://10.7.1.9:8032/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(6000);
	}

	@Test
	public void test01() throws Exception {
		// 1.对手机短信提醒设置进行验证，设置类型为“无类型”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'手机短信提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'无类型')]");
		webtest.click("xpath=//option[contains(.,'无类型')]");
		webtest.click("xpath=//button[contains(.,' 保存提醒设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test02() throws Exception {
		// 设置类型为“阿里大于短信”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'手机短信提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'阿里大于短信')]");
		webtest.click("xpath=//option[contains(.,'阿里大于短信')]");
		webtest.click("xpath=//button[contains(.,' 保存提醒设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test03() throws Exception {
		// 设置类型为“阿里云短信(消息服务)”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'手机短信提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'阿里云短信(消息服务)')]");
		webtest.click("xpath=//option[contains(.,'阿里云短信(消息服务)')]");
		webtest.click("xpath=//button[contains(.,' 保存提醒设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test04() throws Exception {
		// 设置类型为“阿里云短信(云通信)”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'手机短信提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'阿里云短信(云通信)')]");
		webtest.click("xpath=//option[contains(.,'阿里云短信(云通信)')]");
		webtest.click("xpath=//button[contains(.,' 保存提醒设置')]");
		assertTrue(webtest.ifContains("保存成功"));
		
	}



	@Test
	public void test05() throws Exception {
		// 验证基本信息
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.typeAndClear("name=admin_receive_email", "admin@qq.com");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test06() throws Exception {
		// 提交订单
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'提交订单')]");
		webtest.click("xpath=//input[@name='submit_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_submit_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test07() throws Exception {
		// 付款完成
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'付款完成')]");
		webtest.click("xpath=//input[@name='payment_finish_state']");
		webtest.click("xpath=//input[@name='buyer_payment_finish_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test08() throws Exception {
		// 发货完成
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'发货完成')]");
		webtest.click("xpath=//input[@name='ship_finish_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_ship_finish_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test09() throws Exception {
		// 交易完成
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'交易完成')]");
		webtest.click("xpath=//input[@name='transaction_finish_state']");
		webtest.click("xpath=//input[@name='buyer_transaction_finish_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test10() throws Exception {
		// 取消订单
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'取消订单')]");
		webtest.click("xpath=//input[@name='cancel_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_cancel_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test11() throws Exception {
		// 商品咨询
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='#system_g']");
		webtest.click("xpath=//input[@name='goods_ask_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test12() throws Exception {
		// 咨询回复
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'咨询回复')]");
		webtest.click("xpath=//input[@name='goods_ask_reply_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_reply_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test13() throws Exception {
		// 商品缺货
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'商品缺货')]");
		webtest.click("xpath=//input[@name='goods_stock_out_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test14() throws Exception {
		// 虚拟商品发货
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'消息提醒设置')]");
		webtest.click("xpath=//a[contains(.,'电子邮件提醒设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'虚拟商品发货')]");
		webtest.click("xpath=//input[@name='virtual_goods_send_state']");
		webtest.click("xpath=//input[@name='buyer_virtual_goods_send_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("保存成功"));
	}

	@Test
	public void test15() throws Exception {
		// 添加地区
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'地区管理')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,' 添加地区')]");
		webtest.type("name=region_name", "矿区");
		webtest.click("xpath=//button[contains(.,'保存')]");
		
	}

	@Test
	public void test16() throws Exception {
		// 查看下级并返回顶级
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'地区管理')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' 返回顶级')]");
		
	}

	@Test
	public void test17() throws Exception {
		// 查看下级返回上一级
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'地区管理')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' 返回上一级')]");
		
	}

	@Test
	public void test18() throws Exception {
		// 编辑地区
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'地区管理')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/span");
		webtest.typeAndClear("xpath=//input[@value='矿区']", "BB");
		webtest.click("xpath=//button[contains(.,' 保存')]");
		// 删除地区
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'地区管理')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'删除')]");
		webtest.alertAccept();
	}

	

	@Test
	public void test19() throws Exception {
		// 4.对库存状态进行验证，添加库存状态(设置状态类型为有货状态)
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'状态设置')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'库存状态')]");
		webtest.click("xpath=//a[contains(.,' 添加库存状态')]");
		webtest.click("xpath=//select[contains(@name,'state')]");
		webtest.click("xpath=//option[contains(.,'有货状态')]");
		webtest.type("name=stock_state_name", "有库存");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "300");
		webtest.click("xpath=//button[contains(.,' 保存库存状态信息')]");
		//编辑添加信息
		System.out.println(webtest.getText("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'编辑')]"));
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'编辑')]");
		webtest.typeAndClear("xpath=//input[contains(@name,'stock_state_name')]", "有物品");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "400");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//删除添加信息
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'删除')]");
		webtest.alertAccept();
		
	}
	@Test
	public void test20() throws Exception {
		// 5. 添加新管理员
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理员设置')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 添加新管理员')]");
		webtest.click("xpath=//select[contains(@name,'admin_group_id')]");
		webtest.click("xpath=//option[contains(@value,'1')]");
		webtest.type("name=admin_name", "admin11");
		webtest.type("name=admin_email", "admin11@126.com");
		webtest.type("name=admin_password", "111111");
		webtest.type("name=admin_password_con", "111111");
		webtest.click("xpath=//button[@type='submit']");	
	}
	@Test
	public void test21() throws Exception {
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理员设置')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		// 对编辑管理员进行验证
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'编辑')]");
		webtest.typeAndClear("name=admin_email", "admin@163.com");
		webtest.click("xpath=//button[@type='submit']");
		webtest.click("xpath=//a[contains(.,' 返回管理员列表')]");
		Thread.sleep(3000);
		// 删除管理员
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'删除')]");
		webtest.alertAccept();
	}
	@Test
	public void test22() throws Exception {
		// 6.对管理员组进行验证
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理员设置')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");
		Thread.sleep(3000);
		// 添加管理员组基本信息和权限设置(系统管理和管理员管理)
		webtest.click("xpath=//a[contains(.,'基本信息')]");
		webtest.click("xpath=//a[contains(.,' 添加管理员组')]");
		webtest.type("name=admin_group_name", "管理员组5");
		webtest.click("xpath=//a[contains(.,'权限设置')]");
		webtest.click("xpath=//input[contains(@id,'System')]");
		webtest.click("xpath=//input[contains(@id,'Admin')]");
		webtest.click("xpath=//button[@type='submit']");	
	}

	@Test
	public void test23() throws Exception {
		// 编辑管理员组
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'管理员设置')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");		
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'编辑')]");
		webtest.typeAndClear("name=admin_group_name", "admin");
		webtest.click("xpath=//a[contains(.,'权限设置')]");
		webtest.click("xpath=//input[@id='System']");
		webtest.click("xpath=//input[@id='Admin']");
		webtest.click("xpath=//button[@type='submit']");
		// 删除管理员组	
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'删除')]");
		webtest.alertAccept();
	}
	@Test
	public void test24() throws Exception {
		//在线客服样式设置(个性样式-1)
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[contains(.,'客服样式设置')]");
		Thread.sleep(3000);
		webtest.click("name=online_style");
		webtest.mouseoverElement("xpath=//option[contains(.,'个性样式-1')]");
		webtest.click("xpath=//option[contains(.,'个性样式-1')]");
		webtest.click("xpath=//button[@type='submit']");

	}
	
	@Test
	public void test25() throws Exception {
		//添加在线客服组
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[contains(.,'在线客服分组')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 添加在线客服组')]");
		webtest.typeAndClear("name=online_group_name","商家");
		webtest.typeAndClear("name=online_group_sort","200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//编辑在线客服组
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'编辑')]");
		webtest.typeAndClear("name=online_group_name","店家");
		webtest.typeAndClear("name=online_group_sort","255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);	
	}
	@Test
	public void test26() throws Exception {
		// 添加在线客服
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/online']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 添加在线客服')]");
		webtest.typeAndClear("name=online_name", "客服一");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'店家')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='skype']");
		webtest.typeAndClear("name=online_account", "admin@admin.com");
		webtest.typeAndClear("name=online_sort", "200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");

	}
	@Test
	public void test27() throws Exception {
		//编辑在线客服成员
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[contains(.,'在线客服成员')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'编辑')]");
		webtest.typeAndClear("name=online_name", "客服");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'店家')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='qq']");
		webtest.typeAndClear("name=online_account", "admin@qq.com");
		webtest.typeAndClear("name=online_sort", "255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test28() throws Exception {
		//删除在线客服成员
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[contains(.,'在线客服成员')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'删除')]");
		webtest.alertAccept();
		Thread.sleep(3000);
		// 删除在线客服分组
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'在线客服设置')]");
		webtest.click("xpath=//a[contains(.,'在线客服分组')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'删除')]");
		webtest.alertAccept();
		
	}

}
