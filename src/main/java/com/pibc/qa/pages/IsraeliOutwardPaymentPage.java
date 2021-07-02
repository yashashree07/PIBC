package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.Windowhandle;

public class IsraeliOutwardPaymentPage extends TestBase{
	DatabaseIntegrity DI = new DatabaseIntegrity();
	String gpkey = null;

	// -------------- Cheque Data EntryList menu xpath----------//

	@FindBy(name = "payerAccount")
	WebElement payerAccountTextfield;

	@FindBy(name = "chequeNumber")
	WebElement chqNumberTextField;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	// --------------Payment List menu xpath-------------------//
	@FindBy(name = "content(periodValueDate)")
	WebElement periodValueDate;

	@FindBy(name = "content(referenceOption)")
	WebElement referenceOption;

	@FindBy(name = "content(referenceTest)")
	WebElement referenceTest;

	@FindBy(name = "content(reference)")
	WebElement chequenoTextfield;

	@FindBy(xpath = "//input[@id='btnAll']")
	WebElement btnGetAll;

	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(name = "payTranPrim")
	WebElement gpKey;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[10]")
	WebElement statusText;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[19]")
	WebElement status;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[22]")
	WebElement dbidstatus;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	// Approve menu xpath
	@FindBy(id = "0")
	WebElement approveCheckBox;

	@FindBy(name = "approve")
	WebElement btnApprove;

	// Duplicate page menu xpath
	@FindBy(xpath = "//input[@value='Allow Duplicate']")
	WebElement btnAllowDuplicate;

	@FindBy(xpath = "//input[@value='To Repair']")
	WebElement btnToRepair;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement btnCancel;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOK;

	@FindBy(name = "btnOk")
	WebElement btnConfirm;

	// Repair page menu xpath
	@FindBy(name="payTranValueDate")
	WebElement calendarTextField;
	
	@FindBy(name="btnOk")
	WebElement repairBtnOk;
	
	// logout btn
	@FindBy(id = "logoutButtonId")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	@FindBy(name="requestType")
	WebElement RequestType;
	
	@FindBy(name="Create")
	WebElement createBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement outFileRequestViewScreenStatusDropDown;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement outFileRequestViewScreenSubmitBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[2]/tbody/tr[2]")
	WebElement outFileRequestCreateScreenRecord;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement outFileRequestViewScreenRecordId;
	
	@FindBy(xpath="//tr[2]//[@class='rowcoloreven ln_highlight']")
	WebElement outFileRequestViewScreenRecord;
	

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement outFileRequestViewScreenRecordStatus;
	
	@FindBy(name="fileType")
	WebElement fileType;
	
	@FindBy(name="file")
	WebElement file;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")
	WebElement uploadBtn;
	
	@FindBy(name="fileName")
	WebElement fileName;
	
	@FindBy(name = "periodDate")
	WebElement PeriodDate;
	
	@FindBy(xpath = "//*[@id=\"mainForm\"]/table/tbody/tr/td/table/tbody/tr[8]/td/input[2]")
	WebElement okBtnFileViewScreen;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[7]")
	WebElement fileStatus;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement fileNameFileViewScreen;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[3]")
	WebElement ApproveScreenText;


	
	// Constructor to invoke above elements
	public IsraeliOutwardPaymentPage() {
		PageFactory.initElements(driver, this);
	}

	// --Filter method for Cheque data entry list
	public void chqDataEntryFilter(String chequeno, String payeraccount) throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerAccountTextfield.sendKeys(payeraccount);
		chqNumberTextField.sendKeys(chequeno);
		btnOk.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		// record.click();
		String actualStatus = statusText.getText();
		String expectedStatus = "QueuedToPayment";

		if (actualStatus.contains(expectedStatus)) {
			DI.getOracleDatabaseConnection(DI.updatePaymentstatus());
			System.out.println("Query Executed");
		} else {
			System.out.println("-----Payment status is not in QueuedToPayment----");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}
	
