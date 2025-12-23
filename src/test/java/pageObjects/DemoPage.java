package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class DemoPage extends basePage 
{

	public DemoPage(WebDriver driver) 
	{
		super(driver);
	}

	// page locators
	
	@FindBy(xpath = "")
	WebElement txtfname;
	
	@FindBy(xpath = "")
	WebElement txtlastname;
	
	@FindBy(xpath = "")
	WebElement txtcountry;
	
	@FindBy(xpath = "")
	WebElement txtnumber;
	
	
	
//	action methods
	
	public void setFirstName(String fname)
	{
		txtfname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setCountry(String country)
	{
		txtcountry.sendKeys(country);
	}
	
	public void setNumber(String number)
	{
		txtnumber.sendKeys(number);
	}
}
