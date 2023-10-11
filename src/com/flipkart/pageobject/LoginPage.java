package com.flipkart.pageobject;
import org.openqa.selenium.WebDriver;
import com.flipkart.pagelement.LoginPageElement;
import com.flipkart.pagelement.SearchPageElement;

import com.flipkart.core.ActionDriver;

public class LoginPage extends ActionDriver{
	
	LoginPageElement lpe=new LoginPageElement();
	SearchPageElement eles=new SearchPageElement();
	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		if(!getTitle().equalsIgnoreCase("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
		throw new Exception("This is not a flipkart login page and page is : "+getTitle());
		}
	}
    public LoginPage typeUsername(String value){
    	type(lpe.getUsername(), value);
    	return this;
    }
    public LoginPage typePassword(String value){
    	type(lpe.getPassword, value);
    	
    	return this;
    }
    public HomePage clickLoginButton(){
    	click(lpe.getLoginBtn());
    	return new HomePage(driver);
    }
    public HomePage signIn(String username,String password){
    	type(lpe.getUsername(), username);
    	type(lpe.getPassword, password);
    	click(lpe.getLoginBtn());
    	return new HomePage(driver);
    }

    
}

