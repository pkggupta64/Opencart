package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnlogin;
	
	public void email(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void password(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	public void login()
	{
		btnlogin.click();
	}
	public String pagetitel()
	{
		return (driver.getTitle());
	}

	
	
}
