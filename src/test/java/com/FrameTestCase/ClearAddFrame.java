package com.FrameTestCase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import com.YetloPageObjects.FramePage;
import com.YetloTestCase.BaseClass;

public class ClearAddFrame extends BaseClass {
	@Test
	public void Cleartest() throws InterruptedException, IOException, AWTException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		FramePage fp=new FramePage(driver);
		fp.SetEmail();
		fp.SetPassword();
		fp.ClickLogin();
		Thread.sleep(2000);
		fp.ClickFrame();
		fp.ClickAddFrame();
		Thread.sleep(2000);
		fp.SetFrame();
		fp.SetBNameHgt();
		fp.SetNamewgt();
		fp.SetMrgRgt();
		fp.Setmrglft();
		fp.Setlogohgt();
		fp.Setlogowdt();
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		fp.setstatus();
		Thread.sleep(3000);
		fp.setimg();
		Thread.sleep(2000);
		fp.Setclr();
		

		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ClearFrame.png");
		FileHandler.copy(source, store);
		
		
		

		
				
		
		
	}
	

}
