package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoAutomate {

	public static void main(String[] args) throws Exception {
		String url = "https://magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);
		WebElement myacct = driver.findElement(By.linkText("My Account"));
		myacct.click();
		WebElement mailtf = driver.findElement(By.id("email"));
		mailtf.sendKeys("kcpkaranth@gmail.com");
		WebElement passtf = driver.findElement(By.id("pass"));
		passtf.sendKeys("welcome#123");
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out"))).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
