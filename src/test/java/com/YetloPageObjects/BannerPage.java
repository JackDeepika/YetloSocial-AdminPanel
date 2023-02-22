package com.YetloPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
//import java.awt.AWTException;
//import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;

public class BannerPage {
	
	WebDriver ldriver;
	
	public BannerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
    @FindBy (xpath="//a[@href='/image_banner']")
	WebElement Banner;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement AddBanner;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[1]/div[1]")
	WebElement image;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[1]/div[1]")
	WebElement image4;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[1]/div[1]")
	WebElement image2;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[1]/div[1]")
	WebElement image3;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[2]/div/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[2]/div/button[2]")
	WebElement clear;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[4]/div/button")
	WebElement edit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[2]/div/div[1]/input")
    WebElement image1;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement status1;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status2;
	
	@FindBy(xpath="//*[@id=\'editcategoriesModal\']/div/form/div/div[2]/div/div[3]/button")
	WebElement update;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[5]/div/button")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'deletecategoriesModal\']/div/form/div/div[3]/button")
	WebElement conf;
	
	@FindBy(xpath="//*[@id=\'deletecategoriesModal\']/div/form/div/div[1]/button")
	WebElement cancel;
	
	@FindBy(xpath="//*[@id=\"page-content-wrapper\"]/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	
	
	//Action Method
	
	public void SetEmail()
	{
		email.sendKeys("yetlosocial@gmail.com");
	}
	
	public void SetPassword()
	{
		password.sendKeys("1234");
	}
	
	public void ClickLogin()
	{
		login.click();
	}
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	public void ClickBField()
	{
		Banner.click();
	}
	public void ClickAddBan()
	{
		AddBanner.click();
	}
	
	  public void ChooseJPG() throws AWTException, InterruptedException
	  { 
		  Thread.sleep(2000);
		  image.click();
		  Thread.sleep(2000);
		  String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
		  StringSelection Selection = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			
			Robot rr=new Robot();
			rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);
			
	  }
	  public void ChoosePDF() throws AWTException, InterruptedException
	  {
		  Thread.sleep(2000);
		  image4.click();
		   String file="J:\\Testing\\Manual Testing Questions.pdf";
		  StringSelection Selection = new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		  
		  Robot rr=new Robot();
			rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);
		  
	  }
	  
	  public void ChooseDOCX() throws AWTException, InterruptedException
	  {
		  Thread.sleep(2000);
		  image2.click();
		  Thread.sleep(3000);
		  String file="J:\\Testing\\SDLC & STLC Q&A.docx";
		  StringSelection Selection=new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		  Thread.sleep(1000);
		  Robot rr=new Robot();
		  rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);	 
		}
	  public void chooseTXT() throws AWTException, InterruptedException 
	  {
		  Thread.sleep(2000);
		  image3.click();
		  String file="J:\\Testing\\Q&A.txt";
		  StringSelection Selection=new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		  Thread.sleep(1000);
		  Robot rr=new Robot();
		  rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);	 
		}
		  
	  
	 
	 
	public void ClickStatus()
	{
		status.click();
	}
	public void ClickAdd()
	{
		add.click();
	}
	public void clickclr()
	{
		clear.click();
	}
	public void EnterValue()
	{
		search.sendKeys("Active");
	
	}
	public void EnterValue1()
	{
		search.sendKeys("in");
	}
	
	public void ClickSortArrow()
	{
		sort.click();
	}
	public void ClickEdit()
	{
		edit.click();
	}
	
	 
	  public void ChooseImage1() throws AWTException, InterruptedException 
	  { 
		 Thread.sleep(2000);
		 WebElement image1 = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[2]/div/div[1]/input"));
		 image1.sendKeys("C:\\Users\\91996\\Downloads\\wall.jpg");

	   }
	  public void Choosepdf() throws AWTException, InterruptedException 
		 {
		    Thread.sleep(2000);
		     WebElement image1 = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/form/div/div[2]/div/div[1]/input"));
			 image1.sendKeys("J:\\Testing\\SDLC & STLC Q&A.docx");
			 
		 } 

	public void Setstatus1()
	{
		status1.click();
		
	}
	public void SetActive() 
	{
	   status2.click();
       
	 }
    public void Clickup()
     {
    	 update.click();
     }
     public void Clickdel()
     {
    	 delete.click();
     }
     public void ClickConfirm()
     {
    	 conf.click();
     }
     public void clickcan()
     {
    	 cancel.click();
     }
     public void ClickRecord() throws InterruptedException
     {
    	 record.click();
    	 Thread.sleep(2000);
    	 Select ss=new Select(record);
    	 ss.selectByVisibleText("100");
    	 Thread.sleep(1000);
    	 record.sendKeys(Keys.ENTER);
     }
    
     
	
}
