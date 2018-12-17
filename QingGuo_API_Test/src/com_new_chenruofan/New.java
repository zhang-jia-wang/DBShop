package com_new_chenruofan;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class New{
	public CloseableHttpClient httpclient = HttpClients.createDefault();
	
	public void login(String request) throws ClientProtocolException, IOException {
		HttpPost httpPost = new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
		httpPost.setHeader("Content-Type","application/json");
		StringEntity entity = new StringEntity(request,"utf-8");
		httpPost.setEntity(entity);
		CloseableHttpResponse response=httpclient.execute(httpPost);
		HttpEntity httpEntity = response.getEntity();
		System.out.println("login��ִ�н���ǣ�" + EntityUtils.toString(httpEntity));
		
		EntityUtils.consume(httpEntity);
		response.close();
	}
	
	public void add_address(String request1,String request2) throws ClientProtocolException, IOException {
		login(request1);
		HttpPost httpPost = new HttpPost("http://study-perf.qa.netease.com/fgadmin/address/new");
		httpPost.setHeader("Content-Type","application/json");
		StringEntity entity = new StringEntity(request2,"utf-8");
		httpPost.setEntity(entity);
		CloseableHttpResponse response=httpclient.execute(httpPost);
		HttpEntity httpEntity = response.getEntity();
		System.out.println("add_address��ִ�н���ǣ�" + EntityUtils.toString(httpEntity));
		EntityUtils.consume(httpEntity);
		response.close();
	}
	
	
	
	
	@Test
	public void addressnew_1() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_2() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":123,\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_3() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":12345678901,\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_4() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":123}"
			);
	}
	@Test
	public void addressnew_5() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":571,\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_6() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":571,\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_7() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":571,\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_8() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_9() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_10() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\"}"
			);
	}
	@Test
	public void addressnew_11() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_12() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_13() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_14() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�Ϻ���\",\"city\":\"�Ϻ���\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"������ѧ\"}"
			);
	}
	@Test
	public void addressnew_15() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�Ͼ���ѧ\"}"
			);
	}
	@Test
	public void addressnew_16() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"�Ͼ���\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�Ͼ���ѧ\"}"
			);
	}
	@Test
	public void addressnew_17() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"����ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�Ͼ���ѧ\"}"
			);
	}
	@Test
	public void addressnew_18() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�Ͼ���ѧ\"}"
			);
	}
	@Test
	public void addressnew_19() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_20() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678902\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ҵ��ѧ\"}"
			);
	}
	@Test
	public void addressnew_21() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"0\",\"password\":\"3\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_22() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
	@Test
	public void addressnew_23() throws ClientProtocolException, IOException {
		add_address(
			"{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}",
			"{\"id\":\"\",\"receiverName\":\"����\",\"cellPhone\":null,\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\"\r\n" + ":\"������\",\"addressDetail\":\"�㽭��ѧ\"}"
			);
	}
}
