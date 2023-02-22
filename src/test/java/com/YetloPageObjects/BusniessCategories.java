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
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusniessCategories {
WebDriver ldriver;
	
	public BusniessCategories(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[6]")
	WebElement busniess;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement AddCategory;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement categoryName;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement categoryname1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/input")
	WebElement color;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/input")
	WebElement color1;
	
//      @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[3]")
//      WebElement image;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement active;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement inactive;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[2]/div/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div[2]/div/button[2]")
	WebElement clear;
	
	//search
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search2;
	
	
	
	//Sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sortAddposter;
	
	//Action
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[4]/div/button")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement addPoster;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[1]/div/div[24]")
	WebElement backcolor;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[2]")
	WebElement image1;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\'activeRadio1\']")
	WebElement status1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[1]")
	WebElement add1;
	
	@FindBy(xpath="//*[@id=\'content\']/form/div/div/div[4]/div/button[2]")
	WebElement clear1;
	
	//Edit
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[3]/div/button/i")
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[1]/div[1]/div/div[30]")
	WebElement coloredit;
	
	//@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[2]/div/div[1]/div[2]/div/input")
	//WebElement imageedit;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement inactive1;
	
	@FindBy(xpath="//*[@id=\'editframesModal\']/div/form/div/div[3]/button")
	WebElement update;
	//delete
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[4]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[1]/button")
	WebElement cancel;
	
	@FindBy(xpath="//*[@id=\'deleteframesModal\']/div/form/div/div[3]/button")
	WebElement deletecon;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[6]/div")
	WebElement delete1;
	
	@FindBy(xpath="//*[@id=\'deletecategoriesModal\']/div/form/div/div[1]/button")
	WebElement cancel1;
	
	@FindBy(xpath="//*[@id=\'deletecategoriesModal\']/div/form/div/div[3]/button")
	WebElement deletecon1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[5]/div/button")
	WebElement editcategory;
	
	@FindBy(xpath="//*[@id=\'Image\']")
	WebElement editname;
	
	@FindBy(xpath="//*[@id=\'inactiveRadio2\']")
	WebElement editstatus;
	//Record
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[4]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement recordcategory;
	
	@FindBy(xpath="//*[@id=\'editcategoriesModal\']/div/form/div/div[2]/div/div[5]/button")
	WebElement update1;
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
	public void ClickBusCat()
	{
		busniess.click();
	}
	public void ClickAddCategory()
	{
		AddCategory.click();
	}
	public void SetcategoryName()
	{
		categoryName.sendKeys("Shop");
	}
	public void Setcategoryname()
	{
		categoryname1.sendKeys("1234");
	}
	public void Setcolor()
	{
		color.sendKeys("black");
	}
	public void setcolor1()
	{
		color1.sendKeys("2156");
	}
	public void SetImage() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		
		WebElement image = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[3]/input"));
//		Thread.sleep(2000);
     	image.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
		//image.click();
		
	}
	public void ClickActive()
	{
		active.click();
	}
	public void ClickInactive()
	{
		inactive.click();
	}
	public void clickadd()
	{
		add.click();
	}
	public void clickClear()
	{
		clear.click();
	}
	public void searchclick()
	{
		search.sendKeys("1234");
	}
	public void searchclick1()
	{
		search1.sendKeys("marketing");
	}
	public void negativesearch()
	{
		search2.sendKeys("dd");
	}
	public void clickSort()
	{
		sort.click();
		sort.click();
	}
	public void clickEye()
	{
		eye.click();
	}
	public void clickAddposter()
	{
		addPoster.click();
	}
	public void clickbackcolor()
	{
		backcolor.click();
	}
	public void clickimage1() throws InterruptedException, AWTException
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
	public void clickactive()
	{
		status.click();
	}
	public void clickInactive()
	{
		status1.click();
	}
	public void clickAdd1()
	{
		add1.click();
	}
	public void clickclr()
	{
		clear1.click();
	}
	public void clicksortAddposter()
	{
		sortAddposter.click();
		sortAddposter.click();
	}
	public void clickEdit()
	{
		edit.click();
	}
	public void clickeditcolor()
	{
		coloredit.click();
	}
	public void clickimageedit()
	{
		WebElement imageedit = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/form/div/div[2]/div/div[1]/div[2]/div/input"));
		imageedit.sendKeys("C:\\Users\\91996\\Downloads\\wall.jpg");
		
	}
	public void clickInactive1()
	{
		inactive1.click();
	}
	public void clickupdate()
	{
		update.click();
	}
	public void clickdelete()
	{
		delete.click();
	}
	public void clickCancel()
	{
		cancel.click();
	}
	public void clickdeleteConfirm()
	{
		deletecon.click();
	}
	public void ClickRecord()
	{
		record.click();
		Select ss=new Select(record);
		ss.selectByVisibleText("100");
	}
	public void Clickeditcategory()
	{
		editcategory.click();
	}
	public void clickeditname()
	{
		editname.clear();
		editname.sendKeys("cat");
	}
	public void clickEditstatus()
	{
		editstatus.click();
	}
	public void clickupdate1()
	{
		update1.click();
	}
	public void clickdelete1()
	{
		delete1.click();
	}
	public void clickcancel1()
	{
		cancel1.click();
	}
	public void clickdeleteconf()
	{
		deletecon1.click();
	}
	public void clickrecordcategory()
	{
		recordcategory.click();
		Select ss = new Select(recordcategory);
		ss.selectByVisibleText("100");
	}
	

}
