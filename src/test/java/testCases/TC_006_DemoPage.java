package testCases;

import java.util.Properties;

import org.testng.annotations.Test;

import pageObjects.DemoPage;
import testBase.baseClass;

public class TC_006_DemoPage extends baseClass 
{
	
	@Test
	public void demoPageTest()
	{
		logger.info("TC started ");
		
		DemoPage dp = new DemoPage(driver);
		dp.setFirstName(pro.getProperty(""));
		dp.setLastName(pro.getProperty(""));
		dp.setCountry(pro.getProperty(""));
		dp.setNumber(pro.getProperty(""));
		
		logger.info("TC Ended");
	}
}
