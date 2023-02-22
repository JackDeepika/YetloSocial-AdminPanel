package com.OtherPosterCategoriesTestcase;


import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_AddPoster_01 extends BaseClass {
	@Test(priority=0)
	public void AddposterTest() throws InterruptedException, AWTException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickAddPoster();
		Thread.sleep(3000);
		bc.setCategoryName();
		js.executeScript("window.scrollBy,(0,10000)");
		Thread.sleep(3000);
		bc.clickImage();
		js.executeScript("window.scrollBy,(0,10000)");
		Thread.sleep(5000);
		bc.clickactive();
		bc.clickadd();
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void AddposterTestclear() throws InterruptedException, AWTException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickAddPoster();
		Thread.sleep(3000);
		bc.setCategoryName();
		js.executeScript("window.scrollBy,(0,10000)");
		Thread.sleep(3000);
		bc.clickImage();
		js.executeScript("window.scrollBy,(0,10000)");
		Thread.sleep(5000);
		bc.clickactive();
		bc.clickClear();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void AddposterTestMandatory() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickAddPoster();
		Thread.sleep(3000);
		bc.clickInactive();
		bc.clickadd();
}
}



