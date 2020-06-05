package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By emailtf = By.xpath("//input[@id='email']");
	By passtf = By.xpath("(//input[@id='pass'])[1]");
	By login = By.xpath("(//button[@id='send2'])[1]");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeEmail(String email) {
		driver.findElement(emailtf).sendKeys(email);
	}
	public void typepwd(String pwd) {
		driver.findElement(passtf).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
}
