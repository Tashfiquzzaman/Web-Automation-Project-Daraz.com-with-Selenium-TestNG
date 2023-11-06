package com.it.bd.Daraz_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Test {
	WebDriver driver;
	
	@BeforeSuite
	public void browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.daraz.com.bd/");	
	}
     
	
	@Test
	public void assertion() throws InterruptedException{
		
		//Assertion is used for check the text of a website .
		
		driver.get("https://www.daraz.com.bd/");
		
		String expectedtitle="Onlin7e Shopping in Bangladesh: Order Now from Daraz.com.bd";
	
	    String actualtital = driver.getTitle();
	
	//Hard assertion
	    
	Assert.assertEquals(actualtital,expectedtitle);
	System.out.println("Hello....");
	
	
	//soft Assertion
	
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(expectedtitle, actualtital);
	System.out.println("Hello..112233..");
	
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void close() {
		driver.close();

	}
	
}
