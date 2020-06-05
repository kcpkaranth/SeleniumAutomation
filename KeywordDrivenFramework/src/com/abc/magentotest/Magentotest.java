package com.abc.magentotest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magentotest {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("F:\\testingDecJan\\KeywordDrivenFramework\\src\\com\\abc\\utilities\\keyworddriven.properties");
		Properties p = new Properties();
		p.load(fis);
		String myacctkey = p.getProperty("myacct");
		String emailtfkey = p.getProperty("emailtf");
		String passtfkey = p.getProperty("passtf");
		String loginkey = p.getProperty("login");
		String logoutkey = p.getProperty("logout");
		System.out.println(myacctkey +";"+emailtfkey+";"+passtfkey+";"+loginkey+";"+logoutkey);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		driver.findElement(By.xpath(myacctkey)).click();
		driver.findElement(By.xpath(emailtfkey)).sendKeys("kcpkaranth@gmail.com");
		driver.findElement(By.xpath(passtfkey)).sendKeys("welcome#123");
		driver.findElement(By.xpath(loginkey)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(logoutkey)).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
