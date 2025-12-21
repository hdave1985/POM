package pageObjects;

import org.openqa.selenium.Keys;
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
	
	@FindBy(name="email")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
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
	
	public void clear() {
		txtusername.sendKeys(Keys.CONTROL + "a");
		txtusername.sendKeys(Keys.DELETE);
		txtusername.clear();
	}
	
	public void clearpassLogin() {
		txtpassword.sendKeys(Keys.CONTROL + "a");
		txtpassword.sendKeys(Keys.DELETE);
		txtpassword.clear();
	}
	
}
