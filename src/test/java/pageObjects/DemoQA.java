package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class DemoQA extends basePage 
{

	public DemoQA(WebDriver driver) 
	{
		super(driver);
	}
	
//	Page Methods
	@FindBy(id="userName")
	WebElement userNameInput1;
	
	@FindBy(id="userName")
	WebElement userNameInput2;
	
	@FindBy(id="userName")
	WebElement userNameInputs;
	
	
//	Actions Methods
	
	public void enterUserName(String userName) 
	{
		userNameInput1.sendKeys(userName);
	}
	public void enterUserName2(String userName) 
	{
		userNameInput1.sendKeys(userName);
	}
	public void enterUserNameqa(String userName) 
	{
		userNameInput1.sendKeys(userName);
	}
}
