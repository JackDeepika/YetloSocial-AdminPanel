package com.ordersTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.OrdersPage;
import com.YetloTestCase.BaseClass;

public class TC_delete_01 extends BaseClass{
	@Test
	public void deleteTest() throws InterruptedException
	{
		driver.get(baseURL);
		OrdersPage od = new OrdersPage(driver);
		od.SetEmail();
		od.SetPassword();
		od.ClickLogin();
	    Thread.sleep(3000);	
	    od.clickorders();
	    od.clickdelete();
	    Thread.sleep(2000);
	    od.clickdeletecancel();
	    
	}

}
