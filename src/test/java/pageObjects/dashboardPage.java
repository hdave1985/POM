package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class dashboardPage extends basePage 
{

	public dashboardPage(WebDriver driver) 
	{
		super(driver);	
	}
	
//	page elements
	@FindBy(xpath = "//img[@class='avatar circle']")
	WebElement circle;
	
	@FindBy(xpath = "//*[contains(text(), 'Sign out')]")
	WebElement signoutlink;
	
	@FindBy(xpath = "")
	WebElement circle2;
	
//	Action methods
	
	public void clickoncircle() 
	{
		circle.click();	
	}
	
	public void clickonlogout() 
	{
		signoutlink.click();
	}
	
}
