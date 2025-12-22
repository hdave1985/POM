package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;
import testBase.baseClass;
import utilities.DataProvider_;

public class TC_005_DDTTest extends baseClass 
{

	@Test(dataProvider = "newtestDDT", dataProviderClass = DataProvider_.class)
	public void DDTTest(String email, String pwd, String res) 
	{
		logger.info("TC started ");
		HomePage hp = new HomePage(driver);
		loginPage lp = new loginPage(driver);
		
		logger.info("TC Ended");
	}
}
