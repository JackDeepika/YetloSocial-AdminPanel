package com.OtherPosterCategoriesTestcase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Sort_01 extends BaseClass{
	@Test(priority=0)
	public void sortTest() throws InterruptedException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.setsort();
		bc.Setsort1();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void sortTestaction() throws InterruptedException
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
		bc.clicksort();
		bc.clicksort1();
	}
	@Test(priority=2)
	public void actionTestsort() throws InterruptedException, AWTException
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
		Thread.sleep(3000);
		bc.clickactionsort();
	}

}
