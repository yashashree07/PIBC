package com.pibc.qa.pages;

import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.Windowhandle;

public class PaymentFlow extends TestBase {

	DatabaseIntegrity DI = new DatabaseIntegrity();
	Windowhandle win = new Windowhandle(driver);
	String gpkey = null;

	@FindBy(id = "btnAll")
	WebElement getAllBtn;
	
	@FindBy(xpath="//*[@id='btnOk' and @type='submit']")
    WebElement buttonVisibility;
	
	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[1]/td/input[3]")
	WebElement toQualifyReceiveBtn;
	
	@FindBy(xpath="//*[@id=\"mainForm\"]/table[2]/tbody/tr[2]/td/input[3]")
	WebElement DuplicateScreenToRepairBtn;
	
	@FindBy(id="newMemo")
	WebElement entermemo;
	
	@FindBy(name="payTranValueDate")
	WebElement valuedateBtn;
	
	@FindBy(name="content(chkAccNo)")
	WebElement chkAccNo;
	
	@FindBy(name="content(payTranBeneficiaryAcctExt)")
	WebElement payTranBeneficiaryAcctExt;
	
	@FindBy(id="btnOkErr")
	WebElement recheckBtn;
	
	@FindBy(xpath="//*[@id=\"btnOk\"]")
	WebElement qualifyreceiveconfirmBtn;
	
	@FindBy(id="btnOk")
	WebElement qualifyreceiveokBtn;
	
	@FindBy(name="payTranOGBLkpValue")
	WebElement benebankbiccode;
	
	@FindBy(name="payTranBeneBankLkpValue")
	WebElement payerbankbiccode;   
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyokBtn;
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyConfirmBtn;
	
	@FindBy(name = "approve")
	WebElement approveBtn;
	
	@FindBy(name="btnOk")
	WebElement InsuffiOKBtn;
	
	@FindBy(name="btnOk")
	WebElement InsuffiConfirmBtn;

	@FindBy(name="delete")
	WebElement deleteBtn;
	
	@FindBy(name="reject")
	WebElement rejectBtn;
	
	@FindBy(name="btnOk")
	WebElement duplicateOkBtn;
	
	@FindBy(xpath="//body[@id='body']//tr//tr[1]//td[1]//input[6]")
	WebElement allowDuplicateBtn;
	
	@FindBy(name="btnOk")
	WebElement confirmDuplicateBtn;
	
	@FindBy(id="0")
	WebElement lineIdCheckbox;
	
	@FindBy(name = "content(periodValueDate)")
	WebElement periodValueDate;

	@FindBy(name="content(paymentType)")
	WebElement paymentType;
	
	@FindBy(name = "content(referenceOption)")
	WebElement referenceOption;

	@FindBy(name = "content(referenceTest)")
	WebElement referenceTest;

	@FindBy(name = "content(reference)")
	WebElement chequeno;

	@FindBy(name = "content(startaccountNumber)")
	WebElement accountNumber;

	@FindBy(name = "payTranPrim")
	WebElement gpKey;

	@FindBy(name = "content(messageKey)")
	WebElement entergpkey;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[19]")
	WebElement status;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[22]")
	WebElement dbidstatus;
	
	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(name = "skip")
	WebElement skipBtn;

	@FindBy(name = "confirmBtn")
	WebElement confirmBtn;

	@FindBy(name = "Return")
	WebElement returnBtn;

	@FindBy(name="return")
	WebElement insuffifundreturnBtn;
	
	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement alertmsg;

	@FindBy(id = "memoReasonCode")
	WebElement reasonCode;
	
	@FindBy(id="newMemo")
	WebElement reason;

	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[11]/td/input[4]")
	WebElement toCancelBtn;
	
	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[1]/td/input[4]")
	WebElement ToCancelBtn;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	@FindBy(id = "0")
	WebElement approveCheckBoxPDCDeletePage;
	

