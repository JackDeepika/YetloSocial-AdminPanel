package com.BannerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_SortTest_01 extends BaseClass {
	@Test
	public void Sorttest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		BannerPage bp1=new BannerPage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickBField();
		bp1.ClickSortArrow();
		Thread.sleep(2000);
		
		
	}

}
