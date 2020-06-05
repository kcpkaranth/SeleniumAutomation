package com.abc.MagentoFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	WebElement emailtf;
	@FindBy(xpath="(//input[@id='pass'])[1]")
	WebElement passtf;
	@FindBy(xpath="(//button[@id='send2'])[1]")
	WebElement login;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String email) {
		emailtf.sendKeys(email);
	}
	public void typepwd(String pwd) {
		passtf.sendKeys(pwd);
	}
	public void clickOnLogin() {
		login.click();
	}

}
