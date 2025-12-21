package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.loginPage;
import testBase.baseClass;
import utilities.DataProviderTest;
import utilities.DataProviders;

public class TC_004_loginDDT_2 extends baseClass 
{
	
	@Test(dataProvider = "LoginDataUpdated", dataProviderClass = DataProviderTest.class)
	public void loginDDT() 
	{
		
	}

}
