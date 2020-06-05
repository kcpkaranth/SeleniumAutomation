package com.abc.demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/HtmlPages/page1.html");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Goto Page2")).click();
		
		String address = driver.getWindowHandle();
		System.out.println("the aadress of page 1 is : "+address);
		
		Set<String> windowaddress = driver.getWindowHandles();
		System.out.println(windowaddress);
		
		ArrayList<String> a = new ArrayList<String>(windowaddress);
		System.out.println(a);
		
		driver.switchTo().window(a.get(1));
		
		driver.findElement(By.linkText("Goto Page3")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}
 
}
