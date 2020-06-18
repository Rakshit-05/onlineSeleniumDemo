package com.testyantra.retrydemo;

public class MyRetry implements IRetryAnalyser {
	
	int retryCount =0;
	final int maxRetryCount =3;
	
	@Overide
	public boolean retry(ITestResult result) {
		
		if (retryCount<maxRetryCount) {
			retry count++;
			return true;
		
		}
		return false;
	}
	

}
