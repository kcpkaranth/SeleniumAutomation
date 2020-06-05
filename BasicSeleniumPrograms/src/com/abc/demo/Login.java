package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HtmlPages/login.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("phaniraj");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("1234567890"); 
		driver.quit();
	}

}
