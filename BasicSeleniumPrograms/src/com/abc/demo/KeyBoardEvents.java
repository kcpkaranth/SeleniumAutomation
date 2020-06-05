package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		WebElement fromtf = driver.findElement(By.id("FromTag"));
		WebElement totf = driver.findElement(By.id("ToTag"));
		Actions a = new Actions(driver);
		
		a.moveToElement(fromtf).click().pause(1000).sendKeys("tri").build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		
		a.sendKeys(Keys.ENTER).pause(1000).build().perform();
		
		a.moveToElement(totf).click().pause(1000).sendKeys("ben").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		
		a.sendKeys(Keys.ARROW_UP).pause(1000).build().perform();
		
		a.sendKeys(Keys.ENTER).pause(1000).build().perform();
		
		a.pause(3000).build().perform();
		driver.quit();
		

	}

}
