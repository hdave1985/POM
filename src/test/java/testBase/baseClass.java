package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass
{
	public WebDriver driver;
	public org.apache.logging.log4j.Logger logger;
	public Properties pro;
	@BeforeClass
	@Parameters({"os","browser"})
	public void testSetup(String os, String br) throws IOException 
	{
		FileReader file = new FileReader("./src//test//resources//config.properties");
//		./ = current project directory
		pro = new Properties();
		pro.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		
		
		switch (br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		
		default: logger.error("Invalid browser name"); return;

		}
		
		
		
		
		logger.info("From test suite");
		System.out.println("From Test set up");
		
//		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//		driver.get("https://github.com/login");
		driver.get(pro.getProperty("appurl"));
		logger.info("github");
	}
	
	@AfterClass
	public void testTeardown() 
	{
		logger.info("From test tear down");
		System.out.println("From tear down method");
		driver.quit();
	}
	
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	

	

	
}
