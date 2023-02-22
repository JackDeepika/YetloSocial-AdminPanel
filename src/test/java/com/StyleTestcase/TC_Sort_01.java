package com.StyleTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_Sort_01 extends BaseClass{
	@Test (priority = 0)
	public void sorttest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clicksrt();
        Thread.sleep(2000);	
	}
	@Test(priority = 1)
	public void sorttestStyle() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.Clicksrt1();
		Thread.sleep(1000);
		
		TakesScreenshot src=(TakesScreenshot) driver;
		File source=src.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\SortStyle1.png");
		FileHandler.copy(source, store);
	}

}
