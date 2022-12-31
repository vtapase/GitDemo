package pra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Finale {
	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Tutorials\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	
	@Test
	public void Exec() throws IOException {
		
		//
		
		FileInputStream fis = new FileInputStream("D:\\Tutorials\\Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Details");
		int total = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		for(int i = 1; i < total ; i++) {
			
			 XSSFRow row = sheet.getRow(i);
			 int colTot = row.getLastCellNum() - row.getFirstCellNum();
			 for(int j = 0; j < colTot ; j++) {
				 
				XSSFCell place = row.getCell(j);
				String city = place.getStringCellValue();
				driver.findElement(By.id("autosuggest")).sendKeys(city);
			 }
		}
		
		XSSFRow row = sheet.getRow(5);	
		XSSFCell place = row.createCell(total);
		place.setCellValue("av");
		
		FileOutputStream fos = new FileOutputStream("D:\\Tutorials\\Book.xlsx");
		
		
		wb.write(fos);
		fos.close();
	}
	
	
	
}
