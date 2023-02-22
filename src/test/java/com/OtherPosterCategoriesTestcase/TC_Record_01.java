package com.OtherPosterCategoriesTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Record_01 extends BaseClass {
	@Test(priority=0)
	public void recordtest() throws InterruptedException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		js.executeScript("window.scrollBy(0,18000)");
		Thread.sleep(3000);
		bc.clickrecordpage();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void actionTestrecord() throws InterruptedException, AWTException, IOException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		Thread.sleep(3000);
		bc.ClickActionEye();
		js.executeScript("window.scrollBy(0,18000)");
		bc.clickrecordaction();
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\otherposterrecordaction.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=2)
	public void actionTestrecord1() throws InterruptedException, AWTException, IOException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		js.executeScript("window.scrollBy(0,18000)");
		Thread.sleep(3000);
		bc.clickrecordaction1();
	}
		


}
