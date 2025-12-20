package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import testBase.baseClass;
import utilities.DataProviders;

public class TC_001_DDT_Login extends baseClass 
{
	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class)
	public void testDDTLogin() 
	{
		
		logger.info("Starting of TC_001_DDT_Login");
		try 
		{
			loginPage lp = new loginPage(driver);
			lp.addUsername(pro.getProperty(""));
			
		} catch (Exception e) 
		{
			logger.error("Test Failed" +e.toString());
			// TODO: handle exception
		}
		
		
		
		logger.info("Ending of TC_001_DDT_Login");
		
		
	}

}
