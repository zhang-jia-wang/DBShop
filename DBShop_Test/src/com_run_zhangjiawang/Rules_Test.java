package com_run_zhangjiawang;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Rules_Test extends BaseTest{
	@BeforeClass
	//��¼
	public void login() throws InterruptedException {
	webtest.open("http://localhost:8032/DBShop/admin");
	webtest.type("name=user_name","admin");
	webtest.type("name=user_passwd","123456");
	webtest.click("xpath=//button[@class='btn']");
	}
	
//��Ϣ
	public void information(String a,String b,String c) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'��Ӫ���� ')]");
	webtest.click("xpath=//a[contains(.,'�Żݴ�������')]");
	webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
	webtest.type("class=span3",a);
	webtest.type("class=span6" ,b);
	webtest.type("xpath=//input[@id='promotions_start_time']","2018-11-30");
	webtest.type("xpath=//input[@id='promotions_end_time']","2018-12-9");
	webtest.click("xpath=//select[@id='rule_state']");
	webtest.click("name=coupon_state");	
	webtest.click(c);	
	}
	//��������
	public void cu(String d) throws InterruptedException {
		webtest.click("xpath=//a[@href='#promotions_c']");	
		webtest.type("xpath=//input[@class='span2']","100");
		webtest.type("xpath=//input[@class='span1']","10");
		webtest.click("xpath=//select[@class='span1']");
		webtest.click(d);
		}
	//�Żݿͻ���
	public void group(String e,String f) throws InterruptedException {
	webtest.click("xpath=//a[@href='#promotions_b']");
	webtest.click("xpath=//select[@id='promotions_user_type']");
	webtest.click(e);
	webtest.click(f);
	}
	//�Ż���Ʒ
			public void goods(String g,String h) throws InterruptedException {
			webtest.click("xpath=//a[@href='#promotions_d']");
			webtest.click("xpath=//select[@id='promotions_goods_type']");
			webtest.click(g);
			webtest.click(h);
			}
	//����
			public void save() throws InterruptedException {
			webtest.click("xpath=//button[@class='btn btn-small btn-primary']");
			}
	//ɾ��
			public void delete() throws InterruptedException {
		     webtest.click("xpath=//table/tbody/tr[last()]/td[5]/a[contains(.,'ɾ��')]");//�ҵ����һ��ɾ������Ӧɾ�����У���Ӧ���У�ɾ��������/
			 webtest.alertAccept();
			 Thread.sleep(4000);
			}
	@Test	
	public void test1() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'����')]");
		cu("xpath=//option[contains(.,'%')]");
		group("xpath=//option[@value='all_user']","");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
	
}
	@Test	
	public void test2() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'�ر�')]");
		cu("xpath=//option[contains(.,'Ԫ')]");
		group("xpath=//option[@value='all_user']","");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
}
	@Test	
	public void test3() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'����')]");
		cu("xpath=//option[contains(.,'Ԫ')]");
		group("xpath=//option[@value='user_group']","xpath=//label[contains(.,'��ͨ��Ա')]");
		goods("xpath=//select[@id='promotions_goods_type']",""); 
		save();
		delete();
}
	@Test	
	public void test4() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'����')]");
		cu("xpath=//option[contains(.,'Ԫ')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[@value='class_goods']","xpath=//label[contains(.,'��ʳ')]"); 
		save();
		delete();
}
	@Test	
	public void test5() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'����')]");
		cu("xpath=//option[contains(.,'Ԫ')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[contains(.,'��ƷƷ��')]","xpath=//label[contains(.,'���ϴ�˹')]"); 
		save();
		delete();
}
	@Test	
	public void test6() throws InterruptedException {		
		information("iphone","An apple","xpath=//option[contains(.,'����')]");
		cu("xpath=//option[contains(.,'Ԫ')]");
		group("xpath=//option[@value='all_user']","");		
		goods("xpath=//option[contains(.,'��ƷƷ��')]","xpath=//label[contains(.,'�Ϳ�')]"); 
		save();
		delete();
}

	
	//�Ż�ȯ��ʹ��
