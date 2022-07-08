package com.testng;

import org.testng.annotations.Test;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Cross_Browser2 {
	
	WebDriver driver;
	
	@BeforeTest 
	@Parameters("browser")
	
	private void browse_Launch(String browser) {
	
		if (browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if  (browser.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir")	+ "\\driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

	}
		// TODO Auto-generated method stub
		 
	@Test
	private void url_Launc() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.get("http://automationpractice.com/index.php");
		 Thread.sleep(3000);
		 
		 WebElement username = driver.findElement(By.id("email"));
		   username.sendKeys("manoj_123@gmail.com");
		   System.out.println("username");
		   
		   WebElement password = driver.findElement(By.id("passwd"));
		   
		   password.sendKeys("divya@1234");
		   System.out.println("pass");
		   
		   WebElement submit1 = driver.findElement(By.id("SubmitLogin"));
		   submit1.click();
		   System.out.println("loggedin");

	}
	
	
	
	
	
	

}
