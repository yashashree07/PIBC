package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class DBLoadPage extends TestBase{

	@FindBy(name="loadType")
	WebElement selectLoadtype;
	
	@FindBy(name="forceUpdate")
	WebElement forceUpdate;
	
	@FindBy(name="fileName")
	WebElement fileName;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[1]")
	WebElement OKBtn;
	
	@FindBy(name="back")
	WebElement backBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[2]")
	WebElement confirmBtn;
	
	@FindBy(xpath="//input[@name='reveal']")
	WebElement statusBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[14]/td/input[3]")
	WebElement okBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn; 
	
	public DBLoadPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DBLoadPage addParticipantBank(String Loadtype,String ForceUpdate,String FileName) throws InterruptedException {
		Select sl=new Select(selectLoadtype);
		sl.selectByVisibleText(Loadtype);
		Select sl1=new Select(forceUpdate);
		sl1.selectByVisibleText(ForceUpdate);
		fileName.sendKeys(FileName);
		OKBtn.click();
		backBtn.click();
		OKBtn.click();
		confirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		statusBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new DBLoadPage();
	}
}
