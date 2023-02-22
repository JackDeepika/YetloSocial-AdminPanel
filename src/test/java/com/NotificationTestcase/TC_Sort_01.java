package com.NotificationTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.Notification;
import com.YetloTestCase.BaseClass;

public class TC_Sort_01 extends BaseClass{
	@Test
	public void sortTest() throws InterruptedException
	{
		driver.get(baseURL);
		Notification not = new Notification(driver);
		not.SetEmail();
		not.SetPassword();
		not.ClickLogin();
        Thread.sleep(3000);
		not.ClickNotification();
		not.ClickSort();
		not.ClickSort1();
	}

}
