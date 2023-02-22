package com.YetloPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
WebDriver ldriver;
	
	public LogOut(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/nav/div/button[2]/i")
	WebElement logout;
	
	@FindBy(xpath="//*[@id=\'navbarSupportedContent\']/ul/li/a")
	WebElement logout1;
	
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
	public void clicklogout()
	{
		logout.click();
	}
	public void logout1()
	{
		logout1.click();
	}
	

}
