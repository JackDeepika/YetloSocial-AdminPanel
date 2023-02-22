package com.YetloPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StylePage {
	
	WebDriver ldriver;
	
	public StylePage (WebDriver rdriver){
	
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[4]")
	WebElement style;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement addstyle;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]/select")
	WebElement styleselect;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[2]")
	WebElement clear;
	
	//search 
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/div[2]/input")
	WebElement titlesrc;
	
	@FindBy(xpath="//*[@id=\'input_name\']")
	WebElement style1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/select")
	WebElement ststus1;
	
	//sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort;
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sort1;
	
	//edit
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[6]/div/button/i")
	               
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement title2;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div[1]/div/div[2]/select")
	WebElement style2;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement status3;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div[2]/button")
	WebElement update;
	//Action
	@FindBy(xpath="//*[@id=\"page-content-wrapper\"]/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[6]/td[5]/div/button/i")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[11]/td[5]/div/button")
	WebElement eye1;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement  Addban;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/form/div/div/div[1]/input")
	WebElement fesnam;
	
	//@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]")
	//WebElement chsimg;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[3]/select")
	WebElement type;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div[1]/div/input")
	WebElement catnam;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div[2]/div[2]/table/tbody/tr[1]")
	WebElement srch;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div[2]/div[3]/button")
	WebElement close;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[5]/div/div/input")
	WebElement sub;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[5]/div[2]/div[3]/button")
	WebElement close1;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement active;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[6]/div/button[1]")
	WebElement add1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[7]/div/button[2]")
	WebElement clear1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement ActionSrch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[4]/div/button/i")
	WebElement ActionEdit;
	
	 @FindBy(xpath="//*[@id=\'Name\']")    
	 WebElement bannertype;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[2]/select")
	 WebElement typeAction;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[3]/div/div/input")
	 WebElement categorynameaction;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[3]/div[2]/div[2]/table/tbody/tr[2]")
	 WebElement Categorysearch;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	 WebElement update1;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[4]/div/div/input")
	 WebElement subcategory;
	 
	 @FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[4]/div[2]/div[2]/table/tbody/tr/td")
	 WebElement choosesubcategory;
	               
	
	//Delete
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[7]/div/button")
	WebElement del;
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement cancel;
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement delte;
	
	//record
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement eyerec;
	//ACTION METHOD
	
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
	public void Clickstyle()
	{
		style.click();
	}
	public void Clickaddsty()
	{
		addstyle.click();
	}
	public void etrtlt()
	{
		title.sendKeys("DEEPIKA");
	}
	public void chssyl()
	{
		styleselect.click();
		Select ss=new Select(styleselect);
		ss.selectByVisibleText("Business Categories");
	}
	public void ChsStus()
	{
		status.click();
	}
	public void clickadd()
	{
		add.click();
	}
	public void Clickclr()
	{
		clear.click();
	}
	public void Clicksrc()
	{
		search.sendKeys("Style 1");
	}
	public void Clicksrcneg()
	{
		search.sendKeys("dd");
	}
	public void clicktitsrc()
	{
		titlesrc.sendKeys("DEEPIKa");
	}
	public void clicktitsrc1()
	{
		titlesrc.sendKeys("divi");
	}
	public void Clicksty1()
	{
		style1.click();
		Select ss1=new Select(style1);
		ss1.selectByIndex(1);
	}
	public void clickststus1()
	{
		
		ststus1.click();
		Select ss2=new Select(ststus1);
		ss2.selectByVisibleText("Inactive");
		ststus1.sendKeys(Keys.ENTER);
	}
	public void Clicksrt()
	{
		sort.click();
	}
	public void Clicksrt1()
	{
		sort1.click();
	}
	public void clickedt()
	{
		edit.click();
	}
	public void entrtit()
	{
		title2.sendKeys("divya");
	}
	public void clicksty2()
	{
		style2.click();
		Select ss2=new Select(style2);
		ss2.selectByVisibleText("Style 2");
	}
	public void Clikstus()
	{
		status3.click();
	}
	public void clickup()
	{
		update.click();
	}
	public void clickeye()
	{
		eye.click();
	}
	public void clickeye1()
	{
		eye1.click();
	}
	public void clickaddban()
	{
		Addban.click();
	}
	public void etrfesnam()
	{
        fesnam.sendKeys("MURUGAN");
	}
	public void clickchsimg() throws InterruptedException, AWTException
	{
		 WebElement chsimg = ldriver.findElement(By.xpath("//*[@id=\'content\']/form/div/div/div[2]/input"));
		 chsimg .sendKeys("C:\\Users\\91996\\Downloads\\wall.jpg");
		//chsimg.click();
//		 Thread.sleep(2000);
//    	 String file="C:\\Users\\91996\\Downloads\\happy life.jpg";
//		  StringSelection Selection = new StringSelection(file);
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
//			//Thread.sleep(2000);
//			Robot rr=new Robot();
//			rr.keyPress(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_V);
//			rr.keyRelease(KeyEvent.VK_CONTROL);
//			rr.keyPress(KeyEvent.VK_ENTER);
//			rr.keyRelease(KeyEvent.VK_ENTER);
	}
	public void chstype()
	{
		type.click();
		Select ss = new Select(type);
		ss.selectByVisibleText("Business Categories");
		//((WebElement) ss).sendKeys(Keys.ENTER);
	}
	public void clickcatnam()
	{
		catnam.click();
		
	}
	public void clicksrc()
	{
		srch.click();
	}
	public void clickcls()
	{
		close.click();
	}
	public void subcls()
	{
		close1.click();
	}
	public void clicksub()
	{
		sub.click();
	}
	public void Clickact()
	{
		active.click();
	}
	public void clickadd1()
	{
		add1.click();
	}
	public void clickclr1()
	{
		clear1.click();
	}
	public void ActionSearch()
	{
		ActionSrch.sendKeys("Style 2");
	}
	public void ActionSearchNegative()
	{
		ActionSrch.sendKeys("sty");
	}
	public void Actionedit()
	{
		ActionEdit.click();
	}
	public void BannerType()
	{
		bannertype.clear();
		bannertype.sendKeys("dd");
	}
	public void TypeAction() throws InterruptedException
	{
		typeAction.click();
		
		Select ss2=new Select(typeAction);
		ss2.selectByVisibleText("Other Poster Categories");
		typeAction.sendKeys(Keys.ENTER);
	}
	public void CategoryAction()
	{
		categorynameaction.click();
	}
	public void CategorySearch()
	{
		Categorysearch.click();
	}
	public void clickdel()
	{
		del.click();
	}
	public void clickcan()
	{
		cancel.click();
	}
	public void clickdet()
	{
		delte.click();
	}
	public void clickrecord()
	{
		record.click();
		Select ss4=new Select(record);
		ss4.selectByVisibleText("100");
	}
	public void clickrec()
	{
		eyerec.click();
		Select ss3=new Select(eyerec);
		ss3.selectByVisibleText("50");
	}
	public void update1()
	{
		update1.click();
	}
	public void subcategory()
	{
		subcategory.click();
	}
	public void choosesubcategory()
	{
		choosesubcategory.click();
	}
	

}
