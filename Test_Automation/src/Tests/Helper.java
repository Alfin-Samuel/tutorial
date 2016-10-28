package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {
  
	WebDriver driver;
	String validemailId="test2009@yahoo.com";
	String validPassword="test@123";
	String pageurl;
	File f = new File("B:\\GIT_Repo\\Tutorial\\tutorial\\Test_Automation\\input.properties");
	FileInputStream fs = new FileInputStream(f);  
	 // Create Properties object  
	 Properties prop = new Properties();  
	 //load properties file  
	 
	 

	 //// WebDriver reference but Firefox object  
	 public void browserSetup (String browser) {
			if(browser.equals("Firefox")){
				driver = new FirefoxDriver();


			} else if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();

			}
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	 

	 public String getURL() {
		pageurl=prop.getProperty("URL");
		return pageurl;
		}
}
