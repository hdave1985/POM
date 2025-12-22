package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;
import testBase.baseClass;

public class TC_003_login extends baseClass 
{
	
	@Test(groups= {"Master"})
	public void performLogin() 
	{
		
		logger.info("Starting of TC ");
		
		try 
		{
			HomePage hp = new HomePage(driver);
			loginPage lp = new loginPage(driver);
			
			hp.clickMyAccount();
			logger.info("Clicked on my account");
			hp.clickLogin();
			logger.info("Clicked on my Login");
			Thread.sleep(2000);
			
			lp.addUsername(pro.getProperty("email"));
			logger.info("Added email" +pro.getProperty("email"));
			lp.addPassword(pro.getProperty("password"));
			logger.info("Added password" +pro.getProperty("password"));
			lp.clickLogin();
			logger.info("Login button clicked");
		} 
		catch (Exception e) 
		{
			logger.error("From catch blocked, failed.." +e.getMessage());
		}
		
		logger.info("Starting of TC ");
	}

	
}
