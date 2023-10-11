package com.flipkart.testcases;
import org.testng.annotations.Test;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.RemoveFromCartElement;
import com.flipkart.pageobject.RemoveFromCartPage;

public class RemoveFromCartPageTest {	
	ActionDriver act=new ActionDriver(ActionDriver.driver);
	RemoveFromCartPage pg=new RemoveFromCartPage();
	RemoveFromCartElement re=new RemoveFromCartElement();	
  
  @Test
  public void Removing_FromCart() throws InterruptedException {	 
		pg.removeProductsFromCart();
		Thread.sleep(3000);
		act.waitByVisibility(re.getRemoveProduct1());
	    pg.removeProductsFromCart();
	    Thread.sleep(3000);
	    //act.waiting(re.getRemoveToCartBtn());
	    //pg.removeProductsFromCart();	  
  }  
  
}
