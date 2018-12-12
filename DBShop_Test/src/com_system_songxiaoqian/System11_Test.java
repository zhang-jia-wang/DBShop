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
		// 1.���ֻ������������ý�����֤����������Ϊ�������͡�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�ֻ�������������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'������')]");
		webtest.click("xpath=//option[contains(.,'������')]");
		webtest.click("xpath=//button[contains(.,' ������������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test02() throws Exception {
		// ��������Ϊ��������ڶ��š�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�ֻ�������������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'������ڶ���')]");
		webtest.click("xpath=//option[contains(.,'������ڶ���')]");
		webtest.click("xpath=//button[contains(.,' ������������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test03() throws Exception {
		// ��������Ϊ�������ƶ���(��Ϣ����)��
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�ֻ�������������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'�����ƶ���(��Ϣ����)')]");
		webtest.click("xpath=//option[contains(.,'�����ƶ���(��Ϣ����)')]");
		webtest.click("xpath=//button[contains(.,' ������������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test04() throws Exception {
		// ��������Ϊ�������ƶ���(��ͨ��)��
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�ֻ�������������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("name=phone_sms_type");
		webtest.mouseoverElement("xpath=//option[contains(.,'�����ƶ���(��ͨ��)')]");
		webtest.click("xpath=//option[contains(.,'�����ƶ���(��ͨ��)')]");
		webtest.click("xpath=//button[contains(.,' ������������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
		
	}



	@Test
	public void test05() throws Exception {
		// ��֤������Ϣ
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.typeAndClear("name=admin_receive_email", "admin@qq.com");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test06() throws Exception {
		// �ύ����
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'�ύ����')]");
		webtest.click("xpath=//input[@name='submit_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_submit_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test07() throws Exception {
		// �������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'�������')]");
		webtest.click("xpath=//input[@name='payment_finish_state']");
		webtest.click("xpath=//input[@name='buyer_payment_finish_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test08() throws Exception {
		// �������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'�������')]");
		webtest.click("xpath=//input[@name='ship_finish_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_ship_finish_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test09() throws Exception {
		// �������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'�������')]");
		webtest.click("xpath=//input[@name='transaction_finish_state']");
		webtest.click("xpath=//input[@name='buyer_transaction_finish_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test10() throws Exception {
		// ȡ������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'ȡ������')]");
		webtest.click("xpath=//input[@name='cancel_order_state']");
		webtest.click("xpath=//input[contains(@name,'buyer_cancel_order_state')]");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test11() throws Exception {
		// ��Ʒ��ѯ
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='#system_g']");
		webtest.click("xpath=//input[@name='goods_ask_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_state']");
		webtest.click("xpath=//button[contains(@type,'submit')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test12() throws Exception {
		// ��ѯ�ظ�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'��ѯ�ظ�')]");
		webtest.click("xpath=//input[@name='goods_ask_reply_state']");
		webtest.click("xpath=//input[@name='buyer_goods_ask_reply_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test13() throws Exception {
		// ��Ʒȱ��
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'��Ʒȱ��')]");
		webtest.click("xpath=//input[@name='goods_stock_out_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test14() throws Exception {
		// ������Ʒ����
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'��Ϣ��������')]");
		webtest.click("xpath=//a[contains(.,'�����ʼ���������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'������Ʒ����')]");
		webtest.click("xpath=//input[@name='virtual_goods_send_state']");
		webtest.click("xpath=//input[@name='buyer_virtual_goods_send_state']");
		webtest.click("xpath=//button[@type='submit']");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	@Test
	public void test15() throws Exception {
		// ��ӵ���
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,' ��ӵ���')]");
		webtest.type("name=region_name", "����");
		webtest.click("xpath=//button[contains(.,'����')]");
		
	}

	@Test
	public void test16() throws Exception {
		// �鿴�¼������ض���
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' ���ض���')]");
		
	}

	@Test
	public void test17() throws Exception {
		// �鿴�¼�������һ��
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[@href='/DBShop/admin/region/index/top_id/1']");
		webtest.click("xpath=//a[contains(.,' ������һ��')]");
		
	}

	@Test
	public void test18() throws Exception {
		// �༭����
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/span");
		webtest.typeAndClear("xpath=//input[@value='����']", "BB");
		webtest.click("xpath=//button[contains(.,' ����')]");
		// ɾ������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
	}

	

	@Test
	public void test19() throws Exception {
		// 4.�Կ��״̬������֤����ӿ��״̬(����״̬����Ϊ�л�״̬)
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'״̬����')]");
		Thread.sleep(3000);
		System.out.println("abc");
		webtest.click("xpath=//a[contains(.,'���״̬')]");
		webtest.click("xpath=//a[contains(.,' ��ӿ��״̬')]");
		webtest.click("xpath=//select[contains(@name,'state')]");
		webtest.click("xpath=//option[contains(.,'�л�״̬')]");
		webtest.type("name=stock_state_name", "�п��");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "300");
		webtest.click("xpath=//button[contains(.,' ������״̬��Ϣ')]");
		//�༭�����Ϣ
		System.out.println(webtest.getText("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'�༭')]"));
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'�༭')]");
		webtest.typeAndClear("xpath=//input[contains(@name,'stock_state_name')]", "����Ʒ");
		webtest.typeAndClear("xpath=//input[contains(@name,'state_sort')]", "400");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//ɾ�������Ϣ
		webtest.click("xpath=//table/tbody/tr[last()-1]/td[5]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
		
	}
	@Test
	public void test20() throws Exception {
		// 5. ����¹���Ա
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'����Ա����')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' ����¹���Ա')]");
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
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'����Ա����')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/administrator']");
		Thread.sleep(3000);
		// �Ա༭����Ա������֤
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'�༭')]");
		webtest.typeAndClear("name=admin_email", "admin@163.com");
		webtest.click("xpath=//button[@type='submit']");
		webtest.click("xpath=//a[contains(.,' ���ع���Ա�б�')]");
		Thread.sleep(3000);
		// ɾ������Ա
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
	}
	@Test
	public void test22() throws Exception {
		// 6.�Թ���Ա�������֤
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'����Ա����')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");
		Thread.sleep(3000);
		// ��ӹ���Ա�������Ϣ��Ȩ������(ϵͳ����͹���Ա����)
		webtest.click("xpath=//a[contains(.,'������Ϣ')]");
		webtest.click("xpath=//a[contains(.,' ��ӹ���Ա��')]");
		webtest.type("name=admin_group_name", "����Ա��5");
		webtest.click("xpath=//a[contains(.,'Ȩ������')]");
		webtest.click("xpath=//input[contains(@id,'System')]");
		webtest.click("xpath=//input[contains(@id,'Admin')]");
		webtest.click("xpath=//button[@type='submit']");	
	}

	@Test
	public void test23() throws Exception {
		// �༭����Ա��
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'����Ա����')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/admingroup']");		
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'�༭')]");
		webtest.typeAndClear("name=admin_group_name", "admin");
		webtest.click("xpath=//a[contains(.,'Ȩ������')]");
		webtest.click("xpath=//input[@id='System']");
		webtest.click("xpath=//input[@id='Admin']");
		webtest.click("xpath=//button[@type='submit']");
		// ɾ������Ա��	
		webtest.click("xpath=//table/tbody/tr[last()]/td[3]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
	}
	@Test
	public void test24() throws Exception {
		//���߿ͷ���ʽ����(������ʽ-1)
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[contains(.,'�ͷ���ʽ����')]");
		Thread.sleep(3000);
		webtest.click("name=online_style");
		webtest.mouseoverElement("xpath=//option[contains(.,'������ʽ-1')]");
		webtest.click("xpath=//option[contains(.,'������ʽ-1')]");
		webtest.click("xpath=//button[@type='submit']");

	}
	
	@Test
	public void test25() throws Exception {
		//������߿ͷ���
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[contains(.,'���߿ͷ�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' ������߿ͷ���')]");
		webtest.typeAndClear("name=online_group_name","�̼�");
		webtest.typeAndClear("name=online_group_sort","200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
		//�༭���߿ͷ���
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'�༭')]");
		webtest.typeAndClear("name=online_group_name","���");
		webtest.typeAndClear("name=online_group_sort","255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);	
	}
	@Test
	public void test26() throws Exception {
		// ������߿ͷ�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[@href='/DBShop/admin/online']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,' ������߿ͷ�')]");
		webtest.typeAndClear("name=online_name", "�ͷ�һ");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'���')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='skype']");
		webtest.typeAndClear("name=online_account", "admin@admin.com");
		webtest.typeAndClear("name=online_sort", "200");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//button[@type='submit']");

	}
	@Test
	public void test27() throws Exception {
		//�༭���߿ͷ���Ա
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[contains(.,'���߿ͷ���Ա')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'�༭')]");
		webtest.typeAndClear("name=online_name", "�ͷ�");
		webtest.click("name=online_group_id");
		webtest.click("xpath=//option[contains(.,'���')]");
		webtest.click("name=online_type");
		webtest.click("xpath=//option[@value='qq']");
		webtest.typeAndClear("name=online_account", "admin@qq.com");
		webtest.typeAndClear("name=online_sort", "255");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test28() throws Exception {
		//ɾ�����߿ͷ���Ա
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[contains(.,'���߿ͷ���Ա')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
		Thread.sleep(3000);
		// ɾ�����߿ͷ�����
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.mouseoverElement("xpath=//a[contains(.,'���߿ͷ�����')]");
		webtest.click("xpath=//a[contains(.,'���߿ͷ�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//table/tbody/tr[last()]/td[6]/a[contains(.,'ɾ��')]");
		webtest.alertAccept();
		
	}

}
