package com.BusniessCategoriesTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.BusniessCategories;
import com.YetloTestCase.BaseClass;

public class TC_delete_01 extends BaseClass{
	@Test(priority=0)
	public void deleteTest() throws InterruptedException
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
		bc.clickdelete();
		Thread.sleep(2000);
		bc.clickCancel();
		
	}
	@Test(priority=1)
	public void deleteTestconfirm() throws InterruptedException
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
		bc.clickdelete();
		Thread.sleep(2000);
		bc. clickdeleteConfirm();
		
	}
	@Test(priority=2)
	public void deleteTestcategory() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		Thread.sleep(3000);
		bc.clickdelete1();
		Thread.sleep(3000);
		bc.clickcancel1();

}
	@Test(priority=3)
	public void deleteTestcategorycongirm() throws InterruptedException
	{
		driver.get(baseURL);
		BusniessCategories bc=new BusniessCategories(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.ClickBusCat();
		Thread.sleep(3000);
		bc.clickdelete1();
		Thread.sleep(2000);
		bc.clickdeleteconf();
	}
}