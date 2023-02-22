package com.BusniessCategoriesTestcase;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_Action_01 extends BaseClass{
	@Test(priority=0)
	public void ActionAddposter() throws InterruptedException, AWTException
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
		Thread.sleep(2000);
		bc.clickAddposter();
		Thread.sleep(2000);
		bc.clickbackcolor();
		Thread.sleep(3000);
		bc.clickimage1();
		js.executeScript("window.scrollBy(0,1000)");
		bc.clickactive();
		Thread.sleep(5000);
		bc.clickAdd1();
	}
	@Test(priority=1)
	public void ActionAddposterMandatory() throws InterruptedException, AWTException
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
		bc.clickAddposter();
		Thread.sleep(3000);
		bc.clickInactive();
		bc.clickAdd1();
	}
	@Test(priority=2)
	public void ActionAddposterNegative() throws InterruptedException, AWTException
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
		bc.clickAddposter();
		Thread.sleep(3000);
		bc.clickAdd1();
		
	}
	@Test(priority=3)
	public void ActionAddposterclear() throws InterruptedException, AWTException
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
		bc.clickAddposter();
		Thread.sleep(3000);
		bc.clickInactive();
		bc.clickclr();
	}
	

}
