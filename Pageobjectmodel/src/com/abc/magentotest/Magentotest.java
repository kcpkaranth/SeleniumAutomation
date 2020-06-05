package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Welcome;

public class Magentotest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyAcct();
		
		Login l = new Login(driver);
		l.typeEmail("kcpkaranth@gmail.com");
		l.typepwd("welcome#123");
		l.clickOnLogin();
		
		Home h = new Home(driver);
		h.clickOnLogout();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
