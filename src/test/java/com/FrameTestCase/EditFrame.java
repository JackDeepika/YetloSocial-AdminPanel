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

public class EditFrame extends BaseClass{
	@Test
	public void editTest() throws InterruptedException, IOException
	{
		
		driver.get(baseURL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		bp1.SetEdt1();
		Thread.sleep(2000);
		bp1.SetNam1();
		js.executeScript("window.scrollBy(0,18000)");
		Thread.sleep(10000);
		bp1.Setstatus1();
	//	Thread.sleep(5000);
		//bp1.Setclick();
		
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\EditFrame.png");
		FileHandler.copy(source, store);
	
		
	}

}
