package com_analysis_lianqianhui;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Analysis_Test extends BaseTest{

	@Test(priority=0)
	public void testlogin() throws InterruptedException {
		webtest.open("http://localhost:8032/DBShop/admin");
//		webtest.click("xpath=//a[contains(.,'��¼')]");
		
		webtest.type("name=user_name","admin");
		webtest.type("name=user_passwd","111111");
		webtest.click("xpath=//button[contains(.,'��̨��¼')]");
		Thread.sleep(5000);
		}
	@Test(priority=1)
	public void test1() throws InterruptedException{
		System.out.println("��ʼִ��");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'�ͻ�ͳ��')]");
		System.out.println("����ִ��");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void test2() throws InterruptedException {
		//�ͻ�����
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");

		webtest.type("name=group_id", "��ͨ��Ա");
		
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		//����ͳ��
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'����ͳ��')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void test4() throws InterruptedException {
		//���۸�������������ͼ��
		
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'���۸ſ�')]");
		webtest.click("xpath=//a[contains(.,'��������ͼ')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");   
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
		//��������ͼ
		webtest.click("xpath=//a[contains(.,'���۶�����ͼ')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
		
	}
	
	@Test(priority=5)
	public void test5() throws InterruptedException {
		//������ϸ
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'������ϸ')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public void test6() throws InterruptedException {
		//��������
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void test7() throws InterruptedException {
		//�������۷���
		webtest.click("xpath=//a[contains(.,'ͳ�Ʒ���')]");
		webtest.click("xpath=//a[contains(.,'�������۷���')]");
		webtest.click("xpath=//a[contains(.,'���7��')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���30��')]");
		webtest.click("xpath=//select[@name='class_id']");
		webtest.click("xpath=//option[contains(.,'��ʳ')]");
		webtest.type("name=group_id", "��ͨ��Ա");
		Thread.sleep(3000);
		//���ڷ�Χ����������
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-07");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ��30������
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-11-20");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		//���ڷ�Χ����30��
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@id='start_time']", " ");
		webtest.click("xpath=//input[@id='start_time']");
		webtest.type("xpath=//input[@id='start_time']", "2018-11-01");
		webtest.typeAndClear("xpath=//input[@id='end_time']", " ");
		webtest.click("xpath=//input[@id='end_time']");
		webtest.type("xpath=//input[@id='end_time']", "2018-12-05");
		webtest.click("xpath=//button[contains(.,'�鿴')]");
		Thread.sleep(3000);
			}
		}
