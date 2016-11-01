package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testbase  {

	WebDriver driver;
	public void login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("B:\\GIT_Repo\\Tutorial\\tutorial\\Test_Automation\\input.properties");
		prop.load(fis);
		String browser=prop.getProperty("Browser");
	
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.get(prop.getProperty("URL"));
	
}
	public WebDriver getDriver() {
		return driver;
		
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


}
