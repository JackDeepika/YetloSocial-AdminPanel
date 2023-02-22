package com.BusniessCategoriesTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_Sort_01 extends BaseClass {
	@Test(priority=0)
	public void SortTest() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.clickSort();
	}
	@Test(priority=1)
	public void SortTestaddPoster() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.clickEye();
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\AddposterSearchBusniesscate.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);
		Thread.sleep(2000);
		bc.clicksortAddposter();
	}

}
