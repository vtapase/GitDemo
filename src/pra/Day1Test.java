package pra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Day1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\Tutorials\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver(options);
		 
		 driver.get("https://expired.badssl.com/");
		 
		 System.out.println("Viraj");
		 
		 System.out.println("Tapase");
	}

}
