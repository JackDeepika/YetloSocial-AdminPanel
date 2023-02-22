package com.BannerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass {
	@Test (priority=0)
	public void searchTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		BannerPage bp1=new BannerPage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickBField();
		bp1.EnterValue();
		Thread.sleep(2000);
		
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\searchPosstiveBanner.png");
		FileHandler.copy(source, store);
		
	}
	@Test(priority=1)
	public void searchTestNeg() throws InterruptedException, IOException
	{
     driver.get(baseURL);
		
		BannerPage bp1=new BannerPage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickBField();
		bp1.EnterValue1();
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\searchNegativeBanner.png");
		FileHandler.copy(source, store);

	}


}
