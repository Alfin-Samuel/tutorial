package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Objects {
	WebDriver driver;
	public HomePage_Objects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement Email;
	
	@FindBy(id="ember469")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Signin;
	
	@FindBy(id="header-home")
	WebElement Home_btn;
	
	public WebElement Email()
	{
		   return Email;
	}
	
	public WebElement Password()
	{
		   return Password;
	}
	
	public WebElement Signin()
	{
		   return Signin;
	}
	public WebElement Home_btn()
	{
		   return Home_btn;
	}
}
