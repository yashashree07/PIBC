package com.pibc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.TestUtil;

import io.cucumber.core.api.Scenario;

public class ScannerProfilePage extends TestBase {

	
	// --Scanner Profile Page Xpath---//

	@FindBy(xpath = "//input[@name='profileName']")
	WebElement textfieldScanProfile;

	@FindBy(xpath = "//button[@id='checkAllBtn']")
	WebElement btnChkAll;

	@FindBy(xpath = "//button[@id='unCheckAllBtn']")
	WebElement btnUnChkAll;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]") // Profile Name Required
	WebElement btnOkErrorMsg;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]") // You must select some menu checkboxes
	WebElement textfieldErrorMsg;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]")
	WebElement btnOkAfterMsg;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnCancel;

	@FindBy(xpath = "//*[@id=\"header_nav\"]/li[5]/a")
	WebElement btnRestartWorkflow;

	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	// Approve Page Xpath
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement approveRecord;

	@FindBy(name = "approve")
	WebElement btnApprove;

	@FindBy(name = "reject")
	WebElement btnReject;

	// Modify Page Xpath

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecord;

	@FindBy(xpath = "//input[@name='profileName']")
	WebElement textfieldModify;

	@FindBy(xpath = "//input[@id='checkBox29']")
	WebElement chkboxModify29;

	@FindBy(xpath = "//input[@id='checkBox30']")
	WebElement chkboxModify30;

	@FindBy(xpath = "//input[@id='checkBox31']")
	WebElement chkboxModify31;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnModifyOk;

	@FindBy(xpath = "//input[@name='cancel']")
	WebElement btnModifyCancel;

	// Remove Page Xpath

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecord;
	
	@FindBy(xpath="//input[@name='approve']")
	WebElement btnDelete;
	
	
	// Constructor to initialize above elements
	public ScannerProfilePage() {
		PageFactory.initElements(driver, this);
	}

	// -------------Methods---------------//

	public void addScanProfile(String profilename) throws InterruptedException, IOException {

		// only click ok button and validate the message
		btnOk.click();
		Thread.sleep(3000);

		String actualOkBtnMsg = btnOkErrorMsg.getText();
		String expctOkBtnMsg = "Profile Name Required";

		if (actualOkBtnMsg.equals(expctOkBtnMsg)) {
			System.out.println("------Ok Button Message Validated-------");
		} else {
			System.out.println("------Ok Button Message Not Validated-------");
			TestUtil.takeScreenshot(actualOkBtnMsg,expctOkBtnMsg);
		}
		btnRestartWorkflow.click();

		// Name in text-field is entered and all boxes are uncheck validation
		textfieldScanProfile.sendKeys(profilename);
		btnOk.click();
		Thread.sleep(3000);
		String actualTxtMsg = textfieldErrorMsg.getText();
		String expctTxtMsg = "You must select some menu checkboxes";

		if (actualTxtMsg.equals(expctTxtMsg)) {
			System.out.println("---- CheckBox Button Message Validated------");
		} else {
			System.out.println("---- CheckBox Button Message Not Validated------");
//			TestUtil.takeScreenshot(actualTxtMsg,expctTxtMsg);
		}
		
		btnRestartWorkflow.click();

		// Uncheck button
		textfieldScanProfile.sendKeys(profilename);
		btnChkAll.click();
		Thread.sleep(2000);
		btnUnChkAll.click();
		btnRestartWorkflow.click();

		// ---- add scan profile----//
		textfieldScanProfile.sendKeys(profilename);
		btnChkAll.click();
		btnOk.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualMsg = btnOkAfterMsg.getText();
		String expctMsg = "Profile Successfully Added Waiting For Approve";
		if (actualMsg.equals(expctMsg)) {
			System.out.println("-----Profile Added Successfully Message Validated-----");
		} else {
			System.out.println("-----Profile Added Successfully Message not Validated-----");
//			TestUtil.takeScreenshot(actualMsg, expctMsg);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}

	public ScannerProfilePage approveRecord() {

		approveRecord.click();
		btnApprove.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new ScannerProfilePage();
	}

	public ScannerProfilePage modifyRecord() throws InterruptedException {

		modifyRecord.click();
		chkboxModify29.click();
		chkboxModify30.click();
		chkboxModify31.click();

		Thread.sleep(2000);
		btnModifyOk.click();

		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new ScannerProfilePage();
	}
	
	public ScannerProfilePage removeRecord() {
		
		removeRecord.click();
		btnDelete.click();
		
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new ScannerProfilePage();
		
	}
}

