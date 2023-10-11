package com.flipkart.testcases;

import org.testng.annotations.Test;
import com.flipkart.pageobject.HomePage;
import com.flipkart.pageobject.LoginPage;
import com.flipkart.core.OpenAndCloseBrowser;
import com.flipkart.dataprovider.DataProviderForLoginPage;

public class LoginPageTest extends OpenAndCloseBrowser {
	LoginPage loginPage;
  @Test(description="1. Type valid credentials<br> 2. Click on login button",dataProviderClass=DataProviderForLoginPage.class,dataProvider="validCredentialsProvider",priority = 0)
  public void signIn_validCredentials(String username,String password) throws Exception {
	 
	  loginPage=new LoginPage(driver);
	  HomePage homePage= loginPage.signIn(username,password);	 
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TBD: Auto-generated catch block.
			e.printStackTrace();
		}
   }
}