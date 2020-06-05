package com.abc.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FineElementsLinks {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("no. links in this web page is : "+size);
		
		for (WebElement i : links) {
			
			System.out.println(i.getText());
			if (i.getText().equals("My Account")) {
				i.click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
