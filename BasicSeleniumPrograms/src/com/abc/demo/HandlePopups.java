package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopups {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.name("B3")).click();
		Thread.sleep(2000);
		Alert p = driver.switchTo().alert();
		System.out.println(p.getText());//will print the text inside the popup
		Thread.sleep(2000);
		p.sendKeys("ABC For Tech");//will send text value to text field
		Thread.sleep(2000);
		p.accept();//will click on OK button in popup
		//p.dismiss();//will click on cancel button
		Thread.sleep(3000);
		driver.quit();
	}

}
