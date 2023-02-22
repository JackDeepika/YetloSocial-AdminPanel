package com.YetloPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
	
WebDriver ldriver;
	
	public Settings(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'sidebar-wrapper\']/div[2]/a[10]")
	WebElement setting;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement coin;
	
	@FindBy(xpath="//*[@id=\'Name\']")
	WebElement coinnegative;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[1]/div/div[3]/div/div/div[2]/input")
	WebElement miniumcoin;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[1]/div/div[3]/div/div/div[2]/input")
	WebElement miniumcoinneg;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[3]/button[1]")
	WebElement update;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/input")
	WebElement reward;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[3]/button")
	WebElement save1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div/div[3]/table/tbody/tr[3]/td[3]/button[1]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div/div[3]/table/tbody/tr[3]/td[3]/button[2]")
	WebElement remove;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div/div[4]/button")
	WebElement save;
	
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
		public void clicksetting()
		{
			setting.click();
		}
		public void clickcoin()
		{
			coin.clear();
			coin.sendKeys("30");
		}
		public void clickminiumcoin()
		{
			miniumcoin.clear();
			miniumcoin.sendKeys("15");
		}
		public void update()
		{
			update.click();
		}
		public void reward()
		{
			reward.sendKeys("8.9");
		}
		public void save1()
		{
			save1.click();
		}
		public void remove()
		{
			remove.click();
		}
		public void save()
		{
			save.click();
		}
		public void add()
		{
			add.click();
		}
		public void coinnegative()
		{
			coinnegative.clear();
			coinnegative.sendKeys(",.//,,.123");
		}
		public void miniumcoinneg()
		{
			miniumcoinneg.clear();
		}

}
