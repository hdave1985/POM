package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.loginPage;
import testBase.baseClass;

public class TC_001_Login extends baseClass 
{
	
	@Test(groups = {"Sanity","Master"})
	public void performLogin() throws InterruptedException
	{	
		try 
		{
			
			logger.info("STarting of TC_001_Login");
			System.out.println("From test method");
			loginPage objlogin  = new loginPage(driver);
			objlogin.addUsername(pro.getProperty("email"));
			logger.info("ADded username");
			Thread.sleep(2000);
			objlogin.addPassword(pro.getProperty("password"));
			logger.info("ADded Password");
			Thread.sleep(2000);
			objlogin.clickLogin();
			logger.info("Clicked on password");
			Thread.sleep(2000);
			logger.info("Success");
			logger.info("Ending of TC_001_Login");
			
		} 
		catch (Exception e) 
		{
			logger.error("Test Failed" +e.toString());
			logger.debug("Debug logs");
			Assert.fail();			
		}
		
		
	}

}
