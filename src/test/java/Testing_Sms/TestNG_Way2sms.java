package Testing_Sms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_Way2sms extends Excel_Data{
	public WebDriver driver;
	
  @Test(priority = 1)
  public void Login() {
	   
	  driver.manage().deleteAllCookies();
	    try {
			driver.findElement(By.id("mobileNo")).sendKeys(ReadExcel(1, 0).getRawValue());
			driver.findElement(By.id("password")).sendKeys(ReadExcel(1, 1).getStringCellValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();
		
 }
  @Test(priority = 0)
  public void InitializeDriver() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriverService service = ChromeDriverService.createDefaultService();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(service, options);
		 driver.get("http://www.way2sms.com/");
		
		
  }

  @Test(priority = 2)
  public void ConfigureMessage() {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys(ReadExcel(1, 3).getRawValue());
			
			driver.findElement(By.xpath("//*[@id='message']")).sendKeys(ReadExcel(1, 2).getStringCellValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("sendButton")).click();
		
  }
  @Test(priority = 3)
  public void logout()
  {
	  driver.findElement(By.xpath("//*[@class='logout']")).click();
  }
  @AfterMethod
  public void screenshot() 
  {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
/*	  // now copy the  screenshot to desired location using copyFile //method
*/	  try {
	FileUtils.copyFile(src, new File("target\\"+System.currentTimeMillis()+".png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}