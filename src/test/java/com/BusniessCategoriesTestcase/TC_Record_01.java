package com.BusniessCategoriesTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_Record_01 extends BaseClass{
	@Test(priority=0)
	public void Recordtest() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.clickEye();
		Thread.sleep(3000);
		bc.ClickRecord();
	}
	@Test(priority=1)
	public void Recordtestcategory() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.clickEye();
		js.executeScript("window.scrollBy,(0,100000)");
		Thread.sleep(5000);
		bc.clickrecordcategory();
	}

}
