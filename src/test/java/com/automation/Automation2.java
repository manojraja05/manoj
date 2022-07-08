package com.automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class_1;
import com.pojo_class.Page_Object_Manager;

import co.properties.FileReadManager;

public class Automation2 extends Base_Class_1 {
public static WebDriver driver = getBrowser("Chrome");
public static Page_Object_Manager Pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException  {
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\DELL\\eclipse-workspace\\Selinum\\Selinum1\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
        implicitWait(20);
        getUrl(FileReadManager.getInstanceFR().getInstanceCR().get_url());
	//	driver.get("http://automationpractice.com/index.php");
 
		//WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		//signin.click();
		//System.out.println("signin");
        
        clickButton(Pom.getHomepg().getSignin());

		//WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("manoj_123@gmail.com");
		//System.out.println("email");
        
        input(Pom.getlLoginPg().getemail(), FileReadManager.getInstanceFR().getInstanceCR().getemail());
		//WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		//password.sendKeys("divya@1234");
        input(Pom.getlLoginPg().getpassword(), FileReadManager.getInstanceFR().getInstanceCR().getpassword());
		System.out.println("password");
		//WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		//submit.click();
		clickButton(Pom.getlLoginPg().getsubmit());
		System.out.println("submit");
	}
}
