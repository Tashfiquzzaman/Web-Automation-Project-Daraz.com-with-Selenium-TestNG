package com.it.bd.Daraz_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
   public class Scrolling_Test {
	    WebDriver driver;
	    
	  @BeforeSuite
	public void browser() {
		
		String browsesetup=System.getProperty("browser","Chrome");
		
		if(browsesetup.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		//	driver.manage().window().maximize();	
			
		}
		else {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		    }
		
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		
	}
	  @Test
	 public void Scrolling() throws InterruptedException {
		 
		//Scroll To a Specific location 
		 JavascriptExecutor object=(JavascriptExecutor) driver;
		 
		 WebElement location=driver.findElement(By.xpath("//span[@class='icon-yatra-s-fb drz-footer-sprit-link']"));
		 
		 object.executeScript("arguments[0].scrollIntoView(true)",location);
		 
		 TimeUnit.SECONDS.sleep(3);
		 
		 
		 // Scroll To Top  
		 object.executeScript("window.scrollTo(0,0)");
		 Thread.sleep(3000);
		 
		 
		 //down
		 
		 object.executeScript("window.scrollTo(0,3189)");
		 Thread.sleep(3000);	 
	  }
	
	
 
	
	@AfterSuite
	public void close() {
		driver.close();
}
	
	
}
