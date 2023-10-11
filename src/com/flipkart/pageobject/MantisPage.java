package com.flipkart.pageobject;
import com.flipkart.core.ActionDriver;
import com.flipkart.pagelement.MantisPageElement;

public class MantisPage {
	ActionDriver act=new ActionDriver(ActionDriver.driver);
	MantisPageElement ele=new MantisPageElement();
	
	public void username(String username,String pass) {
		act.waitByVisibility(ele.getUsername());
		act.type(ele.getUsername(), username);
		act.click(ele.getSubmitBtn());
		act.waitByVisibility(ele.getPassword());
		act.type(ele.getPassword(), pass);
		act.click(ele.getSubmitBtn());
		
	}
	
	public void data(String cat,String adata,String adata1) {
		act.waitByVisibility(ele.getReportIssue());
		act.click(ele.getReportIssue());
		act.waitByVisibility(ele.getBugCategory());
		act.getDropdown(ele.getBugCategory(), cat);
		act.waitByVisibility(ele.getBugSummary());
		act.type(ele.getBugSummary(), adata);
		act.type(ele.getBugDesc(), adata1);
		act.click(ele.getSubmitBtn());
	}
}
