package com.YetloPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage {
WebDriver ldriver;
	
	public OrdersPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div/div[3]/div[2]/div/div/div/div[2]/a")
	WebElement orders;
	
	//search
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement searchNegtaive;
	
	@FindBy(xpath="//*[@id=\'input_created_date\']")
	WebElement selectPeroid;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/div/span[11]")
	WebElement clickperiod;
	
	//@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/div/span[6]")
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[2]/input")
	WebElement mobileSearch;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[2]/input")
	WebElement mobilesearch1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement orderAmount;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement orderAmount1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement Discount;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement Discount1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[2]/input")
	WebElement buyAmount;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div[2]/input")
	WebElement buyAmount1;
	
	
	//Sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[2]/div")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sort1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement sort2;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[5]/div/span[1]")
	WebElement sort3;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/thead/tr/th[6]/div/span[1]")
	WebElement sort4;
	
	//Action
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[7]/div/button/i")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'editcategoriesModal\']/div/form/div/div[1]/button")
	WebElement cancel;
	
	//Delete
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[2]/div/table/tbody/tr[2]/td[8]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'deletecategoriesModal\']/div/form/div/div[1]/button")
	WebElement canceldelete;
	
	//Record
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
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
	public void clickorders()
	{
		orders.click();
	}
	public void SetSearch()
	{
		search.sendKeys("1234567899");
	}
	public void SetSearchNegative()
	{
		searchNegtaive.sendKeys("9952457188");
	}
	public void Datesort()
	{
		sort.click();
		sort.click();
	}
	public void moblieSort()
	{
		sort1.click();
		sort1.click();
	}
	public void orderAmount()
	{
		sort2.click();
	}
	public void DiscountAmount()
	{
		sort3.click();
		sort3.click();
	}
	public void BuyAmount()
	{
		sort4.click();
	}
	public void clickperiod()
	{
		selectPeroid.click();
	}
	public void clickdate()
	{
		clickperiod.click();
	}
	public void clickmobilesearch()
	{
		mobileSearch.sendKeys("9952457188");
	}
	public void clickmobilesearch1()
	{
		mobilesearch1.sendKeys("1234567899");
	}
	public void clickOrderAmount()
	{
		orderAmount.sendKeys("500");
	}
	public void clickOrderAmount1()
	{
		orderAmount1.sendKeys("100");
	}
	public void ClickDiscount()
	{
		Discount.sendKeys("15");
	}
	public void ClickDiscount1()
	{
		Discount1.sendKeys("90");
	}
	public void ClickbuyAmount()
	{
		buyAmount.sendKeys("600");
	}
	public void clickbuyAmount1()
	{
		buyAmount1.sendKeys("500");
	}
	public void ClickAction()
	{
		eye.click();
	}
	public void clickCancel()
	{
		cancel.click();
	}
	public void clickdelete()
	{
		delete.click();
	}
	public void clickdeletecancel()
	{
		canceldelete.click();
	}
	public void clickRecordPage()
	{
		record.click();
		Select ss1=new Select(record);
		ss1.selectByVisibleText("50");
				
	}
	
	

}
