package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_1 {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		 if (type.equalsIgnoreCase("Chrome")) {  
			 
			 System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		 else if(type.equalsIgnoreCase("fireFox")) {
			 System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			 driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
		}
		
		return driver;
		
	
	}
	
	//close
	
	public static void CloseOnWindow() {
		driver.close();
		
	}
	  //WEbDriver Methods
	//get url
	public static void getUrl(String url) {
		driver.get(url);
	}
		
	
	public static void clickButton(WebElement element) {
		
		element.click(); 

	}
	
	
	public static void implicitWait(int waitime) {
		
		driver.manage().timeouts().implicitlyWait(waitime, TimeUnit.SECONDS);
	}
	
	public static void input(WebElement element ,String value) {
		
		element.sendKeys(value);
	}
	
	public static void dropdown(WebElement element,String type,String data) {
		
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(data);
			
			
		}
		else if(type.equalsIgnoreCase("by visible text")){
			s.selectByVisibleText(data);
			
		}
		else if (type.equalsIgnoreCase("byindex")) {
			int index =Integer.parseInt(data);
					s.selectByIndex(index);
			
			
		}
		
	}

}
