package com.CustomerTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_RecordPage_01 extends BaseClass {
	@Test(priority=0)
	public void recordTest() throws InterruptedException
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
	    bp.ClickRecord();

	}
	
	@Test(priority=1)
	public void recordPayment() throws InterruptedException
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
	    bp.clickPayment();
	    Thread.sleep(2000);
	    bp.clickpaymentcancel();
	    Thread.sleep(2000);
	    bp.Clickreferal();
	    Thread.sleep(2000);
	    bp.ClickRefCancel();
	    bp.ClickDownload();
	    Thread.sleep(2000);
	    bp.ClickCancelDow();
	 }
	@Test(priority=2)
	public void recordcustomer() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(baseURL);
		
		CustomerPage bp=new CustomerPage(driver);
		bp.SetEmail();
		bp.SetPassword();
		bp.ClickLogin();
	    Thread.sleep(3000);	
	    bp.clickcustomer1();
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
	    bp.clickRecord();
	}
	

}
