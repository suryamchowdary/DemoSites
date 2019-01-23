package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page_Factory {
	@FindBy(how = How.ID, using="mobileNo")
	public static WebElement username;
	@FindBy(how = How.ID, using="password")
	public static WebElement password;
	@FindBy(how = How.XPATH, using="//*[@id=\\\"loginform\\\"]/div[2]/div[2]/button")
	public static WebElement login;
	@FindBy(how = How.XPATH, using="//*[@class='logout']")
	public static WebElement logout;

}
