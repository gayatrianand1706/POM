package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindByLoginFunction {

	@FindBy(how = How.NAME, using ="username" )
	public static WebElement Username;
	
	@FindBy(how = How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id='loginfrm']/button")
	public static WebElement submit;
}
