package pra;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {

	WebDriver driver ;
	Logger logger = LogManager.getLogger(Para.class);
	
	@BeforeClass
	public void Setup() {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Tutorials\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		logger.info("First Link intialise");
	}
	
	
	@Test(dataProvider = "val")
	public void Exec(String val, String bal) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("Second Link intialise");
		driver.findElement(By.id("autocomplete")).sendKeys(val);
		driver.findElement(By.name("enter-name")).sendKeys(bal);
		Thread.sleep(4000);
	}
	
	@DataProvider(name = "val")
	public Object[][] prov() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "v";
		data[0][1] = "i";
		data[1][0] = "r";
		data[1][1] = "a";
		return data ; 
	}
	
	@Test(priority=0)
	public void radio() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(4000);
		logger.trace("Radio Button");
	}	
	@Test(priority=6)
	public void check() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		Thread.sleep(4000);
	}	
}	
