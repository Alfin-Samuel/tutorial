package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testbase_signup {
	String existing_user;
	String existing_email;
	
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
	driver.get(prop.getProperty("URL_signup"));
	
}
	public WebDriver getDriver() {
		return driver;
		
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void select_drpdown(WebElement a,String value)
	{
		Select sel=new Select(a);
		sel.selectByVisibleText(value);
		
	}
	public void click_checkbox(WebElement b,String click)
	{
		if(click.equalsIgnoreCase("yes"))
		{
			if(!b.isSelected())
			{
			b.click();
			}
		}
	}
	public boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		return m.matches();
	}
	
}
