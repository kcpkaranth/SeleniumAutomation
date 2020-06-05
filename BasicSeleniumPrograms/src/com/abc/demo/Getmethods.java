package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		WebElement link = driver.findElement(By.linkText("My Account"));
		
		//to get tagname of the web element --> getTagName()
		System.out.println("the tag name associated with this element is : "+link.getTagName());
		
		//to get the text assciated with the web element ---> getText()
		System.out.println("the text associated with this element is : "+link.getText());
		
		//to get any attribute value inside the web element --> getAttribute("attribute name")
		System.out.println("the attribute value assciated with target attribute is : "+link.getAttribute("target"));
		
		driver.quit();

	}

}