	public void chqDataEntryFilterIsraeliOutward(String chequeno, String payeraccount) throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerAccountTextfield.sendKeys(payeraccount);
		chqNumberTextField.sendKeys(chequeno);
		btnOk.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		// record.click();
		String actualStatus = statusText.getText();
		String expectedStatus = "QueuedToPayment";

		if (actualStatus.contains(expectedStatus)) {
			DI.getOracleDatabaseConnection(DI.updateIsraeliPaymentstatus());
			System.out.println("Query Executed");
		} else {
			System.out.println("-----Payment status is not in QueuedToPayment----");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}


	// --Filter method for Payment list
	public void filterScreen(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1 = new Select(referenceOption);
		sl1.selectByVisibleText(Reference);
		Select sl2 = new Select(referenceTest);
		sl2.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequenoTextfield.clear();
		chequenoTextfield.sendKeys(ChequeNo);
		btnGetAll.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		gpkey = gpKey.getAttribute("Value");
		System.out.println(gpkey);

	}

	// For Normal filter without gpkey
	public void filterScreen1(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequenoTextfield.clear();
		chequenoTextfield.sendKeys(ChequeNo);
		btnGetAll.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	public void filterwithGpkey(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
	}

	// ---Methods to move from one status to other
	public IsraeliOutwardPaymentPage checkInitialPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}

