/**
 * 
 */
package com_goods_fanlimei;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/**
 * @author �ż���
 *
 */
public class Goods_Test extends BaseTest {
	@Test
	public void goods_test() throws Exception {
		
		
// ---------------------------��¼���棨��ɣ�-----------------------------
		webtest.open("http://10.7.1.9:8686/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
		
		
// ---------------------------��Ʒ������ɣ�-------------------------------
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		// ������Ʒ
//		webtest.click("xpath=//a[contains(.,'������Ʒ')]");
//		// �����Ʒ
//		webtest.click("xpath=//a[contains(.,'�����Ʒ')]");
//		webtest.type("name=goods_name", "����");
//		webtest.type("name=goods_shop_price", "10");
//		webtest.type("name=goods_type", "ʵ����Ʒ");
//		webtest.click("xpath=//button[contains(.,' ������Ʒ')]");
//		// �ύ����
//		webtest.click("xpath=//input[@value='16']");
//		webtest.type("name=allEdit", "ɾ��");
//		webtest.click("xpath=//button[contains(.,' �ύ����')]");
//		webtest.getAlert();
//		webtest.alertAccept();
//		// ��������
//		webtest.click("name=goods_name");
//		webtest.type("name=goods_name", "����");
//		webtest.tapClick();
//		webtest.click("xpath=//button[@type='submit']");


//---------------------------------- ������ࣨ��ɣ�------------------------------------
		//��Ʒ����
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'�������')]");
//		webtest.click("xpath=//a[contains(.,'��Ʒ����')]");
//		webtest.click("xpath=//a[contains(.,' ��ӷ���')]");
//		webtest.type("name=class_name", "��ʳ��");
//		webtest.type("name=class_state", "����");
//		webtest.click("xpath=//button[@type='submit']");
		//ǰ̨�������
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'�������')]");
//		webtest.click("xpath=//a[contains(.,'ǰ̨�������')]");
//		webtest.click("xpath=//a[contains(.,' ��Ӳ����ʾ')]");
//		webtest.type("name=frontside_name", "��ʳ��");
//		webtest.click("xpath=//button[@type='submit']");
		
		
//--------------------------- -------��Ʒ����(��ɣ�-------------------------------
		//���Է���
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'��Ʒ����')]");
//		webtest.click("xpath=//a[contains(.,'���Է���')]");
//		webtest.click("xpath=//a[contains(.,' ���������')]");
//		webtest.type("name=attribute_group_name", "�ߴ�");
//		webtest.click("xpath=//button[@type='submit']");
		//����
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'��Ʒ����')]");
//		webtest.click("xpath=//a[@href='/DBShop/admin/goods/attribute']");
//		webtest.click("xpath=//a[contains(.,' �������')]");
//		webtest.type("name=attribute_group_id", "�ߴ�");
//		webtest.type("name=attribute_group_id", "��ѡ");
//		webtest.type("name=attribute_name", "����");
//		webtest.click("xpath=//button[@type='submit']");
		
		
		
// ----------------------------------��ƷƷ�ƣ���ɣ�-------------------------------
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.click("xpath=//a[@href='/DBShop/admin/goods/brand']");
//		webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
//		webtest.type("name=brand_name", "DELL");
//		webtest.click("xpath=//button[@type='submit']");
//		webtest.click("xpath=//a[@onclick='return brand_del_js(1);']");
//		webtest.alertAccept();

		
		
// ----------------------------------��Ʒ���ۣ���ɣ�-------------------------------
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.click("xpath=//a[contains(.,'��Ʒ����')]");

		
		
//---------------------------------- ��Ʒ��ѯ����ɣ�------------------------------
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.click("xpath=//a[contains(.,'��Ʒ��ѯ')]");
		
		
		
//---------------------------------- ��Ʒ��ǩ����ɣ�------------------------------
		//��Ʒ��ǩ����
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'��Ʒ��ǩ')]");
//		webtest.click("xpath=//a[contains(.,'��Ʒ��ǩ����')]");
//		webtest.click("xpath=//a[contains(.,' ��ӱ�ǩ��')]");
//		webtest.type("name=tag_group_name", "��Ʒ�Ƽ�");
//		webtest.click("xpath=//button[@type='submit']");
		//�ض���Ʒ��ǩ
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'��Ʒ��ǩ')]");
//		webtest.click("xpath=//a[contains(.,'�ض���Ʒ��ǩ')]");
//		webtest.click("xpath=//a[contains(.,' ����ض���Ʒ��ǩ')]");
//		webtest.type("name=tag_type", "�ֻ�����ҳ��Ʒ");
//		webtest.type("name=tag_name", "����Ʒ");
//		webtest.click("xpath=//button[@type='submit']");
		//��ͨ��Ʒ��ǩ
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.mouseoverElement("xpath=//a[contains(.,'��Ʒ��ǩ')]");
//		webtest.click("xpath=//a[contains(.,'��ͨ��Ʒ��ǩ')]");
//		webtest.click("xpath=//a[contains(.,' �����ͨ��Ʒ��ǩ')]");
//		webtest.type("name=tag_group_id", "����");
//		webtest.type("name=tag_name", "S��");
//		webtest.click("xpath=//button[@type='submit']");	
		

// ----------------------------------��Ʒ����(���)-------------------------------
//		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
//		webtest.click("xpath=//a[contains(.,'��Ʒ����')]");
//		webtest.click("xpath=//input[@name='goods_index']");
//		webtest.click("xpath=//button[contains(.,'���������Ʒ����')]");
//		webtest.click("xpath=//button[contains(.,' ������������')]");
//		webtest.alertAccept();
	}
}
