package com.flipkart.pagelement;

import org.openqa.selenium.By;

public class AddToCartElement {
	String addProduct1=	"//div[contains(text(),'Samsung Galaxy A50 (Black, 64 GB)')]";
	String addProduct2="//div[contains(text(),'Samsung Galaxy A50 (Blue, 64 GB)')]";
	String addProduct3="//div[contains(text(),'Samsung Galaxy A50 (White, 64 GB)')]";
	String addToCartBtn="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']";
	public By getAddProduct1() {
		return By.xpath(addProduct1);		
	}
	public By getAddProduct2() {
		return By.xpath(addProduct2);		
	}
	public By getAddProduct3() {
		return By.xpath(addProduct3);
	}	
	public By getAddToCartBtn() {
		return By.xpath(addToCartBtn);
	}
}
