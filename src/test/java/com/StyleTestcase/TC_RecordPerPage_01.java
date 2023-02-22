package com.StyleTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_RecordPerPage_01 extends BaseClass{
	@Test
	public void recrdtest() throws InterruptedException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		js.executeScript("window.scrollBy(0,18000)");
		Thread.sleep(10000);
		sp.clickrecord();
		//sp.clickeye1();
//		Thread.sleep(10000);
//		sp.clickrec();
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File("M://StyleRecord.png");
		FileHandler.copy(source, store);

	}

}
