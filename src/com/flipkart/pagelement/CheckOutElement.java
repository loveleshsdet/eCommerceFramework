package com.flipkart.pagelement;
import org.openqa.selenium.By;

public class CheckOutElement {
	String change="/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div/div/button";
	String Edit="/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/label/div[2]/div/div[2]/button";
	String button="//span[contains(text(),'Place Order')]";
	
	String name="//input[@name='name']";
	String mobile="//input[@name='phone']";
	String pincode="//input[@name='pincode']";
	String locality="//input[@name='addressLine2']";
	String address="//textarea[@name='addressLine1']";
	String addressType="//span[contains(text(),'Home (All day delivery)')]";
	String saveBtn="//button[contains(text(),'Save and Deliver Here')]";
	String cont ="//button[contains(text(),'CONTINUE')]";
	
	public By checkingout() {
		return By.xpath(button);		
	}
	public By getName() {
		return By.xpath(name);
	}	
	public By getMobile() {		
		return By.xpath(mobile);
	}
	public By getPinCode() {		
		return By.xpath(pincode);		
	}
	public By getLocality() {
		return By.xpath(locality);
	}
	public By getAddress() {
		return By.xpath(address);
	}
	public By getAddressType() {
		return By.xpath(addressType);
	}
	public By getSaveBtn() {
		return By.xpath(saveBtn);
	}
	public By getContinue() {		
		 return By.xpath(cont);
	}
	public By change() {
		return By.xpath(change);
	}
	public By Editing() {
		return By.xpath(Edit);
	}
}
