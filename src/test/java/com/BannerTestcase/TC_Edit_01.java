package com.BannerTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_Edit_01 extends BaseClass {
	@Test (priority =0)
	public void Edittest() throws InterruptedException, IOException, AWTException
	{
		//WebDriver driver;
		driver.get(baseURL);
		
		BannerPage bp1=new BannerPage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickBField();
		bp1.ClickEdit();
		Thread.sleep(2000);
	    bp1.ChooseImage1();
	    Thread.sleep(2000); 
        bp1.Setstatus1(); 
        bp1.Clickup();
        Thread.sleep(2000);
		
	}
	
	@Test (priority = 1)
	public void EditNegative() throws InterruptedException, AWTException, IOException
	{
      driver.get(baseURL);
		
		BannerPage bp1=new BannerPage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickBField();
		Thread.sleep(2000);
		bp1.ClickEdit();
		Thread.sleep(2000);
		bp1.Choosepdf();
		Thread.sleep(2000); 
		bp1.Setstatus1();
		Thread.sleep(2000);
	    //bp1.Clickup();
	    Thread.sleep(2000); 
	    TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\EditNegativeBanner.png");
		FileHandler.copy(source, store);
		 
	}
}
