package com.flipkart.pageobject;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.RemoveFromCartElement;

public class RemoveFromCartPage {
	
	RemoveFromCartElement rfce= new RemoveFromCartElement();
	ActionDriver act= new ActionDriver(ActionDriver.driver);	
	
	public void removeProductsFromCart() {
		
		 act.click(rfce.getRemoveProduct1());
		 act.waitByVisibility(rfce.getRemoveToCartBtn());
		 act.click(rfce.getRemoveToCartBtn());
	}
}
