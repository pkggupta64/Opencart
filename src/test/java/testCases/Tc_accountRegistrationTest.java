package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc_accountRegistrationTest extends Tc_BasePage
{
	@Test
	public void Verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setLastname(randomeString().toUpperCase());
		regpage.email(randomeString()+"@gmail.com");
		regpage.telephone(randomenumber());
		
		String pas=randomeaplanumric();
		regpage.password(pas);     
		regpage.confpassword(pas);
		
		regpage.policy();
		regpage.contin();
		
		String confmsg=regpage.getmsgconfirmation();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");	
	}
	}


