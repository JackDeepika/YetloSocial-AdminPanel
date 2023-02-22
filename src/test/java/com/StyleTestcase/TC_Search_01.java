package com.StyleTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass {
	@Test(priority = 0)
	public void searchtest() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clicksrc();
		Thread.sleep(2000);
		
		//Thread.sleep(2000);
		//sp.clickststus1();

	}
	@Test(priority = 1)
	public void srchtest() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clicksrcneg();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void searchtitleposstive() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.clicktitsrc();
		Thread.sleep(2000);
		//sp.Clicksty1();
		//Thread.sleep(2000);
		//sp.clickststus1();

	}
	@Test(priority = 3)
	public void srchtittleNEGATIVE() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.clicktitsrc1();
	}
	@Test(priority = 4)
	public void searchtStyle() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clicksty1();
		//Thread.sleep(2000);
		//sp.clickststus1();
		}
	@Test(priority = 5)
	public void searchtStatus() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(2000);
		sp.clickststus1();
		}
	

}
