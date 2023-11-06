package com.it.bd.Daraz_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Copyand_PasteCLass extends Login_Class{
	
	
	
	
	@Test

	public void copypast() throws InterruptedException {

		WebElement seller = driver.findElement(By.xpath("//a[contains(text(),'Become a Seller')]"));
		seller.click();

		Actions action = new Actions(driver);
		WebElement box = driver.findElement(By
				.xpath("//div[@class='accountLabelInputContent flexCenterLeft']//input[@placeholder='Please enter']"));
		box.sendKeys("01934838992");
		Thread.sleep(3000);

		// select all
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// Tab

		action.sendKeys(Keys.TAB);
		action.build().perform();

		// paste

		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);

	}

}
