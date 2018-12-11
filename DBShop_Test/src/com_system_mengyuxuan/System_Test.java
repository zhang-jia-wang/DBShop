package com_system_mengyuxuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class System_Test extends BaseTest{
	@BeforeClass
	public void Login() throws Exception  {
		webtest.open("http://10.7.1.9:8686/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@AfterClass
	public void quit() {
		webtest.quit();
	}	
	
	
	
	
	
	//验证基本信息填写的要求（系统设置中）
	@Test
	public void test12()  throws Exception{	
		//3.基本信息——网站名称填写“DBShop电子商务网站”，扩展名称填写“网站中的战斗机”,系统时区选择“哈尔滨”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'系统设置')]");
		webtest.click("xpath=//a[contains(.,'基本信息')]");
		webtest.typeAndClear("xpath=//input[@id='shop_name']","DBShop电子商务网站");
		webtest.typeAndClear("xpath=//input[@id='shop_extend_name']","网站中的战斗机");
		webtest.click("xpath=//select[@id='dbshop_timezone']");
		webtest.click("xpath=//option[contains(@value,'Asia/Harbin')]");
		webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
		Thread.sleep(1000);
		assertTrue(webtest.ifContains("保存成功"));
	}
	
	
	// 验证内容信息填写的要求（系统设置中）
	@Test
	public void test15() throws Exception  {	
		//3.内容信息——商品品质保证内容为“本店所售商品，货真价实，绝无次品，各位新老客户可放心购买！”，商品售后服务“全国联保”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'系统设置')]");
		webtest.click("xpath=//a[contains(.,'内容信息')]");
		webtest.typeAndClear("xpath=//textarea[@name='goods_quality']","本店所售商品，货真价实，绝无次品，各位新老客户可放心购买！ ");
		webtest.enterFrame("ueditor_0");
		webtest.click("xpath=//body[contains(@class,view)]");
		webtest.typeAndClear("xpath=//body[contains(@class,view)]","全国联保");
		webtest.leaveFrame();
		webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}	
	
	
	//测试验证码设置的要求（系统设置中）
	@Test
	public void test17() throws Exception  {
	//2.验证码设置——全部选择，时间设置为180
	webtest.click("xpath=//a[contains(.,'系统管理 ')]");
	webtest.click("xpath=//a[contains(.,'系统设置')]");
	webtest.click("xpath=//a[contains(.,'验证码设置')]");
	Boolean C = webtest.isChecked("xpath=//input[@name='user_register_captcha']");
	if(C==false) {
		webtest.click("xpath=//input[@name='user_register_captcha']");
	}else {
	webtest.click("xpath=//input[@name='user_register_captcha']");
	webtest.click("xpath=//input[@name='user_login_captcha']");
	webtest.click("xpath=//input[@name='goods_ask_captcha']");
	webtest.click("xpath=//input[@name='phone_user_register_captcha']");
	webtest.click("xpath=//select[contains(@name,'phone_captcha_time')]");
	webtest.mouseoverElement("xpath=//option[contains(@value,'180')]");
	webtest.click("xpath=//option[contains(@value,'180')]");
	webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
	assertTrue(webtest.ifContains("保存成功"));
	}
}
	// 验证邮件服务器设置（系统设置中）
	@Test
	public void test190() throws Exception  {	
	//3.邮件服务器——必填项均填写
	webtest.click("xpath=//a[contains(.,'系统管理 ')]");
	webtest.click("xpath=//a[contains(.,'系统设置')]");
	webtest.click("xpath=//a[contains(.,'邮件服务器')]");
	Boolean F = webtest.isChecked("xpath=//input[contains(@id,'email_service_state')]");
	if(F==false) {
			webtest.click("xpath=//input[contains(@id,'email_service_state')]");
	}else {
			webtest.typeAndClear("xpath=//input[@id='send_from_mail']","DBShop_test@126.com");
			webtest.typeAndClear("xpath=//input[@id='send_name']","孟YUXUAN");		
			webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
			assertTrue(webtest.ifContains("保存成功"));
	}
}	
	
	
	//验证商品设置（系统设置中）
		@Test
		public void test191() throws Exception  {				
			//1.商品设置——商品分享选择百度分享(文字式)，商品货号前缀为DBG
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'系统设置')]");
			webtest.click("xpath=//a[contains(.,'商品设置')]");
			webtest.click("xpath=//select[@id='dbshop_goods_share']");
			webtest.mouseoverElement("xpath=//option[contains(@value,'/baidu/text.php')]");
			webtest.click("xpath=//option[contains(@value,'/baidu/text.php')]");
			webtest.typeAndClear("xpath=//input[@id='dbshop_goods_sn_prefix']","DBG");
			webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}	
		
		
		// 验证统计设置（系统设置中）
		@Test
		public void test194() throws Exception {		
			//1.统计设置——百度统计账户为13313310702——百度统计密码为0702
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'系统设置')]");
			webtest.click("xpath=//a[@href='#system_i']");
			webtest.click("xpath=//select[@name='shop_tongji_type']");
			webtest.mouseoverElement("xpath=//option[contains(.,'百度统计')]");
			webtest.click("xpath=//option[contains(.,'百度统计')]");
			webtest.typeAndClear("xpath=//input[@id='shop_tongji_baidu_user']", "13313310702");
			webtest.typeAndClear("xpath=//input[@id='shop_tongji_baidu_passwd']", "0702");
			webtest.click("xpath=//button[contains(.,' 保存系统设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}
		
		
		// 验证订单设置（系统设置中）
		@Test
		public void test196() throws Exception {	
			//1.订单设置——选择送货时间显示启用——选择退货申请启用 
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'系统设置')]");
			webtest.click("xpath=//a[contains(.,'订单设置')]");
			Boolean K =webtest.isChecked("xpath=//input[@id='user_order_refund']");
			if(K==false) {
					webtest.click("xpath=//input[@id='user_order_refund']");
			}else {
				Boolean L=webtest.isChecked("xpath=//input[@id='user_shipping_date']");
				if(L==false) {
						webtest.click("xpath=//input[@id='user_shipping_date']");
				}else {
					webtest.click("xpath=//button[contains(.,' 保存系统设置')]");	
					assertTrue(webtest.ifContains("保存成功"));
				}
			}
		}
	
	
	
	//验证基本优化设置（性能优化中） 
		@Test
		public void test20()  throws Exception{		
			//基本优化——勾选前台Gzip压缩框
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'性能优化')]");
			webtest.click("xpath=//a[contains(.,'基本优化')]");
			Boolean A= webtest.isChecked("xpath=//input[@id='dbshop_front_compress']");
			if(A==false) {
				webtest.click("xpath=//input[@id='dbshop_front_compress']");
			}else {
			webtest.click("xpath=//button[contains(.,' 保存性能优化设置')]");
			assertTrue(webtest.ifContains("保存成功"));
			}
		}
		
		
		//验证前台缓存设置要求（性能优化中） 
		@Test
		public void test21()  throws Exception{	
			//前台缓存状态选择“请选择”——前台缓存时间填写2分钟
					webtest.click("xpath=//a[contains(.,'系统管理 ')]");
					webtest.click("xpath=//a[contains(.,'性能优化')]");
					webtest.click("xpath=//a[contains(.,'前台缓存')]");
					webtest.click("xpath=//select[@id='front_cache_state']");
					webtest.mouseoverElement("xpath=//option[contains(.,'请选择')]");
					webtest.click("xpath=//option[contains(.,'请选择')]");
					webtest.typeAndClear("xpath=//input[@id='front_cache_time']", "2");
					webtest.click("xpath=//select[@id='front_cache_time_type']");
					webtest.mouseoverElement("xpath=//option[contains(.,'分钟')]");
					webtest.click("xpath=//option[contains(.,'分钟')]");
					webtest.click("xpath=//button[contains(.,' 保存性能优化设置')]");
					assertTrue(webtest.ifContains("保存成功"));
		}
		@Test
		public void test22()  throws Exception{	
			//前台缓存状态选择“请选择”——前台缓存时间填写1小时
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'性能优化')]");
			webtest.click("xpath=//a[contains(.,'前台缓存')]");
			webtest.click("xpath=//select[@id='front_cache_state']");
			webtest.mouseoverElement("xpath=//option[contains(.,'开启')]");
			webtest.click("xpath=//option[contains(.,'开启')]");
			webtest.typeAndClear("xpath=//input[@id='front_cache_time']", "1");
			webtest.click("xpath=//select[@id='front_cache_time_type']");
			webtest.mouseoverElement("xpath=//option[contains(.,'小时')]");
			webtest.click("xpath=//option[contains(.,'小时')]");
			webtest.click("xpath=//button[contains(.,' 保存性能优化设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}
		
	
		//验证cdn图片加速设置要求（性能优化中）
		@Test
		public void test23()  throws Exception{	
			//cdn加速状态选择关闭——前加速域名填写后末尾+“/”
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'性能优化')]");
			webtest.click("xpath=//a[contains(.,'cdn图片加速')]");
			webtest.click("xpath=//input[@value='false']");
			webtest.typeAndClear("xpath=//input[@id='front_cdn_domain']","http://localhost:8032/DBShop/admin/optimization/");
			webtest.click("xpath=//button[contains(.,' 保存性能优化设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}
		@Test
		public void test24()  throws Exception{	
			//cdn加速状态选择关闭——前加速域名填写正确
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'性能优化')]");
			webtest.click("xpath=//a[contains(.,'cdn图片加速')]");
			webtest.click("xpath=//input[@value='false']");
			webtest.typeAndClear("xpath=//input[@id='front_cdn_domain']","http://localhost:8032/DBShop/admin/optimization");
			webtest.click("xpath=//button[contains(.,' 保存性能优化设置')]");
			assertTrue(webtest.ifContains("保存成功"));
			Thread.sleep(2000);
		}

	
     // 验证基本设置要求（在附件设置中）
	@Test
	public void test30()  throws Exception{		
		//基本优化——图片附件最大尺寸设置为3000——图片附件允许上传类型勾选jpg
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'基本设置')]");
		webtest.typeAndClear("xpath=//input[@id='upload_image_max']", "3000");
		Boolean A= webtest.isChecked("xpath=//input[@name='jpg']");
		if(A==false) {
			webtest.click("xpath=//input[@name='jpg']");
		}else {
			Boolean B= webtest.isChecked("xpath=//input[@value='gif']");
			if(B==true) {
				webtest.click("xpath=//input[@value='gif']");
			}else {
				Boolean C= webtest.isChecked("xpath=//input[@value='png']");
				if(C==true) {
					webtest.click("xpath=//input[@value='png']");
				}else {
					Boolean D= webtest.isChecked("xpath=//input[@value='bmp']");
					if(D==true) {
						webtest.click("xpath=//input[@value='bmp']");
					}else {
						Boolean E= webtest.isChecked("xpath=//input[@value='ico']");
						if(E==true) {
							webtest.click("xpath=//input[@value='ico']");
						}else {
							webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
							assertTrue(webtest.ifContains("保存成功"));
						}
					}
				}
			}
		
		}
	}
	@Test
	public void test31()  throws Exception{		
		//基本优化——图片附件最大尺寸设置为2000——图片附件允许上传类型不勾选
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'基本设置')]");
		webtest.typeAndClear("xpath=//input[@id='upload_image_max']", "2000");
		Boolean A= webtest.isChecked("xpath=//input[@name='jpg']");
		if(A==true) {
			webtest.click("xpath=//input[@name='jpg']");
		}else {
			Boolean B= webtest.isChecked("xpath=//input[@value='gif']");
			if(B==true) {
				webtest.click("xpath=//input[@value='gif']");
			}else {
				Boolean C= webtest.isChecked("xpath=//input[@value='png']");
				if(C==true) {
					webtest.click("xpath=//input[@value='png']");
				}else {
					Boolean D= webtest.isChecked("xpath=//input[@value='bmp']");
					if(D==true) {
						webtest.click("xpath=//input[@value='bmp']");
					}else {
						Boolean E= webtest.isChecked("xpath=//input[@value='ico']");
						if(E==true) {
							webtest.click("xpath=//input[@value='ico']");
						}else {
							webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
							assertTrue(webtest.ifContains("保存成功"));
						}
					}
				}
			}
		
		}
	}
	
	
	//验证商品图片设置要求（在附件设置中） 
	@Test
	public void test32()  throws Exception{		
		//缩微图宽度空不填写——图片添加水印勾选——图片命名方式“图片原始名称”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'商品图片')]");
		webtest.typeAndClear("xpath=//input[@name='goods_thumb_width']", "  ");
		Boolean A= webtest.isChecked("xpath=//input[@name='goods_watermark_state']");
		if(A==false) {
			webtest.click("xpath=//input[@name='goods_watermark_state']");
		}else {
		webtest.click("xpath=//select[@id='goods_image_name_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'图片原始名称')]");
		webtest.click("xpath=//option[contains(.,'图片原始名称')]");
		webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
		assertTrue(webtest.ifContains("保存成功"));
		}
	}
	@Test
	public void test33()  throws Exception{		
		//缩微图宽度400——图片添加水印不勾选——图片命名方式“图片原始名称”
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'商品图片')]");
		webtest.typeAndClear("xpath=//input[@name='goods_thumb_width']", "400");
		Boolean A= webtest.isChecked("xpath=//input[@name='goods_watermark_state']");
		if(A==true) {
			webtest.click("xpath=//input[@name='goods_watermark_state']");
		}else {
		webtest.click("xpath=//select[@id='goods_image_name_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'图片原始名称')]");
		webtest.click("xpath=//option[contains(.,'图片原始名称')]");
		webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
		assertTrue(webtest.ifContains("保存成功"));
		}
	}
	
	
	//验证水印设置要求（在附件设置中）
	@Test
	public void test34()  throws Exception{		
		//水印设置状态选择关闭
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'水印设置')]");
		webtest.click("xpath=//select[@id='watermark_state']");
		webtest.mouseoverElement("xpath=//option[contains(.,'开启')]");
		webtest.click("xpath=//option[contains(.,'开启')]");
		webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}
	@Test
	public void test35()  throws Exception{		
		//水印设置状态选择关闭
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'水印设置')]");
		webtest.click("xpath=//select[@id='watermark_state']");
		webtest.mouseoverElement("xpath=//option[contains(.,'关闭')]");
		webtest.click("xpath=//option[contains(.,'关闭')]");
		webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
		assertTrue(webtest.ifContains("保存成功"));
		Thread.sleep(1000);
	}
	
	
	//验证存储方式设置要求（在附件设置中）
	@Test
	public void test37()  throws Exception{		
		//商品图片选择七牛云存储
		webtest.click("xpath=//a[contains(.,'系统管理 ')]");
		webtest.click("xpath=//a[contains(.,'附件设置')]");
		webtest.click("xpath=//a[contains(.,'存储方式')]");
		webtest.click("xpath=//select[@id='storage_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'七牛云存储')]");
		webtest.click("xpath=//option[contains(.,'七牛云存储')]");
		webtest.click("xpath=//button[contains(.,' 保存附件设置')]");
		assertTrue(webtest.ifContains("保存成功"));
	}

	
	//验证基本设置要求（在客户设置中）
		@Test
		public void test40()  throws Exception{		
			//基本设置——客户注册状态选择关闭——注册关闭显示信息填写——客户注册默认组为请选择
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'基本设置')]");		
			webtest.click("xpath=//input[@name='user_register_state']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'暂时关闭注册功能！')]", "关闭关闭注册功能！");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'请选择')]");
			webtest.click("xpath=//option[contains(.,'请选择')]");
			webtest.click("xpath=//button[contains(.,' 保存客户设置')]");
			assertTrue(webtest.ifContains("请选择客户默认组！"));
		}
		@Test
		public void test41()  throws Exception{		
			//基本设置——客户注册状态选择开启——注册关闭显示信息填写——客户注册默认组为普通会员
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'基本设置')]");
			webtest.click("xpath=//select[@class='span2 valid']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'暂时关闭注册功能！')]", "要暂时关闭关闭注册功能！");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'普通会员')]");
			webtest.click("xpath=//option[contains(.,'普通会员')]");
			webtest.click("xpath=//button[contains(.,' 保存客户设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}
		@Test
		public void test42()  throws Exception{		
			//基本设置——客户注册状态选择关闭——注册关闭显示信息填写——客户注册默认组为普通会员
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'基本设置')]");
			webtest.click("xpath=//select[@class='span2 valid']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'暂时关闭注册功能！')]", "要暂时关闭关闭注册功能！");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'普通会员')]");
			webtest.click("xpath=//option[contains(.,'普通会员')]");
			webtest.click("xpath=//button[contains(.,' 保存客户设置')]");
			assertTrue(webtest.ifContains("保存成功"));
		}
		
		
		// 验证注册与登录设置要求（在客户设置中）
		@Test
		public void test43()  throws Exception{		
			//注册与登录设置——系统注册项设置电子邮箱空选——电话号码选择启用——可用登录名方式全部勾选——第三方登录设置项电子邮箱选择启用（未开启第三方登录）
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'注册与登录')]");
			Boolean A= webtest.isChecked("xpath=//input[@name='register_email_state']");
			if(A==true) {
				webtest.click("xpath=//input[@name='register_email_state']");
			}else {
				Boolean B= webtest.isChecked("xpath=//input[@name='register_phone_state']");
				if(B==false) {
					webtest.click("xpath=//input[@name='register_phone_state']");
				}else {
					Boolean C= webtest.isChecked("xpath=//input[@name='login_email_state']");
					if(C==false) {
						webtest.click("xpath=//input[@name='login_email_state']");
					}else {
						Boolean D= webtest.isChecked("xpath=//input[@name='other_login_email_state']");
						if(D==false) {
							webtest.click("xpath=//input[@name='other_login_email_state']");
						}else {
							webtest.click("xpath=//button[contains(.,' 保存客户设置')]");
							assertTrue(webtest.ifContains("保存成功"));
						}
					}
				}
			}
		}
		@Test
		public void test44()  throws Exception{		
			//注册与登录设置——系统注册项设置电子邮箱选择启用——电话号码勾选——可用登录名方式勾选电子邮件——第三方登录设置项电子邮箱选择启用（已开启第三方登录
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'注册与登录')]");
			Boolean A= webtest.isChecked("xpath=//input[@name='register_email_state']");
			if(A==false) {
				webtest.click("xpath=//input[@name='register_email_state']");
			}else {
				Boolean B= webtest.isChecked("xpath=//input[@name='register_phone_state']");
				if(B==false) {
					webtest.click("xpath=//input[@name='register_phone_state']");
				}else {
					Boolean C= webtest.isChecked("xpath=//input[@name='login_email_state']");
					if(C==false) {
						webtest.click("xpath=//input[@name='login_email_state']");
					}else {
						Boolean D= webtest.isChecked("xpath=//input[@name='other_login_email_state']");
						if(D==false) {
							webtest.click("xpath=//input[@name='other_login_email_state']");
						}else {
							webtest.click("xpath=//button[contains(.,' 保存客户设置')]");
							assertTrue(webtest.ifContains("保存成功"));
						}
					}
				}
			}
		}
		
		
		//验证第三方登录设置要求（在客户设置中）
		@Test
		public void test45() throws Exception{	
//			第三方登录
//			前台顶部选择不显示——QQ互联登录选择关闭——微信登录内选择关闭—— 
//			微信登录(网站)选择关闭——支付宝登录选择关闭
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'客户设置')]");
			webtest.click("xpath=//a[contains(.,'第三方登录')]");
			Boolean A= webtest.isChecked("xpath=//input[@name='front_other_login_show']");
			if(A==true) {
				webtest.click("xpath=//input[@name='front_other_login_show']");
			}else {
				webtest.click("xpath=//input[@name='qq_login_state']");
				webtest.click("xpath=//input[@name='weixin_phone_login_state']");
				webtest.click("xpath=//input[@name='weixin_login_state']");
				webtest.click("xpath=//input[@name='alipay_login_state']");
				Thread.sleep(2000);
			}			
		}
			
		
		//验证添加货币功能（在货币设置中）
		@Test
		public void test50()  throws Exception{		
			//添加货币——货币选择“美元”——货币名称“美元”——小数位数“4”——货币汇率“6.8362”——货币状态启用
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//a[contains(.,' 添加货币')]");
			webtest.click("xpath=//span[contains(.,'安道尔比塞塔')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "美元");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "美元");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "6.8362");
			webtest.click("xpath=//option[contains(.,'启用')]");
			webtest.click("xpath=//button[contains(.,' 保存货币信息')]");
			assertTrue(webtest.ifContains("货币设置"));
		}
		@Test
		public void  test51()  throws Exception{		
			//添加货币——货币选择“美元”——货币名称空——小数位数“4”——货币汇率“6.8362”——货币状态启用
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//a[contains(.,' 添加货币')]");
			webtest.click("xpath=//span[contains(.,'安道尔比塞塔')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "美元");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", " ");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "6.8362");
			webtest.click("xpath=//option[contains(.,'启用')]");
			webtest.click("xpath=//button[contains(.,' 保存货币信息')]");
			assertTrue(webtest.ifContains("货币名称不能为空"));
		}
		@Test
		public void  test52()  throws Exception{		
			//添加货币——货币选择“英镑”——货币名称“英镑”——小数位数“4”——货币汇率“6.8362”——货币状态禁用
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//a[contains(.,' 添加货币')]");
			webtest.click("xpath=//span[contains(.,'安道尔比塞塔')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "英镑");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "英镑");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "8.7141");
			webtest.click("xpath=//option[contains(.,'禁用')]");
			webtest.click("xpath=//button[contains(.,' 保存货币信息')]");
			assertTrue(webtest.ifContains("货币设置"));
			Thread.sleep(2000);
		}
		@Test
		public void  test53()  throws Exception{		
			//添加货币——货币选择“英镑”——货币名称“英镑”——小数位数“8”——货币汇率“6.8362”——货币状态禁用
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//a[contains(.,' 添加货币')]");
			webtest.click("xpath=//span[contains(.,'安道尔比塞塔')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "英镑");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "英镑");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "8");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "8.7141");
			webtest.click("xpath=//option[contains(.,'禁用')]");
			webtest.click("xpath=//button[contains(.,' 保存货币信息')]");
			assertTrue(webtest.ifContains("位数最大为6！"));
		}
		
		
		//验证编辑键的功能（货币设置中）
		@Test
		public void  test54()  throws Exception{		
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'编辑')]");
			assertTrue(webtest.ifContains("编辑货币"));
		}
		
		
		//验证编辑的功能（货币设置中）
		@Test
		public void  test55()  throws Exception{		
			webtest.click("xpath=//a[contains(.,'系统管理 ')]");
			webtest.click("xpath=//a[contains(.,'货币设置')]");
			webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'编辑')]");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "美币");
			webtest.click("xpath=//button[contains(.,' 保存货币信息')]");
			assertTrue(webtest.ifContains("货币设置"));
		}
		
		
		//验证刷新键的功能（货币设置中）
			@Test
			public void test56()  throws Exception{		
	 		    webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.click("xpath=//a[contains(.,'货币设置')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'编辑')]");
				webtest.click("xpath=//a[contains(.,' 刷新')]");
				assertTrue(webtest.ifContains("编辑货币"));
			}
		
			
			//验证返回货币列表键的功能（货币设置中）
			@Test
			public void  test57()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");					
				webtest.click("xpath=//a[contains(.,'货币设置')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'编辑')]");
				webtest.click("xpath=//a[contains(.,' 返回货币列表')]");
				assertTrue(webtest.ifContains("货币设置"));
			}

			
			//验证删除键的功能（货币设置中）
			@Test
			public void  test58()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");					
				webtest.click("xpath=//a[contains(.,'货币设置')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'删除')]");
				webtest.alertAccept();
				assertTrue(webtest.ifContains("货币设置"));
				Thread.sleep(5000);
			}

		
			//验证编辑的功能(支付设置中)
			@Test
			public void test60()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.click("xpath=//a[contains(.,'支付设置')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'编辑')]");
				webtest.typeAndClear("xpath=//input[@value='支付宝支付']", "支付宝支付方式");
				webtest.click("xpath=//button[contains(.,' 保存支付方式信息')]");
				assertTrue(webtest.ifContains("保存成功"));
			}
			
			
			//验证刷新的功能(支付设置中)
			@Test
			public void test61()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.click("xpath=//a[contains(.,'支付设置')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'编辑')]");
				webtest.click("xpath=//a[contains(.,' 刷新')]");
				assertTrue(webtest.ifContains("编辑支付方式"));
			}
			
			
			//验证返回货币列表键的功能（支付设置中）
			@Test
			public void  test62()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");					
				webtest.click("xpath=//a[contains(.,'支付设置')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'编辑')]");
				webtest.click("xpath=//a[contains(.,' 返回支付方式列表')]");
				assertTrue(webtest.ifContains("支付管理"));
				Thread.sleep(3000);
			}
	
	//验证添加配送方式功能（在配送设置中）
			@Test
			public void test70()  throws Exception{		
				//添加配送方式——配送(公司)名称：“中通快递”——配送(公司)简介：“一家让你满意的公司”——配送状态：“开启”
				//——配送排序：“255”——费用设置方式：“统一设置”——配送费用（公式）:
				//按重量和距离来收费的,省内件1公斤之内,一般十元左右,每超出1公斤,再加二至五元,省外件12至15一公斤,每超出1公斤另加五至八元

				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' 添加配送方式')]");
				webtest.click("xpath=//a[contains(.,'基本信息')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "中通快递");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "一家让你满意的公司");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//a[contains(.,'费用设置')]");
				webtest.click("xpath=//input[@value='T']");
				webtest.typeAndClear("xpath=//input[@id='express_price']","按重量和距离来收费的,省内件1公斤之内,一般十元左右,每超出1公斤,再加二至五元,省外件12至15一公斤,每超出1公斤另加五至八元");
				webtest.click("xpath=//button[contains(.,' 保存配送方式信息')]");
				assertTrue(webtest.ifContains("配送管理"));
			}
			@Test
			public void  test71()  throws Exception{		
				//添加配送方式——配送(公司)名称为空——配送(公司)简介：“一家让你满意的公司”——配送状态：“开启”——配送排序：“255”
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");
				webtest.click("xpath=//a[contains(.,' 添加配送方式')]");
				webtest.click("xpath=//a[contains(.,'基本信息')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", " ");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "一家让你满意的公司");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//button[contains(.,' 保存配送方式信息')]");
				assertTrue(webtest.ifContains("配送名称不能为空！"));
			}
			@Test
			public void  test72()  throws Exception{		
				//添加配送方式——配送(公司)名称：“中通快递”——配送(公司)简介：“一家让你满意的公司”——配送状态：“开启”——配送排序：“ ”
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' 添加配送方式')]");
				webtest.click("xpath=//a[contains(.,'基本信息')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "中通快递");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "一家让你满意的公司");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "  ");			
				webtest.click("xpath=//button[contains(.,' 保存配送方式信息')]");
				assertTrue(webtest.ifContains("配送排序不能为空！"));
			}
			@Test
			public void test73()  throws Exception{		
				//添加配送方式——配送(公司)名称：“中通快递”——配送(公司)简介：“一家让你满意的公司”——配送状态：“关闭”——配送排序：“255”
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' 添加配送方式')]");	
				webtest.click("xpath=//a[contains(.,'基本信息')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "中通快递");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "一家让你满意的公司");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//option[contains(.,'支持')]");
				webtest.click("xpath=//input[@value='0']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//button[contains(.,' 保存配送方式信息')]");
				assertTrue(webtest.ifContains("配送管理"));
			}
			
			//验证配送设置中的编辑的功能(配送设置中)
			@Test
			public void test74()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'系统管理 ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'编辑')]");
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "一家让你满意的公司");
				webtest.click("xpath=//button[contains(.,' 保存配送方式信息')]");
				assertTrue(webtest.ifContains("配送管理"));
			}
			
					
			//验证配送设置中的刷新键的功能(配送设置中)
				@Test
				public void  test75()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'系统管理 ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'编辑')]");
	     			webtest.click("xpath=//a[contains(.,' 刷新')]");
					assertTrue(webtest.ifContains("编辑配送方式"));
				}
			
				
				//验证配送设置中的返回配送方式列表键的功能(配送设置中)
				@Test
				public void  test76()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'系统管理 ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");		
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'编辑')]");
					webtest.click("xpath=//a[contains(.,' 返回配送方式列表')]");
					assertTrue(webtest.ifContains("配送管理"));
				}
				
				
				//验证配送设置中的删除键的功能(配送设置中)
				@Test
				public void test77()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'系统管理 ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'配送设置')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'删除')]");
					webtest.alertAccept();
					assertTrue(webtest.ifContains("配送管理"));
				}
				
}
