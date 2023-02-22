package com.CustomerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_Search_01 extends BaseClass {
    @Test (priority = 0)
	public void searchtestNegative() throws InterruptedException
	{
       driver.get(baseURL);
		
		CustomerPage bp=new CustomerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(2000);
        bp.selectPeriod();
        Thread.sleep(5000);
        bp.selecteDate();
        Thread.sleep(5000);
        bp.Setname();
        bp.Setnumber();
        bp.Setstatus();
        Thread.sleep(2000);
	}
    
    @Test(priority =1)
    public void SearchPosstive() throws InterruptedException
    {
    	driver.get(baseURL);
  		
  		CustomerPage bp=new CustomerPage(driver);
  		bp.SetEmail();
  		bp.SetPassword();
  		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(3000);
        bp.selectPeriod();
        Thread.sleep(5000);
        bp.SetPosstiveDate();
        Thread.sleep(5000);
        bp.SetPosstiveNmae();
        bp.SetPosstivenumber();
        bp.SetPosstiveStatus();
        Thread.sleep(2000);
    }
    @Test(priority =2)
    public void SearchPosstiveDate() throws InterruptedException
    {
    	driver.get(baseURL);
  		
  		CustomerPage bp=new CustomerPage(driver);
  		bp.SetEmail();
  		bp.SetPassword();
  		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(3000);
        bp.selectPeriod();
        Thread.sleep(5000);
        bp.SetPosstiveDate();
        Thread.sleep(2000);
    }
    @Test(priority =3)
    public void SearchPosstiveName() throws InterruptedException
    {
    	driver.get(baseURL);
  		
  		CustomerPage bp=new CustomerPage(driver);
  		bp.SetEmail();
  		bp.SetPassword();
  		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(3000);
        bp.SetPosstiveNmae();
        Thread.sleep(2000);
        
    }
    @Test(priority =4)
    public void SearchPosstiveMobile() throws InterruptedException
    {
    	driver.get(baseURL);
  		
  		CustomerPage bp=new CustomerPage(driver);
  		bp.SetEmail();
  		bp.SetPassword();
  		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(3000);
        bp.SetPosstivenumber();
        Thread.sleep(2000);
       
    }
    @Test(priority =5)
    public void SearchPosstivestatus() throws InterruptedException
    {
    	driver.get(baseURL);
  		
  		CustomerPage bp=new CustomerPage(driver);
  		bp.SetEmail();
  		bp.SetPassword();
  		bp.ClickLogin();
        Thread.sleep(3000);	
        bp.clickcustomer1();
        Thread.sleep(3000);
        bp.SetPosstiveStatus();
        Thread.sleep(2000);
        
    }
    @Test (priority=6)
	
	public void actionSearch() throws InterruptedException, IOException
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
    bp.SetSearch();
    Thread.sleep(4000);
    TakesScreenshot sc=(TakesScreenshot) driver;
    File source=sc.getScreenshotAs(OutputType.FILE);
	File store=new File(".\\ScreenShot\\dashboardActionSearch.png");
	FileHandler.copy(source, store);
	Thread.sleep(2000);
   
}
    @Test (priority=7)
	
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
       Thread.sleep(2000);
       bp.SetSearch1();
       Thread.sleep(2000);
      
       
      
   }
}
