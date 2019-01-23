package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Objects {
	
protected static WebElement element = null;
	public static WebElement Username(WebDriver driver)
	{
		element = driver.findElement(By.id("mobileNo"));
		return element;
		
	}
	public static WebElement Password(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
		
	}
	public static WebElement Login(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button"));
		return element;
		
	}
	public static WebElement Logout(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@class='logout']"));
		return element;
		
	}
}