package com.BusniessCategoriesTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_Edit_01 extends BaseClass {
	@Test(priority=0)
	public void editTest() throws InterruptedException
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
		Thread.sleep(5000);
		bc.clickEdit();
		Thread.sleep(5000);
		bc.clickeditcolor();
		js.executeScript("window.scrollBy,(0,30000)");
		bc.clickimageedit();
		Thread.sleep(8000);
		bc.clickInactive1();
		Thread.sleep(2000);
		bc.clickupdate();
	}
	@Test(priority=1)
	public void editTestcategory() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		bc.Clickeditcategory();
		Thread.sleep(5000);
		bc.clickeditname();
		js.executeScript("window.scrollBy,(0,30000)");
		Thread.sleep(5000);
		bc.clickEditstatus();
		Thread.sleep(3000);
		bc.clickupdate1();
		
	}

}
