package com.pibc.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.pages.OutwardPaymentPage;
import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.Windowhandle;

public class OutwardPaymentPage extends TestBase {

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

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[20]")
	WebElement listScreenStatus;

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
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	@FindBy(id = "0")
	WebElement approveCheckBoxPDCDeletePage;
	
	@FindBy(name = "delete")
	WebElement DeleteBtnPDCDeletePg;
	
	@FindBy(name="payTranBeneBankLkpValue")
	WebElement payerbankbiccode;
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyokBtn;
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyConfirmBtn;


	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;
	
	
	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(id = "btnViewSwitch")
	WebElement FullPageviewBtn;
	
	@FindBy(name="fileType")
	WebElement fileType;
	
	@FindBy(name="file")
	WebElement file;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")
	WebElement uploadBtn;
	

	
	// Constructor to invoke above elements
	public OutwardPaymentPage() {
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
			DI.getSqlDatabaseConnection(DI.updatePaymentstatus());
			System.out.println("Query Executed");
		} else {
			System.out.println("-----Payment status is not in QueuedToPayment----");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}
	
	// --Filter method for Cheque data entry list for PDCDeleteFlow
		public void chqDataEntryFilterforPDCDeleteFlow(String chequeno, String payeraccount) throws InterruptedException {

			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			payerAccountTextfield.sendKeys(payeraccount);
			chqNumberTextField.sendKeys(chequeno);
			btnOk.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			// record.click();
			String actualStatus = statusText.getText();
			String expectedStatus = "QueuedToPayment";

			if (actualStatus.contains(expectedStatus)) {
				//DI.getSqlDatabaseConnection(DI.updatePaymentstatus());
				System.out.println("Payment is in Queued To Payment");
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
	public OutwardPaymentPage checkInitialPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}
		return new OutwardPaymentPage();
	}

	public OutwardPaymentPage QueuedToAccountVerificationToApprove(Windowhandle win, String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid = dbidstatus.getText();
		System.out.println(dbid);
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("in if for update to approve");
			DI.getSqlDatabaseConnection(DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification", dbid));
//			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery2(gpkey, "Approve", "AccountVerificationApprove","GP_APP_MOD"));
			System.out.println("Payment moved to Approve status");
		}
		else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}

	// --Method to approve the record
	public OutwardPaymentPage approvePayment(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		approveCheckBox.click();
		btnApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}

