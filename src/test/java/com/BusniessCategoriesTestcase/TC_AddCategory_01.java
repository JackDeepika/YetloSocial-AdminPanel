package com.BusniessCategoriesTestcase;


import java.awt.AWTException;

import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;

import com.YetloTestCase.BaseClass;

public class TC_AddCategory_01 extends BaseClass{
	@Test (priority=0)
	public void AddCategoryTest() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.ClickAddCategory();
		Thread.sleep(2000);
		bc.SetcategoryName();
		bc.Setcolor();
		Thread.sleep(9000);
		bc.SetImage();
		bc.ClickActive();
		bc.clickadd();
		Thread.sleep(2000);

	}
	@Test (priority=1)
	public void AddCategoryTestClear() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(4000);
		bc.ClickBusCat();
		bc.ClickAddCategory();
		Thread.sleep(2000);
		bc.SetcategoryName();
		bc.Setcolor();
		Thread.sleep(2000);
		bc.ClickInactive();
		Thread.sleep(2000);
		bc.clickClear();
		Thread.sleep(2000);
	}
	@Test (priority=2)
	public void AddCategoryTestNegative() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.ClickAddCategory();
		Thread.sleep(2000);
		bc.Setcategoryname();
		bc.setcolor1();
		Thread.sleep(2000);
		bc.clickadd();
		Thread.sleep(2000);
	} 
	@Test (priority=3)
	public void AddCategoryMandatory() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(4000);
		bc.ClickBusCat();
		bc.ClickAddCategory();
		Thread.sleep(2000);
		bc.Setcategoryname();
		Thread.sleep(2000);
		bc.clickadd();
		Thread.sleep(2000);
	}
}