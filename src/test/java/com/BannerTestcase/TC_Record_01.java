package com.BannerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_Record_01 extends BaseClass {
	@Test
	public void RecordTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
	
		Thread.sleep(3000);
		bp.ClickBField();
		//Thread.sleep(9000);
		js.executeScript("window.scrollBy(0,8000)");
		Thread.sleep(2000);
		bp.ClickRecord();
		Thread.sleep(2000);
		
		
		 
		
	}

}
