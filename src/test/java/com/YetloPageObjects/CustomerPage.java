package com.YetloPageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CustomerPage{
	
WebDriver ldriver;
	
	public CustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\'loginpassword\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'center-content\']/div/section/div/div/div/div/div/form/div[3]/button")
	WebElement login;

	@FindBy(linkText="View Entire Details")
	WebElement customers;
	
	//Sort
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id='page-content-wrapper']/div/div/div/div[2]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement sort1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement sort2;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/thead/tr/th[5]/div/span[1]")
	WebElement sort3;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[2]/div/span[1]")
	WebElement actSort;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[3]/div/span[1]")
	WebElement actsort1;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[4]/div/span[1]")
	WebElement actsort2;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[5]/div/span[1]")
	WebElement actsort3;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[6]/div/span[1]")
	WebElement actsort4;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/thead/tr/th[7]/div/span[1]")
	WebElement actsort5;
			
	
	//search
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div")
	WebElement select;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/div/span[17]")
	WebElement date;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/div/span[32]")
	WebElement date1;
	
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement actSearch; 
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/label/div/input")
	WebElement actsearch1;
	
	
   //	@FindBy(xpath="/html/body/div[5]/div[1]/span[1]/svg/path")
   //	WebElement dateArrow;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/div[2]/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/div[2]/input")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/input")
	WebElement status;
	
	//Action
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]/div/button")
	WebElement eye;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[2]/button")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[1]")
	WebElement choose;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[1]/div/div[3]")
	WebElement choose1;
	
	@FindBy(xpath="//*[@id=\'vehicle18\']")
	WebElement choose2;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[2]/input")
	WebElement cusname;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[2]/input")
	WebElement cusname1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[3]/input")
	WebElement cusphone;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[3]/input")
	WebElement cusphone1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[4]/input")
	WebElement email1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[4]/input")
	WebElement email2;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[5]/input")
	WebElement website;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[5]/input")
	WebElement website1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[6]/input")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[6]/input")
	WebElement state1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[7]/input")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[7]/input")
	WebElement city1;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[8]/input")
    WebElement insta ;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[9]/input")
	WebElement fb;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[10]/input")
	WebElement youtube;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[11]/input")
	WebElement linkedin;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[12]/input")
	WebElement twitter;
	
