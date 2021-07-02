package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class UserPage extends TestBase {

	// ***---User Page Xpath---***

	@FindBy(name = "username")
	WebElement lblUserName;

	@FindBy(name = "fullName")
	WebElement lblFullName;

	@FindBy(name = "profileId")
	WebElement lblProfile;

	@FindBy(name="AmountRange")
	WebElement lblauthMatrix;
	
	@FindBy(name = "password")
	WebElement lblPassword;

	@FindBy(name = "verifyPassword")
	WebElement lblVerifyPswd;

	@FindBy(xpath = "//input[@id='submitButton']")
	WebElement btnOk;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement btnCancel;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement btnReset;

	// Cancel Error Msg Xpath
	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement cancelErrorMsg;

	// Text fields Error Msg Xpath
	@FindBy(xpath = "//*[@id=\"inf_username\"]")
	WebElement userNameErrorMsg;

	@FindBy(xpath = "//td[@id='inf_fullName']")
	WebElement fullNameErrorMsg;

	@FindBy(xpath = "//td[@id='inf_profileId']")
	WebElement profileErrorMsg;

	@FindBy(xpath = "//a[@class='restartInHeader']")
	WebElement btnRestartWorkFLow;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement userOk;

	
	//---***Modify Screen Xpath***--
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecordLink;
	
	// Confirm btn
	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement btnConfirm;

	//---***Block Screen Xpath***---

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement blockRecordLink;
	
	@FindBy(xpath="//input[@id='btnBlockUnblock']")
	WebElement btnBlock;
	
	//---***Remove Screen Xpath***---
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecordLink;
	
	@FindBy(xpath="//input[@id='btnRemove']")
	WebElement btnRemove;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement removeValidateMsg;
	
	// logout btn
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	// ***---Inside approve page xpath---***

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement approveRecord;

	// User Confirm approve
	@FindBy(name = "approve")
	WebElement confirmApprove;

	public UserPage() {
		PageFactory.initElements(driver, this);
	}

	// ***---Methods---***
	public void addUser(String un, String fn, String profile,String authmatrix, String password, String verifypassword) {

		// testing the cancel button
		btnCancel.click();
		String a = cancelErrorMsg.getText();
		String b = "Operation Add new user was cancelled.";

		if (a.equals(b)) {
			System.out.println("---Cancel button operation completed sucessfully---");
		} else {
			System.out.println("---Cancel button is not working---");
		}
		userOk.click();
		lblUserName.sendKeys(un);
		lblFullName.sendKeys(fn);
		lblPassword.sendKeys(password);
		lblVerifyPswd.sendKeys(verifypassword);

		// testing of Reset Button
		btnReset.click();
		String c = lblUserName.getText();
		String d = lblFullName.getText();
		String e = lblPassword.getText();
		String f = lblVerifyPswd.getText();

		if (c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("---Text Fields are getting reset---");
		} else {
			System.out.println("---Text Fields are not getting reset---");
		}

		// Adding new User
		lblUserName.sendKeys(un);
		lblFullName.sendKeys(fn);
		Select sel = new Select(lblProfile);
		sel.selectByVisibleText(profile);
		Select sl=new Select(lblauthMatrix);
		sl.selectByVisibleText(authmatrix);
		lblPassword.sendKeys(password);
		lblVerifyPswd.sendKeys(verifypassword);
		btnOk.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
	}

	public UserPage approveUser() {

		approveRecord.click();
		confirmApprove.click();
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}

	public UserPage validationMessage() throws InterruptedException {

		btnOk.click();
		// UserName Text Field Validation
		String actualUserNameMsg = userNameErrorMsg.getText();
		String expctdUserNameMsg = "ERROR: required";

		if (actualUserNameMsg.equals(expctdUserNameMsg)) {
			System.out.println("---UserName text field is validated---");
		} else {
			System.out.println("---UserName text field is not validated---");
		}
		Thread.sleep(3000);
		
		// FullName Text Field Validation
		String actualFullNameMsg = fullNameErrorMsg.getText();
		String expctFullNameMsg = "ERROR: required";

		if (actualFullNameMsg.equals(expctFullNameMsg)) {
			System.out.println("---FullName text field is validated---");
		} else {
			System.out.println("---FullName text field is validated---");
		}
		
		// Profile Field Validation
		String actualProfileMsg = profileErrorMsg.getText();
		String expctProfileMsg = "ERROR: required";

		if (actualProfileMsg.equals(expctProfileMsg)) {
			System.out.println("---Profile field is validated---");
		} else {
			System.out.println("---Profile field is not validated");
		}
		return new UserPage();
	}
	
	public UserPage modifyRecord(String userName,String fullName) throws InterruptedException {
		

		modifyRecordLink.click();
		lblUserName.clear();
		Thread.sleep(3000);
		lblUserName.sendKeys(userName);
		lblFullName.clear();
		Thread.sleep(3000);
		lblFullName.sendKeys(fullName);
		btnOk.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}
	
	public UserPage blockRecord() {
		blockRecordLink.click();
		btnBlock.click();
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}
	
	public UserPage removeRecord() throws InterruptedException {
		removeRecordLink.click();
		btnRemove.click();
		Thread.sleep(3000);
		String actualRemoveMsg=removeValidateMsg.getText();
		String expctdRemoveMsg="Operation Remove user executed successfully. ADMIN/Test1 placed in APPROVE queue.";
		
		if(actualRemoveMsg.equals(expctdRemoveMsg)) {
			System.out.println("---Remove Message is Validated---");
		}else {
			System.out.println("---Remove Message is not Validated---");
		}
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}
}

