package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomdem {

	WebDriver driver ;

	public Pomdem(WebDriver driver) {
		
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.id("autocomplete")).sendKeys("Viraj");
	
	@FindBy(id="autocomplete")
	WebElement feild ;
	
	public void btn(String name) {
		
	feild.sendKeys(name);
		
	}
	
	
	@FindBy(id="dropdown-class-example")
	WebElement se ;
	
	public void lect(WebElement se , String opt) {
		
		Select sel = new Select(se);
		sel.selectByValue( opt);
		
			
		}
}
