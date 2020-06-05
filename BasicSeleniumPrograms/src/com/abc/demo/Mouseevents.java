package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevents {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		WebElement uracct = driver.findElement(By.xpath("//span[text()='Your Account']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(signin).pause(2000).moveToElement(uracct).pause(1000).click().build().perform();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login with Amazon']"));
		a.moveToElement(login).pause(1000).click().build().perform();
		
		WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		a.moveToElement(create).pause(1000).click().build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
