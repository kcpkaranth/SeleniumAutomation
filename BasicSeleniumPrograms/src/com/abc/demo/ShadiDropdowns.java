package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiDropdowns {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com");
		WebElement drop1 = driver.findElement(By.id("ddlReligion"));
		drop1.click();
		Select s1 = new Select(drop1);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		WebElement drop2 = driver.findElement(By.id("ddlEducation"));
		drop2.click();
		Select s2 = new Select(drop2);
		s2.selectByValue("5");
		Thread.sleep(3000);
		WebElement drop3 = driver.findElement(By.id("ddlCountry"));
		drop3.click();
		Select s3 = new Select(drop3);
		s3.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.close();
	}

}
