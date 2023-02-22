package com.OtherPosterCategoriesTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Action_01 extends BaseClass {
	@Test(priority=0)
	public void actionTest() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		Thread.sleep(3000);
		bc.clickaddposter();
		Thread.sleep(3000);
		bc.setcategoryname();
		bc.setimage1();
		Thread.sleep(5000);
		bc.clickstatus1();
		bc.clickadd1(); 
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void actionTestclear() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		Thread.sleep(3000);
		bc.clickaddposter();
		Thread.sleep(3000);
		bc.setcategoryname();
		bc.setimage1();
		Thread.sleep(5000);
		bc.clickstatus1();
		bc.clickclear1();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void actionTestMandatory() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		Thread.sleep(3000);
		bc.clickaddposter();
		Thread.sleep(3000);
		bc.clickadd1(); 
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void actionTesteye() throws InterruptedException, AWTException, IOException
	{
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
		bc.clickActionAddposter();
		Thread.sleep(5000);
		bc.clickActioncolor1();
		bc.clickimageaction();
		bc.clickactionInactive();
		bc.clickaddAction();
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\addposteractionOtherposter.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);

		
	}
	@Test(priority=4)
	public void actionTesteyeclear() throws InterruptedException, AWTException
	{
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
		bc.clickActionAddposter();
		Thread.sleep(5000);
		bc.clickActioncolor();
		bc.clickimageaction();
		bc.clickactionInactive();
		bc.clikActionclear();
	}
	
}
