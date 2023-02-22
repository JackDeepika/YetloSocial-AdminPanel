package com.StyleTestcase;

import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_Delete_01 extends BaseClass{
	@Test
	public void deleteTest() throws InterruptedException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.clickdel();
		Thread.sleep(1000);
		sp.clickcan();
		sp.clickdet();
	}

}
