package com.flipkart.testcases;
import org.testng.annotations.Test;

import com.flipkart.dataprovider.DataProviderForCheckOut;
import com.flipkart.dataprovider.DataProviderForLoginPage;
import com.flipkart.pageobject.CheckOutPage;

public class CheckOutPageTest {
	
	@Test(dataProviderClass=DataProviderForCheckOut.class,dataProvider="checkOutUserDetails") 
	public void Checking_OutFromCart(String name, String mobile,String pincode, String location,String addre) throws InterruptedException {
		
		CheckOutPage obj=new CheckOutPage();
		obj.data(name, mobile, pincode, location, addre);		
		try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TBD: Auto-generated catch block.
			e.printStackTrace();
		}
  
	}
}
