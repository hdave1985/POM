package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	@BeforeClass(groups= {"Sanity", "Regression", "Master", "Datadriven"})
	@Parameters({"os","browser"})
	public void testSetup(String os, String br) throws IOException 
	{
		FileReader file = new FileReader("./src//test//resources//config.properties");
//		./ = current project directory
		pro = new Properties();
		pro.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		
		
		switch (br.toLowerCase()) 
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		
		default: logger.error("Invalid browser name"); return;

		}
			
		logger.info("From test suite");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("appurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		logger.info("tutorialsninja.com Demo");
	}
	
	@AfterClass(groups= {"Sanity", "Regression", "Master", "Datadriven"})
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

	public String captureScreen(String tname) 
	{
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetfilepath = System.getProperty("user.dir")+"\\screenshots\\" + tname + "_"+ timestamp;
		File targetFile = new File(targetfilepath);
		
		source.renameTo(targetFile);
		
		return targetfilepath;
	}
	

	

	
}
