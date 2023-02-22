package com.OtherPosterCategoriesTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.OtherPosterCategories;
import com.YetloTestCase.BaseClass;

public class TC_Delete_01 extends BaseClass{
	@Test(priority=0)
	public void deleteTestcancel() throws InterruptedException
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
		bc.clickdeleteaction();
		Thread.sleep(3000);
		bc.clickcancelaction();
	}
	@Test(priority=1)
	public void deleteTestconfirm() throws InterruptedException
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
		bc.clickdeleteaction();
		Thread.sleep(3000);
		bc.clickdeleteconfirm();
	}
	@Test(priority=2)
	public void deleteTest() throws InterruptedException
	{
		driver.get(baseURL);
		OtherPosterCategories bc=new OtherPosterCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clickOtherPoster();
		bc.clickdelte();
		Thread.sleep(3000);
		bc.clickcancel();
		bc.clickdelete();
	}

}
