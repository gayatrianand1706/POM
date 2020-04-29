package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.FindByLoginFunction;
import pageObject.LoginFunct;
import pageObject.Updateprofile;

public class FindLogin {

	@Test
	public void Login()
	{
			/*
			 * Email user@phptravels.com 
			 * Password demouse
			 */
			System.setProperty("webdriver.chrome.driver", "C:\\Testing WorkSpace\\driver\\chrome80version\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.phptravels.net/login");
			driver.manage().window().maximize();
			PageFactory.initElements(driver, FindByLoginFunction.class);
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
			FindByLoginFunction.Username.sendKeys("user@phptravels.com");
			FindByLoginFunction.password.sendKeys("demouser");
			FindByLoginFunction.submit.click();
			
		/*
		 * LoginFunct.Username(driver).sendKeys("user@phptravels.com");
		 * LoginFunct.password(driver).sendKeys("demouse");
		 * LoginFunct.submit(driver).click();
		 */
			
			Updateprofile.Clickprofile(driver).click();
			Updateprofile.city(driver).sendKeys("Newyork");
			Updateprofile.phonenumber(driver).sendKeys("1234567890");
			Updateprofile.submit(driver).click();
			
			
			
			
	}
}
