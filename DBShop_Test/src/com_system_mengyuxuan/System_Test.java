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
	
	
	
	
	
	//��֤������Ϣ��д��Ҫ��ϵͳ�����У�
	@Test
	public void test12()  throws Exception{	
		//3.������Ϣ������վ������д��DBShop����������վ������չ������д����վ�е�ս������,ϵͳʱ��ѡ�񡰹�������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
		webtest.click("xpath=//a[contains(.,'������Ϣ')]");
		webtest.typeAndClear("xpath=//input[@id='shop_name']","DBShop����������վ");
		webtest.typeAndClear("xpath=//input[@id='shop_extend_name']","��վ�е�ս����");
		webtest.click("xpath=//select[@id='dbshop_timezone']");
		webtest.click("xpath=//option[contains(@value,'Asia/Harbin')]");
		webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
		Thread.sleep(1000);
		assertTrue(webtest.ifContains("����ɹ�"));
	}
	
	
	// ��֤������Ϣ��д��Ҫ��ϵͳ�����У�
	@Test
	public void test15() throws Exception  {	
		//3.������Ϣ������ƷƷ�ʱ�֤����Ϊ������������Ʒ�������ʵ�����޴�Ʒ����λ���Ͽͻ��ɷ��Ĺ��򣡡�����Ʒ�ۺ����ȫ��������
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
		webtest.click("xpath=//a[contains(.,'������Ϣ')]");
		webtest.typeAndClear("xpath=//textarea[@name='goods_quality']","����������Ʒ�������ʵ�����޴�Ʒ����λ���Ͽͻ��ɷ��Ĺ��� ");
		webtest.enterFrame("ueditor_0");
		webtest.click("xpath=//body[contains(@class,view)]");
		webtest.typeAndClear("xpath=//body[contains(@class,view)]","ȫ������");
		webtest.leaveFrame();
		webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}	
	
	
	//������֤�����õ�Ҫ��ϵͳ�����У�
	@Test
	public void test17() throws Exception  {
	//2.��֤�����á���ȫ��ѡ��ʱ������Ϊ180
	webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
	webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
	webtest.click("xpath=//a[contains(.,'��֤������')]");
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
	webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
	assertTrue(webtest.ifContains("����ɹ�"));
	}
}
	// ��֤�ʼ����������ã�ϵͳ�����У�
	@Test
	public void test190() throws Exception  {	
	//3.�ʼ��������������������д
	webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
	webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
	webtest.click("xpath=//a[contains(.,'�ʼ�������')]");
	Boolean F = webtest.isChecked("xpath=//input[contains(@id,'email_service_state')]");
	if(F==false) {
			webtest.click("xpath=//input[contains(@id,'email_service_state')]");
	}else {
			webtest.typeAndClear("xpath=//input[@id='send_from_mail']","DBShop_test@126.com");
			webtest.typeAndClear("xpath=//input[@id='send_name']","��YUXUAN");		
			webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
	}
}	
	
	
	//��֤��Ʒ���ã�ϵͳ�����У�
		@Test
		public void test191() throws Exception  {				
			//1.��Ʒ���á�����Ʒ����ѡ��ٶȷ���(����ʽ)����Ʒ����ǰ׺ΪDBG
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
			webtest.click("xpath=//a[contains(.,'��Ʒ����')]");
			webtest.click("xpath=//select[@id='dbshop_goods_share']");
			webtest.mouseoverElement("xpath=//option[contains(@value,'/baidu/text.php')]");
			webtest.click("xpath=//option[contains(@value,'/baidu/text.php')]");
			webtest.typeAndClear("xpath=//input[@id='dbshop_goods_sn_prefix']","DBG");
			webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}	
		
		
		// ��֤ͳ�����ã�ϵͳ�����У�
		@Test
		public void test194() throws Exception {		
			//1.ͳ�����á����ٶ�ͳ���˻�Ϊ13313310702�����ٶ�ͳ������Ϊ0702
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
			webtest.click("xpath=//a[@href='#system_i']");
			webtest.click("xpath=//select[@name='shop_tongji_type']");
			webtest.mouseoverElement("xpath=//option[contains(.,'�ٶ�ͳ��')]");
			webtest.click("xpath=//option[contains(.,'�ٶ�ͳ��')]");
			webtest.typeAndClear("xpath=//input[@id='shop_tongji_baidu_user']", "13313310702");
			webtest.typeAndClear("xpath=//input[@id='shop_tongji_baidu_passwd']", "0702");
			webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}
		
		
		// ��֤�������ã�ϵͳ�����У�
		@Test
		public void test196() throws Exception {	
			//1.�������á���ѡ���ͻ�ʱ����ʾ���á���ѡ���˻��������� 
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'ϵͳ����')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			Boolean K =webtest.isChecked("xpath=//input[@id='user_order_refund']");
			if(K==false) {
					webtest.click("xpath=//input[@id='user_order_refund']");
			}else {
				Boolean L=webtest.isChecked("xpath=//input[@id='user_shipping_date']");
				if(L==false) {
						webtest.click("xpath=//input[@id='user_shipping_date']");
				}else {
					webtest.click("xpath=//button[contains(.,' ����ϵͳ����')]");	
					assertTrue(webtest.ifContains("����ɹ�"));
				}
			}
		}
	
	
	
	//��֤�����Ż����ã������Ż��У� 
		@Test
		public void test20()  throws Exception{		
			//�����Ż�������ѡǰ̨Gzipѹ����
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�����Ż�')]");
			webtest.click("xpath=//a[contains(.,'�����Ż�')]");
			Boolean A= webtest.isChecked("xpath=//input[@id='dbshop_front_compress']");
			if(A==false) {
				webtest.click("xpath=//input[@id='dbshop_front_compress']");
			}else {
			webtest.click("xpath=//button[contains(.,' ���������Ż�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
			}
		}
		
		
		//��֤ǰ̨��������Ҫ�������Ż��У� 
		@Test
		public void test21()  throws Exception{	
			//ǰ̨����״̬ѡ����ѡ�񡱡���ǰ̨����ʱ����д2����
					webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
					webtest.click("xpath=//a[contains(.,'�����Ż�')]");
					webtest.click("xpath=//a[contains(.,'ǰ̨����')]");
					webtest.click("xpath=//select[@id='front_cache_state']");
					webtest.mouseoverElement("xpath=//option[contains(.,'��ѡ��')]");
					webtest.click("xpath=//option[contains(.,'��ѡ��')]");
					webtest.typeAndClear("xpath=//input[@id='front_cache_time']", "2");
					webtest.click("xpath=//select[@id='front_cache_time_type']");
					webtest.mouseoverElement("xpath=//option[contains(.,'����')]");
					webtest.click("xpath=//option[contains(.,'����')]");
					webtest.click("xpath=//button[contains(.,' ���������Ż�����')]");
					assertTrue(webtest.ifContains("����ɹ�"));
		}
		@Test
		public void test22()  throws Exception{	
			//ǰ̨����״̬ѡ����ѡ�񡱡���ǰ̨����ʱ����д1Сʱ
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�����Ż�')]");
			webtest.click("xpath=//a[contains(.,'ǰ̨����')]");
			webtest.click("xpath=//select[@id='front_cache_state']");
			webtest.mouseoverElement("xpath=//option[contains(.,'����')]");
			webtest.click("xpath=//option[contains(.,'����')]");
			webtest.typeAndClear("xpath=//input[@id='front_cache_time']", "1");
			webtest.click("xpath=//select[@id='front_cache_time_type']");
			webtest.mouseoverElement("xpath=//option[contains(.,'Сʱ')]");
			webtest.click("xpath=//option[contains(.,'Сʱ')]");
			webtest.click("xpath=//button[contains(.,' ���������Ż�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}
		
	
		//��֤cdnͼƬ��������Ҫ�������Ż��У�
		@Test
		public void test23()  throws Exception{	
			//cdn����״̬ѡ��رա���ǰ����������д��ĩβ+��/��
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�����Ż�')]");
			webtest.click("xpath=//a[contains(.,'cdnͼƬ����')]");
			webtest.click("xpath=//input[@value='false']");
			webtest.typeAndClear("xpath=//input[@id='front_cdn_domain']","http://localhost:8032/DBShop/admin/optimization/");
			webtest.click("xpath=//button[contains(.,' ���������Ż�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}
		@Test
		public void test24()  throws Exception{	
			//cdn����״̬ѡ��رա���ǰ����������д��ȷ
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�����Ż�')]");
			webtest.click("xpath=//a[contains(.,'cdnͼƬ����')]");
			webtest.click("xpath=//input[@value='false']");
			webtest.typeAndClear("xpath=//input[@id='front_cdn_domain']","http://localhost:8032/DBShop/admin/optimization");
			webtest.click("xpath=//button[contains(.,' ���������Ż�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
			Thread.sleep(2000);
		}

	
     // ��֤��������Ҫ���ڸ��������У�
	@Test
	public void test30()  throws Exception{		
		//�����Ż�����ͼƬ�������ߴ�����Ϊ3000����ͼƬ���������ϴ����͹�ѡjpg
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
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
							webtest.click("xpath=//button[contains(.,' ���渽������')]");
							assertTrue(webtest.ifContains("����ɹ�"));
						}
					}
				}
			}
		
		}
	}
	@Test
	public void test31()  throws Exception{		
		//�����Ż�����ͼƬ�������ߴ�����Ϊ2000����ͼƬ���������ϴ����Ͳ���ѡ
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
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
							webtest.click("xpath=//button[contains(.,' ���渽������')]");
							assertTrue(webtest.ifContains("����ɹ�"));
						}
					}
				}
			}
		
		}
	}
	
	
	//��֤��ƷͼƬ����Ҫ���ڸ��������У� 
	@Test
	public void test32()  throws Exception{		
		//��΢ͼ��ȿղ���д����ͼƬ���ˮӡ��ѡ����ͼƬ������ʽ��ͼƬԭʼ���ơ�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��ƷͼƬ')]");
		webtest.typeAndClear("xpath=//input[@name='goods_thumb_width']", "  ");
		Boolean A= webtest.isChecked("xpath=//input[@name='goods_watermark_state']");
		if(A==false) {
			webtest.click("xpath=//input[@name='goods_watermark_state']");
		}else {
		webtest.click("xpath=//select[@id='goods_image_name_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'ͼƬԭʼ����')]");
		webtest.click("xpath=//option[contains(.,'ͼƬԭʼ����')]");
		webtest.click("xpath=//button[contains(.,' ���渽������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
		}
	}
	@Test
	public void test33()  throws Exception{		
		//��΢ͼ���400����ͼƬ���ˮӡ����ѡ����ͼƬ������ʽ��ͼƬԭʼ���ơ�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��ƷͼƬ')]");
		webtest.typeAndClear("xpath=//input[@name='goods_thumb_width']", "400");
		Boolean A= webtest.isChecked("xpath=//input[@name='goods_watermark_state']");
		if(A==true) {
			webtest.click("xpath=//input[@name='goods_watermark_state']");
		}else {
		webtest.click("xpath=//select[@id='goods_image_name_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'ͼƬԭʼ����')]");
		webtest.click("xpath=//option[contains(.,'ͼƬԭʼ����')]");
		webtest.click("xpath=//button[contains(.,' ���渽������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
		}
	}
	
	
	//��֤ˮӡ����Ҫ���ڸ��������У�
	@Test
	public void test34()  throws Exception{		
		//ˮӡ����״̬ѡ��ر�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'ˮӡ����')]");
		webtest.click("xpath=//select[@id='watermark_state']");
		webtest.mouseoverElement("xpath=//option[contains(.,'����')]");
		webtest.click("xpath=//option[contains(.,'����')]");
		webtest.click("xpath=//button[contains(.,' ���渽������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}
	@Test
	public void test35()  throws Exception{		
		//ˮӡ����״̬ѡ��ر�
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'ˮӡ����')]");
		webtest.click("xpath=//select[@id='watermark_state']");
		webtest.mouseoverElement("xpath=//option[contains(.,'�ر�')]");
		webtest.click("xpath=//option[contains(.,'�ر�')]");
		webtest.click("xpath=//button[contains(.,' ���渽������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
		Thread.sleep(1000);
	}
	
	
	//��֤�洢��ʽ����Ҫ���ڸ��������У�
	@Test
	public void test37()  throws Exception{		
		//��ƷͼƬѡ����ţ�ƴ洢
		webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'�洢��ʽ')]");
		webtest.click("xpath=//select[@id='storage_type']");
		webtest.mouseoverElement("xpath=//option[contains(.,'��ţ�ƴ洢')]");
		webtest.click("xpath=//option[contains(.,'��ţ�ƴ洢')]");
		webtest.click("xpath=//button[contains(.,' ���渽������')]");
		assertTrue(webtest.ifContains("����ɹ�"));
	}

	
	//��֤��������Ҫ���ڿͻ������У�
		@Test
		public void test40()  throws Exception{		
			//�������á����ͻ�ע��״̬ѡ��رա���ע��ر���ʾ��Ϣ��д�����ͻ�ע��Ĭ����Ϊ��ѡ��
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'��������')]");		
			webtest.click("xpath=//input[@name='user_register_state']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'��ʱ�ر�ע�Ṧ�ܣ�')]", "�رչر�ע�Ṧ�ܣ�");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'��ѡ��')]");
			webtest.click("xpath=//option[contains(.,'��ѡ��')]");
			webtest.click("xpath=//button[contains(.,' ����ͻ�����')]");
			assertTrue(webtest.ifContains("��ѡ��ͻ�Ĭ���飡"));
		}
		@Test
		public void test41()  throws Exception{		
			//�������á����ͻ�ע��״̬ѡ��������ע��ر���ʾ��Ϣ��д�����ͻ�ע��Ĭ����Ϊ��ͨ��Ա
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//select[@class='span2 valid']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'��ʱ�ر�ע�Ṧ�ܣ�')]", "Ҫ��ʱ�رչر�ע�Ṧ�ܣ�");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'��ͨ��Ա')]");
			webtest.click("xpath=//option[contains(.,'��ͨ��Ա')]");
			webtest.click("xpath=//button[contains(.,' ����ͻ�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}
		@Test
		public void test42()  throws Exception{		
			//�������á����ͻ�ע��״̬ѡ��رա���ע��ر���ʾ��Ϣ��д�����ͻ�ע��Ĭ����Ϊ��ͨ��Ա
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//select[@class='span2 valid']");
			webtest.typeAndClear("xpath=//textarea[contains(.,'��ʱ�ر�ע�Ṧ�ܣ�')]", "Ҫ��ʱ�رչر�ע�Ṧ�ܣ�");
			webtest.click("xpath=//select[@id='default_group_id']");
			webtest.mouseoverElement("xpath=//option[contains(.,'��ͨ��Ա')]");
			webtest.click("xpath=//option[contains(.,'��ͨ��Ա')]");
			webtest.click("xpath=//button[contains(.,' ����ͻ�����')]");
			assertTrue(webtest.ifContains("����ɹ�"));
		}
		
		
		// ��֤ע�����¼����Ҫ���ڿͻ������У�
		@Test
		public void test43()  throws Exception{		
			//ע�����¼���á���ϵͳע�������õ��������ѡ�����绰����ѡ�����á������õ�¼����ʽȫ����ѡ������������¼�������������ѡ�����ã�δ������������¼��
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'ע�����¼')]");
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
							webtest.click("xpath=//button[contains(.,' ����ͻ�����')]");
							assertTrue(webtest.ifContains("����ɹ�"));
						}
					}
				}
			}
		}
		@Test
		public void test44()  throws Exception{		
			//ע�����¼���á���ϵͳע�������õ�������ѡ�����á����绰���빴ѡ�������õ�¼����ʽ��ѡ�����ʼ�������������¼�������������ѡ�����ã��ѿ�����������¼
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'ע�����¼')]");
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
							webtest.click("xpath=//button[contains(.,' ����ͻ�����')]");
							assertTrue(webtest.ifContains("����ɹ�"));
						}
					}
				}
			}
		}
		
		
		//��֤��������¼����Ҫ���ڿͻ������У�
		@Test
		public void test45() throws Exception{	
//			��������¼
//			ǰ̨����ѡ����ʾ����QQ������¼ѡ��رա���΢�ŵ�¼��ѡ��رա��� 
//			΢�ŵ�¼(��վ)ѡ��رա���֧������¼ѡ��ر�
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'�ͻ�����')]");
			webtest.click("xpath=//a[contains(.,'��������¼')]");
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
			
		
		//��֤��ӻ��ҹ��ܣ��ڻ��������У�
		@Test
		public void test50()  throws Exception{		
			//��ӻ��ҡ�������ѡ����Ԫ�������������ơ���Ԫ������С��λ����4���������һ��ʡ�6.8362����������״̬����
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//a[contains(.,' ��ӻ���')]");
			webtest.click("xpath=//span[contains(.,'������������')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "��Ԫ");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "��Ԫ");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "6.8362");
			webtest.click("xpath=//option[contains(.,'����')]");
			webtest.click("xpath=//button[contains(.,' ���������Ϣ')]");
			assertTrue(webtest.ifContains("��������"));
		}
		@Test
		public void  test51()  throws Exception{		
			//��ӻ��ҡ�������ѡ����Ԫ�������������ƿա���С��λ����4���������һ��ʡ�6.8362����������״̬����
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//a[contains(.,' ��ӻ���')]");
			webtest.click("xpath=//span[contains(.,'������������')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "��Ԫ");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", " ");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "6.8362");
			webtest.click("xpath=//option[contains(.,'����')]");
			webtest.click("xpath=//button[contains(.,' ���������Ϣ')]");
			assertTrue(webtest.ifContains("�������Ʋ���Ϊ��"));
		}
		@Test
		public void  test52()  throws Exception{		
			//��ӻ��ҡ�������ѡ��Ӣ���������������ơ�Ӣ��������С��λ����4���������һ��ʡ�6.8362����������״̬����
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//a[contains(.,' ��ӻ���')]");
			webtest.click("xpath=//span[contains(.,'������������')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "Ӣ��");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "Ӣ��");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "4");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "8.7141");
			webtest.click("xpath=//option[contains(.,'����')]");
			webtest.click("xpath=//button[contains(.,' ���������Ϣ')]");
			assertTrue(webtest.ifContains("��������"));
			Thread.sleep(2000);
		}
		@Test
		public void  test53()  throws Exception{		
			//��ӻ��ҡ�������ѡ��Ӣ���������������ơ�Ӣ��������С��λ����8���������һ��ʡ�6.8362����������״̬����
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//a[contains(.,' ��ӻ���')]");
			webtest.click("xpath=//span[contains(.,'������������')]");
			webtest.typeAndClear("xpath=//input[@autocomplete='off']", "Ӣ��");		
			webtest.click("xpath=//input[@autocomplete='off']");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "Ӣ��");
			webtest.typeAndClear("xpath=//input[@id='currency_decimal']", "8");
			webtest.typeAndClear("xpath=//input[@id='currency_rate']", "8.7141");
			webtest.click("xpath=//option[contains(.,'����')]");
			webtest.click("xpath=//button[contains(.,' ���������Ϣ')]");
			assertTrue(webtest.ifContains("λ�����Ϊ6��"));
		}
		
		
		//��֤�༭���Ĺ��ܣ����������У�
		@Test
		public void  test54()  throws Exception{		
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'�༭')]");
			assertTrue(webtest.ifContains("�༭����"));
		}
		
		
		//��֤�༭�Ĺ��ܣ����������У�
		@Test
		public void  test55()  throws Exception{		
			webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
			webtest.click("xpath=//a[contains(.,'��������')]");
			webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'�༭')]");
			webtest.typeAndClear("xpath=//input[@id='currency_name']", "����");
			webtest.click("xpath=//button[contains(.,' ���������Ϣ')]");
			assertTrue(webtest.ifContains("��������"));
		}
		
		
		//��֤ˢ�¼��Ĺ��ܣ����������У�
			@Test
			public void test56()  throws Exception{		
	 		    webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.click("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'�༭')]");
				webtest.click("xpath=//a[contains(.,' ˢ��')]");
				assertTrue(webtest.ifContains("�༭����"));
			}
		
			
			//��֤���ػ����б���Ĺ��ܣ����������У�
			@Test
			public void  test57()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");					
				webtest.click("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'�༭')]");
				webtest.click("xpath=//a[contains(.,' ���ػ����б�')]");
				assertTrue(webtest.ifContains("��������"));
			}

			
			//��֤ɾ�����Ĺ��ܣ����������У�
			@Test
			public void  test58()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");					
				webtest.click("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//table/tbody/tr[last()-1]/td[8]/a[contains(.,'ɾ��')]");
				webtest.alertAccept();
				assertTrue(webtest.ifContains("��������"));
				Thread.sleep(5000);
			}

		
			//��֤�༭�Ĺ���(֧��������)
			@Test
			public void test60()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.click("xpath=//a[contains(.,'֧������')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'�༭')]");
				webtest.typeAndClear("xpath=//input[@value='֧����֧��']", "֧����֧����ʽ");
				webtest.click("xpath=//button[contains(.,' ����֧����ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("����ɹ�"));
			}
			
			
			//��֤ˢ�µĹ���(֧��������)
			@Test
			public void test61()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.click("xpath=//a[contains(.,'֧������')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'�༭')]");
				webtest.click("xpath=//a[contains(.,' ˢ��')]");
				assertTrue(webtest.ifContains("�༭֧����ʽ"));
			}
			
			
			//��֤���ػ����б���Ĺ��ܣ�֧�������У�
			@Test
			public void  test62()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");					
				webtest.click("xpath=//a[contains(.,'֧������')]");
				webtest.click("xpath=//table/tbody/tr[last()]/td[9]/a[contains(.,'�༭')]");
				webtest.click("xpath=//a[contains(.,' ����֧����ʽ�б�')]");
				assertTrue(webtest.ifContains("֧������"));
				Thread.sleep(3000);
			}
	
	//��֤������ͷ�ʽ���ܣ������������У�
			@Test
			public void test70()  throws Exception{		
				//������ͷ�ʽ��������(��˾)���ƣ�����ͨ��ݡ���������(��˾)��飺��һ����������Ĺ�˾����������״̬����������
				//�����������򣺡�255�������������÷�ʽ����ͳһ���á��������ͷ��ã���ʽ��:
				//�������;������շѵ�,ʡ�ڼ�1����֮��,һ��ʮԪ����,ÿ����1����,�ټӶ�����Ԫ,ʡ���12��15һ����,ÿ����1�������������Ԫ

				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' ������ͷ�ʽ')]");
				webtest.click("xpath=//a[contains(.,'������Ϣ')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "��ͨ���");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "һ����������Ĺ�˾");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//input[@value='T']");
				webtest.typeAndClear("xpath=//input[@id='express_price']","�������;������շѵ�,ʡ�ڼ�1����֮��,һ��ʮԪ����,ÿ����1����,�ټӶ�����Ԫ,ʡ���12��15һ����,ÿ����1�������������Ԫ");
				webtest.click("xpath=//button[contains(.,' �������ͷ�ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("���͹���"));
			}
			@Test
			public void  test71()  throws Exception{		
				//������ͷ�ʽ��������(��˾)����Ϊ�ա�������(��˾)��飺��һ����������Ĺ�˾����������״̬���������������������򣺡�255��
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");
				webtest.click("xpath=//a[contains(.,' ������ͷ�ʽ')]");
				webtest.click("xpath=//a[contains(.,'������Ϣ')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", " ");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "һ����������Ĺ�˾");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//button[contains(.,' �������ͷ�ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("�������Ʋ���Ϊ�գ�"));
			}
			@Test
			public void  test72()  throws Exception{		
				//������ͷ�ʽ��������(��˾)���ƣ�����ͨ��ݡ���������(��˾)��飺��һ����������Ĺ�˾����������״̬���������������������򣺡� ��
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' ������ͷ�ʽ')]");
				webtest.click("xpath=//a[contains(.,'������Ϣ')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "��ͨ���");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "һ����������Ĺ�˾");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//input[@value='1']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "  ");			
				webtest.click("xpath=//button[contains(.,' �������ͷ�ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("����������Ϊ�գ�"));
			}
			@Test
			public void test73()  throws Exception{		
				//������ͷ�ʽ��������(��˾)���ƣ�����ͨ��ݡ���������(��˾)��飺��һ����������Ĺ�˾����������״̬�����رա������������򣺡�255��
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//a[contains(.,' ������ͷ�ʽ')]");	
				webtest.click("xpath=//a[contains(.,'������Ϣ')]");		
				webtest.typeAndClear("xpath=//input[@id='express_name']", "��ͨ���");		
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "һ����������Ĺ�˾");
				webtest.click("xpath=//select[@class='span1 valid']");
				webtest.mouseoverElement("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//option[contains(.,'֧��')]");
				webtest.click("xpath=//input[@value='0']");
				webtest.typeAndClear("xpath=//input[@id='express_sort']", "255");			
				webtest.click("xpath=//button[contains(.,' �������ͷ�ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("���͹���"));
			}
			
			//��֤���������еı༭�Ĺ���(����������)
			@Test
			public void test74()  throws Exception{		
				webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
				webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
				webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
				webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'�༭')]");
				webtest.typeAndClear("xpath=//textarea[@id='express_info']", "һ����������Ĺ�˾");
				webtest.click("xpath=//button[contains(.,' �������ͷ�ʽ��Ϣ')]");
				assertTrue(webtest.ifContains("���͹���"));
			}
			
					
			//��֤���������е�ˢ�¼��Ĺ���(����������)
				@Test
				public void  test75()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'�༭')]");
	     			webtest.click("xpath=//a[contains(.,' ˢ��')]");
					assertTrue(webtest.ifContains("�༭���ͷ�ʽ"));
				}
			
				
				//��֤���������еķ������ͷ�ʽ�б���Ĺ���(����������)
				@Test
				public void  test76()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");		
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'�༭')]");
					webtest.click("xpath=//a[contains(.,' �������ͷ�ʽ�б�')]");
					assertTrue(webtest.ifContains("���͹���"));
				}
				
				
				//��֤���������е�ɾ�����Ĺ���(����������)
				@Test
				public void test77()  throws Exception{		
					webtest.click("xpath=//a[contains(.,'ϵͳ���� ')]");
					webtest.mouseoverElement("xpath=//a[contains(.,'��������')]");
					webtest.click("xpath=//a[@href='/DBShop/admin/express']");	
					webtest.click("xpath=//table/tbody/tr[last()]/td[7]/a[contains(.,'ɾ��')]");
					webtest.alertAccept();
					assertTrue(webtest.ifContains("���͹���"));
				}
				
}
