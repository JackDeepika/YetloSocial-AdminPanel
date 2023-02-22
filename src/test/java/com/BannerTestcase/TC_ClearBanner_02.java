package com.BannerTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_ClearBanner_02 extends BaseClass{
	@Test
	public void clearTest() throws InterruptedException, AWTException, IOException
	{
      driver.get(baseURL);
		
		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
	
		Thread.sleep(3000);
		bp.ClickBField();
		bp.ClickAddBan();
		Thread.sleep(5000);
		bp.ChooseJPG();
		Thread.sleep(2000);
		bp.ClickStatus();
		Thread.sleep(2000);
		bp.clickclr();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\BannerClear.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);

		
		
	}

}
