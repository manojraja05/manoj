package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void arithmatic_Operation() {
		// TODO Auto-generated method stub
          int a = 22/0;
          
          System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
