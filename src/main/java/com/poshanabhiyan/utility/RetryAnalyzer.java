package com.poshanabhiyan.utility;

import java.util.Set;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int counter=0;
	int retryLimit=1;


	@Override
	public boolean retry(ITestResult result) {
		if(counter<retryLimit) {
			counter++;
			return true;
		}		
		return false;
	}

	
}


