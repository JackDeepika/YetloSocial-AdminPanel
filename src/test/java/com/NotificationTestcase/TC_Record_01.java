package com.NotificationTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.Notification;
import com.YetloTestCase.BaseClass;

public class TC_Record_01 extends BaseClass {
	@Test(priority=0)
	public void recoedtest() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		not.Clickrecord();
	}
	@Test(priority=1)
	public void recoedtest1() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		not.Clickrecord1();
	}
	@Test(priority=2)
	public void recoedtest2() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		not.Clickrecord2();
	}
	@Test(priority=3)
	public void recoedtest3() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		not.Clickrecord3();
	}

}
