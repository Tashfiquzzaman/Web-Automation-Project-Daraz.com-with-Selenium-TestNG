package com.it.bd.Daraz_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomaticMouse_HoveringandClick extends Login_Class{
	
	
	
	@Test
	public void hovering() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement lifestile = driver.findElement(By.xpath("//span[normalize-space()='Electronic Accessories']"));
		action.moveToElement(lifestile).perform();
		TimeUnit.SECONDS.sleep(2);

		WebElement Audio = driver.findElement(By.xpath(
				"//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[1]/a[1]/span[1]"));
		action.moveToElement(Audio).perform();
		TimeUnit.SECONDS.sleep(2);

		WebElement headphone = driver.findElement(By.xpath(
				"//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[1]/ul[1]/ul[1]/li[1]/a[1]/img[1]"));
		// action.moveToElement(headphone).perform();
		headphone.click();
		TimeUnit.SECONDS.sleep(4);

	}
	

}
