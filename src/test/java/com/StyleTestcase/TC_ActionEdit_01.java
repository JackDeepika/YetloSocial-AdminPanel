package com.StyleTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_ActionEdit_01 extends BaseClass {
	@Test(priority=0)
	public void action() throws InterruptedException, IOException, AWTException
	{
		driver.get(baseURL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(2000);
		sp.clickeye();
		Thread.sleep(1000);
		sp.clickaddban();
		Thread.sleep(1000);
		sp.etrfesnam();
        Thread.sleep(2000);
        sp.clickchsimg();
		sp.chstype();
		sp.clickcatnam();
		js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
		sp.clicksrc();
		Thread.sleep(8000);
		sp.Clickact();
		Thread.sleep(5000);
		sp.clickadd1();
		Thread.sleep(3000);
		
		
	}
	@Test(priority=1)
	public void ActionSearch() throws InterruptedException
	{
		driver.get(baseURL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(2000);
		sp.clickeye();
		Thread.sleep(2000);
		sp.ActionSearch();
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void ActionSearchNegative() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(2000);
		sp.clickeye();
		Thread.sleep(2000);
		sp.ActionSearchNegative();
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ActionSearchNegative.png");
		FileHandler.copy(source, store);
		
	}
	 @Test(priority=3)
	public void ActionEditmandatory() throws InterruptedException
	{
		driver.get(baseURL);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(2000);
		sp.clickeye();
		Thread.sleep(1000);
		sp.Actionedit();
		Thread.sleep(1000);
		sp.BannerType();
		//js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(4000);
		sp.TypeAction();
		Thread.sleep(3000);
		sp.CategoryAction();
		Thread.sleep(2000);
		sp.CategorySearch();
		Thread.sleep(4000);
		sp.update1();

	}
	 @Test(priority=4)
		public void ActionEdit() throws InterruptedException
		{
			driver.get(baseURL);
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			StylePage sp=new StylePage(driver);
			sp.SetEmail();
			sp.SetPassword();
			sp.ClickLogin();
			Thread.sleep(2000);
			sp.Clickstyle();
			Thread.sleep(2000);
			sp.clickeye();
			Thread.sleep(1000);
			sp.Actionedit();
			Thread.sleep(1000);
			sp.BannerType();
			//js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(4000);
			sp.TypeAction();
			Thread.sleep(5000);
			sp.CategoryAction();
			Thread.sleep(2000);
			sp.CategorySearch();
			Thread.sleep(4000);
			sp.choosesubcategory();
			sp.update1();
		}

}
