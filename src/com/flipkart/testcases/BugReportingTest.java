package com.flipkart.testcases;

import org.testng.annotations.Test;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import com.flipkart.core.ActionDriver;
import com.flipkart.pageobject.MantisPage;

public class BugReportingTest {
	
	MantisPage pg=new MantisPage();
	
	@Test
	public void mant(String username,String pass,String cat,String adata,String adata1) {
		
		JavascriptExecutor e=(JavascriptExecutor)ActionDriver.driver;
	    e.executeScript("window.open()");
	    ArrayList<String> a= new ArrayList<String>(ActionDriver.driver.getWindowHandles());
	    ActionDriver.driver.switchTo().window(a.get(4));
	    ActionDriver.driver.get("http://mantis.mobilytedev.com/login_page.php");		
	    pg.username(username, pass);
	    pg.data(cat, adata, adata1);
	    
  }
}
