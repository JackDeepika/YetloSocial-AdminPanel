package com.YetloPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FramePage {
	
	WebDriver ldriver;
	public FramePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[3]")
	WebElement frame;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement addframe;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[1]/input")
	WebElement framename;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[2]/input")
	WebElement bnamehgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[3]/input")
	WebElement bnamewgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[4]/input")
	WebElement bmrgrgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[5]/input")
	WebElement bmrglft;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[6]/input")
	WebElement bpadrgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[7]/input")
	WebElement bpadlft;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[8]/input")
	WebElement mblhgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[9]/input")
	WebElement mblwdt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[10]/input")
	WebElement mblmrgrgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[11]/input")
	WebElement mblmrglft;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[12]/input")
	WebElement mblpadrg;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[13]/input")
	WebElement mblpadlt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[14]/input")
	WebElement webhgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[15]/input")
	WebElement webwgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[16]/input")
	WebElement webmgnrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[17]/input")
	WebElement webmgnlf;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[18]/input")
	WebElement webpadrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[19]/input")
	WebElement webpadlt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[20]/input")
	WebElement addhgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[21]/input")
	WebElement addwdt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[22]/input")
	WebElement addmrgrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[23]/input")
	WebElement addmrglt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[24]/input")
	WebElement addpadrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[25]/input")
	WebElement addpadlt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[26]/input")
	WebElement emailhgt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[27]/input")
	WebElement emailwdt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[28]/input")
	WebElement emailmrgrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[29]/input")
	WebElement emailmrglt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[30]/input")
	WebElement emailpadrt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[31]/input")
	WebElement emailpadlt;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[32]/input")
	WebElement logort;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[33]/input")
	WebElement logolt;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio_secount\']")
	WebElement status2;
	
//    @FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[35]/input") 
//	WebElement img;
//    
//    @FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/div[35]/input") 
//    WebElement img1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[2]/div/button[1]")
	WebElement add1;
	
	//clear method
	@FindBy(xpath="//*[@id=\'content\']/form/div/div[2]/div/button[2]")
	WebElement clear;
	
	//search
	@FindBy(xpath="//*[@id='page-content-wrapper']/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search1;
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[2]/input")
	WebElement namesrc;
	@FindBy(xpath="//*[@id=\'input_name\']")
	WebElement status3;
	
	//sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort1;
	
	//Edit
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[4]/div/button")
	WebElement edit1;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div/div[2]/input")
	WebElement bnahgt;
	
	
	
	@FindBy(xpath="//*[@id=\'inactiveRadio_in\']")
	WebElement edtstatus;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	WebElement update1;
	
	//record
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordpage1;
	
	//delete
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[5]/div/button/i")
	WebElement delete1;
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement deltecan;
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement delete3;
	
	
	//Action method
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
	 public void ClickFrame()
     {
    	 frame.click();
     }
     public void ClickAddFrame()
     {
    	 addframe.click();
     }
     public void SetFrame()
     {
    	 framename.sendKeys("happy");
     }
     public void SetBNameHgt()
     {
    	 bnamehgt.sendKeys("11");
     }
     public void SetNamewgt()
     {
    	 bnamewgt.sendKeys("12");
     }
     public void SetMrgRgt()
     {
    	 bmrgrgt.sendKeys("13");
     }
     public void Setmrglft()
     {
    	 bmrglft.sendKeys("11");
     }
     public void Setpadrgt()
     {
    	 bpadrgt.sendKeys("12");
     }
     public void Setpadlft()
     {
    	 bpadlft.sendKeys("13");
     }
     public void Setmblhgt()
     {
    	 mblhgt.sendKeys("10");
     }
     public void Setmblwdt()
     {
    	 mblwdt.sendKeys("11");
     }
     public void SetmblMrgrt()
     {
    	 mblmrgrgt.sendKeys("-12");
     }
     public void SetmblMrglft()
     {
    	 mblmrglft.sendKeys("8");
     }
     public void Setmblpadrg()
     {
    	 mblpadrg.sendKeys("15");
     }
     public void Setmblpadlf()
     {
    	 mblpadlt.sendKeys("6");
     }
     public void Setwebhgt()
     {
    	 webhgt.sendKeys("9");
     }
     public void Setwebwgt()
     {
    	 webwgt.sendKeys("22");
     }
     public void Setwebmrgrt()
     {
    	 webmgnrt.sendKeys("1");
     }
     public void Setwebmgnlf()
     {
    	 webmgnlf.sendKeys("1");
     }
     public void Setwebpadrt()
     {
    	 webpadrt.sendKeys("2");
     }
     public void Setwebpadlt()
     {
    	 webpadlt.sendKeys("2");
     }
     public void Setaddhgt()
     {
    	 addhgt.sendKeys("1");
     }
     public void Setaddwdt()
     {
    	 addwdt.sendKeys("1");
     }
     public void Setaddmrgrt()
     {
    	 addmrgrt.sendKeys("1");
     }
     public void Setaddmrglt()
     {
    	 addmrglt.sendKeys("1");
     }
     public void Setaddpadrt()
     {
    	 addpadrt.sendKeys("2");
     }
     public void Setaddpadlt()
     {
    	 addpadlt.sendKeys("2");
     }
     public void Setemailhgt()
     {
    	 emailhgt.sendKeys("1");
     }
     public void setemailwdt()
     {
    	 emailwdt.sendKeys("1");
     }
     public void Setemailmrgrt()
     {
    	 emailmrgrt.sendKeys("1");
     }
     public void Setemailmrglt()
     {
    	 emailmrglt.sendKeys("1");
     }
     public void Setemailpadrt()
     {
    	 emailpadrt.sendKeys("2");
     }
     public void Setemailpadlt()
     {
    	 emailpadlt.sendKeys("2");
     }
     public void Setlogohgt()
     {
    	 logort.sendKeys("1");
     }
     public void Setlogowdt()
     {
    	 logolt.sendKeys("1");
     }
     public void Setstus() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 status2.click();
     }
     public void setstatus()
     {
    	 status2.click();
     }
     public void Setchs() throws AWTException, InterruptedException
     {
    	 Thread.sleep(2000);
		 WebElement img = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div[1]/div[35]/input"));
		 img .sendKeys("C:\\Users\\91996\\Downloads\\wall.jpg");
//    	 img.click();
//    	  Thread.sleep(1000);
//    	 String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
//		  StringSelection Selection = new StringSelection(file);
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
//			Thread.sleep(2000);
//			Robot rr=new Robot();
//			rr.keyPress(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_ENTER);
//			rr.keyRelease(KeyEvent.VK_ENTER);
			
     }
     public void Setadd1()
     {
    	 add1.click();
     }
     public void setimg() throws InterruptedException, AWTException
     {
    	 Thread.sleep(2000);
		 WebElement img1= ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div[1]/div[35]/input"));
		 img1.sendKeys("C:\\Users\\91996\\Downloads\\wall.jpg");
    	 //img1.click();
    	
     }
     public void Setclr()
     {
    	 clear.click();
     }
     public void Setsrh()
     {
    	 search1.sendKeys("Frame 001");
     }
     public void Setnegsrh()
     {
    	 search1.sendKeys("deepika");
     }
     public void Setnmsrch()
     {
    	 namesrc.sendKeys("Frame 002");
    	 
     }
     public void SetnamsrcNeg()
     {
    	 namesrc.sendKeys("Frame 005");
     }
     public void Clickinac()
     {
    	 status3.click();
    	 Select ss1=new Select(status3);
    	 ss1.selectByIndex(2);
    	 //status3.sendKeys(Keys.ENTER);
    	 
     }
     public void Clickall()
     {
    	 status3.click();
    	 Select ss1=new Select(status3);
    	 ss1.selectByIndex(0);
     }
     public void Clickac()
     {
    	 status3.click();
    	 Select ss1=new Select(status3);
    	 ss1.selectByIndex(1);
     }
     public void Setsort()
     {
    	 sort1.click();
     }
     
     public void SetEdt1()
     {
    	 edit1.click();
     }
     public void SetNam1()
     {
    	 bnahgt.clear();
    	 bnahgt.sendKeys("10");
    	 
    	 
    	 
     }
     public void Setstatus1()
     {
    	 edtstatus.click();
    	 
     }
     public void Setclick()
     {
    	 update1.click();
     }
     public void Clickrecfr()
     {
    	 recordpage1.click();
    	 Select ss=new Select(recordpage1);
    			 ss.selectByVisibleText("50");
     }
     public void Clickdet1()
     {
    	 delete1.click();
     }
    public void Clickdeltecan()
     {
    	 deltecan.click();
     }
     public void delete()
     {
    	 delete3.click();
     }
     

}
