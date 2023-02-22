package com.NotificationTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.Notification;
import com.YetloTestCase.BaseClass;

public class TC_SendNotification_01 extends BaseClass {
	@Test(priority=0)
	public void notification() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		not. clickSend();
		Thread.sleep(2000);
		not.clicktitle();
		not.SetMessage();
		Thread.sleep(3000);
		not.SetImage1();
		not.clickSend1();
		
		
	}
	@Test(priority=1)
	public void notificationClear() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		not. clickSend();
		Thread.sleep(2000);
		not.clicktitle();
		not.SetMessage();
		Thread.sleep(3000);
		not.clickClear();
	}
	@Test(priority=2)
	public void notificationMandatory() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		not. clickSend();
		Thread.sleep(2000);
		not.clickSend1();
	}
	@Test(priority=3)
	public void notificationROUTINE() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		not. clickSend();
		Thread.sleep(2000);
		not.clicktitle();
		not.SetMessage();
		Thread.sleep(3000);
		not.SetImage();
		not.clickSend1();
	}
	

}
