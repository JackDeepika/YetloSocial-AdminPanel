package com.FrameTestCase;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.YetloPageObjects.BannerPage;
import com.YetloPageObjects.FramePage;
import com.YetloTestCase.BaseClass;

public class TC_AddFrame_01 extends BaseClass {
	@Test
	public void Frametest() throws InterruptedException, AWTException
	{
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        FramePage bp1=new FramePage(driver);
		bp1.SetEmail();
		bp1.SetPassword();
		bp1.ClickLogin();
		Thread.sleep(2000);
		bp1.ClickFrame();
		bp1.ClickAddFrame();
		Thread.sleep(2000);
		bp1.SetFrame();
		bp1.SetBNameHgt();
		bp1.SetNamewgt();
		bp1.SetMrgRgt();
		bp1.Setmrglft();
		bp1.Setpadrgt();
		bp1.Setpadlft();
		bp1.Setmblhgt();
		bp1.Setmblwdt();
		bp1.SetmblMrgrt();
		bp1.SetmblMrglft();
		bp1.Setmblpadrg();
		bp1.Setmblpadlf();
		bp1.Setwebhgt();
		bp1.Setwebwgt();
		bp1.Setwebmrgrt();
		bp1.Setwebmgnlf();
		bp1.Setwebpadrt();
		bp1.Setwebpadlt();
		bp1.Setaddhgt();
		bp1.Setaddwdt();
		bp1.Setaddmrgrt();
		bp1.Setaddmrglt();
		bp1.Setaddpadrt();
		bp1.Setaddpadlt();
		bp1.Setemailhgt();
		bp1.setemailwdt();
		bp1.Setemailmrgrt();
		bp1.Setemailmrglt();
		bp1.Setemailpadrt();
		bp1.Setemailpadlt();
		bp1.Setlogohgt();
		bp1.Setlogowdt();
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(10000);
		bp1.Setstus();
		Thread.sleep(8000);
	    bp1.Setchs();
	    Thread.sleep(3000);
		bp1.Setadd1();
		
	}

}
