 package com.it.bd.Daraz_Practice;

 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


// Driver setup
@Test
public class Login_Class {
	public static WebDriver driver;

	@BeforeSuite
	public void browsersetup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");

	}
	
	
	
     //Get the Current_URL and ActualTitle
	
	
	public void current_url_get() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String getActualtitle = driver.getTitle();
		System.out.println(getActualtitle);

	}

	public void test1() {
		driver.findElement(By.xpath("//li[@class=\"login-icon\"]//a")).click();

	}

	public void emailadress() throws InterruptedException {
		WebElement email = driver
				.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(4000);
	}

	public void password() throws InterruptedException {
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Please enter your password']"));
		pass.sendKeys("12345");
		Thread.sleep(4000);
	}

	@AfterSuite
	public void close() {
		driver.close();

	}/*
	 * @Test public void handelpopup() throws InterruptedException {
	 * JavascriptExecutor popup= (JavascriptExecutor) driver; String
	 * scripet="document.querySelector('body>div.airship-html-prompt-shadow')" +
	 * ".shadowRoot.querySelector('div.airship-prompt-container')" +
	 * ".querySelector('div.airship-alert.airship-position-top')" +
	 * ".querySelector('div.airship-alert-buttons')" +
	 * ".querySelector('button').click()"; popup.executeScript(scripet );
	 * TimeUnit.SECONDS.sleep(3);
	 * 
	 * }
	 */

	public void Clicklogin() throws Exception {

		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
		loginbutton.click();
		TimeUnit.SECONDS.sleep(3);

		driver.navigate().back();
		TimeUnit.SECONDS.sleep(3);
	}

	public void searchtheittem() throws InterruptedException {

		WebElement search = driver.findElement(By.xpath("//*[@placeholder='Search in Daraz']"));
		search.sendKeys("boys watch");
		TimeUnit.SECONDS.sleep(2);

		WebElement seaechclick = driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]"));
		seaechclick.click();

	}

	
}
