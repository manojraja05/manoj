package com.testng;

import java.util.PriorityQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Cross_Browser {
	
	@Test
	private void AutoMa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
     WebElement signin  = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

       signin.click();
 
	}	
@Test (priority = -1)
private void auto1() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\Selinum\\Selinum1\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();

	driver.get("http://automationpractice.com/index.php");
 WebElement signin  = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

   signin.click();
Thread.sleep(2000);
   
  
}

}
