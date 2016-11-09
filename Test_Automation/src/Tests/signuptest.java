package Tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.Signup_objects;


public class signuptest extends testbase_signup {

	Signup_objects spg;
public  signuptest() throws IOException, InterruptedException {
	// TODO Auto-generated constructor stub
	login();
	Thread.sleep(10000);
	spg=new Signup_objects(driver);
}
@Test
@Parameters({"username","emailid","password","rptpassword", "iama", "speciality", "accept"})

public void login(String username, String emailid, String password, String rptpassword, String iama, String speciality, String accept ) throws InterruptedException{
	spg.username().sendKeys(username);
	spg.emailid().sendKeys(emailid);
	spg.password().sendKeys(password);
	spg.rptpassword().sendKeys(rptpassword);
	select_drpdown(spg.iama_drpdown() ,iama);
	select_drpdown(spg.speciality_drpdown(),speciality);
	click_checkbox(spg.acpt_chkbox(),accept);
	spg.submit_button().click();
	
	if(emailid.equals(existing_email))
	{

	Assert.assertEquals(spg.er_mess_light().getText(),"An account with that email already exists");
		
	}

	if(username.equals(existing_user))
	{
		Assert.assertEquals(spg.er_mess_light().getText(),"An account with that username already exists.");
		
	}
	if(username.isEmpty()||username.length()<4 )
	{
		Assert.assertEquals(spg.username_small().getText(), "Username must be at least 4 characters long (accepts letters, numbers and da");
	}
	if(emailid.equals("") || !isValidEmailAddress(emailid))
	{

		Assert.assertEquals(spg.invalid_email().getText(),"That is not a valid email address");
		
	}
	if(password.isEmpty()||password.length()<6)
    {
	     Assert.assertEquals(spg.password_small().getText(), "Password must be at least 6 characters long");
    }
	if(password != rptpassword)
	{
		Assert.assertEquals(spg.password_not_match().getText(), "Passwords must match");
	}
	if(iama.equals("I am a")|| speciality.equals("My speciality is") )
	{
		Assert.assertEquals(spg.select_speciality().getText(), "Please selected a valid specialty");
	}
	driver.close();
	
}
}
