package com.flipkart.pageobject;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.CheckOutElement;

public class CheckOutPage {	
	ActionDriver act=new ActionDriver(ActionDriver.driver);
	CheckOutElement e=new CheckOutElement();
	
	public void data(String name,String mobile,String pincode,String location,String addre){
		
		act.waitByVisibility(e.checkingout());
		act.click(e.checkingout());
		act.waitByVisibility(e.change());
		act.click(e.change());
		act.waitByVisibility(e.Editing());
		act.click(e.Editing());
		
		act.waitByVisibility(e.getName());
		act.clear(e.getName());
		act.type(e.getName(), name);
		act.clear(e.getMobile());
		act.type(e.getMobile(), mobile);
		act.clear(e.getLocality());
		act.type(e.getLocality(), location);
		act.clear(e.getAddress());
		act.type(e.getAddress(),addre);
		act.clear(e.getPinCode());
		act.type(e.getPinCode(), pincode);
		
		try
		{			
			Thread.sleep(5000);
		}
		catch(Exception e){			
		}
		act.click(e.getAddressType());
		act.click(e.getSaveBtn());
		act.waitByVisibility((e.getContinue()));
		act.click(e.getContinue());				
	}
}
