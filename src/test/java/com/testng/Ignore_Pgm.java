package com.testng;

import org.junit.Ignore;
import org.testng.annotations.Test;



public class Ignore_Pgm {
	
	@Test
	private void urlLaunch() {
		
		System.out.println("url Launch");
		
		
	}
	
	
	@Test
	private void homePage() {
		
		System.out.println("homepage");
		
		
	}
	
	@Test
	private void loginPage() {
		
		System.out.println("Login Page");
		
		
	}
	@Ignore
	@Test (invocationCount = 2)
	private void userName() {
		System.out.println("user name");
	}
	@Test (enabled =false)
	private void passWord(){
	System.out.println("pass word");
	}
	
	
	@Test
	private void logOut(){
		System.out.println("Logged Out");
	} 
	
	
	}

