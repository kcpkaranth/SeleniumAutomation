package com.abc.testngprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {
	
	@Test
	@Parameters({"url","email","pwd"})
	public void testcase1(String url, String email, String pwd) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys(email);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
