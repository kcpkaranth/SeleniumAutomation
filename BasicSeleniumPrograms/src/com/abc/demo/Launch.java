package com.abc.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();//to launch chrome
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.cssSelector("input[id*='mai']"));
		email.sendKeys("kcpkaranth");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.cssSelector("input[id*='as']"));
		pwd.sendKeys("1234567890");
		
		Thread.sleep(3000);
		driver.close();
	}

}
