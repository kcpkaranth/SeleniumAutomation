package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/LENOVO/Desktop/selenium%20components/Field1.html");
		driver.findElement(By.id("fname")).sendKeys("Phaniraj");
		Thread.sleep(3000);
		//driver.switchTo().frame(0); --> using index value
		//driver.switchTo().frame("nameinfo"); --> usind ID
		//driver.switchTo().frame("newEntry"); --> using name
		driver.switchTo().frame("/html/body/iframe");//using xpath
		driver.findElement(By.id("lname")).sendKeys("karanth");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
