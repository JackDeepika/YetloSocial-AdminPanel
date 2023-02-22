package com.BusniessCategoriesTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass{
	@Test(priority = 0)
	public void SearchTest() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.searchclick();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void SearchTestname() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.searchclick1();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void SearchTestNegative() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.negativesearch();

	}

}
