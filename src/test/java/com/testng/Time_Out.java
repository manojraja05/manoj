package com.testng;

import org.testng.annotations.Test;

public class Time_Out {
	
	@Test(timeOut = 5000)
	
	private void User_Name() throws InterruptedException {
		
		System.out.println("user Name");
		
		Thread.sleep(3000);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
