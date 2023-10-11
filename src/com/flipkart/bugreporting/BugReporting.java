package com.flipkart.bugreporting;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.flipkart.testcases.BugReportingTest;
import com.flipkart.screenshot.ScreenShotOnFailure;

public class BugReporting implements ITestListener{
	BugReportingTest te=new BugReportingTest();
	ScreenShotOnFailure s1 = new ScreenShotOnFailure();
	String username="manoj_qa";
	String pass="Manoj@2108";
	String cat="[All Projects] General";
	String adata="no such element exception";
	String adata1="the test case has failed due to no such element exception";
	
@Override
public void onTestFailure(ITestResult result) {	
	
	te.mant(username, pass, cat, adata, adata1);	
	try {		
		 s1.screenshot(result);
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}

@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

}

