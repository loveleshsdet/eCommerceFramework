package com.flipkart.dataprovider;
import java.util.Scanner;
import org.testng.annotations.DataProvider;

public class DataProviderForUserInput {
	Scanner sc=new Scanner(System.in);	
	@DataProvider(name="data")
	public Object met(){	
		Object arr[][]=new Object[1][1];
		for(int i=0;i<=0;i++) {		
		for(int j=0;j<=0;j++) {
				String k=sc.nextLine();
				Object m=(String )k;
				arr[i][j]=m;			
		}	
	}	
		return arr;
	}
}