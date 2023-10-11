package com.flipkart.pagelement;

import org.openqa.selenium.By;

public class SearchPageElement {
	String searchBox="//input[@title='Search for products, brands and more']";
	String searchBtn="//button[@class='vh79eN']";

	public By getSearchBox() {
		return By.xpath(searchBox);
	}
	
	public By getSearchBtn() {		
		return By.xpath(searchBtn);
	}
}
