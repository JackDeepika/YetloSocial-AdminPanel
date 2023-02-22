package com.FrameTestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloPageObjects.FramePage;
import com.YetloTestCase.BaseClass;

public class RecordFrame extends BaseClass {
	@Test
	public void recordTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		bp1.Clickrecfr();
		Thread.sleep(2000);
		
		

	

	}

}