//	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[2]/div/div[13]/input")
//	WebElement img;
	
	@FindBy(xpath="//*[@id=\'addcustomerModal\']/div/form/div/div[3]/button")
	WebElement save;
	
	//RECORDPAGE
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement AddRecord;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[4]/div[1]/button")
	WebElement payment;
	
	@FindBy(xpath="//*[@id=\'payment\']/div/div/div[1]/button")
	WebElement cancel;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[4]/div[2]/button")
	WebElement referal;
	
	@FindBy(xpath="//*[@id=\'referral\']/div/form/div/div[1]/button")
	WebElement refCancel;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[4]/div[3]/button")
	WebElement download;
	
	@FindBy(xpath="//*[@id=\'images\']/div/form/div/div[1]/button")
	WebElement dowCancel;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[3]/div/div/footer/div[1]/div/label/select")
	WebElement record;
	
	//Edit
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/tbody/tr[2]/td[8]/div/button")
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\'editcustomerModal\']/div/form/div/div[2]/div/div[1]/div/div[10]")
	WebElement editchoose;
	
	@FindBy(xpath="//*[@id=\'editcustomerModal\']/div/form/div/div[2]/div/div[2]/input")
	WebElement editbusname;
	
	@FindBy(xpath="//*[@id=\'editcustomerModal\']/div/form/div/div[2]/div/div[12]/input")
	WebElement editTwiiter;
	
	@FindBy(xpath="//*[@id=\'editcustomerModal\']/div/form/div/div[3]/button")
	WebElement update;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div[1]/div[1]/div[3]/div[2]/div/table/tbody/tr[2]/td[9]/div/button/i")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\'delete_business\']/div/form/div/div[1]/button")
	WebElement deleteCancel;
	
	@FindBy(xpath="//*[@id=\'delete_business\']/div/form/div/div[3]/button")
	WebElement deleteconfirm;
	
	@FindBy(xpath="//*[@id=\'page-content-wrapper\']/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[8]/div/button/i")
	WebElement delete1;
	
	@FindBy(xpath="//*[@id=\'deletecustomerModal\']/div/form/div/div[1]/button")
	WebElement deleteCancel1;
	
	@FindBy(xpath="//*[@id=\'deletecustomerModal\']/div/form/div/div[3]/button")
	WebElement deletecon;
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
	
	public void clickcustomer1()
	{
		customers.click();
	}
	public void clickSort()
	{
		sort.click();
	}
	public void sortName()
	{
		sort1.click();
	}
	public void sortmobile()
	{
		sort2.click();
	}
	public void sortStatus()
	{
		sort3.click();
	}
	public void selectPeriod()
	{
		select.click();
	}
	String month="April 2022";
	String day="13";

	public void selecteDate()
	{
		date.click();
		date.sendKeys(Keys.ENTER);
//		while(true)
//		{
//			//date.click();
//			String text=date.getText();
//			if(text.equals(month))
//			{
//				break;
//			}
//			else
//			{
//				dateArrow.click();
//			}
//		}
			
		
			}
	public void SetPosstiveDate()
	{
		date1.click();
		date1.sendKeys(Keys.ENTER);

		
	}
	
	public void Setname()
	{
		name.sendKeys("deepika");
		
	}
	public void SetPosstiveNmae()
	{
		name.sendKeys("XXX");
	}
	public void Setnumber()
	{
		mobile.sendKeys("9962019188");
		
	}
	public void SetPosstivenumber()
	{
		mobile.sendKeys("1591591591");
	}
	public void Setstatus()
	{
		status.sendKeys("Inactive");
		
	}
	public void SetPosstiveStatus()
	{
		status.sendKeys("Active");
	}
	public void ClickEye()
	{
		eye.click();
	}
	public void ClickAdd()
	{
		add.click();
	}
	public void clickChoose()
	{
		choose.click();
	}
	public void clickchoose1()
	{
		choose1.click();
	}
	public void clickChoose2()
	{
		choose2.click();
	}
	public void setcustomerName()
	{
		cusname.sendKeys("shop");
	}
	public void setcusname1()
	{
		cusname1.sendKeys("doctor");
	}
	
	public void SetcusPhone()
	{
		cusphone.sendKeys("7305884112");
	}
	public void Setcusphonenum()
	{
		cusphone1.sendKeys("532rdd7456");
	}
	public void Setemail()
	{
		email1.sendKeys("aa22@gmail.com");
	}
	public void Setemail1()
	{
		email2.sendKeys("a22@");
	}
	public void Setwebsite()
	{
		website.sendKeys("leaf.com");
	}
	public void Setwebsite1()
	{
		website1.sendKeys("l123");
	}
	public void SetState()
	{
		state.sendKeys("tt");
	}
	public void SetState1()
	{
		state1.sendKeys("tt");
	}
	public void setcity()
	{
		city.sendKeys("kali");
	}
	public void setcity1()
	{
		city1.sendKeys("kali");
	}
	public void Setinsta()
	{
		insta.sendKeys("divi.vo");
	}
	public void Setfb()
	{
		fb.sendKeys("deepi");
	}
	public void SetYoutube()
	{
		youtube.sendKeys("learn");
	}
	public void SetLinkedIn()
	{
		linkedin.sendKeys("dppp");
	}
	public void SetTwitter()
	{
		twitter.sendKeys("dikk12");
	}
	public void SetImage() throws InterruptedException
	{
		Thread.sleep(2000);
	     WebElement img = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[1]/div[6]/div/form/div/div[2]/div/div[13]/input"));
		 img.sendKeys("J:\\Testing\\SDLC & STLC Q&A.docx");
		
		
	}
	public void ClickSave()
	{
		save.click();
	}
	public void SetSearch()
	{
		actSearch.sendKeys("shop");
	}
	public void SetSearch1()
	{
		actsearch1.sendKeys("deep");
	}
	public void SetDate()
	{
		actSort.click();
	}
	public void SetBusname()
	{
		actsort1.click();
	}
	public void SetEmail3()
	{
		actsort2.click();
	}
	public void Setphone()
	{
		actsort3.click();
	}
	public void Setimage()
	{
		actsort4.click();
	}
	public void SetStatus1()
	{
		actsort5.click();
	}
	public void ClickRecord() throws InterruptedException
	{
		AddRecord.click();
		Thread.sleep(2000);
		Select ss = new Select (AddRecord);
		ss.selectByVisibleText("100");
		
	}
	public void clickPayment()
	{
		payment.click();
	}
	public void clickpaymentcancel()
	{
		cancel.click();
	}
	public void Clickreferal()
	{
		referal.click();
	}
	public void ClickRefCancel()
	{
		refCancel.click();
	}
	public void ClickDownload()
	{
		download.click();
	}
	public void ClickCancelDow()
	{
		dowCancel.click();
	}
	public void Clickedit()
	{
		edit.click();
	}
	public void ChooseCategory()
	{
		editchoose.click();
	}
	public void SetnameCustomer()
	{
		editbusname.clear();
		editbusname.sendKeys("Baker");
	}
	public void SetTwitteredit()
	{
		editTwiiter.sendKeys("dd3");
	}
	public void clickupdateedit()
	{
		update.click();
	}
	public void ClickDelete()
	{
		delete.click();
	}
	public void Clickdeletecancel()
	{
		deleteCancel.click();
	}
    public void clickdeleteConfirm()
    {
    	deleteconfirm.click();
    }
    public void clickdelete()
    {
    	delete1.click();
    }
    public void deletecancelcus()
    {
    	deleteCancel1.click();
    }
    public void deleteconfirm()
    {
    	deletecon.click();
    }
    public void clickRecord()
    {
    	record.click();
    	Select ss = new Select(record);
    	ss.selectByValue("100");
    }






	
}
