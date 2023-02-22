package com.YetloPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Notification {
WebDriver ldriver;
	
	public Notification(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[5]")
	WebElement notification;
	
	@FindBy(xpath="//*[@id=\'btn_add\']")
	WebElement send;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/form/div/div/div/div/div[1]/input")
	WebElement title;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/form/div/div/div/div/div[2]/textarea")
	WebElement Message;
	
//	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/form/div/div/div/div/div[3]/input")
//	WebElement image;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div/div/div[4]/button[1]")
	WebElement send1;
	
	@FindBy(xpath="//*[@id=\'content\']/div/div/div/div[4]/button[2]")
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
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sort1;
	
	//Record
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record2;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record3;
	
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
	public void ClickNotification()
	{
		notification.click();
	}
	public void clickSend()
	{
		send.click();
	}
	public void clicktitle()
	{
		title.sendKeys("leaf");
	}
	public void SetMessage()
	{
		Message.sendKeys("asdgjbihuivn uwuh5843575128eavgwrvdscvffvfadf");
	}
	public void SetImage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement image=ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/form/div/div/div/div/div[3]/input"));
		image.sendKeys("J:\\Testing\\SDLC & STLC Q&A.docx");
		
	}
	public void SetImage1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement image1=ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/form/div/div/div/div/div[3]/input"));
		image1.sendKeys("C:\\Users\\91996\\Downloads\\happy life.jpg");
	}
	public void clickSend1()
	{
		send1.click();
	}
	public void clickClear()
	{
		clear.click();
	}
	public void SetSearch()
	{
		search.sendKeys("hii");
	}
	public void Setsearch1()
	{
		search1.sendKeys("35156");
	}
	public void Setsearch2()
	{
		search2.sendKeys(".1248@#");
	}
	public void ClickSort()
	{
		sort.click();
		sort.click();
	}
	public void ClickSort1()
	{
		sort1.click();
		sort1.click();
	}
	public void Clickrecord()
	{
		record.click();
		Select ss=new Select(record);
		ss.selectByValue("50");
	}
	public void Clickrecord1()
	{
		record1.click();
		Select ss=new Select(record);
		ss.selectByValue("100");
	}
	public void Clickrecord2()
	{
		record2.click();
		Select ss=new Select(record);
		ss.selectByValue("25");
	}
	public void Clickrecord3()
	{
		record3.click();
		Select ss=new Select(record);
		ss.selectByValue("0");
	}

}
