package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Updateprofile {
//profile---> //a[@href='#profile']
	
	public static WebElement Clickprofile(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[@href='#profile']"));
	}
	public static WebElement city(WebDriver driver)
	{
		return driver.findElement(By.name("city"));
	}
	
	public static WebElement phonenumber(WebDriver driver)
	{
		return driver.findElement(By.name("phone"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[contains(text(),'Submit')][@type='submit']"));
		
	}
	
	
	
}
