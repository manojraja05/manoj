package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test (dependsOnMethods = "offersDiwali")
	private void mobileOff() {
		System.out.println("50% discount"); 
	}
	
	@Test
	private void laptopNoOff() {
		// TODO Auto-generated method stub
System.out.println("No offer For Laptop");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
