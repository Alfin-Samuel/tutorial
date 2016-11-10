package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage_Objects;

public class logintest extends testbase {

	HomePage_Objects hpg;
public  logintest() throws IOException {
	// TODO Auto-generated constructor stub
	login();
	hpg=new HomePage_Objects(driver);
}

@Test
public void a_incorrect_login() throws IOException, InterruptedException
{
	
	/*login();
	hpg=new HomePage_Objects(driver);*/
	hpg.Email().sendKeys("mobile.qa@gmail.com");
	hpg.Password().sendKeys("123Password");
	hpg.Signin().click();
	Thread.sleep(5000);
	String mess=hpg.incorrect_cred().getText();
	Assert.assertEquals("That email or password is incorrect", mess);
    driver.close();
}
@Test
public void b_correct_login() throws IOException, InterruptedException
{
	
	login();
	hpg=new HomePage_Objects(driver);
	hpg.Email().sendKeys("alfin.mobile.qa@gmail.com");
	hpg.Password().sendKeys("123Password");
	hpg.Signin().click();
	Thread.sleep(5000);
	hpg.sign_avatar().click();
    driver.close();
    
}
}
