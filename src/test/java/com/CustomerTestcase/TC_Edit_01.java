package com.CustomerTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.CustomerPage;
import com.YetloTestCase.BaseClass;

public class TC_Edit_01 extends BaseClass{
	@Test
	public void EditTest() throws InterruptedException, IOException
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
	    bp.Clickedit();
	    Thread.sleep(3000);
	    bp.ChooseCategory();
	    bp.SetnameCustomer();
	    Thread.sleep(2000);
	    bp.SetTwitteredit();
	    Thread.sleep(2000);
	    bp.clickupdateedit();
	}

}
