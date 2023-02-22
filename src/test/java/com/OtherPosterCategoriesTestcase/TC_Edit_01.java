package com.OtherPosterCategoriesTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Edit_01 extends BaseClass {
	@Test(priority=0)
	public void actionedit1() throws InterruptedException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickEye();
		Thread.sleep(3000);
		bc.clickactionedit();
		Thread.sleep(3000);
		bc.clickactioncategoryname();
		Thread.sleep(3000);
		bc.clickactionimage();
		js.executeScript("window.scrollBy(0,18000)");
		bc.clickinactiveaction();
		Thread.sleep(3000);
		bc.clickupdate();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void actionedit() throws InterruptedException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickedit();
		Thread.sleep(3000);
		bc.setcatname();
		Thread.sleep(3000);
		bc.clickimage();
		js.executeScript("window.scrollBy(0,8000)");
		bc.clickactive1();
		Thread.sleep(3000);
		bc.clickupdate1();
	}

}
