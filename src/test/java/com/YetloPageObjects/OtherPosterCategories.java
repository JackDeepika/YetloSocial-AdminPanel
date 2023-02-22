package com.YetloPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OtherPosterCategories {
	
	WebDriver ldriver;
	
	public OtherPosterCategories(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[7]")
	WebElement OtherPoster;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement AddPoster;
	
	@FindBy(xpath="//*[@id=\'Name\']") 
	WebElement CategoryName;
	
	@FindBy(xpath="//*[@id=\'Name\']") 
	WebElement Categoryname1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]")
	WebElement image;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]")
	WebElement image1;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status1;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement status2;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[1]")
	WebElement add1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[2]")
	WebElement clear;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[2]")
	WebElement clear1;
	
	//Search
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement Search1;
	
	//Sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sort1;
	
	//Action
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[5]/div/button")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement addposter;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search2;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search3;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sortact;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sortact1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[5]/div/button/i")
	WebElement Actioneye;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement ActionAddposter;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div/div[1]/div/div[34]")
	WebElement Actioncolor;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div/div[1]/div/div[34]")
	WebElement Actioncolor1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div/div[1]/div/div[34]")
	WebElement Actioncolor2;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]")
	WebElement imageaction;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement actionInactive;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[1]")
	WebElement addaction;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[2]")
	WebElement Actionclear;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement actionsearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement actionsort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[6]/div/button/i")
	WebElement actionedit;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement actioncategoryname;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement statusaction;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	WebElement updateaction;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[7]/div/button/i")
	WebElement deleteaction;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement cancelaction;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement deleteconfirm;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[6]/div/button/i")
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement catname;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement active;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	WebElement update1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[7]/div/button")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement cancel;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement deleteconfirm1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordpage;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordaction;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordaction1;
	
	
	//ActionMethod
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
	public void clickOtherPoster()
	{
		OtherPoster.click();
	}
	public void clickAddPoster()
	{
		AddPoster.click();
	}
	public void setCategoryName()
	{
		CategoryName.sendKeys("Medical Shop");
	}public void clickImage() throws InterruptedException, AWTException
	{
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
	public void clickactive()
	{
		status.click();
	}
	public void clickadd()
	{
		add.click();
	}
	public void clickClear()
	{
		clear.click();
	}
	public void clickInactive()
	{
		status2.click();
	}
	public void setsearch()
	{
		search.sendKeys("medical Shop");
	}
	public void setsearch1()
	{
		Search1.sendKeys("deepi");
	}
	public void setsort()
	{
		sort.click();
		sort.click();
	}
	public void Setsort1()
	{
		sort1.click();
		sort1.click();
	}
	public void clickEye()
	{
		eye.click();
	}
	public void clickaddposter()
	{
		addposter.click();
	}
	public void setcategoryname()
	{
		Categoryname1.sendKeys("store");
	}
	public void setimage1() throws InterruptedException, AWTException
	{
		image1.click();
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
	public void clickstatus1()
	{
		status1.click();
	}
	public void clickadd1() 
	{
		add1.click();
	}
	public void clickclear1()
	{
		clear1.click();
	}
	public void setSearch()
	{
		search2.sendKeys("store");
	}
	public void setsearch2()
	{
		search3.sendKeys("deepi");
	}
	public void clicksort()
	{
		sortact.click();
		sortact.click();
		}
	public void clicksort1()
	{
		sortact1.click();
		sortact1.click();
	}
	public void ClickActionEye()
	{
		Actioneye.click();
	}
	public void clickActionAddposter()
	{
		ActionAddposter.click();
	}
	public void clickActioncolor()
	{
		Actioncolor.click();
	}
	public void clickActioncolor1()
	{
		Actioncolor1.click();
	}
	public void clickaActioncolor2()
	{
		Actioncolor2.click();
	}
	public void clickimageaction() throws AWTException, InterruptedException
	{
		imageaction.click();
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
	public void clickactionInactive()
	{
		actionInactive.click();
	}
	public void clickaddAction()
	{
		addaction.click();
	}
	public void clikActionclear()
	{
		Actionclear.click();
	}
	public void clickactionsearch()
	{
		actionsearch.sendKeys("inactive");
	}
	public void clickactionsort()
	{
		actionsort.click();
	}
	public void clickactionedit()
	{
		actionedit.click();
	}
	public void clickactioncategoryname()
	{
		actioncategoryname.sendKeys(" shop");
	}
	public void clickactionimage()
	{
		WebElement imageaction=ldriver.findElement(By.xpath("//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[1]/div[2]/div/input"));
		imageaction.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
	}
	public void clickinactiveaction()
	{
		statusaction.click();
	}
	public void clickupdate()
	{
		updateaction.click();
	}
	public void clickdeleteaction()
	{
		deleteaction.click();
	}
	public void clickcancelaction()
	{
		cancelaction.click();
	}
	public void clickdeleteconfirm()
	{
		deleteconfirm.click();
	}
	public void clickedit()
	{
		edit.click();
	}
	public void setcatname()
	{
		catname.clear();
	}
	public void clickimage()
	{
		WebElement imageact=ldriver.findElement(By.xpath("//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[1]/div[2]/div/input"));
		imageact.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
	}
	public void clickactive1()
	{
		active.click();
	}
	public void clickupdate1()
	{
		update1.click();
	}
	public void clickdelte()
	{
		delete.click();
	}
	public void clickcancel()
	{
		cancel.click();
	}
	public void clickdelete()
	{
		deleteconfirm1.click();
	}
	public void clickrecordpage()
	{
		recordpage.click();
		Select ss1=new Select(recordpage);
		ss1.selectByVisibleText("100");
	}
	public void clickrecordaction()
	{
		recordaction.click();
		Select ss2=new Select(recordaction);
		ss2.selectByVisibleText("0");
		
	}
	public void clickrecordaction1()
	{
		recordaction1.click();
		Select ss2=new Select(recordaction1);
		ss2.selectByVisibleText("100");
	}

}
