package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc_login extends Tc_BasePage {

	@Test
	public void Verify_Account_login() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage logpag=new LoginPage(driver);
		logpag.email("gupta@gmail.com");
		logpag.password("12345");
		logpag.login();
		Thread.sleep(3000);
		String titel=driver.getTitle();
		Assert.assertEquals(titel,"My Account");
		
	}
	
	
	
}
