package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page_Factory {
	@CacheLookup
	@FindBy(how = How.ID, using="mobileNo")
	public static WebElement username;
	@CacheLookup
	@FindBy(how = How.ID, using="password")
	public static WebElement password;
	@CacheLookup
	@FindBy(how = How.XPATH, using="//*[@id=\"loginform\"]/div[2]/div[2]/button")
	public static WebElement login;
	@CacheLookup
	@FindBy(how = How.XPATH, using="/html/body/div[4]/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement logout;
	

}
