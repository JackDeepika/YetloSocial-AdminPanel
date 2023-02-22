package com.StyleTestcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.YetloPageObjects.StylePage;
import com.YetloTestCase.BaseClass;

public class TC_Edit_01 extends BaseClass {
	@Test
	public void editTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		StylePage sp=new StylePage(driver);
		sp.SetEmail();
		sp.SetPassword();
		sp.ClickLogin();
		Thread.sleep(2000);
		sp.Clickstyle();
		sp.clickedt();
		Thread.sleep(1000);
		sp.entrtit();
		sp.clicksty2();
		sp.Clikstus();
		sp.clickup();
		
		Thread.sleep(2000);
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File store=new File("M://StyleEdit.png");
		FileHandler.copy(source, store);
		
		
	}

}
