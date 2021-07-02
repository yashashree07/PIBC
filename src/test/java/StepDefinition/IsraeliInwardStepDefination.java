package StepDefinition;


import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.EnvironmentPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.IsraeliInwardPaymentFlow;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.OutwardPaymentPage;
import com.pibc.qa.util.Windowhandle;
import org.junit.Assert;
import io.cucumber.java.en.Then;


public class IsraeliInwardStepDefination extends TestBase{
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	IsraeliInwardPaymentFlow israeliInwardPaymentFlow;
	OutwardPaymentPage outwardPg;
	EnvironmentPage environmentPage;
	Windowhandle win;
	
	
	@Then("To check whether Inward file gets uploaded using {string},{string}")
	public void to_check_whether_Inward_file_gets_uploaded_using(String FileType, String FilePath) throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    israeliInwardPaymentFlow=homePage.clickonFileManagerFileUploadLink();
	    israeliInwardPaymentFlow.uploadInwardFile(FileType, FilePath);
	    israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkIsraeli_Inward_Cheque_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end

	
	
	@Then("To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using {string},{string},{string}")
	public void to_check_whether_cheque_data_entry_move_to_QueuedToPayment_status_using(String FileName, String Period,String FileType) throws InterruptedException 
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
		
	}//end 
	

	@Then("To check whether Cheque data entry gets Completed for Israeli Payment Flow using {string},{string},{string}")
	public void to_check_whether_Cheque_data_entry_gets_Completed_using(String FileName, String Period,String FileType) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkIsraeli_Inward_Cheque_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
	}//end
	
	@Then("disable Israeli_Inward_Cheque_Server")
	public void disable_Cheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.disableIsraeli_Inward_Cheque_Server();
		environmentPage.LogOut();
		driver.quit();
	}

//	--------------------
//	ISRAELI INWARD
//	--------------------
	

@Then("validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_QueuedToAccountVerification_status_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);


}

@Then("validate whether payment move to QueuedToIntitalPosting status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_QueuedToIntitalPosting_status_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoQueuedToInitialPosting(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
//	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck_InsufficientFund(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	

}

@SuppressWarnings("deprecation")
@Then("validate whether payment move to SignatureCheck status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_SignatureCheck_status_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
		throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);


}

@Then("validate whether payment gets approved from SignatureCheck for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_gets_approved_from_SignatureCheck_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.signatureCheckQueue_Confirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
   
}

@Then("validate whether payment move to SignatureCheckApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_SignatureCheckApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 

throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
}

@Then("validate whether payment gets approved from SignatureCheckApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_gets_approved_from_SignatureCheckApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
 throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickSignatureCheckApproveLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.acceptfromSignatureCheckApproveQueue(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
   
}

@Then("validate whether payment move to PendingSettlement for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_PendingSettlement_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
		throws InterruptedException 
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
}

@Then("To check whether IsraeliInward file gets uploaded using {string},{string}")
public void to_check_whether_IsraeliInward_file_gets_uploaded_using(String FileType, String FilePath)
throws InterruptedException
{
	driver.switchTo().frame("toc");
    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
    israeliInwardPaymentFlow=homePage.clickonFileManagerFileUploadLink();
    israeliInwardPaymentFlow.uploadInwardFile(FileType, FilePath);
    israeliInwardPaymentFlow.logout();
}

@Then("To check whether file status changes to QueuedToPayment status for Israeli Payment Flow using {string},{string},{string}")
public void to_check_whether_file_status_changes_to_QueuedToPayment_status_for_Israeli_Payment_Flow_using(String FileName, String Period, String FileType)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage( );
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
	
}

@Then("To check whether file status changes to Completed status for Israeli Payment Flow using {string},{string},{string}")
public void to_check_whether_file_status_changes_to_Completed_status_for_Israeli_Payment_Flow_using(String FileName, String Period, String FileType)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage( );
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	environmentPage=homePage.clickonEnvironmentRunLink();
	environmentPage.clickonEnvironmentokbutton();
	environmentPage.checkIsraeli_Inward_Cheque_Server();
	environmentPage.LogOut();
	driver.quit();
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage( );
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);

}

