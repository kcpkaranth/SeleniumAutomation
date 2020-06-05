package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement drag1 = driver.findElementByXPath("//span[text()='Draggable 1']");
		WebElement drag2 = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(drag1, dest).build().perform();
		a.pause(3).dragAndDrop(drag2, dest).build().perform();
		a.pause(3).build().perform();
		
		driver.quit();

	}

}
