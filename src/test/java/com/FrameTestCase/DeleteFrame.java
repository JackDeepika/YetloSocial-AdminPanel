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

public class DeleteFrame extends BaseClass{
	@Test(priority =0)
	public void deletetest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		bp1.Clickdet1();
		Thread.sleep(3000);
		bp1.Clickdeltecan();
		Thread.sleep(2000);
	}
	@Test(priority =1)
	public void deletetestclr() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		bp1.Clickdet1();
		Thread.sleep(2000);
		bp1.delete();
		Thread.sleep(2000);
		
	}
	

}
