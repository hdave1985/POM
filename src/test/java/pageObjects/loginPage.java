package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class loginPage extends basePage
{
//	WebDriver driver;
	
	public loginPage(WebDriver driver) 
	{
		super(driver);
	}
	
//	Page elements 
	
	@FindBy(name="login")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="commit")
	WebElement signinbutton;
	
	
//	Action methods
	
	public void addUsername(String email) {
		txtusername.sendKeys(email);
	}
	
	 public void addPassword(String password) {
		txtpassword.sendKeys(password);
		}
	
	public void clickLogin() {
		signinbutton.click();
	}
	
}
