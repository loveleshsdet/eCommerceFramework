package com.flipkart.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDriver {
	
	public static WebDriver driver;
	
	public ActionDriver(WebDriver driver){
		this.driver=driver;
	}
	
	public void type(By locator,String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public void click(By locator){
		driver.findElement(locator).click();
	}
	public void clear(By Locator) {
		driver.findElement(Locator).clear();
	}
	
	public String getText(By locator){
		return driver.findElement(locator).getText();		
	}
	
	public boolean valueEqualTo(By locator,String value){
		return driver.findElement(locator).getText().equals(value);		
	}
	
	public String getTitle(){
		return driver.getTitle();		
	}
	
	public void waitByVisibility(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locator)));
	}
	
	public void waitByClickable(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locator)));
	}
	
	public void waitBySelect(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(Locator)));
	}
	
	public void getDropdown(By Locator,String Value) {
		Select s=new Select(driver.findElement(Locator));
		s.selectByVisibleText(Value);
	}

}
