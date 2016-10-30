package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.HomePage_Objects;

public class Helper {

	WebDriver driver;

	String validemailId = "test2009@yahoo.com";
	String validPassword = "test@123";
	String validUsername = "test2009";
	InputStream inputStream;
	Properties prop = new Properties();
	String pageurl;
	String browser;
	HomePage_Objects homepg=new HomePage_Objects(driver);

	String propFileName = "B:\\GIT_Repo\\Tutorial\\tutorial\\Test_Automation\\input.properties";

	public void getInputs() throws IOException {

		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}

	}
	

	public String getURL() {
		pageurl = prop.getProperty("URL");
		return pageurl;
	}
	public String getbrowser() {
		browser = prop.getProperty("Browser");
		return "Firefox";
	}

    public void browserSetup () {
		if(getbrowser().equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64");
			driver = new FirefoxDriver();


		} else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32");
			driver=new ChromeDriver();

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
    public void login(String email,String Password)
    {
    	browserSetup();
    	driver.get(getURL());
    	homepg.Email().sendKeys(email);
    	homepg.Password().sendKeys(Password);
    	homepg.Signin().click();
    	
    }
          
    {
    	
    }
}
