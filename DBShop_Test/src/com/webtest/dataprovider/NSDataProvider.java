package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class NSDataProvider {

	
	@DataProvider(name="txt")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/user.cvs");
	}

	@DataProvider(name="excel")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("‪E://demo//a.xlsx","Sheet1");
	}
	
	@DataProvider(name="mysql")
	public Object[][] getMysqlDada() throws IOException{
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + 
				"FROM `mm_movie` ");
	}
	
	@DataProvider(name="excel_add_customer")
	public Object[][] excel_add_customer() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/add_customer.xlsx","Sheet1");
	}
	
}
