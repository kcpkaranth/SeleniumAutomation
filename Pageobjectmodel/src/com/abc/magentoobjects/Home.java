package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	By logout = By.xpath("//a[text()='Log Out']");
	
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnLogout() {
		driver.findElement(logout).click();
		
	}
	
}
