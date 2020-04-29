package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LoginFunct;
import pageObject.Updateprofile;

public class PHPrun {

	
	@Test
public void Loginupdate()
{
		/*
		 * Email user@phptravels.com 
		 * Password demouse
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Testing WorkSpace\\driver\\chrome80version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		LoginFunct.Username(driver).sendKeys("user@phptravels.com");
		LoginFunct.password(driver).sendKeys("demouse");
		LoginFunct.submit(driver).click();
		
		Updateprofile.Clickprofile(driver).click();
		Updateprofile.city(driver).sendKeys("Newyork");
		Updateprofile.phonenumber(driver).sendKeys("1234567890");
		Updateprofile.submit(driver).click();
		
		
		
		
}

}
