package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MyTest {
@Test
private void uName() {
	String expected = "ManojRaja";
	String actual   ="ManojRaja";
	assertEquals(actual, expected);
	
	
}
@Test
private void passWord() {
	
	int expected = 1234567;
	int actual = 3214567;
	assertEquals(actual, expected);

}



}