	@FindBy(name = "delete")
	WebElement DeleteBtnPDCDeletePg;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[20]")
	WebElement listScreenStatus;

	
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td")
	WebElement ModifyScreenFrame;




	public PaymentFlow() {
		PageFactory.initElements(driver, this);
	}

	public void filterScreen(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		gpkey = gpKey.getAttribute("Value");
		System.out.println(gpkey);
	}

	public void filterScreen1(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	public void filterwithGpkey(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
	}

	public PaymentFlow checkInitialPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}
		return new PaymentFlow();
	}

	public PaymentFlow movetoRepair(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		DuplicateScreenToRepairBtn.click();
		String actualalertmsg=alertmsg.getText();
		String expectedalertmsg="Enter Reason for sending to To Repair";
		if(actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Memo Reason field");
			entermemo.sendKeys(Reason);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			DuplicateScreenToRepairBtn.click();
			Thread.sleep(IntfConstants.TIMEOUT);
		}else {
			System.out.println("Validation failed for Memo reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}

	public PaymentFlow movetoQualifyreceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		toQualifyReceiveBtn.click();
		String actualalertmsg=alertmsg.getText();
		String expectedalertmsg="Enter Reason for sending to To Qualify";
		if(actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Memo Reason field");
			entermemo.sendKeys(Reason);
			toQualifyReceiveBtn.click();
		}else {
			System.out.println("Validation failed for Memo reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}

	public PaymentFlow rejectfromSignatureCheckApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheckApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheckApprove screen is not working");
		}
		record.click();
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Signature Check Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from SignatureCheckApprove screen is not working");
		}
		lineIdCheckbox.click();
		entermemo.sendKeys(Reason);
		rejectBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow acceptfromSignatureCheckApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheckApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheckApprove screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Signature Check Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from SignatureCheckApprove screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		approveBtn.click();
		driver.switchTo().alert().accept();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow acceptfromInsufficientFundApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from InsufficientFundApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from InsufficientFundApprove screen is not working");
		}
		record.click();
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Insufficient Fund Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from InsufficientFundApprove screen is not working");
		}
		record.click();
		approveBtn.click();
		driver.switchTo().alert().accept();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoPendingAck(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		return new PaymentFlow();
	}
	
	public PaymentFlow logout() {
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}

	
	
	public PaymentFlow insufficientFundQueue_Return(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Insufficient Fund screen is working fine");
		} else {
			System.out.println("Cancel Button from Insufficient Fund screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		returnBtn.click();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			returnBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow moveDuplicatetoApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Duplicate screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		duplicateOkBtn.click();
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Duplicate Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate Confirm screen is not working");
		}
		record.click();
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow moveDuplicatetoApproveforOnus(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Duplicate screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Duplicate Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate Confirm screen is not working");
		}
		record.click();
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
		
	}
	
	public PaymentFlow acceptfromQualifyReceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String CheckkAccNo,String ValueDate,String PayerBICCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Qualify Receive screen is working fine");
		} else {
			System.out.println("Cancel Button from Qualify Receive  screen is not working");
		}
		record.click();
