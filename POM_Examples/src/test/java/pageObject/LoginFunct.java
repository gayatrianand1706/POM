package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunct {

	public static WebElement Username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
	}
}
