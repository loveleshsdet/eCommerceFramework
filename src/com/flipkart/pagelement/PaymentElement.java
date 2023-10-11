package com.flipkart.pagelement;

import org.openqa.selenium.By;

public class PaymentElement {
	String method="//div[contains(text(),'Credit / Debit / ATM Card')]";
	String card="//input[@name='cardNumber']"; //label[contains(text(),'Enter Card Number')]
	String month="//select[@name='month']";
	String year="//select[@name='year']";
	String cvv="//input[@type='password']";   //input[@name='cvv']
	String pay="//butto[contains(text(),'PAY')]";   
	///html/body/div[1]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[2]/div[2]/div/div/div/form/div[4]/button
	public By method() {
		return By.xpath(method);
	}
	
	public By card() {
		return By.xpath(card);
	}
	public By month() {
		
		return By.xpath(month);
	}
	
	public By year() {
		return By.xpath(year);
	}
	public By cvv() {
		return By.xpath(cvv);
	}
	public By pay() {
		return By.xpath(pay);
	}
}
