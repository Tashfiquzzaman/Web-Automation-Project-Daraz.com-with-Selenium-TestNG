package com.it.bd.Daraz_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Optionselect_classs  {
	
	public static WebDriver driver;

	@BeforeSuite
	public void browsersetup() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}
	

	@Test
	  public void Dropdowntest() throws InterruptedException {
		
		WebElement select1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		// select= Select class er object name & select1 ta holo webelement er nam

		Select select = new Select(select1);
		
		select.selectByIndex(5);
		
		TimeUnit.SECONDS.sleep(3);

		select.selectByVisibleText("Deals");
		
		TimeUnit.SECONDS.sleep(3);
		
		
		WebElement searchbutton= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchbutton.sendKeys("mathematics");
		
		WebElement searchbuttonclick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		searchbuttonclick.click();
		
		
		

	}
	
	    public void sendkeys() {
	    	
	    	
	    	
	    	
	    }
	@AfterSuite
	public void close() {
		driver.close();

}
}
