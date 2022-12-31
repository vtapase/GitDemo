package pra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SSLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*FirefoxProfile p = new FirefoxProfile();
		
		p.setAcceptUntrustedCertificates(true);*/
		
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Tutorials\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	}

}