//		String actualerrormsg=errormessages.getText();
//		String expectederrormsg="Error occurred while MICR validation, Cheque Account Number does not match with MICR Account Number.";
//		if(actualerrormsg.contains(expectederrormsg)) {
////					valuedateBtn.clear();
////					valuedateBtn.sendKeys(ValueDate);
//			chkAccNo.clear();
//			chkAccNo.sendKeys(CheckkAccNo);
//			payTranBeneficiaryAcctExt.clear();
//			payTranBeneficiaryAcctExt.sendKeys("1001005616");
//			qualifyreceiveokBtn.click();
////			payerbankbiccode.clear();
////			payerbankbiccode.sendKeys(PayerBICCode);
//			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
////			qualifyreceiveokBtn.click();
		qualifyreceiveokBtn.click();
		qualifyreceiveconfirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow returnfromQualifyReceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Qualify Receive screen is working fine");
		} else {
			System.out.println("Cancel Button from Qualify Receive  screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		returnBtn.click();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			returnBtn.click();
			driver.switchTo().alert().accept();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow cancelfromRepair(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Repair screen is working fine");
		} else {
			System.out.println("Cancel Button from Repair screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		ToCancelBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to To Cancel";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			entermemo.sendKeys(Reason);
			ToCancelBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoQueuedToVipChequeAcceptance(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedToVipChequeAcceptance", null));
			System.out.println("Payment moved to QueuedToVipChequeAcceptance status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new PaymentFlow();
	}
    
	public PaymentFlow moveexceptiontoApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Manual Tray screen is working fine");
		} else {
			System.out.println("Cancel Button from Manual Tray screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow moveexceptiontoApproveByReject(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Manual Tray screen is working fine");
		} else {
			System.out.println("Cancel Button from Manual Tray screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		rejectBtn.click();
		driver.switchTo().alert().accept();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Reject";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reason.sendKeys("Reject");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		rejectBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoInsufficientFund(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "InsufficientFund", null));
			System.out.println("Payment moved to InsufficientFund status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoInsufficientFundApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		InsuffiOKBtn.click();
		InsuffiConfirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow approvefromInsufficientFundApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		approveBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow moveAccountverificationtoApprove(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid=dbidstatus.getText();
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification",dbid));
//			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Approve", "AccountVerificationApprove"));
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoAccountVerification(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber,String ValueDate) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Repair screen is working fine");
		} else {
			System.out.println("Cancel Button from Repair screen is not working");
		}
		record.click();
		String actualerrormsg=errormessages.getText();
		String expectederrormsg="";
		if(actualerrormsg.contains(expectederrormsg)) {
		valuedateBtn.clear();
		valuedateBtn.sendKeys(ValueDate);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		qualifyreceiveokBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		qualifyreceiveconfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
	}
		return new PaymentFlow();
	}
	
	public PaymentFlow deleteRecord(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from PDC Delete screen is working fine");
		} else {
			System.out.println("Cancel Button from PDC Delete screen is not working");
		}
		lineIdCheckbox.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	//Method to move payment from QueuedToDeletePDC status to Delete Status
	public PaymentFlow movetoDelete(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToDeletePDC";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Delete", null));
			System.out.println("Payment moved to Delete status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}//end of movetoDelete function
	
	/*//Method to move payment from QueuedToDeletePDC status to Delete Status
		public PaymentFlow movetoDelete(String ValueDateperiod,String PaymentType, String Reference,
				String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToDeletePDC";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getOracleDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "PDCDelete", null));
				System.out.println("Payment moved to PDCDelete status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();
		}//end of movetoDelete function*/

	
	public PaymentFlow modifyRecord(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber,String PayerBIC) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from PDC Modify screen is working fine");
		} else {
			System.out.println("Cancel Button from PDC Modify screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerbankbiccode.clear();
		payerbankbiccode.sendKeys(PayerBIC);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=pdcmodifyokBtn.getAttribute("Value");
		System.out.println(a);
		pdcmodifyokBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String b=pdcmodifyConfirmBtn.getAttribute("Value");
		System.out.println(b);
		pdcmodifyConfirmBtn.click();
		return new PaymentFlow();
	}
	
///////////////////////////////////////////////////////////////////////////
	
	public PaymentFlow movetoInitialPosting(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedToInitialPosting", null));
			System.out.println("Payment moved to QueuedToInitialPosting status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoSignatureCheck(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "SignatureCheck", null));
			System.out.println("Payment moved to SignatureCheck status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow signatureCheckQueue_Confirm(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow checkPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoSignatureCheck_Insuffifund(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		String dbid=dbidstatus.getText();
		if (expectedStatus.equals(paymentActualstatus)) {
		DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "SignatureCheck", null));
		DI.getSqlDatabaseConnection(DI.insertParsedMessage1(gpkey, "INITPOSTING_FAILURE_ERROR_MSG", "INSUFFICIENT AVAILABLE BALA FOR TRANSACT",dbid));
		System.out.println("Payment moved to SignatureCheck status");
		}
		else{
		System.out.println("Payment status is in " + paymentActualstatus + " ");
	     }
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new PaymentFlow();
	}
	
	public PaymentFlow movetoQueuedToReturnCreation(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedToReturnCreation", null));
			System.out.println("Payment moved to QueuedToReturnCreation status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new PaymentFlow();
	}
	
	 public PaymentFlow movetoException(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
	    	restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToInitialPosting";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Exception", "QueuedToInitialPosting_Exception"));
				System.out.println("Payment moved to Exception status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
	    	return new PaymentFlow();
	    }
	 
	 public PaymentFlow approvePayment(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			lineIdCheckbox.click();
			approveBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();
		}
	 
	 public PaymentFlow approvePayment1(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			record.click();
			approveBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			driver.switchTo().alert().accept();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();
		}
	 
	 public PaymentFlow movetoException1(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
	    	restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToFinalPosting";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Exception","QueuedToFinalPosting_Exception"));
				System.out.println("Payment moved to Exception status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
	    	return new PaymentFlow();
	    }
	 
	 public PaymentFlow movetoCompleted(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToFinalPosting";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Completed", null));
				System.out.println("Payment moved to Completed status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();
		}
	
	 public PaymentFlow signatureCheckQueue_Return(String ValueDateperiod,String PaymentType, String Reference,
				String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2,
				String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
				String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
				String ReasonCode13, String ReasonCode14, String ReasonCode15)
				throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			cancelBtn.click();
			String actualCancelmsg = errormessages.getText();
			String expectedCancelmsg = "Operation was cancelled.";
			if (actualCancelmsg.equals(expectedCancelmsg)) {
				System.out.println("Cancel Button from SignatureCheck screen is working fine");
			} else {
				System.out.println("Cancel Button from SignatureCheck screen is not working");
			}
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			returnBtn.click();
			Thread.sleep(IntfConstants.TIMEOUT);
			String actualalertmsg = alertmsg.getText();
			String expectedalertmsg = "Enter Reason for sending to Return";
			if (actualalertmsg.equals(expectedalertmsg)) {
				System.out.println("Alert message is displayed for Reason field");
				reasonCode.click();
				Select sl = new Select(reasonCode);
				sl.selectByVisibleText(ReasonCode1);
				sl.selectByVisibleText(ReasonCode2);
				sl.selectByVisibleText(ReasonCode3);
				sl.selectByVisibleText(ReasonCode4);
				sl.selectByVisibleText(ReasonCode5);
				sl.selectByVisibleText(ReasonCode6);
				sl.selectByVisibleText(ReasonCode7);
				sl.selectByVisibleText(ReasonCode8);
				sl.selectByVisibleText(ReasonCode9);
				sl.selectByVisibleText(ReasonCode10);
				sl.selectByVisibleText(ReasonCode11);
				sl.selectByVisibleText(ReasonCode12);
				sl.selectByVisibleText(ReasonCode13);
				sl.selectByVisibleText(ReasonCode14);
				sl.selectByVisibleText(ReasonCode15);
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				returnBtn.click();
				Thread.sleep(IntfConstants.TIMEOUT);
			} else {
				System.out.println("Validation failed for Return reason field");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();
		}
	 
	 public PaymentFlow movetoReturned(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToFinalPosting";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Returned", null));
				System.out.println("Payment moved to Returned status");
			} else {
				System.out.println("Payment status is in "+paymentActualstatus+"");
			}
			return new PaymentFlow();
	}//end
	 
	 //-------------------------PDC ONUS PAYMENT FLOW METHODS-----------------------------------
	//Method to check initial payment status for future payment	
	 public PaymentFlow checkInitialPaymentFuturestatus(String ValueDateperiod,String PaymentType, String Reference,
				String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = listScreenStatus.getText();
			System.out.println(paymentActualstatus);
			String expectedStatus = "Future";
			if (expectedStatus.equals(paymentActualstatus)) {
				System.out.println("Payment moved to Future status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + "");
			}
			return new PaymentFlow();
	 }//end of checkInitialPaymentFuturestatus function
	 
	//Method to delete payment from PDCDelete screen
	 public PaymentFlow deletePaymentFromPDCDelete(String ValueDateperiod,String PaymentType, String Reference,
				String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			lineIdCheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			deleteBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new PaymentFlow();

	 }//end of deletePaymentFromPDCDelete function
	 
	 //Method to move payment from QueuedToDeletePDC to Delete status
	 public PaymentFlow QueuedToDeletePDCtoDelete(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = listScreenStatus.getText();
			String expectedStatus = "QueuedToDeletePDC";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Delete", null));
				System.out.println("Payment moved to Delete status");
			} else {
				System.out.println("Payment status is in "+paymentActualstatus+"");
			}
			return new PaymentFlow();
	}//end of QueuedToDeletePDCtoDelete function
	 
	 
	 public PaymentFlow QueuedToAddPDCtoFuturestatus(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
				String ChequeNo, String AccountNumber) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = listScreenStatus.getText();
			String expectedStatus = "QueuedToAddPDC";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Future", null));
				System.out.println("Payment moved to Future status");
			} else {
				System.out.println("Payment status is in "+paymentActualstatus+"");
			}
			return new PaymentFlow();
	}//end
	 
	 
	 //Method to check payment status for PDC Flow
	 public PaymentFlow checkPaymentstatusforPDCFlow(String ValueDateperiod,String PaymentType, String Reference,
			 String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			String paymentActualstatus = listScreenStatus.getText();
			System.out.println("Payment moved to " + paymentActualstatus + " status");
			return new PaymentFlow();
	 }//end of checkPaymentstatusforPDCFlow function
	 
	//Method to click on ok button on PDC modify Screen	
	 public PaymentFlow okbuttontab() throws InterruptedException
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Actions act=new Actions(driver);
			for (int i=0; i<=18; i++)
			{
				act.sendKeys(Keys.TAB).perform();
			}
