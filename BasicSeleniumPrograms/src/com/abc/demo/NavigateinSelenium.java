package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateinSelenium {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");//navigate to magento
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Account")).click();//click on my account link
		Thread.sleep(3000);
		driver.navigate().back();//to click on back button
		Thread.sleep(3000);
		driver.navigate().forward();//to click on forword button
		Thread.sleep(3000);
		driver.navigate().refresh();//to click on refresh button
		Thread.sleep(3000);
		driver.close();

	}

}
