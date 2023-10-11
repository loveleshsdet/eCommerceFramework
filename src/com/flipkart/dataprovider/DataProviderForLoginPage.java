package com.flipkart.dataprovider;

import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.flipkart.utility.ExcelHandler;

public class DataProviderForLoginPage {
	
	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{
	String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
	String sheetName=context.getCurrentXmlTest().getParameter("sheetName");

	  File location=new File(System.getProperty("user.dir")+excelLoc);
	  ExcelHandler excel=new ExcelHandler(location);
	  excel.selectSheet(sheetName);
	  String username=excel.getColumn(1).get(2).getContents();
	  String password=excel.getColumn(2).get(2).getContents();
	  
      return new Object[][]{{username,password}};
	}


}
