package com.ordersTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.OrdersPage;
import com.YetloTestCase.BaseClass;

public class TC_Action_01 extends BaseClass{
	@Test
	public void actionTest() throws InterruptedException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.ClickAction();
	    Thread.sleep(2000);
	    od.clickCancel();
	}

}
