package com.testng;

import org.testng.annotations.Test;

public class GroupsPgm {
	@Test(groups = "Defence")
	private void policeDept() {
		
		System.out.println("police");
		
	}
	
	@Test(groups = "Entertainment")
	private void singingDept() {
		
		System.out.println("singer");
		
	}
	
	
	
	
	@Test(groups = "Defence")
	private void armyDept() {
		
		System.out.println("army");
		
	}
	
	
	
	@Test(groups = "Entertainment")
	private void actingDept() {
		
		System.out.println("actor");
		
	}
	
	@Test(groups = "Defence")
	private void fireDept() {
		
		System.out.println("fire man");
		
	}
	
	@Test(groups = "Education")
	private void libraryDept() {
		
		System.out.println("books");
		
	}
	
	
	@Test(groups = "Education")
	private void examDept() {
		
		System.out.println("question");
		
	}
	
	
	
	@Test(groups = "Entertainment")
	private void dancingDept() {
		
		System.out.println("dancer");
		
	}
	

}
