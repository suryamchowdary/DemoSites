package Testing_Sms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Way2SmsTest extends Excel_Data {
 public static WebDriver driver;
 
 
/* @AfterMethod
 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

     //Convert web driver object to TakeScreenshot
     TakesScreenshot scrShot =((TakesScreenshot)webdriver);
     //Call getScreenshotAs method to create image file
             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

             File DestFile=new File(fileWithPath);

             //Copy file at destination

             FileUtils.copyFile(SrcFile, DestFile);

 }
 */
  @Test
  public void Login() {
	  driver.manage().deleteAllCookies();
	    try {
			Double username = ReadExcel(1, 0).getNumericCellValue();
			driver.findElement(By.id("mobileNo")).sendKeys(username.toString());
			driver.findElement(By.id("password")).sendKeys(ReadExcel(1, 0).getStringCellValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();
  }

  @Test
  public void Send_Sms() {
	  
    
  }

  @Test
  public WebDriver driver_intitialization() {
   
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	ChromeDriverService service = ChromeDriverService.createDefaultService();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("test-type");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-extensions");
	options.setExperimentalOption("useAutomationExtension", false);
	return driver = new ChromeDriver(service, options);
  }

 
}
