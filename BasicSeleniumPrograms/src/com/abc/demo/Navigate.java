package com.abc.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
	public static String url = "https://www.facebook.com";

	public static void main(String[] args) {
		System.out.println("Tell me which browser to launch?");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriver c = new ChromeDriver();
			test(c);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriver f = new FirefoxDriver();
			test(f);
		}
		else {
			System.out.println("invalid browser option");
		}

	}
	public static void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("the title is : "+driver.getTitle());
		driver.close();
	}
}
