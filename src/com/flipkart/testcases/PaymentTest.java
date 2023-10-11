package com.flipkart.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.dataprovider.DataProviderForCheckOut;
import com.flipkart.dataprovider.DataProviderForPayment;
import com.flipkart.pageobject.PaymentPage;

public class PaymentTest {
	PaymentPage p=new PaymentPage();	
	
  @Test(dataProviderClass=DataProviderForPayment.class,dataProvider="cardNumberVerification")
  public void payment(String cardNumber1,String mon1,String year1,String cvv1) throws InterruptedException {
		Thread.sleep(3000);
	  p.payments(cardNumber1, mon1, year1, cvv1);
	  
  }
}
