package com.flipkart.pagelement;

import org.openqa.selenium.By;

public class LoginPageElement {

	String username="(//input[@class='_2zrpKA _1dBPDZ'])";	
	String password="(//input[@class='_2zrpKA _3v41xv _1dBPDZ'])";
	String loginBtn="//button[@class='_2AkmmA _1LctnI _7UHT_c']";
	
	public By getUsername(){
		return By.xpath(username);
	}
	
	public By getPassword= By.xpath(password);
	
	public By getLoginBtn(){
		return By.xpath(loginBtn);
	}
}
