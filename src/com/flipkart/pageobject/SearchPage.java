package com.flipkart.pageobject;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.SearchPageElement;

public class SearchPage {
	SearchPageElement spele=new SearchPageElement();
	ActionDriver act=new ActionDriver(ActionDriver.driver);

public void searchProduct(String value) {
	
	act.clear(spele.getSearchBox());
	act.type(spele.getSearchBox(),value);	
	act.waitByVisibility(spele.getSearchBox());
}

public void clickSearchBtn() {	
	
	act.click(spele.getSearchBtn());
	act.waitByVisibility(spele.getSearchBtn());
	
  }
}