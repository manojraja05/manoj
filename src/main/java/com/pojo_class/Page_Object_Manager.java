package com.pojo_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	private HomePg hp;
	private LoginPg lp;
	 
	public Page_Object_Manager (WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public HomePg getHomepg() {
		hp= new HomePg (driver);
		return hp;
	}

	

	public LoginPg getlLoginPg() {
		lp= new LoginPg(driver);
		return lp;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