@Then("validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_QueuedToAccountVerification_status_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber, String Filetype)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}



@Then("validate whether payment gets Returned from SignatureCheck for IraeliInward Flow using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_gets_Returned_from_SignatureCheck_for_IraeliInward_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.signatureCheckQueue_ReturnForIsraeliInwardFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4);

}

@Then("validate whether payment move to SignatureCheckApprove after gets Returned from SignatureCheck queue for IraeliInward Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_SignatureCheckApprove_after_gets_Returned_from_SignatureCheck_queue_for_IraeliInward_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickSignatureCheckApproveLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.acceptfromSignatureCheckApproveQueue(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}

@Then("validate whether payment move to QueuedToFinalPosting after SignatureCheckApprove for IraeliInward Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_QueuedToFinalPosting_after_SignatureCheckApprove_for_IraeliInward_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
}

@Then("validate whether payment moves to QueuedToIsraeliReturnCreation using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_moves_to_QueuedToIsraeliReturnCreation_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.QueuedToIsraeliReturnCreation(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();


}

@Then("validate whether payment moves to Rejected for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_moves_to_Rejected_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	environmentPage=homePage.clickonEnvironmentRunLink();
	environmentPage.clickonEnvironmentokbutton();
	environmentPage.checkIsraeli_Inward_Return_Server();
	environmentPage.LogOut();
	driver.quit();
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();

}

@Then("validate whether Out file request is getting created using {string}")
public void validate_whether_Out_file_request_is_getting_created_using(String Request_Type) 
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickonOutfileRequestCreatelink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestCreation(Request_Type);
	israeliInwardPaymentFlow.logout();
}

@Then("to view Created Outfile Request using {string},{string}")
public void to_view_Created_Outfile_Request_using(String Request_Type, String Status)
throws InterruptedException
{
	
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickonOutfileRequestViewlink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestView(Request_Type, Status);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestViewScreenStatusCheck();
		israeliInwardPaymentFlow.logout();
	
}

@Then("to enable Israeli_Cheque_Outfile_Creation_Server")
public void to_enable_Israeli_Cheque_Outfile_Creation_Server()
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	environmentPage=homePage.clickonEnvironmentRunLink();
	environmentPage.clickonEnvironmentokbutton();
	environmentPage.checkIsraeli_Cheque_Outfile_Creation_Server();
	environmentPage.LogOut();
	driver.quit();
}

@Then("validate whether payment moves to Completed for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_moves_to_Completed_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
}

@Then("disable Israeli_Cheque_Outfile_Creation_Server")
public void disable_Israeli_Cheque_Outfile_Creation_Server()
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	environmentPage=homePage.clickonEnvironmentRunLink();
	environmentPage.clickonEnvironmentokbutton();
	environmentPage.disableIsraeli_Cheque_Outfile_Creation_Server();
	environmentPage.LogOut();
	driver.quit();
}


@Then("validate whether payment move to SignatureCheck status after QueuedToInitialPosting for IsraeliInward Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_SignatureCheck_status_after_QueuedToInitialPosting_for_IsraeliInward_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);		
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck_InsufficientFund(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}

@Then("check whether payment gets approved from SignatureCheckQueue for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void check_whether_payment_gets_approved_from_SignatureCheckQueue_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.SignatureCheckQueueConfirmforInsufficientFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);


}

@Then("validate whether payment goes to InsufficientFund status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_goes_to_InsufficientFund_status_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
	//paymentFlow=paymentFlow.movetoSignatureCheck_InsufficientFund(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}

@Then("validate whether payment gets approved from InsufficientFund for IsraeliInward Payment Flow {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_gets_approved_from_InsufficientFund_for_IsraeliInward_Payment_Flow(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickInsufficientFundLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.InsufficientFundConfirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}

@Then("validate whether payment move to InsufficientFundApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_move_to_InsufficientFundApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber)
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	israeliInwardPaymentFlow.logout();
}

@Then("validate whether payment gets approved from InsufficientFundApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
public void validate_whether_payment_gets_approved_from_InsufficientFundApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) 
throws InterruptedException
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.clickInsufficientFundApproveLink();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoInsufficientFundApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

}


}
