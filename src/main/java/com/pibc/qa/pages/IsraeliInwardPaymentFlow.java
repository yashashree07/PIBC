package com.pibc.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;


import com.pibc.qa.base.TestBase;
import com.pibc.qa.util.Windowhandle;
import com.pibc.qa.constants.IntfConstants;

public class IsraeliInwardPaymentFlow extends TestBase{
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

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[20]")
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
	
	@FindBy(name="chequeNumber")
	WebElement chequeNumber;
	
	@FindBy(name="payerAccount")
	WebElement payerAccount;

	@FindBy(xpath="//*[@id=\"btnOk\"]")
	WebElement InsufficientFundConfirmBtn2;
	
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td")
	WebElement ModifyScreenFrame;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/div/table/tbody/tr[2]/td/input[2]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[9]")
	WebElement chequeType;

	@FindBy(name="fileType")
	WebElement fileType;
	
	@FindBy(name="file")
	WebElement file;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")
	WebElement uploadBtn;
	
	@FindBy(xpath="//tr[2]//td[10]")
	WebElement chequedataentrystatus;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement fileName;
	
	@FindBy(name = "periodDate")
	WebElement PeriodDate;
	
	@FindBy(xpath = "//*[@id=\"mainForm\"]/table/tbody/tr/td/table/tbody/tr[8]/td/input[2]")
	WebElement okBtnFileViewScreen;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[7]")
	WebElement fileStatus; 
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr[1]/td[2]/select/option[1]")
	WebElement fileType1;
	
	@FindBy(name = "content(startValueDate)")
	WebElement startValueDate;
	
	@FindBy(name = "content(isHistory)")
	WebElement isHistoryCheckBox;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement outFileRequestViewScreenStatusDropDown;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement outFileRequestViewScreenSubmitBtn;
	
	@FindBy(name="requestType")
	WebElement RequestType;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[2]/tbody/tr[2]")
	WebElement outFileRequestCreateScreenRecord;
	
	@FindBy(name="Create")
	WebElement createBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement outFileRequestViewScreenRecordId;
	
	@FindBy(xpath="//tr[2]//[@class='rowcoloreven ln_highlight']")
	WebElement outFileRequestViewScreenRecord;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement outFileRequestViewScreenRecordStatus;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement SignatureCheckScreenText;
	
	@FindBy(name="btnOk")
	WebElement InsufficientFundBtn;
	
