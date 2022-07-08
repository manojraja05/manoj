package com.testng;

import org.testng.annotations.Test;

import com.baseclass.Base_Class_1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.util.PriorityQueue;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleAnnotation extends Base_Class_1 {
	
	public static WebDriver driver;
  @BeforeSuite 
  public void driverLaunch() {
	  System.out.println("driver Launched");
	  
	  
	  
	 
  }
  
@BeforeTest
  public void browserLaunch() {
	
	 driver =getBrowser("Chrome");
	  System.out.println("browser");
	  
	  
	  
  }

  @BeforeClass
  public void urlLaunch() {
	  
	  getUrl("http://automationpractice.com/index.php");
		 System.out.println("URL");
	  
	  
  }

  @BeforeMethod
  public void loginPage() {
	  
	  WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	  clickButton(signin);
	  
	  
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  input(email, "manoj_123@gmail.com");
	  
	  System.out.println("email");
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
	  input(password, "divya@1234");
	  System.out.println("psswrd");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	  clickButton(submit);
	  System.out.println("loggedin");
	  
  }
 
  @Test
	// 
  public void womenDress () throws InterruptedException{
	  WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	  
	  clickButton(women);
	  driver.wait(20);
	  WebElement fadedsleeve = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	  clickButton(fadedsleeve);
	  
	  WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	  clickButton(addtocart);
	  System.out.println("add");
	  WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
	  clickButton(viewcart);
	  WebElement checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	  clickButton(checkout);
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  input(email, "manoj_123@gmail.com");
	  
	  System.out.println("email");
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
	  input(password, "divya@1234");
	  System.out.println("psswrd");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	  clickButton(submit);
	  System.out.println("loggedin");
	  
	  WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	  clickButton(proceed);
	  WebElement check = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	  clickButton(check);
	  WebElement pro = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
      clickButton(pro);
      WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]"));
      clickButton(pay);
      WebElement check1 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
      clickButton(check1);
      System.out.println("checkout");
  }

  @Test (invocationCount = 2 , priority = -1)
	
  public void womenTop() {
	  WebElement black = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
	  clickButton(black);
	  
	  WebElement addcart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	  clickButton(addcart);
	  WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
	  clickButton(viewcart);
	  WebElement checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	  clickButton(checkout);
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  input(email, "manoj_123@gmail.com");
	  
	  System.out.println("email");
	  
	  WebElement password = driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span"));
	  input(password, "divya@1234");
	  System.out.println("psswrd");
	  
	  WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	  clickButton(submit);
	  System.out.println("loggedin");
	  
	  WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	  clickButton(proceed);
	  WebElement check = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	  clickButton(check);
	  WebElement pro = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
      clickButton(pro);
      WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]"));
      clickButton(pay);
      WebElement check1 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
      clickButton(check1);
      System.out.println("checkout2");
      
	  
	  
  }

  @AfterMethod
  public void singOut() {
	 WebElement signout = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	 clickButton(signout);
	  
  }

  @AfterClass
  public void closePage () {
	  
	  driver.close();
  }

  @AfterTest
  public void quitBrowser() {
	  
	  driver.quit();
	  
  }
  
  @AfterSuite
  public void closeAll() {
	  
	  driver.quit();

}
}