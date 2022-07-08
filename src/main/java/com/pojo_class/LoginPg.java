package com.pojo_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPg {
 public static WebDriver driver;
 @FindBy(xpath="//input[@id='email']")
 private WebElement email;
  
 @FindBy(xpath="//input[@id='passwd']")
 private WebElement password;
 
 @FindBy(xpath="//button[@id='SubmitLogin']")
 private WebElement submit;

public LoginPg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
 
}
 
 public WebElement getemail() {
	// TODO Auto-generated method stub
        return email;
       
}
 
 public WebElement getpassword() {
		// TODO Auto-generated method stub
	        return password;
	       
	}
 
 
 public WebElement getsubmit() {
		// TODO Auto-generated method stub
	        return submit;
	       
	}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
