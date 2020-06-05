package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledbooleanMethod {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://account.magento.com/customer/account/create/");
		WebElement submit = driver.findElement(By.id("registerSubmit"));
		
		System.out.println("is submit button is enabled? "+submit.isEnabled());
		
		Thread.sleep(15000);
		
		System.out.println("is submit button is enabled now atleast? "+submit.isEnabled());
		driver.quit();

	}

}
