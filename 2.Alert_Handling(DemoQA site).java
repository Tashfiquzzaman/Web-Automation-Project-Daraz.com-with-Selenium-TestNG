package com.it.bd.Daraz_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_Handling extends Login_Class{
	


	@Test
	public void newtabopen() throws InterruptedException {
		
		//New tab OPen.
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		TimeUnit.SECONDS.sleep(2);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement alert2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert2.click();
		// Alert alert=driver.switchTo().alert();
		alert.dismiss();
		TimeUnit.SECONDS.sleep(3);

		WebElement alert3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alert3.click();
		TimeUnit.SECONDS.sleep(3);
		// Alert alert4=driver.switchTo().alert();
		alert3.sendKeys("good");
		alert.accept();
		TimeUnit.SECONDS.sleep(3);

	}

}
