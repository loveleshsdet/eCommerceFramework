package com.flipkart.pagelement;
import org.openqa.selenium.By;

public class MantisPageElement {
	
	String username="/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/label/span/input";
	String submitBtn="//input[@type='submit']";
	String password="//input[@id='password']";
	String reportissue="//span[contains(text(),'Report Issue')]";
	String category="//select[@id='category_id']";
	String summary="//input[@id='summary']";
	String description="//textarea[@id='description']";
	String Private="/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[2]/span";
		
	public By getUsername() {
		return By.xpath(username);		
	}
	public By getPassword() {
		return By.xpath(password);
	}
	public By getSubmitBtn() {		
		return By.xpath(submitBtn);
	}
	public By getReportIssue() {
		return By.xpath(reportissue);		
	}
	public By getBugCategory() {		
		return By.xpath(category);
	}
	public By getBugSummary() {		
		return By.xpath(summary);
	}
	public By getBugDesc() {		
		return By.xpath(description);
	}
	public By Private_radio() {		
		return By.xpath(Private);
	}
}
