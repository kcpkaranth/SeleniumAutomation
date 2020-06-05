package com.abc.testngprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	WebDriver driver;
	@BeforeTest
	@Parameters("browserName")
	public void select(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("invalid browser");
		}
	}
	@Test
	public void testcase1() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("kcpkaranth@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("welcome#123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
