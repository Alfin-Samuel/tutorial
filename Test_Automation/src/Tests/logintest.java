package Tests;

import org.testng.annotations.Test;

public class logintest extends Helper {
	
@Test

public void login_correct()
{
	login(validemailId,validPassword);
	String home_bn_link=homepg.Home_btn().getTagName();
	System.out.println(home_bn_link);
}
}
