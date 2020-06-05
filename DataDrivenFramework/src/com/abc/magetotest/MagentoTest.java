package com.abc.magetotest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\testingDecJan\\DataDrivenFramework\\src\\com\\abc\\utilities\\datadriven.properties");
		Properties p = new Properties();
		p.load(fis);
		String urldata = p.getProperty("url");
		String emaildata = p.getProperty("emailid");
		String passdata = p.getProperty("password");
		System.out.println(urldata+" , "+emaildata+" , "+passdata);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(urldata);
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emaildata);
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(passdata);
		driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
