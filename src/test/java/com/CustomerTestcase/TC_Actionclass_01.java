package com.CustomerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_Actionclass_01 extends BaseClass {
	@Test(priority = 0)
	public void actionTest() throws InterruptedException
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
	        Thread.sleep(2000);
	        bp.ClickAdd();
	        Thread.sleep(2000);
	        bp.clickChoose();
	        Thread.sleep(3000);
	        bp.setcustomerName();
	        bp.SetcusPhone();
	        Thread.sleep(2000);
	        bp.Setemail();
	        bp.Setwebsite();
	        bp.SetState();
	        Thread.sleep(2000);
            bp.setcity();
	        bp.Setinsta();
	        Thread.sleep(2000);
	        bp.Setfb();
	        bp.SetYoutube();	    
	        Thread.sleep(2000);
            bp.SetLinkedIn();
	        bp.SetTwitter();
	        Thread.sleep(5000);
	        bp.SetImage();
	        bp.ClickSave();
	        Thread.sleep(2000);
	}
	@Test(priority=1)
	public void actionmandatoryNegative() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		
		CustomerPage bp=new CustomerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(2000);
        bp.ClickEye();
        Thread.sleep(2000);
        bp.ClickAdd();
        Thread.sleep(2000);
        bp.clickchoose1();
        bp.setcustomerName();
        js.executeScript("window.scrollBy(0,1000)");
        bp.SetcusPhone();
        Thread.sleep(2000);
        bp.Setemail();
        Thread.sleep(5000);
        bp.ClickSave();
        Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void actionmandatoryPosstive() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		CustomerPage bp=new CustomerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(2000);
        bp.ClickEye();
        Thread.sleep(2000);
        bp.ClickAdd();
        Thread.sleep(2000);
        bp.clickchoose1();
        bp.setcustomerName();
        bp.SetcusPhone();
        js.executeScript("window.scrollBy(0,1000)");
        bp.Setwebsite();
        bp.SetState();
        Thread.sleep(2000);
        bp.setcity();
        Thread.sleep(5000);
        bp.Setemail();
        Thread.sleep(8000);
        bp.ClickSave();
        Thread.sleep(2000);
		
		
	}
	@Test (priority=3)
	
	public void actionmandatoryInvalid() throws InterruptedException, IOException
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
    Thread.sleep(2000);
   TakesScreenshot sc=(TakesScreenshot) driver;
    File source=sc.getScreenshotAs(OutputType.FILE);
	File store=new File(".\\ScreenShot\\dashboardImage.png");
	FileHandler.copy(source, store);
	bp.ClickAdd();
	//Thread.sleep(2000);
    Thread.sleep(2000);
    bp.clickchoose1();
    Thread.sleep(2000);
    bp.setcusname1();
    Thread.sleep(2000);
    bp.Setcusphonenum();
    bp.Setemail1();
    bp.Setwebsite1();
    bp.SetState1();
    bp.setcity1();
    Thread.sleep(8000);
    bp.ClickSave();
		
	}

}
