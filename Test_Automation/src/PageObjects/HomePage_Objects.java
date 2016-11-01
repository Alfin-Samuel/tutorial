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
	
	@FindBy(id="ember428")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Signin;
	
	@FindBy(id="header-home")
	WebElement Home_btn;
	
	@FindBy(xpath="//*[@class='error-message-light']")
	WebElement incorrect_cred;
	
	@FindBy(xpath="//img[@alt='avatar']")
	WebElement sign_avatar;
	
	@FindBy(xpath="//span[@class='username']")
	WebElement name_avatar;
	
	
	
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
	public WebElement incorrect_cred()
	{
		return incorrect_cred;
	}
	public WebElement sign_avatar()
	{
		return sign_avatar;
	}
	public WebElement name_avatar()
	{
		return sign_avatar;
	}
	
}
