package com.FrameTestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloPageObjects.FramePage;
import com.YetloTestCase.BaseClass;

public class SortFrame extends BaseClass {
	@Test
	public void sorttest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(10000);
		bp1.Setsort();
		
		Thread.sleep(1000);
		

		

}
}
