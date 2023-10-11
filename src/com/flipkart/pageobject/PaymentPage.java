package com.flipkart.pageobject;

import com.flipkart.core.ActionDriver;
import com.flipkart.utility.CardNumberValidation;
import com.flipkart.pagelement.PaymentElement;
public class PaymentPage {
	CardNumberValidation card=new CardNumberValidation();
	PaymentElement ele=new PaymentElement();
	ActionDriver act=new ActionDriver(ActionDriver.driver);
	public void payments(String cardNumber,String mon,String year,String cvv) {
		if(card.checkLuhn(cardNumber)) {
			act.waitByVisibility(ele.method());
			act.click(ele.method());
			act.waitByVisibility(ele.card());
			act.type(ele.card(), cardNumber);
			//act.waitByVisibility(ele.month());
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				
			}
			act.getDropdown(ele.month(), mon);
			//act.waitBySelect(ele.month());
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				
			}
			act.getDropdown(ele.year(), year);
			//act.waitBySelect(ele.year());
			act.type(ele.cvv(), cvv);
			act.click(ele.pay());
		}
		else {
			System.out.println("Please enter a valid card number");
		}
		
	}
	
}
