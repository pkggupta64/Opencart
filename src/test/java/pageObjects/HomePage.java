package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnklogin;
	
	@FindBy(xpath="//a[@id='wishlist-total']")
	WebElement lnkwish_list;
	
	@FindBy(xpath="//a[@id='wishlist-total']")
	WebElement lnkwishlist;
	
	@FindBy(xpath="//a[@title='Checkout']")
	WebElement lnkcheckout;
	
	@FindBy(xpath="//button[@data-toggle='dropdown']")
	WebElement lnkcurrency;
	
	@FindBy(xpath="//button[@name='EUR']")
	WebElement lnkeuro;
	
	@FindBy(xpath="//button[@name='GBP']")
	WebElement lnkpound ;
	
	@FindBy(xpath="//button[@name='USD']")
	WebElement lnkusd;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement lnksearch_box;
	
	@FindBy(xpath="//div[@id='search']//button")
	WebElement lnksearch_button;
	
	@FindBy(xpath="//button[@data-loading-text='Loading...']")
	WebElement lnkcart;
	
	@FindBy(xpath="//div[@id='logo']")
	WebElement lnklogo;
	
	
	
	
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clicklogin()
	{
		lnklogin.click();
	}
	
}