	// Constructor to invoke above elements
		public IsraeliInwardPaymentFlow() {
			PageFactory.initElements(driver, this);
	}
	
	
	//Method to upload inward .txt file through file manager screen
	public void uploadInwardFile(String FileType,String FilePath) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileType.click();
		Select sl=new Select(fileType);
		sl.selectByVisibleText(FileType);
		file.sendKeys(FilePath);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		uploadBtn.click();
	}//end of uploadInwardFile function
	
	//Method to check status of Cheque on FileViewScreen
	public IsraeliInwardPaymentFlow checkPaymentStatusFromFileViewScreen(String FileName,String Period,String FileType) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		fileName.sendKeys(FileName);
		Select sl = new Select(PeriodDate);
		sl.selectByVisibleText(Period);
		fileType.click();
		Select s2=new Select(fileType);
		s2.selectByVisibleText(FileType);
		okBtnFileViewScreen.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String File_Name=fileName.getText();
		System.out.println("File Name : " +File_Name);	
		String FileStatus=fileStatus.getText();
		System.out.println("File status " + FileStatus + "");
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of checkPaymentStatusFromFileViewScreen function 
	
	public IsraeliInwardPaymentFlow logout() {
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
//----ISRAELI---
	public void filterwithGpkey(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
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
	
	//Method to filter Screen for Israeli Inward Payment  after EOD and SOD
	public void filterScreenforIsraeli(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber,String StartValueDate) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		startValueDate.clear();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		startValueDate.sendKeys(StartValueDate);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		//endValueDate.clear();
		//Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		//endValueDate.sendKeys(EndValueDate);
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
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		isHistoryCheckBox.click();
		getAllBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	}//end
	
	
	public IsraeliInwardPaymentFlow checkInitialPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
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
		return new IsraeliInwardPaymentFlow();
	}

	public IsraeliInwardPaymentFlow movetoQueuedToInitialPosting(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedToInitialPosting", null));
			System.out.println("Payment moved to QueuedToInitialPosting status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	
	}
	
	public IsraeliInwardPaymentFlow movetoSignatureCheck(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "SignatureCheck", null));
			System.out.println("Payment moved to SignatureCheck status");
		} 
		else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of moveToSignatureCheck function
	
	public IsraeliInwardPaymentFlow signatureCheckQueue_Confirm(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		confirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of signatureCheckQueue_Confirm function
	
	public IsraeliInwardPaymentFlow checkPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new IsraeliInwardPaymentFlow();
	
	}
	
	public IsraeliInwardPaymentFlow acceptfromSignatureCheckApproveQueue(String ValueDateperiod,String PaymentType,
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
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
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
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end
	


	public IsraeliInwardPaymentFlow signatureCheckQueue_ReturnForIsraeliInwardFlow(String ValueDateperiod,
			String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,
			String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4) throws InterruptedException
	{
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
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		returnBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			entermemo.click();
			entermemo.sendKeys(ReasonCode1,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode2,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode3,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode4);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			returnBtn.click();
			String signatureCheckScreenText="Signature Check";
			if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
			{
				System.out.println("in if");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				returnBtn.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				String actualalertmsg1 = alertmsg.getText();
				String expectedalertmsg1 = "Enter Reason for sending to Return";
				if (actualalertmsg1.equals(expectedalertmsg1)) {
					System.out.println("Alert message is displayed for Reason field");
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					entermemo.click();
					entermemo.sendKeys(ReasonCode1,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode2,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode3,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode4);
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					returnBtn.click();
				}
				
			}//end of if
			else
			{
				System.out.println("in else");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new IsraeliInwardPaymentFlow();

			}
		
			
		} else {
			System.out.println("Validation failed for Return reason field");
		
		}
	
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow QueuedToIsraeliReturnCreation(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedToIsraeliReturnCreation", null));
			System.out.println("Payment moved to QueuedToIsraeliReturnCreation status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow OutfileRequestCreation(String Request_Type) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		RequestType.click();
		Select s1=new Select(RequestType);
		s1.selectByVisibleText(Request_Type);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		if(outFileRequestCreateScreenRecord.isDisplayed())
		{
			//System.out.println("in if loop ");
			createBtn.click();
			
		}
		else
		{
			System.out.println("Record not found");
		}
		return new IsraeliInwardPaymentFlow();
	}//end of OutfileRequestCreation function
	 
	//Method to view payment from OutfileRequestView screen
			public IsraeliInwardPaymentFlow OutfileRequestView(String Request_Type,String Status) throws InterruptedException {
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				RequestType.click();
				Select s1=new Select(RequestType);
				s1.selectByVisibleText(Request_Type);
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				outFileRequestViewScreenStatusDropDown.click();
				Select s2=new Select(outFileRequestViewScreenStatusDropDown);
				s2.selectByVisibleText(Status);
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				outFileRequestViewScreenSubmitBtn.click();
				return new IsraeliInwardPaymentFlow();
			}//end of OutfileRequestView function
	
			public IsraeliInwardPaymentFlow OutfileRequestViewScreenStatusCheck() throws InterruptedException {
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				String OutfileViewScreenRecordID=outFileRequestViewScreenRecordId.getText();
				System.out.println("Request ID : " + OutfileViewScreenRecordID);
				//outFileRequestViewScreenRecord.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				String OutFile_RequestViewScreen_Status=outFileRequestViewScreenRecordStatus.getText();
				System.out.println("Status of " + OutfileViewScreenRecordID + "is" + OutFile_RequestViewScreen_Status);
				return new IsraeliInwardPaymentFlow();
			}//end of OutfileRequestViewScreenStatusCheck function
			
		
			public IsraeliInwardPaymentFlow movetoSignatureCheck_InsufficientFund(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
					String ChequeNo, String AccountNumber) throws InterruptedException 
			{
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
				return new IsraeliInwardPaymentFlow();
			}
				
				
				
				
				
				
				
				
				
				
//				
//				restartWorkflow.click();
//				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//				filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
//				String paymentActualstatus = status.getText();
//				String expectedStatus = "QueuedToInitialPosting";
//				String dbID=dbidstatus.getText();
//				if (expectedStatus.equals(paymentActualstatus)) 
//				{
//					int statusUpdate = DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "SignatureCheck", null));
//					System.out.println("status update variable value"+statusUpdate);
//					if(1 == statusUpdate) 
//					{
//					 long msgid=DI.getSqlDatabaseConnectionForSelectParseMsgId(DI.getparsedmsg());
//					 msgid++;
//					 System.out.println("message id printed:"+msgid);
//					 DI.getSqlDatabaseConnection(DI.insertParsedMessage2(gpkey, "INITPOSTING_FAILURE_ERROR_MSG", "INSUFFICIENT AVAILABLE BALA FOR TRANSACT", msgid,dbID));
//					 System.out.println("Payment moved to SignatureCheck status");
//					}
//				
////				   System.out.println("payment status"+paymentActualstatus);
//				}
//				
//				else {
//					System.out.println("Payment status is in " + paymentActualstatus + " ");
//				}
//					Thread.sleep(IntfConstants.TIMEOUT);
//				logOutBtn.click();
//				logoutBtn.click();
//				driver.quit();
//				return new IsraeliInwardPaymentFlow();
//				}//end of moveToSignatureCheck_InsufficientFund function
//			
			public IsraeliInwardPaymentFlow SignatureCheckQueueConfirmforInsufficientFlow(String ValueDateperiod,String PaymentType, String Reference,
					String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
				Thread.sleep(IntfConstants.TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				confirmBtn.click();
				String signatureCheckScreenText="Signature Check";
				if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
				{
					System.out.println("in if");
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					record.click();
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					confirmBtn.click();
					
				}//end of if
				else
				{
					System.out.println("in else");
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					logOutBtn.click();
					logoutBtn.click();
					driver.quit();
					return new IsraeliInwardPaymentFlow();

				}//end of else
				
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new IsraeliInwardPaymentFlow();
			}//end of signatureCheckQueue_Confirm function
			
			public IsraeliInwardPaymentFlow InsufficientFundConfirm(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
					String ChequeNo, String AccountNumber) throws InterruptedException {
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				cancelBtn.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				driver.switchTo().alert().accept();
				String actualCancelmsg = errormessages.getText();
				String expectedCancelmsg = "Operation was cancelled.";
				if (actualCancelmsg.equals(expectedCancelmsg)) {
					System.out.println("Cancel Button from Insufficient Fund screen is working fine");
				} else {
					System.out.println("Cancel Button from from Insufficient Fund screen is not working");
				}
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				InsufficientFundBtn.click();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				cancelBtn.click();
				driver.switchTo().alert().accept();
				String actualCancelmsg1 = errormessages.getText();
				String expectedCancelmsg1 = "Operation was cancelled.";
				if (actualCancelmsg1.equals(expectedCancelmsg1)) {
					System.out.println("Cancel Button from Insufficient Fund Confirm screen is working fine");
				} else {
					System.out.println("Cancel Button from from Insufficient Fund Confirm screen is not working");
				}
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				InsufficientFundBtn.click();
				Thread.sleep(IntfConstants.LONG_TIMEOUT);
				InsufficientFundConfirmBtn2.click();
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new IsraeliInwardPaymentFlow();
			}//end
			
			
			public  IsraeliInwardPaymentFlow movetoInsufficientFundApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
					String ChequeNo, String AccountNumber) throws InterruptedException {
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				approveBtn.click();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				driver.switchTo().alert().accept();
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new  IsraeliInwardPaymentFlow();
			}//end of movetoInsufficientFundApprove function


			
			
			
}