	public OutwardPaymentPage movetoQueuedToOutFile(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToOutPresentCheque";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedTo OutFile", null));
			System.out.println("Payment moved to QueuedTo OutFile status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		return new OutwardPaymentPage();
	}

	public OutwardPaymentPage checkPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new OutwardPaymentPage();
	}
	
	public OutwardPaymentPage checkPaymentstatus1(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new OutwardPaymentPage();
	}

	// ------------------Duplicate Flow Method------------------------//

	public OutwardPaymentPage checkInitialDuplicateStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentDuplicateStatus = status.getText();
		System.out.println("Payment is in " + paymentDuplicateStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}

	public OutwardPaymentPage allowDuplicate(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnAllowDuplicate.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();

		return new OutwardPaymentPage();
	}

	//------------Repair Flow Methods--------------//
	
	public OutwardPaymentPage checkInitialRepairStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentRepairStatus=status.getText();
		System.out.println("Payment is in " + paymentRepairStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}
	
	public OutwardPaymentPage repairPayment(String ValueDateperiod, String Reference, String SubRef,
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
		return new OutwardPaymentPage();
	}
	
	//-----------------------PDC FLOW METHODS------------------------
	//Methods to check initial payment status for PDC payment
		public OutwardPaymentPage checkInitialPaymentstatusforPDCFlow(String ValueDateperiod, String Reference, String SubRef,
				String ChequeNo) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
			String paymentActualstatus = listScreenStatus.getText();
			System.out.println(paymentActualstatus);
			String expectedStatus = "QueuedToAccountVerification";
			if (expectedStatus.equals(paymentActualstatus)) {
				System.out.println("Payment moved to QueuedToAccountVerification status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + "");
			}
			return new OutwardPaymentPage();
	}//end of checkInitialPaymentstatusforPDCFlow function

	//Method to move payment from QueuedToAccountVerification to Approve Status for PDC Payment
	public OutwardPaymentPage QueuedToAccountVerificationToApproveforPDC(Windowhandle win, String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid = dbidstatus.getText();
		System.out.println(dbid);
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("in if for update to approve");
			DI.getSqlDatabaseConnection(DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification", dbid));
//				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery2(gpkey, "Approve", "AccountVerificationApprove", "GP_APP_MOD"));
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}//end of QueuedToAccountVerificationToApproveforPDC function 

	//Method to check initial status for future payment
	public OutwardPaymentPage checkInitialFutureStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentFutureStatus = listScreenStatus.getText();
		System.out.println("Payment is in " + paymentFutureStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	}//end of checkInitialFutureStatus function
	

	//Method to delete outward pdc payment from PDCDelete Screen
	public OutwardPaymentPage DeletePDC(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveCheckBoxPDCDeletePage.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		DeleteBtnPDCDeletePg.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of DeletePDC function
	

	//Method to move payment from QueuedToDeletePDC status to Delete Status
	public OutwardPaymentPage QueuedToDeletePDCtoDelete(String ValueDateperiod, String Reference,
			String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToDeletePDC";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Delete", null));
			System.out.println("Payment moved to Delete status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new OutwardPaymentPage();
	}//end of movetoDelete function
	
	//Method to move payment from QueuedToAddPDC status QueuedToPDCCommision Status
	public OutwardPaymentPage QueuedToAddPDCToQueuedToPDCCommision(String ValueDateperiod, String Reference,
			String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToAddPDC";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "QueuedToPDCCommision", null));
			System.out.println("Payment moved to QueuedToPDCCommision status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new OutwardPaymentPage();
	}//end of QueuedToAddPDCToQueuedToPDCCommision function

	//Method to move payment from QueuedToPDCCommision to Future  Status
		public OutwardPaymentPage QueuedToPDCCommisiontoFuture(String ValueDateperiod, String Reference,
				String SubRef, String ChequeNo) throws InterruptedException {
			restartWorkflow.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
			String paymentActualstatus = listScreenStatus.getText();
			String expectedStatus = "QueuedToPDCCommision";
			if (expectedStatus.equals(paymentActualstatus)) {
				DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Future", null));
				System.out.println("Payment moved to Future status");
			} else {
				System.out.println("Payment status is in " + paymentActualstatus + " ");
			}
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new OutwardPaymentPage();
	}//end of QueuedToPDCCommisiontoFuture function


	//Method to check payment status 
	public OutwardPaymentPage checkPaymentstatusforPDCFlow(String ValueDateperiod, String Reference, String SubRef,
				String ChequeNo) throws InterruptedException {
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
			String paymentActualstatus = listScreenStatus.getText();
			System.out.println("Payment moved to " + paymentActualstatus + " status");
			return new OutwardPaymentPage();
	}//end of checkPaymentstatusforPDCFlow function
	
	//Method to modify record from PDCModify
	public OutwardPaymentPage modifyRecord(String ValueDateperiod, String Reference,
			String SubRef, String ChequeNo,String PayerBIC) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
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
		FullPageviewBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerbankbiccode.clear();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerbankbiccode.sendKeys(PayerBIC);
		//Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		//String a=pdcmodifyokBtn.getAttribute("Value");
		//System.out.println(a);
		//pdcmodifyokBtn.click();
		//Thread.sleep(IntfConstants.TIMEOUT);
		//pdcmodifyConfirmBtn.click();
		//String b=pdcmodifyConfirmBtn.getAttribute("Value");
		//System.out.println(b);
		return new OutwardPaymentPage();
	}//end of modifyRecord function
	
	
	//Method to click on Okbtn on PDCModify screen
	public  OutwardPaymentPage okbuttontab() throws InterruptedException
	{
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Actions act=new Actions(driver);
		for (int i=0; i<42; i++)
		{
			act.sendKeys(Keys.TAB).perform();
		}
//		act.sendKeys(Keys.TAB).perform(); -- 20 times
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		return new  OutwardPaymentPage();
		
	}//end of okbuttontab function

	
	//Method for ConfirmBtnClicking on PDCModify Screen
	public OutwardPaymentPage confirmbuttontab() throws InterruptedException
	{
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Actions act=new Actions(driver);
	
		for (int i=0; i<25; i++)
		{
			//Thread.sleep(100);
			act.sendKeys(Keys.TAB).perform();

		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		return new OutwardPaymentPage();
	}//end of confirmbuttontab function
	
	//Method to move payment from QueuedToAddPDC to Future  Status
	public OutwardPaymentPage QueuedToAddPDCtoFuture(String ValueDateperiod, String Reference,
			String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = listScreenStatus.getText();
		String expectedStatus = "QueuedToAddPDC";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getSqlDatabaseConnection(DI.getSqlUpdateQuery(gpkey, "Future", null));
			System.out.println("Payment moved to Future status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new OutwardPaymentPage();
	}//end of QueuedToPDCCommisiontoFuture function
	
	//trial
	public void uploadInwardFile(String FileType,String FilePath) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileType.click();
		Select sl=new Select(fileType);
		sl.selectByVisibleText(FileType);
		file.sendKeys(FilePath);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		uploadBtn.click();
	}


	public void outwardPageLogOut() {
		btnLogout.click();
		extBtnLogout.click();

	}
}
