package com.SettingsTestcase;
import org.testng.annotations.Test;

import com.YetloPageObjects.Settings;
import com.YetloTestCase.BaseClass;

public class TC_Settings_01 extends BaseClass{
//	@Test(priority=0)
//	public void settingsTest() throws InterruptedException
//	{
//	    driver.get(baseURL);
//		Settings bc=new Settings(driver);
//		bc.SetEmail();
//		bc.SetPassword();
//		bc.ClickLogin();
//		Thread.sleep(3000);
//		bc.clicksetting();
//		bc.clickcoin();
//		bc.clickminiumcoin();
//		Thread.sleep(3000);
//		bc.update();
//		Thread.sleep(3000);
//		bc.reward();
//		bc.save1();
//		Thread.sleep(3000);
//		bc.add();
//		bc.remove();
//		bc.save();
//	}
	@Test(priority=1)
	public void settingsTestnegative() throws InterruptedException
	{
	    driver.get(baseURL);
		Settings bc=new Settings(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(3000);
		bc.clicksetting();
		bc.coinnegative();
		bc.miniumcoinneg();
		bc.save();
	}
}
