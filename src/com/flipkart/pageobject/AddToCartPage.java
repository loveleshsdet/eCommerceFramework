package com.flipkart.pageobject;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.AddToCartElement;
import com.flipkart.pagelement.SearchPageElement;

public class AddToCartPage {
	
	AddToCartElement atce=new AddToCartElement();
	ActionDriver act=new ActionDriver(ActionDriver.driver);
	AddToCartElement ss=new AddToCartElement();
	SearchPageElement pg=new SearchPageElement();
	
	public void selectProduct() {
		
		act.waitByVisibility((atce.getAddProduct1()));		
		act.click(atce.getAddProduct1());
		act.click(atce.getAddProduct2());
		act.click(atce.getAddProduct3());
	}
	
	public void addProductsToCart()  {
		
			ArrayList<String> a= new ArrayList<String>(ActionDriver.driver.getWindowHandles());
			ActionDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			ActionDriver.driver.switchTo().window(a.get(1));	
		
			act.click(atce.getAddToCartBtn());
			ActionDriver.driver.switchTo().window(a.get(0));		
			ActionDriver.driver.switchTo().window(a.get(2));
	
			act.waitByVisibility(atce.getAddToCartBtn());
			act.click(atce.getAddToCartBtn());
			ActionDriver.driver.switchTo().window(a.get(0));
		
			ActionDriver.driver.switchTo().window(a.get(3));
			act.click(atce.getAddToCartBtn());		
		}			
	}
