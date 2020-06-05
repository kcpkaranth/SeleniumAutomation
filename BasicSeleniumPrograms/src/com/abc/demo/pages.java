package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pages {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HtmlPages/page1.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Goto Page2")).click();
		Thread.sleep(3000);
		//driver.close(); ----> used to close only page pointed by driver
		//Thread.sleep(2000);
		driver.quit();// will close all the tabs in browser where driver is pointing

	}

}
