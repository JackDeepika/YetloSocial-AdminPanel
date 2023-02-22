package com.YetloTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.YetloUtilities.ReadConfig;

public class BaseClass {
	ReadConfig read=new ReadConfig();
	
	public String baseURL=read.getApplication();
	public String Email=read.getEmail();
	public String Password=read.getPassword();
	public static WebDriver driver;
	@Parameters ("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))	{
		System.setProperty("webdriver.chromedriver.driver",read.getChromePath());
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
		else {
			System.out.println("login unsuccesfull");
		}
	}
	
	
	/*
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */	 
}
