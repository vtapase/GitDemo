package pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import main.Pomdem;

public class AssertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Tutorials\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Pomdem pd = new Pomdem(driver);
		pd.btn("Viraj");
		
		WebElement sel = driver.findElement(By.id("dropdown-class-example"));
		
		/*Select se = new Select(sel);
		
		se.selectByValue("option3");*/
		
		pd.lect(sel , "option3");
		/*SoftAssert a = new SoftAssert();

		
		a.assertTrue(false, null);
		
		Assert.assertEquals(false, false);*/
	}

	

}
