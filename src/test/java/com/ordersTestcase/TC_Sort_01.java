package com.ordersTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.OrdersPage;
import com.YetloTestCase.BaseClass;

public class TC_Sort_01 extends BaseClass{
	@Test
	public void sorttest() throws InterruptedException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    Thread.sleep(2000);
	    od.Datesort();
	    Thread.sleep(2000);
	    od.moblieSort();
	    Thread.sleep(2000);
	    od.orderAmount();
	    Thread.sleep(2000);
	    od.DiscountAmount();
	    Thread.sleep(2000);
	    od.moblieSort();
	    Thread.sleep(2000);
	    od.orderAmount();
	    Thread.sleep(2000);
	    od.DiscountAmount();
	    Thread.sleep(2000);
	    od.BuyAmount();
	   
	}

}
