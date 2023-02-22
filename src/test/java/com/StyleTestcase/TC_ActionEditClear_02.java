package com.StyleTestcase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_ActionEditClear_02 extends BaseClass {
	@Test
	public void editclear() throws InterruptedException, IOException, AWTException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		Thread.sleep(20000);
		
		sp.clickeye1();
		Thread.sleep(1000);
		sp.clickaddban();
		Thread.sleep(1000);
		sp.etrfesnam();
		//sp.clickchsimg();
		Thread.sleep(1000);
		sp.chstype();
		sp.clickcatnam();
		Thread.sleep(3000);
		
		sp.clickcls();
		sp.clicksub();
		Thread.sleep(2000);
		sp.subcls();
		sp.Clickact();
		Thread.sleep(1000);
		sp.clickclr1();
		
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File("M://StyleActionClear.png");
		FileHandler.copy(source, store);
	}

	}


