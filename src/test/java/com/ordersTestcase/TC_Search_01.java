package com.ordersTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.OrdersPage;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass{
	@Test(priority=0)
	public void searchtest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.SetSearch();
	    Thread.sleep(2000);
	    
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersSearch.png");
		FileHandler.copy(source, store);
	 }
	@Test(priority=1)
	public void searchtestNegative() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.SetSearchNegative();
	  
	}
	@Test(priority=2)
	public void selectdateNegative() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.clickperiod();
	    Thread.sleep(2000);
	    od.clickdate();
	    Thread.sleep(3000);
	    od.clickmobilesearch();
	    od.clickOrderAmount();
	    od.ClickDiscount();
	    od.ClickbuyAmount();
	    Thread.sleep(2000);
    }
	@Test(priority=3)
	public void selectdatePosstive() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.clickperiod();
	    Thread.sleep(2000);
	    od.clickdate();
	    Thread.sleep(2000);
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersdateSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=4)
	public void selectMobilePosstive() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    Thread.sleep(3000);	
	    od.clickmobilesearch1();
	    Thread.sleep(2000);
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersmobileSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=5)
	public void selectorderamount() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    Thread.sleep(3000);	
	    od.clickOrderAmount1();
	    Thread.sleep(2000);
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersammountSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=6)
	public void selectDiscount() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    Thread.sleep(3000);	
	    od.ClickDiscount1();
	    Thread.sleep(2000);
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersDiscountSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=7)
	public void selectBuyamount() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    Thread.sleep(3000);	
	    od.clickbuyAmount1();
	    Thread.sleep(2000);
	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File(".\\ScreenShot\\ordersbuyamountSearch.png");
		FileHandler.copy(source, store);
	}
	@Test(priority=8)
	public void selectPosstive() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.clickperiod();
	    Thread.sleep(2000);
	    od.clickdate();
	    Thread.sleep(2000);
	    od.clickmobilesearch1();
	    od.clickOrderAmount1();
	    od.ClickDiscount1();
	    od.clickbuyAmount1();
	}

}
