package com.flipkart.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.flipkart.pageobject.SearchPage;

public class SearchPageTest {
	@Parameters({"searchKey"})
	@Test
	public void Search_Product(String str){		
		SearchPage searchPage=new SearchPage();
		searchPage.searchProduct(str);		
		searchPage.clickSearchBtn();		
	}
}