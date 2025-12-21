package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.loginPage;
import testBase.baseClass;
import utilities.DataProviders;

public class TC_004_loginDDT_1 extends baseClass 
{

	@Test(dataProvider ="LoginData", dataProviderClass=DataProviders.class, groups = {"Datadriven"})
	public void performDDTLogin(String email, String password, String exp) 
	{
		logger.info("Starting of TC_004_loginDDT_1");
		
		try 
		{
		
//			driver.get(pro.getProperty("appurl"));
			
			HomePage hp = new HomePage(driver);
			loginPage lp = new loginPage(driver);
			
			hp.clickMyAccount();
			logger.info("Clicked on my account" +email);
			hp.clickLogin();
			logger.info("Clicked on my Login" +password);
//			Thread.sleep(2000);
			lp.clear();
	        lp.clearpassLogin();
			
			lp.addUsername(email);
			logger.info("Added email");
			lp.addPassword(password);
			logger.info("Added password");
			lp.clickLogin();
			logger.info("Login button clicked");
			
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					logger.info("***from invalid else****");
//					driver.navigate().refresh();
//					Assert.assertTrue(true);
				}
			}
			
		} 
		catch (Exception e) 
		{
			logger.error("Test failed... "+e.getMessage());
		}
		
		logger.info("Ending of TC_004_loginDDT_1");
	}
	
}
