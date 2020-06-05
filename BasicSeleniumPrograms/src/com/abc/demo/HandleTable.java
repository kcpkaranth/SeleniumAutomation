package com.abc.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/HtmlPages/table.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		int rowsize = rows.size();
		System.out.println("the row size is : "+rowsize);
		List<WebElement> column = driver.findElements(By.xpath("//tbody/tr[1]/td"));
		int columnsize = column.size();
		System.out.println("the column size is : "+columnsize);
		int sum=0;
		
		for (int i = 1; i < rowsize; i++) {
			WebElement course = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
			System.out.println(course.getText());
			WebElement fees = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]"));
			String fee = fees.getText();
			System.out.println(fee);
			
			fee=fee.replace(",", "");
			fee=fee.replace("/", "");
			fee=fee.replace("-", "");
			int amount = Integer.parseInt(fee);
			System.out.println(amount);
			sum+=amount;//sum=sum+amount;	
		}
		System.out.println("the total fee to take all the course  is : "+sum);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
