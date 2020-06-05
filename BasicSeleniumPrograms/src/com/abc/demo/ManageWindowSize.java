package com.abc.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageWindowSize {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println("the width of firefox browser is : "+size.width);
		System.out.println("the height of firefox browser is : "+size.height);
		
		Thread.sleep(2000);
		
		Dimension nsize = new Dimension(size.width/2, size.height/2);
		
		driver.manage().window().setSize(nsize);
		Thread.sleep(2000);
		Dimension size2 = driver.manage().window().getSize();
		System.out.println("the width of firefox browser after setting new dimention is : "+size2.width);
		System.out.println("the height of firefox browser after setting new dimention is : "+size2.height);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
