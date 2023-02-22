package com.CustomerTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_Delete_01 extends BaseClass {
	
	
		@Test(priority = 0)
		public void deleteTest() throws InterruptedException
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
		        bp.ClickDelete();
		        Thread.sleep(2000);
		        bp.Clickdeletecancel();
	}
		
		@Test(priority = 1)
		public void deleteTestconfirm() throws InterruptedException
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
		        bp.ClickDelete();
		        Thread.sleep(2000);
		        bp.clickdeleteConfirm();      

}
		@Test(priority = 2)
		public void deleteTestcustomers() throws InterruptedException
		{
			   driver.get(baseURL);
				CustomerPage bp=new CustomerPage(driver);
				bp.SetEmail();
				bp.SetPassword();
				bp.ClickLogin();
		        Thread.sleep(3000);	
		        bp.clickcustomer1();
		        Thread.sleep(2000);
		        bp.clickdelete();
		        Thread.sleep(2000);
		        bp.deletecancelcus();
		        
		}
		@Test(priority = 3)
		public void deleteTestcustomersconfig() throws InterruptedException
		{
			   driver.get(baseURL);
				CustomerPage bp=new CustomerPage(driver);
				bp.SetEmail();
				bp.SetPassword();
				bp.ClickLogin();
		        Thread.sleep(3000);	
		        bp.clickcustomer1();
		        Thread.sleep(2000);
		        bp.clickdelete();
		        Thread.sleep(2000);
		        bp.deleteconfirm();
}
}
