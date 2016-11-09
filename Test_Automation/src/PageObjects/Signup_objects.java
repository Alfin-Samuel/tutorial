package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_objects {
		WebDriver driver;
		public Signup_objects(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

@FindBy(id="ember468")
WebElement username;

@FindBy(id="ember470")
WebElement emailid;

@FindBy(id="ember472")
WebElement password;
		
@FindBy(id="ember474")
WebElement rptpassword;

@FindBy(id="ember483")
WebElement iama_drpdown;

@FindBy(id="ember492")
WebElement speciality_drpdown;

@FindBy(xpath="//label[@ class='box']")
WebElement acpt_chkbox;

@FindBy(xpath="//button[@class='submit-button blue']")
WebElement submit_button;

@FindBy(xpath="//div[@class='error-message-light']")
WebElement er_mess_light;

@FindBy(xpath="//*[@class='register-page account-container']/main/div[2]/span")
WebElement invalid_email;

@FindBy(xpath="//*[@class='register-page account-container']/main/div[1]/span")
WebElement username_small;

@FindBy(xpath="//*[@class='register-page account-container']/main/div[3]/span")
WebElement password_small;

@FindBy(xpath="//*[@class='register-page account-container']/main/div[4]/span")
WebElement password_not_match;

@FindBy(xpath="//*[@class='register-page account-container']/main/div[5]/span")
WebElement select_speciality;

@FindBy(xpath="//*[@class='email-confirmation-intro']/button[1]")
WebElement edit_address;

@FindBy(xpath="//*[@class='email-confirmation-intro']/button[2]")
WebElement confirm_address;


public WebElement username()
{
	return username;
}

public WebElement emailid()
{
	return emailid;
}
public WebElement password()
{
	return password;
}
public WebElement rptpassword()
{
	return rptpassword;
}
public WebElement iama_drpdown()
{
	return iama_drpdown;
}
public WebElement speciality_drpdown()
{
	return speciality_drpdown;
}
public WebElement acpt_chkbox()
{
	return acpt_chkbox;
}
public WebElement submit_button()
{
	return submit_button;
}
public WebElement er_mess_light()
{
	return er_mess_light;
}

public WebElement invalid_email()
{
	return invalid_email;
}

public WebElement username_small()
{
	return username_small;
}
public WebElement password_small()
{
	return password_small;
}
public WebElement password_not_match()
{
	return password_not_match;
}
public WebElement select_speciality()
{
	return select_speciality;

}
public WebElement edit_address()
{
	return edit_address;

}
public WebElement confirm_address()
{
	return confirm_address;

}


}
