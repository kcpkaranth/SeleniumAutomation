package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartripwithboolian {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		WebElement roundtrip = driver.findElement(By.id("RoundTrip"));
		Thread.sleep(3000);
		if(roundtrip.isSelected()==false) {
			System.out.println("roundtrip radio button is still not selected");
			roundtrip.click();
		}
		System.out.println("is round trip is selected now? "+roundtrip.isSelected());
		Thread.sleep(3000);

		WebElement returnon = driver.findElement(By.id("ReturnDate"));
		if(returnon.isDisplayed()==true) {
			System.out.println("returnon text field is displaying");
			returnon.sendKeys("06/03/2020");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
