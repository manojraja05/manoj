package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {

@Test
@Parameters({"usename","pass"})
private void credentisalData(@Optional("Manoj") String uname,@Optional("Charvick123") String Password) {
	System.out.println("usename:"+uname);
   System.out.println("pass:"+Password);
}



}
