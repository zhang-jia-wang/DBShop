package com_system_songxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class System_Test extends BaseTest {
	@BeforeClass
	public void admin() throws Exception {
		webtest.open("http://localhost:8032/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(6000);
	}
	@AfterClass
	public void quit() {
		webtest.quit();
	}
	@Test
	public void test01() throws Exception {
		// 1.瀵规墜鏈虹煭淇℃彁閱掕缃繘琛岄獙璇侊紝璁剧疆绫诲瀷涓衡�滄棤绫诲瀷鈥�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鎵嬫満鐭俊鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'鏃犵被鍨�')]");
		webtest.click("xpath=//option[contains(.,'鏃犵被鍨�')]");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨鎻愰啋璁剧疆')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test02() throws Exception {
		// 璁剧疆绫诲瀷涓衡�滈樋閲屽ぇ浜庣煭淇♀��
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鎵嬫満鐭俊鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'闃块噷澶т簬鐭俊')]");
		webtest.click("xpath=//option[contains(.,'闃块噷澶т簬鐭俊')]");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨鎻愰啋璁剧疆')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test03() throws Exception {
		// 璁剧疆绫诲瀷涓衡�滈樋閲屼簯鐭俊(娑堟伅鏈嶅姟)鈥�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鎵嬫満鐭俊鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'闃块噷浜戠煭淇�(娑堟伅鏈嶅姟)')]");
		webtest.click("xpath=//option[contains(.,'闃块噷浜戠煭淇�(娑堟伅鏈嶅姟)')]");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨鎻愰啋璁剧疆')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test04() throws Exception {
		// 璁剧疆绫诲瀷涓衡�滈樋閲屼簯鐭俊(浜戦�氫俊)鈥�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鎵嬫満鐭俊鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'闃块噷浜戠煭淇�(浜戦�氫俊)')]");
		webtest.click("xpath=//option[contains(.,'闃块噷浜戠煭淇�(浜戦�氫俊)')]");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨鎻愰啋璁剧疆')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
		
	}



	@Test
	public void test05() throws Exception {
		// 楠岃瘉鍩烘湰淇℃伅
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.typeAndClear("name=admin_receive_email", "admin@qq.com");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test06() throws Exception {
		// 鎻愪氦璁㈠崟
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'鎻愪氦璁㈠崟')]");
		webtest.click("xpath=//input[@name='submit_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_submit_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test07() throws Exception {
		// 浠樻瀹屾垚
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'浠樻瀹屾垚')]");
		webtest.click("xpath=//input[@name='payment_finish_state']");
		webtest.click("xpath=//input[@name='buyer_payment_finish_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test08() throws Exception {
		// 鍙戣揣瀹屾垚
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'鍙戣揣瀹屾垚')]");
		webtest.click("xpath=//input[@name='ship_finish_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_ship_finish_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test09() throws Exception {
		// 浜ゆ槗瀹屾垚
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'浜ゆ槗瀹屾垚')]");
		webtest.click("xpath=//input[@name='transaction_finish_state']");
		webtest.click("xpath=//input[@name='buyer_transaction_finish_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test10() throws Exception {
		// 鍙栨秷璁㈠崟
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'鍙栨秷璁㈠崟')]");
		webtest.click("xpath=//input[@name='cancel_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_cancel_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test11() throws Exception {
		// 鍟嗗搧鍜ㄨ
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='#system_g']");
		webtest.click("xpath=//input[@name='goods_ask_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test12() throws Exception {
		// 鍜ㄨ鍥炲
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'鍜ㄨ鍥炲')]");
		webtest.click("xpath=//input[@name='goods_ask_reply_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_reply_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test13() throws Exception {
		// 鍟嗗搧缂鸿揣
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'鍟嗗搧缂鸿揣')]");
		webtest.click("xpath=//input[@name='goods_stock_out_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test14() throws Exception {
		// 铏氭嫙鍟嗗搧鍙戣揣
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'娑堟伅鎻愰啋璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鐢靛瓙閭欢鎻愰啋璁剧疆')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'铏氭嫙鍟嗗搧鍙戣揣')]");
		webtest.click("xpath=//input[@name='virtual_goods_send_state']");
		webtest.click("xpath=//input[@name='buyer_virtual_goods_send_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("淇濆瓨鎴愬姛"));
	}

	@Test
	public void test15() throws Exception {
		// 娣诲姞鍦板尯
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.click("xpath=//a[contains(.,'鍦板尯绠＄悊')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,' 娣诲姞鍦板尯')]");
		webtest.type("name=region_name", "鐭垮尯");
		webtest.click("xpath=//button[contains(.,'淇濆瓨')]");
		
	}

	@Test
	public void test16() throws Exception {
		// 鏌ョ湅涓嬬骇骞惰繑鍥為《绾�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.click("xpath=//a[contains(.,'鍦板尯绠＄悊')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' 杩斿洖椤剁骇')]");
		
	}

	@Test
	public void test17() throws Exception {
		// 鏌ョ湅涓嬬骇杩斿洖涓婁竴绾�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.click("xpath=//a[contains(.,'鍦板尯绠＄悊')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' 杩斿洖涓婁竴绾�')]");
		
	}

	@Test
	public void test18() throws Exception {
		// 缂栬緫鍦板尯
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.click("xpath=//a[contains(.,'鍦板尯绠＄悊')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/span");
		webtest.typeAndClear("xpath=//input[@value='鐭垮尯']", "BB");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨')]");
		// 鍒犻櫎鍦板尯
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.click("xpath=//a[contains(.,'鍦板尯绠＄悊')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
	}

	

	@Test
	public void test19() throws Exception {
		// 4.瀵瑰簱瀛樼姸鎬佽繘琛岄獙璇侊紝娣诲姞搴撳瓨鐘舵��(璁剧疆鐘舵�佺被鍨嬩负鏈夎揣鐘舵��)
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鐘舵�佽缃�')]");
		webtest.click("xpath=//a[contains(.,'搴撳瓨鐘舵��')]");
		Thread.sleep(3000);
		System.out.println("abc");	
		webtest.click("xpath=//a[contains(.,' 娣诲姞搴撳瓨鐘舵��')]");
		webtest.click("xpath=//select[contains(@name,'state')]");
		webtest.click("xpath=//option[contains(.,'鏈夎揣鐘舵��')]");
		webtest.type("name=stock_state_name", "鏈夊簱瀛�");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "300");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨搴撳瓨鐘舵�佷俊鎭�')]");
	}
	@Test
	public void test20() throws Exception {
		//缂栬緫娣诲姞淇℃伅
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鐘舵�佽缃�')]");
		webtest.click("xpath=//a[contains(.,'搴撳瓨鐘舵��')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'缂栬緫')]");
		webtest.typeAndClear("xpath=//input[contains(@name,'stock_state_name')]", "鏈夌墿鍝�");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "400");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//鍒犻櫎娣诲姞淇℃伅
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
		Thread.sleep(3000);
		
	}
	@Test
	public void test21() throws Exception {
		// 5. 娣诲姞鏂扮鐞嗗憳
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'绠＄悊鍛樿缃�')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 娣诲姞鏂扮鐞嗗憳')]");
		webtest.click("xpath=//select[contains(@name,'admin_group_id')]");
		webtest.click("xpath=//option[contains(@value,'1')]");
		webtest.type("name=admin_name", "admin11");
		webtest.type("name=admin_email", "admin11@126.com");
		webtest.type("name=admin_password", "111111");
		webtest.type("name=admin_password_con", "111111");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(4000);
		
		
	}
	@Test
	public void test22() throws Exception {
		// 缂栬緫绠＄悊鍛�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'绠＄悊鍛樿缃�')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'缂栬緫')]");
		webtest.typeAndClear("name=admin_email", "admin11@163.com");
		webtest.click("xpath=//button[contains(.,' 淇濆瓨绠＄悊鍛樹俊鎭�')]");
		webtest.click("xpath=//a[contains(.,' 杩斿洖绠＄悊鍛樺垪琛�')]");
		// 鍒犻櫎绠＄悊鍛�
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
	}
	@Test
	public void test23() throws Exception {
		// 6.瀵圭鐞嗗憳缁勮繘琛岄獙璇�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'绠＄悊鍛樿缃�')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");
		Thread.sleep(3000);
		// 娣诲姞绠＄悊鍛樼粍鍩烘湰淇℃伅鍜屾潈闄愯缃�(绯荤粺绠＄悊鍜岀鐞嗗憳绠＄悊)
		webtest.click("xpath=//a[contains(.,'鍩烘湰淇℃伅')]");
		webtest.click("xpath=//a[contains(.,' 娣诲姞绠＄悊鍛樼粍')]");
		webtest.type("name=admin_group_name", "绠＄悊鍛樼粍5");
		webtest.click("xpath=//a[contains(.,'鏉冮檺璁剧疆')]");
		webtest.click("xpath=//input[contains(@id,'System')]");
		webtest.click("xpath=//input[contains(@id,'Admin')]");
		webtest.click("xpath=//button[@type='submit']");	
	}

	@Test
	public void test24() throws Exception {
		// 缂栬緫绠＄悊鍛樼粍
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'绠＄悊鍛樿缃�')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");		
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'缂栬緫')]");
		webtest.typeAndClear("name=admin_group_name", "admin");
		webtest.click("xpath=//a[contains(.,'鏉冮檺璁剧疆')]");
		webtest.click("xpath=//input[@id='System']");
		webtest.click("xpath=//input[@id='Admin']");
		webtest.click("xpath=//button[@type='submit']");
		// 鍒犻櫎绠＄悊鍛樼粍	
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
	}
	@Test
	public void test25() throws Exception {
		//鍦ㄧ嚎瀹㈡湇鏍峰紡璁剧疆(涓�ф牱寮�-1)
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'瀹㈡湇鏍峰紡璁剧疆')]");
		Thread.sleep(3000);
		webtest.click("name=online_style");
		webtest.mouseoverElement("xpath=//option[contains(.,'涓�ф牱寮�-1')]");
		webtest.click("xpath=//option[contains(.,'涓�ф牱寮�-1')]");
		webtest.click("xpath=//button[@type='submit']");

	}
	
	@Test
	public void test26() throws Exception {
		//娣诲姞鍦ㄧ嚎瀹㈡湇缁�
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇鍒嗙粍')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 娣诲姞鍦ㄧ嚎瀹㈡湇缁�')]");
		webtest.typeAndClear("name=online_group_name","鍟嗗");
		webtest.typeAndClear("name=online_group_sort","200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//缂栬緫鍦ㄧ嚎瀹㈡湇缁�
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'缂栬緫')]");
		webtest.typeAndClear("name=online_group_name","搴楀");
		webtest.typeAndClear("name=online_group_sort","255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);	
	}
	@Test
	public void test27() throws Exception {
		// 娣诲姞鍦ㄧ嚎瀹㈡湇
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/online']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' 娣诲姞鍦ㄧ嚎瀹㈡湇')]");
		webtest.typeAndClear("name=online_name", "瀹㈡湇涓�");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'搴楀')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='skype']");
		webtest.typeAndClear("name=online_account", "admin@admin.com");
		webtest.typeAndClear("name=online_sort", "200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");

	}
	@Test
	public void test28() throws Exception {
		//缂栬緫鍦ㄧ嚎瀹㈡湇鎴愬憳
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇鎴愬憳')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'缂栬緫')]");
		webtest.typeAndClear("name=online_name", "瀹㈡湇");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'搴楀')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='qq']");
		webtest.typeAndClear("name=online_account", "admin@qq.com");
		webtest.typeAndClear("name=online_sort", "255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test29() throws Exception {
		//鍒犻櫎鍦ㄧ嚎瀹㈡湇鎴愬憳
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇鎴愬憳')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
		// 鍒犻櫎鍦ㄧ嚎瀹㈡湇鍒嗙粍
		webtest.click("xpath=//a[contains(.,'绯荤粺绠＄悊 ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇璁剧疆')]");
		webtest.click("xpath=//a[contains(.,'鍦ㄧ嚎瀹㈡湇鍒嗙粍')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'鍒犻櫎')]");
		webtest.alertAccept();
		Thread.sleep(3000);
		
	}
}