//������Ϣ
	public void message(String g,String h) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'��Ӫ���� ')]");
	webtest.click("xpath=//a[@href='/DBShop/admin/goods/coupon']");
	webtest.click("xpath=//a[@class='btn btn-small btn-primary']");
	webtest.type("xpath=//input[@class='span3']",g);
	webtest.type("xpath=//input[@class='span6']", h);
	webtest.click("xpath=//select[@id='coupon_state']");
	webtest.click("xpath=//option[contains(.,'����')]");	
}
//ʹ�ù���
public void rule(String i,String j) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'�Żݹ���')]");
	webtest.type("xpath=//input[@id='shopping_amount']",i);
	webtest.type("xpath=//input[@class='span1']",j);
	Thread.sleep(1000);
}
//��ȡ����
public void getrule(String k,String l,String m) throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'��ȡ����')]");
	webtest.type("xpath=//input[@id='get_coupon_start_time']",k);
	webtest.type("xpath=//input[@id='get_coupon_end_time']",l);
	webtest.click("xpath=//select[@id='get_coupon_type']");
	webtest.click("xpath=//option[@value='buy']");
	Thread.sleep(2000);
	webtest.type("xpath=//input[@id='get_shopping_amount']",m);
	webtest.click("xpath=//select[@id='get_user_type']");
	webtest.click("xpath=//option[@value='all_user']");
	Thread.sleep(2000);
	webtest.click("xpath=//select[@id='get_goods_type']");
	webtest.click("xpath=//option[@value='all_goods']");
	Thread.sleep(2000);
}
//ʹ�ù���
public void userule(String n,String o) throws InterruptedException {
	webtest.click("xpath=//a[@href='#coupon_d']");
	webtest.type("xpath=//input[@id='coupon_start_time']",n);
	webtest.type("xpath=//input[@id='coupon_end_time']",o);
	webtest.click("xpath=//select[@id='coupon_goods_type']");
}	
//����
public void sav() throws InterruptedException {
	webtest.click("xpath=//button[@type='submit']");
}
//ɾ��
public void del() throws InterruptedException {
    webtest.click("xpath=//table/tbody/tr[last()-1]/td[10]/a[contains(.,'ɾ��')]");//�ҵ����һ��ɾ������Ӧɾ�����У���Ӧ���У�ɾ��������/
	 webtest.alertAccept();
	 Thread.sleep(4000);
	}
@Test
public void test7() throws InterruptedException {
	message("ë��","���ë�º�ů��");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test8() throws InterruptedException {
	message("!!!!","���ë�º�ů��");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}

@Test
public void test9() throws InterruptedException {
	message("ë��","���ë�º�ů��");
	rule("10","100");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test10() throws InterruptedException {
	message("ë��","");
	rule("100","10");
	getrule("2018-12-9","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}
@Test
public void test11() throws InterruptedException {
	message("ë��","");
	rule("100","10");
	getrule("2018-12-12","2018-12-9","100");
	userule("2018-12-12","2018-12-9");
	sav();
	del();
}

@Test
public void test12() throws InterruptedException {
	message("ë��","���ë�º�ů��");
	rule("100","10");
	getrule("","2018-12-12","100");
	userule("2018-12-9","2018-12-12");
	sav();
	del();
}


//ר������
//�����ť����
public void click() throws InterruptedException {
	webtest.click("xpath=//a[contains(.,'��Ӫ���� ')]");
	webtest.mouseoverElement("xpath=//a[contains(.,'ר�����')]");
	webtest.click("xpath=//a[contains(.,'ר������')]");
	webtest.click("xpath=//i[@class='icon-plus icon-white']");
}
//��Ϣ
public void inf(String a,String b) throws InterruptedException {
	webtest.type("xpath=//input[@class='span10']",a);
	webtest.type("xpath=//input[@class='span5']",b);
	webtest.click("xpath=//select[@class='span4']");
	webtest.click("xpath=//option[@value='default']");
	Thread.sleep(2000);
	webtest.click("xpath=//select[@class='span2']");
	webtest.click("xpath=//option[@value='1']");
}
//��������
public void search(String c,String d,String e) throws InterruptedException {
	webtest.click("xpath=//a[@href='#theme_c']");
	webtest.type("xpath=//input[@class='span12']",c);
	webtest.type("xpath=//textarea[@id='theme_keywords']",d);
	webtest.type("xpath=//textarea[@id='theme_description']",e);
}
//����
public void sa() throws InterruptedException {
	webtest.click("xpath=//button[@type='submit']");
}
//ɾ��
public void de() throws InterruptedException {
	    webtest.click("xpath=//table/tbody/tr[last()-1]/td[7]/a[contains(.,'ɾ��')]");//�ҵ����һ��ɾ������Ӧɾ�����У���Ӧ���У�ɾ��������/
		 webtest.alertAccept();
		 Thread.sleep(4000);		
}
@Test
public void test13() throws InterruptedException {
	click();
	inf("˫1212","�����");
	search("�Ż�","����","˫12�����Ϯ");
	sa();
	de();
}
@Test
public void test14() throws InterruptedException {
	click();
	inf("!!!!!!","����");
	search("�Ż�","����","˫12�����Ϯ");
	sa();
	de();
}





}

	

