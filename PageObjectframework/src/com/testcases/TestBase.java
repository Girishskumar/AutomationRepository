package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase
 {

	public static WebDriver driver =null;
	
	@BeforeSuite
	public void initialise()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\giris\\OneDrive\\Desktop\\Selenium -2020\\Chrome\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@AfterSuite
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
}
