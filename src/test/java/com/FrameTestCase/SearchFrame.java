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

public class SearchFrame extends BaseClass{
	@Test(priority=0)
	public void srchTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		bp1.Setnegsrh();
		Thread.sleep(1000);
		
		
	}
	@Test(priority=1)
	public void search() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(10000);
		bp1.Setsrh();
		Thread.sleep(1000);

		
	}
	@Test(priority=2)
	public void searchname() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(5000);
		bp1.Setnmsrch();
		Thread.sleep(1000);

	}
	@Test(priority=3)
	public void searchnameNegative() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(5000);
		bp1.SetnamsrcNeg();
		Thread.sleep(1000);

	}
	@Test(priority=4)
	public void searchStatus() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(5000);
		bp1.Clickinac();
		Thread.sleep(1000);

	}
	@Test(priority=5)
	public void searchStatusall() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(3000);
		bp1.ClickFrame();
		Thread.sleep(5000);
		bp1.Clickall();
		Thread.sleep(1000);

	}
	@Test(priority=6)
	public void searchStatusact() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		Thread.sleep(5000);
		bp1.Clickac();
		Thread.sleep(1000);

	}





}
