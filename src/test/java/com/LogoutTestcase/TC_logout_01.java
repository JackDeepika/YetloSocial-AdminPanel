package com.LogoutTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.LogOut;

import com.YetloTestCase.BaseClass;

public class TC_logout_01 extends BaseClass {
	@Test
	public void logtest() throws InterruptedException
	{
		driver.get(baseURL);
		LogOut bc=new LogOut(driver);
		bc.SetEmail();
		bc.SetPassword();
		bc.ClickLogin();
		Thread.sleep(5000);
	//	bc.clicklogout();
		bc.logout1();
	}

}
