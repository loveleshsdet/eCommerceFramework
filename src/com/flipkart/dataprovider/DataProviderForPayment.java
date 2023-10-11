package com.flipkart.dataprovider;

import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.flipkart.utility.ExcelHandler;

public class DataProviderForPayment {

	@DataProvider
	public static Object[][] cardNumberVerification(ITestContext context) throws Exception{
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String sheetName=context.getCurrentXmlTest().getParameter("sheetName");

		  File location=new File(System.getProperty("user.dir")+excelLoc);
		  ExcelHandler excel=new ExcelHandler(location);
		  excel.selectSheet(sheetName);
		  String cardNumber=excel.getColumn(1).get(8).getContents();
		  String expiryMonth=excel.getColumn(2).get(8).getContents();
		  String expiryYear=excel.getColumn(3).get(8).getContents();
		  String cvv=excel.getColumn(4).get(8).getContents();
		
		return new Object[][] {{cardNumber,expiryMonth,expiryYear,cvv}};	
	}
	
}
