package com.OtherPosterCategoriesTestcase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass{
	@Test(priority=0)
	public void SearchPostive() throws InterruptedException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.setsearch();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void SearchNegative() throws InterruptedException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.setsearch1();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void SearchActionpostive() throws InterruptedException
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
		bc.setSearch();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void SearchActionnegative() throws InterruptedException
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
		bc.setsearch2();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void actionTestsearch() throws InterruptedException, AWTException
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
		bc.clickactionsearch();
		Thread.sleep(3000);
	}
	}
