package com.CustomerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_CustomersAndSort_01 extends BaseClass {
	@Test(priority=0)
	public void customerTest() throws InterruptedException
	{
        driver.get(baseURL);
		
		CustomerPage bp=new CustomerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(2000);
        bp.clickSort();
        Thread.sleep(2000);
        bp.sortName();
        Thread.sleep(2000);
        bp.sortmobile();
        Thread.sleep(5000);
        bp.sortStatus();
     	Thread.sleep(2000);
	}
	
	 @Test (priority=1)
		
	   	public void actionSearchNegative() throws InterruptedException, IOException
	   	{	
	   	driver.get(baseURL);
	   	
	   	CustomerPage bp=new CustomerPage(driver);
	   	bp.SetEmail();
	   	bp.SetPassword();
	   	bp.ClickLogin();
	       Thread.sleep(3000);	
	       bp.clickcustomer1();
	       Thread.sleep(2000);
	       bp.ClickEye();
	       Thread.sleep(3000);
	       bp.SetDate();
	       Thread.sleep(2000);
	       bp.SetBusname();
	       Thread.sleep(2000);
	       bp.SetEmail3();
	       Thread.sleep(2000);
	       bp.Setphone();
	       Thread.sleep(2000);
	       bp.Setimage();
	       Thread.sleep(5000);
	       bp.SetStatus1();
	       Thread.sleep(2000);
			TakesScreenshot sc=(TakesScreenshot) driver;
			File source=sc.getScreenshotAs(OutputType.FILE);
			File store=new File(".\\ScreenShot\\SortAddCustomer.png");
			FileHandler.copy(source, store);
	
	   	}

}
