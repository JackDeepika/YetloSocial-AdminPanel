package com.NotificationTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.Notification;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass {
	@Test(priority=0)
	public void searchTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		Thread.sleep(2000);
		not.SetSearch();
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\NotificationSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=1)
	public void searchTestNegative() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		Thread.sleep(2000);
		not.Setsearch1();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void searchTestNegative1() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		Thread.sleep(2000);
		not.Setsearch2();
		Thread.sleep(2000);
    }
}
