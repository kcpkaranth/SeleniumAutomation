package com.abc.magentotesthybrid;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTestWithExcel {
	public static XSSFSheet sheet;
	public static ChromeDriver driver;
	
	public static String getCellValue(int r, int c) {
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);
		String text = cell.getStringCellValue();
		return text;
	}
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\testingDecJan\\HybridDrivenWithExcel\\src\\com\\abc\\utilities\\hybriddriven.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);
		int NoOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("physical no. of rows present in the excel doc is: "+NoOfRows);
		for (int i = 1; i <= NoOfRows ; i++) {
			
			String action = getCellValue(i,3);
			System.out.println(action);
			switch(action) {
			case "open":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "navigate":
				driver.get(getCellValue(i, 5));
				break;
			case "click":
				driver.findElement(By.xpath(getCellValue(i, 4))).click();
				break;
			case "type":
				driver.findElement(By.xpath(getCellValue(i, 4))).sendKeys(getCellValue(i, 5));
				break;
			case "close":
				driver.quit();
				break;
			}
		}
	}
}
