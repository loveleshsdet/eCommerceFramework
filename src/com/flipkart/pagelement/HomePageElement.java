package com.flipkart.pagelement;

import org.openqa.selenium.By;

public class HomePageElement {
	String verifyUser="//*[@class='alignR']";
	
	public By getVerifyUser(){
		return By.xpath(verifyUser);
	}
	
}
