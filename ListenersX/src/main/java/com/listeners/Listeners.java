package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
	
		System.out.println("start");
		
	}

	public void onTestSuccess(ITestResult result) {
	  
		System.out.println("test Sucess");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test is fail");
	}

	public void onTestSkipped(ITestResult result) {
		
		 System.out.println("Test is Skiped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
