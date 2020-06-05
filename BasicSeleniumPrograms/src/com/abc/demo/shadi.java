package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shadi {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shadi.com");
		
		driver.findElement(By.id("first_name")).sendKeys("Salman");
		driver.findElement(By.id("last_name")).sendKeys("Khan");
		
		WebElement maleradio = driver.findElement(By.id("rblGender_1"));
		WebElement femaleradio = driver.findElement(By.id("rblGender_1_for"));
		WebElement monthdd = driver.findElement(By.id("dob_m"));
		WebElement datedd = driver.findElement(By.id("dob_d"));
		WebElement yeardd = driver.findElement(By.id("dob_y"));
		WebElement religiondd = driver.findElement(By.id("ddlReligion"));
		WebElement edudd = driver.findElement(By.id("ddlEducation"));
		WebElement countrydd = driver.findElement(By.id("ddlCountry"));
		WebElement emailtf = driver.findElement(By.id("txtEmailAddress"));
		WebElement passtf = driver.findElement(By.id("txtPassword"));
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(maleradio).pause(1000).click().build().perform();
		
		System.out.println("is female radio is selected automatically ??? "+femaleradio.isSelected());
		
		Select s1 = new Select(monthdd);
		s1.selectByIndex(10);
		Select s2 = new Select(datedd);
		s2.selectByVisibleText("15");
		Select s3 = new Select(yeardd);
		s3.selectByValue("1985");
		
		a.moveToElement(religiondd).click().pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ENTER).pause(1000).build().perform();
		
		a.moveToElement(edudd).click().pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ENTER).pause(1000).build().perform();
		
		a.moveToElement(countrydd).click().pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		a.sendKeys(Keys.ENTER).pause(1000).build().perform();
		
		emailtf.sendKeys("salmankhanstillsingle@gmail.com");
		a.moveToElement(passtf).click().keyDown(Keys.SHIFT).sendKeys("katrina").keyUp(Keys.SHIFT).sendKeys("kaif").build().perform();
		submit.click();
		
		a.pause(2000).build().perform();
		driver.quit();

	}

}
