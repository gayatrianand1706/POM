package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.FindByLoginFunction;
import pageObject.FindByUpdateProfile;


public class FindUpdate {

	@Test
	public void Update() throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Testing WorkSpace\\driver\\chrome80version\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.phptravels.net/login");
	Thread.sleep(3000);
	PageFactory.initElements(driver, FindByLoginFunction.class);
	
	FindByLoginFunction.Username.sendKeys("user@phptravels.com");
	FindByLoginFunction.password.sendKeys("demouser");
	FindByLoginFunction.submit.click();
	
	PageFactory.initElements(driver, FindByUpdateProfile.class);
	
	System.out.println("clickbefore");
	FindByUpdateProfile.Clickprofile.click();
	System.out.println("clickafter");
	FindByUpdateProfile.city.sendKeys("NewYork");
	FindByUpdateProfile.phonenumber.sendKeys("1234567890");
	FindByUpdateProfile.submit.click();
	
	driver.quit();
	
		/*
		 * Updateprofile.Clickprofile(driver).click();
		 * Updateprofile.city(driver).sendKeys("Newyork");
		 * Updateprofile.phonenumber(driver).sendKeys("1234567890");
		 * Updateprofile.submit(driver).click();
		 */
}}
