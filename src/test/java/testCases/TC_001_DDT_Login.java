package testCases;

import org.testng.annotations.Test;

import pageObjects.dashboardPage;
import pageObjects.loginPage;
import testBase.baseClass;
import utilities.DataProviders;

public class TC_001_DDT_Login extends baseClass 
{
	
	// if dataprovider method is in same class 
	// USe >> @Test(dataProvider="LoginData")
	
	// if dataprovider method is NOT in same class 
	// USe >> @Test(dataProvider="LoginData", dataProviderClass = DataProviders.class)

	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class)
	public void testDDTLogin(String email, String password, String resp) 
	{
		
		logger.info("Starting of TC_001_DDT_Login");
		try 
		{
			loginPage lp = new loginPage(driver);
			dashboardPage dp = new dashboardPage(driver);
			
			lp.addUsername(email);
			logger.info("Added email");
			lp.addPassword(password);
			logger.info("Added password");
			lp.clickLogin();
			logger.info("Clicked login");
			Thread.sleep(3000);
			
			dp.clickoncircle();
			logger.info("Clicked on circle ");
			Thread.sleep(1000);
			dp.clickonlogout();
			logger.info("Clicked on logout ");
			Thread.sleep(1000);
			
		} catch (Exception e) 
		{
			logger.error("Test Failed" +e.toString());
			// TODO: handle exception
		}
		
		
		
		logger.info("Ending of TC_001_DDT_Login");
		
		
	}

}
