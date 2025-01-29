package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
   public AccountRegistrationPage(WebDriver driver)
   {
       super(driver);
   }
	 
   @FindBy(xpath="//input[@name='firstname']")
   WebElement txtFirstname;
   
   @FindBy(xpath="//input[@name='lastname']")
   WebElement txtLastname;
   
   @FindBy(xpath="//input[@name='email']")
   WebElement txtEmail;
   
   @FindBy(xpath="//input[@name='telephone']")
   WebElement txtTelephone;
   
   @FindBy(xpath="//input[@name='password']")
   WebElement txtPassword;
   
   @FindBy(xpath="//input[@name='confirm']")
   WebElement txtConfirmpassword;
   
   //@FindBy(xpath="//input[@value='1']")
    WebElement btnnewsletterYes;

   //@FindBy(xpath="//input[@value='0']")
   WebElement btnnewsletterNo;

   @FindBy(xpath="//input[@name='agree']")
   WebElement chkPolicy;
   
   @FindBy(xpath="//input[@value='Continue']")
   WebElement btnContinue;
   
   @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
   WebElement msgConfirmation;
   
   
   public void setFirstname(String fname)
   {
	   txtFirstname.sendKeys(fname); 
   }
   
   public void setLastname(String lname)
   {
	   txtLastname.sendKeys(lname); 
   }
   
   public void email(String email)
   {
	   txtEmail.sendKeys(email); 
   }
   
   public void telephone(String tel)
   {
	   txtTelephone.sendKeys(tel); 
   }
   
   public void password(String pass)
   {
	   txtPassword.sendKeys(pass); 
   }
   
   public void confpassword(String pass)
   {
	   txtConfirmpassword.sendKeys(pass); 
   }
   
   public void policy()
   {
	   chkPolicy.click(); 
   }
   
   public void contin()
   {
	   btnContinue.click();
	   //Sometime click button not work so we can try in diff way
	   //1
	  // btnContinue.submit();
	   //2
	  /* Actions act =new Actions(driver);
	   act.moveToElement(btnContinue).click().perform();*/
	   //3
	 /*  JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("Argument[0].Click();", btnContinue);*/
	   //4
	 //  btnContinue.sendKeys(Keys.RETURN);
	   //5
	  /* WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   mywait.until(ExpectedConditions.elementToBeClickable(btnContinue));*/
   }
   
   public String getmsgconfirmation()
   {
	   try {
		     return (msgConfirmation.getText());
	       }
	   catch(Exception e)
	       {
		     return (e.getMessage());
	       }
   }
   
	
}
