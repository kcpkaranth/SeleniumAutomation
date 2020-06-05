package com.abc.testngprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider(name="authentication")
	public Object[][] dataprovider(){
		 Object[][] obj = new Object[2][2];
		 obj[0][0]="kcpkaranth@gmail.com";
		 obj[0][1]="welcome#123";
		 obj[1][0]="phanirajkaranth@gmail.com";
		 obj[1][1]="getlost#123";
		 return obj;
	}
	
	@Test(dataProvider="authentication")
	public void testcase1(String email, String pass) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys(email);
		WebElement passtf = driver.findElement(By.id("pass"));
		passtf.sendKeys(pass);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	

}