		return new IsraeliOutwardPaymentPage();
	}
	
	// ---Method to check initial payment status for israeli outward flow
	public IsraeliOutwardPaymentPage checkInitialPaymentstatusForIsraeliFlow(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}

		return new IsraeliOutwardPaymentPage();
	}//end of checkInitialPaymentstatusForIsraeliFlow


	public IsraeliOutwardPaymentPage QueuedToAccountVerificationToApprove(Windowhandle win, String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid = dbidstatus.getText();
		System.out.println("dbid is:" +dbid);
		if (expectedStatus.equals(paymentActualstatus)) {
//			int updatedPrevStatus = DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery1(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification"));
//			System.out.println("status isssss:" +updatedPrevStatus);
//			if (1 == updatedPrevStatus) {
//				long msgid = DI.getOracleDatabaseConnectionForSelectParseMsgId(DI.getparsedmsg());
//				msgid++;
//				System.out.println("msg id is:" +msgid);
//				DI.getOracleDatabaseConnection(DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification", msgid,dbid));
//			}
//			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Approve", "AccountVerificationApprove"));
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}

	// --Method to approve the record
	public IsraeliOutwardPaymentPage approvePayment(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnApprove.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}
	
	// --Method to approve the record
	public IsraeliOutwardPaymentPage approvePaymentforDuplicatePayment(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnApprove.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String Approve_Screen_Text="Approve payments";
		if(ApproveScreenText.getText().equals(Approve_Screen_Text))
		{
			//System.out.println("in if");
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			btnApprove.click();
			driver.switchTo().alert().accept();
			
		
		}
		else
		{
			//System.out.println("in else");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			btnLogout.click();
			extBtnLogout.click();
			driver.quit();
			return new IsraeliOutwardPaymentPage();
		
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}
	
	// --Method to approve the record
	public IsraeliOutwardPaymentPage approvePaymentforRepairPayment(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnApprove.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String Approve_Screen_Text="Approve payments";
		if(ApproveScreenText.getText().equals(Approve_Screen_Text))
		{
			//System.out.println("in if");
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			btnApprove.click();
			driver.switchTo().alert().accept();
			
		
		}
		else
		{
			//System.out.println("in else");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			btnLogout.click();
			extBtnLogout.click();
			driver.quit();
			return new IsraeliOutwardPaymentPage();
		
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}




	public IsraeliOutwardPaymentPage movetoQueuedToOutFile(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToOutPresentCheque";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedTo OutFile", null));
			System.out.println("Payment moved to QueuedTo OutFile status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		return new IsraeliOutwardPaymentPage();
	}
	
	
	//Method to move payment to QueuedToOutReply to Complted status
		public IsraeliOutwardPaymentPage QueuedToOutReplyToCompleted(String ValueDateperiod, String Reference, String SubRef,
				String ChequeNo) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
			String paymentActualstatus = status.getText();
			String expectedStatus = "QueuedToOutReplyCheque";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Completed", null));
				System.out.println("Payment moved to Completed status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			restartWorkflow.click();
			return new IsraeliOutwardPaymentPage();
	}//end of QueuedToOutReplyToCompleted function
	

	public IsraeliOutwardPaymentPage checkPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new IsraeliOutwardPaymentPage();
	}

	// ------------------Duplicate Flow Method------------------------//

	public IsraeliOutwardPaymentPage checkInitialDuplicateStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentDuplicateStatus = status.getText();
		System.out.println("Payment is in " + paymentDuplicateStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}
	
	// Method to move payment to QueuedToOutReply to Returned status
	public IsraeliOutwardPaymentPage QueuedToOutReplyToReturned(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToOutReplyCheque";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Returned", null));
			System.out.println("Payment moved to Returned status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		return new IsraeliOutwardPaymentPage();
	}// end of QueuedToOutReplyToReturnedfunction


	public IsraeliOutwardPaymentPage allowDuplicate(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnAllowDuplicate.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();

		return new IsraeliOutwardPaymentPage();
	}

	//------------Repair Flow Methods--------------//
	
	public IsraeliOutwardPaymentPage checkInitialRepairStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentRepairStatus=status.getText();
		System.out.println("Payment is in " + paymentRepairStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}
	
	public IsraeliOutwardPaymentPage repairPayment(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo, String date) throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarTextField.clear();
		calendarTextField.sendKeys(date);
		repairBtnOk.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new IsraeliOutwardPaymentPage();
	}//end
	
	//Method to create OutFile Request from Outfile Request screen
	public IsraeliOutwardPaymentPage OutfileRequestCreation(String Request_Type) throws InterruptedException {
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
		return new IsraeliOutwardPaymentPage();
	}//end of OutfileRequestCreation function
	
	//Method to view payment from OutfileRequestView screen
	public IsraeliOutwardPaymentPage OutfileRequestView(String Request_Type,String Status) throws InterruptedException {
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
		return new IsraeliOutwardPaymentPage();
	}//end of OutfileRequestView function
	
	//Method to check Status of Payment from OutFileRequestViewScreen
	public IsraeliOutwardPaymentPage OutfileRequestViewScreenStatusCheck() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String OutfileViewScreenRecordID=outFileRequestViewScreenRecordId.getText();
		System.out.println("Request ID : " + OutfileViewScreenRecordID);
		//outFileRequestViewScreenRecord.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String OutFile_RequestViewScreen_Status=outFileRequestViewScreenRecordStatus.getText();
		System.out.println("Status of " + OutfileViewScreenRecordID + " is : " + OutFile_RequestViewScreen_Status);
		return new IsraeliOutwardPaymentPage();
	}//end of OutfileRequestViewScreenStatusCheck function

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
		public IsraeliOutwardPaymentPage checkPaymentStatusFromFileViewScreen(String FileName,String Period,String FileType) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			fileName.sendKeys(FileName);
			Select sl = new Select(PeriodDate);
			sl.selectByVisibleText(Period);
			fileType.click();
			Select s2=new Select(fileType);
			s2.selectByVisibleText(FileType);
			okBtnFileViewScreen.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			String File_Name=fileNameFileViewScreen.getText();
			System.out.println("File Name : " +File_Name);	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			String FileStatus=fileStatus.getText();
			System.out.println("File status " + FileStatus + "");
			return new IsraeliOutwardPaymentPage();
		}//end of checkPaymentStatusFromFileViewScreen function 



	
	public void israeliOutwardPageLogOut() {
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}


}
