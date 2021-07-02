package com.pibc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

import io.netty.util.internal.SystemPropertyUtil;

public class GroupPage extends TestBase {

	//----------Group Page Menu Xpath--------------//
	
	@FindBy(name="name")
	WebElement nameTextField;
	
	@FindBy(name="sortPriority")
	WebElement sortPriorityTextField;
	
	@FindBy(name="details")
	WebElement detailsTextField;
	
	@FindBy(name="admin")
	WebElement adminChkBox;
	
	@FindBy(xpath="//input[@id='drFlag']")
	WebElement noninquiryChkBox;
	
	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement btnOk;
	
	//btn confirm
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement btnConfirm;
	
	// Message
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement approveMsg;
	
	@FindBy(xpath="//a[@class='restartInHeader']")
	WebElement btnRestart;
	
	@FindBy(xpath="//input[@value=\"Reset\"]")
	WebElement btnReset;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement cancelMsg;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement groupErrorMsg;
	
	//---- Approve Record----
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement approveRecord;
	
	@FindBy(xpath="//input[@name='approve']")
	WebElement btnApprove;
	
	// logout btn
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	
	//----Remove xapth----//
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecordLink;
	
	@FindBy(xpath="//input[@id='btnRemove']")
	WebElement btnRemove;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement removeMsg;
	
	
	//------ Modify menu xpath-----//
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecordLink;
	
	public GroupPage() {
		PageFactory.initElements(driver, this);
	}

	//--------------------Methods------------------------//	
	
	public void addGroup(String name, String SortPriority, String details) throws InterruptedException, IOException {
		
		
		//----Cancel button validation----//
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnCancel.click();
		String actualCancelMsg=cancelMsg.getText();
		String expectCancelMsg="Operation Add group was cancelled.";

		if(actualCancelMsg.equals(expectCancelMsg)) {
			System.out.println("-----Cancel Message Validated------");
		}else {
			System.out.println("-----Cancel Message not Validated------");
//			TestUtil.takeScreenshot(actualCancelMsg, expectCancelMsg);
		}
		
		btnRestart.click();
		//----Reset button validation----//
		
		Thread.sleep(4000);
		nameTextField.sendKeys(name);
		sortPriorityTextField.sendKeys(SortPriority);
		detailsTextField.sendKeys(details);
		adminChkBox.click();
		noninquiryChkBox.click();
		btnReset.click();
		
		btnRestart.click();
		
		//-----Ok Button Validation-----//
		
		Thread.sleep(3000);
		btnOk.click();
		String actualGrpMsg=groupErrorMsg.getText();
		String expectGrpMsg="Name is required.\r\n" + 
							"Details is required.";
		
		if(actualGrpMsg.contains(expectGrpMsg)) {
			System.out.println("----Group Message Fields are validated-----");
		}else {
			System.out.println("----Group Message Fields are not validated-----");
//			TestUtil.takeScreenshot(actualGrpMsg, expectGrpMsg);
		}
		
		//----Adding the record----//
				
		nameTextField.sendKeys(name);
		sortPriorityTextField.sendKeys(SortPriority);
		detailsTextField.sendKeys(details);
		adminChkBox.click();
		//noninquiryChkBox.click();
		btnOk.click();
		btnConfirm.click();
		
		String actualGroupMsg=approveMsg.getText();
		String expectGroupMsg="Operation Add group executed successfully.";
		
		if(actualGroupMsg.contains(expectGroupMsg)) {
			System.out.println("-----Add Group Message Validated------");
		}else {
			System.out.println("-----Add Group Message not Validated------");
//			TestUtil.takeScreenshot(actualGroupMsg, expectGroupMsg);
		}
		btnLogout.click();
		extBtnLogout.click();
driver.quit();
	}
	
	public GroupPage approveRecord() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveRecord.click();
		btnApprove.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new GroupPage();
	}
	
	//---- Modify Method----//
	public GroupPage modifyGroupRecord(String name, String SortPriority, String details ) throws InterruptedException {
		modifyRecordLink.click();
		Thread.sleep(3000);
		nameTextField.clear();
		nameTextField.sendKeys(name);
		
		sortPriorityTextField.clear();
		sortPriorityTextField.sendKeys(SortPriority);
		
		detailsTextField.clear();
		detailsTextField.sendKeys(details);
		
		btnOk.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new GroupPage();
	}
	
	public GroupPage removeGroupRecord() throws InterruptedException, IOException {
		
		removeRecordLink.click();
		btnRemove.click();
		Thread.sleep(3000);
		String actualRemoveMsg=removeMsg.getText();
		String expctRemoveMsg="Operation Remove group executed successfully. TEST placed in APPROVE queue.";
		
		if(actualRemoveMsg.contains(expctRemoveMsg)) {
			System.out.println("--------Remove Message Validated---------");
		}else {
			System.out.println("--------Remove Message not Validated------");
//			TestUtil.takeScreenshot(actualRemoveMsg, expctRemoveMsg);
		}
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new GroupPage();
	}
}

