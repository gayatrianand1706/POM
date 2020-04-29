package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FindByUpdateProfile {
	//html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a
	//a[contains(@href,'#profile')]
	////a[contains(text(),'My Profile')]
	@FindBy(xpath ="//a[@href='#profile']")
	public static WebElement Clickprofile;
	
	@FindBy(how = How.NAME,using="city")
	public static WebElement city;
	
	@FindBy(name = "phone")
	public static WebElement phonenumber;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')][@type='submit']" )
	public static WebElement submit;
	
	
	
}

