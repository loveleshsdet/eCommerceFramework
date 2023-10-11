package com.flipkart.testcases;
import org.testng.annotations.Test;
import com.flipkart.pageobject.AddToCartPage;

public class AddToCartPageTest {
	 @Test
	  public void Adding_ToCart() throws InterruptedException {
		  AddToCartPage add=new AddToCartPage();
		  add.selectProduct();
		  Thread.sleep(3000);
		  add.addProductsToCart();
		  Thread.sleep(5000);	  
	  }
}
