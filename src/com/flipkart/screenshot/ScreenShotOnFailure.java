package com.flipkart.screenshot;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.flipkart.core.OpenAndCloseBrowser;

public class ScreenShotOnFailure extends TestListenerAdapter {
	private static final String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";

	  WebDriver driver;
	  
	  @Override	  
	  public void onTestFailure(ITestResult tr) {
		  try {
			screenshot(tr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) {
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  
	  }
	  
	  public void screenshot(ITestResult tr) throws IOException{
		  
		  System.setProperty(ESCAPE_PROPERTY, "false");
		  driver=OpenAndCloseBrowser.getInstance();
		  File location=new File(System.getProperty("user.dir")+"\\test-output");
		  Date date=new Date();
		  DateFormat format=new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
		  String screenshotLoc=location.getCanonicalPath()+"\\Screenshot\\"
		  +tr.getName()+format.format(date)+".png";
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(screenshotLoc));
		  Reporter.log("<H4>Repro steps--</H4><br>"+tr.getMethod().getDescription()+"<br>");
		  Reporter.log("<a href="+screenshotLoc+">Screenshot</a>");
		  
	}
}
