package com.flipkart.dataprovider;

import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.flipkart.utility.ExcelHandler;

public class DataProviderForCheckOut {

	@DataProvider
	public static Object[][] checkOutUserDetails(ITestContext context) throws Exception {
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String sheetName=context.getCurrentXmlTest().getParameter("sheetName");

		  File location=new File(System.getProperty("user.dir")+excelLoc);
		  ExcelHandler excel=new ExcelHandler(location);
		  excel.selectSheet(sheetName);
		  String Name=excel.getColumn(1).get(5).getContents();
		  String Mobile=excel.getColumn(2).get(5).getContents();
		  String pinc=excel.getColumn(3).get(5).getContents();
		  String loca=excel.getColumn(4).get(5).getContents();
		  String addr=excel.getColumn(5).get(5).getContents();
		  
		return new Object[][] {{Name,Mobile,pinc,loca,addr}};
	}
	
}
