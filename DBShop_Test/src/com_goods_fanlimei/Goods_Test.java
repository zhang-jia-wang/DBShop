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
	public void goods_test() {
// ��¼����
		webtest.open("http://10.7.1.9:8686/DBShop/admin");
		webtest.type("name=user_name", "admin");
		webtest.type("name=user_passwd", "111111");
		webtest.click("xpath=//button[@type='submit']");
// ��Ʒ����
		webtest.click("xpath=//a[contains(.,'��Ʒ���� ')]");
		// ������Ʒ
		webtest.click("xpath=//a[contains(.,'������Ʒ')]");
		// �����Ʒ
		webtest.click("xpath=//a[contains(.,'�����Ʒ')]");
		webtest.type("name=goods_name", "����");
		webtest.type("name=goods_shop_price", "10");
		webtest.type("name=goods_type", "ʵ����Ʒ");
		webtest.click("xpath=//button[contains(.,' ������Ʒ')]");
		// �ύ����
		webtest.click("xpath=//input[@value='16']");
		webtest.type("name=allEdit", "ɾ��");
		webtest.click("xpath=//button[contains(.,' �ύ����')]");
		webtest.getAlert();
		webtest.alertAccept();
		// ��������
		webtest.click("name=goods_name");
		webtest.type("name=goods_name", "����");
		webtest.tapClick();
		webtest.click("xpath=//button[@type='submit']");


// �������
		//��Ʒ����
//		webtest.click("xpath=//a[@href='/DBShop/admin/goods/class']");
//		webtest.click("xpath=//a[contains(.,'�������')]/a[contains(.,'��Ʒ����')]");

// ��Ʒ����
// ��ƷƷ��
// ��Ʒ����
		// ��Ʒ��ѯ
		// ��Ʒ��ǩ
		// ��Ʒ����
	}
}
