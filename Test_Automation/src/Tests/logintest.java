package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomePage_Objects;


public class logintest extends testbase {
@Test
public void correct_login() throws IOException, InterruptedException
{
	login();
	HomePage_Objects hpg = new HomePage_Objects(driver);
	hpg.Email().sendKeys("alfin.mobile.qa@gmail.com");
	hpg.Password().sendKeys("123Password");
	hpg.Signin().click();

}
}
