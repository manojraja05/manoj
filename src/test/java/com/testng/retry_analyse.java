package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_analyse implements IRetryAnalyzer{
	int count = 1;
	int limit = 6;
	
	@Override
	public boolean retry(ITestResult Result) {
		if(count<=limit) {
			
			count++;
			return true;
			
		}
		return false;
}
}
