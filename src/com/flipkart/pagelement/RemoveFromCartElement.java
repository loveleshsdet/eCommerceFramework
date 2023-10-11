package com.flipkart.pagelement;
import org.openqa.selenium.By;

public class RemoveFromCartElement {
	String removeProduct1="//div[contains(text(),'Remove')]";
	String removeToCartBtn="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']";

	public By getRemoveProduct1() {		
		return By.xpath(removeProduct1);
	}	
	public By getRemoveToCartBtn() {
		return By.xpath(removeToCartBtn);		
	}
}
