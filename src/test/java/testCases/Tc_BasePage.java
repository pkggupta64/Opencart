package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tc_BasePage {
public WebDriver driver;
	
	@BeforeClass
	public void stup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomeString() //this method help to generate multiple string randomly
	{
	String generatedstring=RandomStringUtils.randomAlphabetic(5);
	return generatedstring;
	}
	
	public String randomenumber() //this method help to generate multiple no randomly
	{
	String generatedno=RandomStringUtils.randomNumeric(10);
	return generatedno;
	}
	
	public String randomeaplanumric() //this method help to generate multiple string+no randomly
	{
	String generatedAlpha=RandomStringUtils.randomAlphabetic(5);
	String generatednum=RandomStringUtils.randomNumeric(5);
	return (generatedAlpha+"@"+generatednum);
	
	}
}
