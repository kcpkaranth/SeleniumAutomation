package com.abc.testngprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfteronMegento {
	public WebDriver driver;
	@BeforeMethod
	public void launch() {
		String url = "https://www.magento.com";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void PositiveTestcase() {
		driver.findElement(By.linkText("My Account")).click();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("kcpkaranth@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("welcome#123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}
	@AfterMethod
	public void detach() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void NegetiveTestcase() {
		driver.findElement(By.linkText("My Account")).click();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("kcpkaranth@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("getlost#123");
		driver.findElement(By.id("send2")).click();
	}
	@Test
	public void registerTestcase() {
		driver.findElement(By.linkText("REGISTER TODAY")).click();
	}
	
	

}
