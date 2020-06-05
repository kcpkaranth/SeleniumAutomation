package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbcTech {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(search).click().pause(1000).build().perform();
		
		a.keyDown(Keys.SHIFT).sendKeys("abc").pause(1000).sendKeys(" for technology training").pause(1000).build().perform();
		a.sendKeys(Keys.ENTER).pause(3000).build().perform();
		
		driver.quit();
		

	}

}
