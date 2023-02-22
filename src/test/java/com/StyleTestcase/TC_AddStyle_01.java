package com.StyleTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_AddStyle_01 extends BaseClass{
	@Test(priority=0)
	public void addstyle() throws InterruptedException
	{
		driver.get(baseURL);
		
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clickaddsty();
		Thread.sleep(1000);
		sp.etrtlt();
		sp.chssyl();
		sp.ChsStus();
		sp.clickadd();
	}
	@Test(priority=1)
	public void cleartest() throws InterruptedException
	{
		driver.get(baseURL);
		
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clickaddsty();
		Thread.sleep(1000);
		sp.etrtlt();
		sp.chssyl();
		sp.ChsStus();
		Thread.sleep(1000);
		sp.Clickclr();
		
}

}
