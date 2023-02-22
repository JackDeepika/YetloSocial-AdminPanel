package com.BannerTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloTestCase.BaseClass;

public class TC_Banner_01 extends BaseClass {
	@Test (priority=0)
	public void TC_Banner() throws AWTException, InterruptedException, IOException{

		driver.get(baseURL);

		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();

		Thread.sleep(3000);
		bp.ClickBField();
		bp.ClickAddBan();
		Thread.sleep(2000);
		bp.ChooseJPG();
		bp.ClickStatus();
		Thread.sleep(2000);
		bp.ClickAdd();
		Thread.sleep(2000);
	}
	@Test (priority=1)
	public void negativePDF() throws InterruptedException, AWTException, IOException
	{
		driver.get(baseURL);

		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();

		Thread.sleep(3000);
		bp.ClickBField();
		bp.ClickAddBan();
		Thread.sleep(2000);
		bp.ChoosePDF();
		Thread.sleep(2000);
		bp.ClickStatus();
		Thread.sleep(2000);
		bp.ClickAdd();
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\NegativePDF.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);
	}

	@Test (priority=2)
	public void negativeDOCX() throws InterruptedException, AWTException, IOException
	{
		driver.get(baseURL);

		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();

		Thread.sleep(3000);
		bp.ClickBField();
		bp.ClickAddBan();
		Thread.sleep(2000);
		bp.ChooseDOCX();
		Thread.sleep(2000);
		bp.ClickStatus();
		Thread.sleep(10000);
		bp.ClickAdd();
		Thread.sleep(10000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\NegativeDOCX.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);
	}
	@Test (priority=2)
	public void negativeTXT() throws InterruptedException, AWTException, IOException
	{
		driver.get(baseURL);

		BannerPage bp=new BannerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();

		Thread.sleep(4000);
		bp.ClickBField();
		bp.ClickAddBan();
		Thread.sleep(2000);
		bp.ChooseDOCX();
		Thread.sleep(2000);
		bp.ClickStatus();
		Thread.sleep(10000);
		bp.ClickAdd();
		Thread.sleep(10000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\NegativeTXT.png");
		FileHandler.copy(source, store);
		Thread.sleep(1000);
	}
}