//			act.sendKeys(Keys.TAB).perform(); -- 20 times
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//			driver.switchTo().alert().accept();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			return new  PaymentFlow();
			
		}//end of okbuttontab function

		
		//Method for ConfirmBtnClicking on PDCModify Screen
		public PaymentFlow confirmbuttontab() throws InterruptedException
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Actions act=new Actions(driver);
			
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//			ModifyScreenFrame.click();
		
			for (int i=0; i<=4; i++)
			{
				
				act.sendKeys(Keys.TAB).perform();
				Thread.sleep(100);

			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			return new PaymentFlow();
		}//end of confirmbuttontab function
		
		public PaymentFlow modifyRecordforPDCFlow(String ValueDateperiod,String PaymentType, String Reference,
				String SubRef, String ChequeNo, String AccountNumber,String PayerBIC) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			cancelBtn.click();
			driver.switchTo().alert().accept();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			String actualCancelmsg = errormessages.getText();
			String expectedCancelmsg = "Operation was cancelled.";
			if (actualCancelmsg.equals(expectedCancelmsg)) {
				System.out.println("Cancel Button from PDC Modify screen is working fine");
			} else {
				System.out.println("Cancel Button from PDC Modify screen is not working");
			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Actions act=new Actions(driver);	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			for (int i=0; i<=5; i++)
			{
				
				act.sendKeys(Keys.TAB).perform();
				Thread.sleep(100);
			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			payerbankbiccode.clear();
			payerbankbiccode.sendKeys(PayerBIC);
			act.sendKeys(Keys.TAB).perform();
			return new PaymentFlow();
		}


	 
}