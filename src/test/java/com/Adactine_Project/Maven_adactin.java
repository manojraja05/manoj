package com.Adactine_Project;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_Class_1;
import com.pojo_class.Page_Object_Manager;

public class Maven_adactin extends Base_Class_1 {
public static WebDriver driver;
public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBrowser("Chrome");
		getUrl("https://adactinhotelapp.com/");
		System.out.println("done");
		//WebElement username = driver.findElement(By.id("username"));
		input(pom.getlLoginPg().getemail(),"Charvick1");
	//	WebElement password = driver.findElement(By.name("password"));
		input(pom.getlLoginPg().getpassword(),"123@manoj");
		//WebElement login = driver.findElement(By.xpath("//*[@id='login']"));
	     clickButton(pom.getlLoginPg().getsubmit());
		WebElement index = driver.findElement(By.name("location"));
	//	Select s = new Select(index);
	//	s.selectByIndex(3);
		dropdown(index, "byindex", "3");
		WebElement value = driver.findElement(By.id("hotels"));
		//Select v = new Select(value);
		//v.selectByValue("Hotel Cornice");
		dropdown(value, "byvalue", "Hotel Cornice");
		WebElement text = driver.findElement(By.name("room_type"));
		//Select t = new Select(text);
		//t.selectByVisibleText("Double");
		dropdown(text,"byvisibletext", "double");
		
//List<WebElement> options =driver.findElements(By.xpath("//*[@id='room_nos']"));
//	for (WebElement webElement : options) {
		
		
	//	System.out.println(webElement.getText());
	//}
	WebElement index1 = driver.findElement(By.xpath("//*[@id='room_nos']"));
	//Select i = new Select(index1);
	//i.selectByIndex(7);
	dropdown(index1, "byindex", "7");
	System.out.println("7roomdone");
    
	WebElement indate = driver.findElement(By.xpath("//*[@id='datepick_in']"));
	//indate.sendKeys("21/5/2022");
	input(indate, "20/6/2022");
	System.out.println("bookingdate:21may");
	WebElement outdate = driver.findElement(By.xpath("//*[@id='datepick_out']"));
	//outdate.sendKeys("22/5/2022");
	input(outdate, "21/6/2022");
	System.out.println("enddate:22may");
	WebElement aperroom = driver.findElement(By.name("adult_room"));
	//Select p = new Select (aperroom);
	//p.selectByVisibleText("2 - Two");
	dropdown(aperroom, "byvisibletext", "2");
	System.out.println("adult:2");
	WebElement cperroom = driver.findElement(By.xpath("//*[@id='child_room']"));
	//Select c = new Select(cperroom);
	//c.selectByIndex(3);
	dropdown(cperroom, "byindex", "3");
	System.out.println("children:3");
	WebElement submit = driver.findElement(By.name("Submit"));
	//submit.click();
	clickButton(submit);
	System.out.println("submit");
	WebElement select1 = driver.findElement(By.xpath("//*[@name='radiobutton_1']"));
	clickButton(select1);
	
	implicitWait(15);
	
	System.out.println("radiobutton");
	WebElement continue1  = driver.findElement(By.name("continue"));
	//continue1.click();
	clickButton(continue1);
	WebElement firstname1 = driver.findElement(By.xpath("//*[@id='first_name']"));
	//firstname1.sendKeys("Manojcharvick");
	input(firstname1, "ManojCharvick");
	WebElement lastname1 = driver.findElement(By.xpath("//*[@id='last_name']"));
	//lastname1.sendKeys("Divya");
	input(lastname1, "divya");
	WebElement address1 = driver.findElement(By.name("address"));
	//address1.sendKeys("tenkasi-627855");
	input(address1, "tenkasi");
	WebElement creditcard1 = driver.findElement(By.xpath("//*[@id='cc_num']"));
	//creditcard1.sendKeys("9835782626197653");
	input(creditcard1, "9835782626197653");
	List<WebElement>option1 = driver.findElements(By.name("cc_type"));
	for (WebElement webElement : option1) {
		System.out.println("option1:"+option1);
		
	}
	WebElement cardtype = driver.findElement(By.xpath("//*[@id='cc_type']"));
	Select c1  = new Select (cardtype);
	c1.selectByIndex(3);
	WebElement exmonth = driver.findElement(By.name("cc_exp_month"));
	Select e = new Select (exmonth);
	System.out.println("month:july");
	e.selectByVisibleText("July");
	WebElement exyear = driver.findElement(By.name("cc_exp_year"));
	System.out.println("expyear:2022");
	Select y = new Select(exyear);
	y.selectByVisibleText("2022");
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("678");
	WebElement book = driver.findElement(By.name("book_now"));
	book.click();
	System.out.println("booked");
	  
	
	WebElement but2 = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
	but2.click();
	System.out.println("myitinerary done");
	 
	WebElement check1 = driver.findElement(By.xpath("//input[@value='632768']"));
	check1.isSelected();
	check1.click();
	System.out.println("ceck1selected");
	
	WebElement cancel1 = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
	cancel1.isSelected();
	cancel1.click();
	System.out.println("cancel selected done");
	
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	System.out.println("alertdone");
	
	WebElement log1 = driver.findElement(By.xpath("//*[@id=\"logout\"]"));
	log1.click();
	System.out.println("logged");
	
	}

}
