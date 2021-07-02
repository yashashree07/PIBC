//package StepDefinition;
//
//import com.pibc.qa.base.TestBase;
//import com.pibc.qa.constants.IntfConstants;
//import com.pibc.qa.pages.ChequeStopPage;
//import com.pibc.qa.pages.EnvironmentPage;
//import com.pibc.qa.pages.HomePage;
//import com.pibc.qa.pages.IsraeliOutwardPaymentPage;
//import com.pibc.qa.pages.LoginPage;
//import com.pibc.qa.pages.PaymentFlow;
//import com.pibc.qa.pages.SchedulePage;
//import com.pibc.qa.util.Windowhandle;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class IsraeliOutwardPaymentFlowStepDefination extends TestBase{
//	LoginPage loginPage = new LoginPage();
//	HomePage homePage = new HomePage();
//	PaymentFlow paymentFlow;
//	EnvironmentPage environmentPage;
//	ChequeStopPage chequeStopPage;
//	SchedulePage schedulePage;
//	Windowhandle win;
//	IsraeliOutwardPaymentPage israeliOutwardPaymentPage;
//	
//	
//
//	@Given("user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using {string} and {string} in cheque data entry list menu")
//	public void user_checks_whether_payment_moved_to_QueuedToPayment_status_for_IsraeliOutward_Payment_using_and_in_cheque_data_entry_list_menu(
//			String ChequeNo, String PayerAccount) throws InterruptedException {
//		driver.switchTo().frame("toc");
//		environmentPage=homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.checkPDC_FileBean_ChequeData_Server();
//		environmentPage.checkIsraeli_PDC_Data_Migration_Server();
//		environmentPage.checkIsraeli_Cheque_Migration_Image_Tagging_Server();
//		environmentPage.LogOut();
//		driver.quit();
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage( );
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.clickChequeDataEntryLink();
//		israeliOutwardPaymentPage.chqDataEntryFilterIsraeliOutward(ChequeNo, PayerAccount);
//	}//end
//	
//	@Then("user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Flow using {string} and {string}")
//	public void user_enables_Cheque_Outward_Payment_Creation_Server_and_checks_whether_Cheque_data_entry_gets_completed_for_IsraeliOutward_Flow_using_and(
//			String string, String string2) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		driver.switchTo().frame("toc");
//		environmentPage=homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.checkCheque_Outward_Payment_Creation_Server();
//		environmentPage.LogOut();
//		driver.quit();
//	}//end
//	
//	@Then("user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_QueuedToAccountVerification_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkInitialPaymentstatusForIsraeliFlow(ValueDateperiod, Reference, SubRef, ChequeNo);
//	}//end
//	
//	@Then("user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_QueuedToOutPresentCheque_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.QueuedToAccountVerificationToApprove(win, ValueDateperiod, Reference, SubRef,
//				ChequeNo);
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.paymentApproveLinkClick();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//
//	}//end
//	
//	@Then("user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_QueuedToOutFile_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.movetoQueuedToOutFile(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//	}//end
//	
//	@Given("user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow")
//	public void user_disable_Cheque_Outward_Payment_Creation_Server_in_environment_server_for_IsraeliOutward_Payment_Flow()throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		environmentPage = homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.switchInactiveCheque_Outward_Payment();
//		environmentPage.LogOut();
//		driver.quit();
//
//	}//end
//	
//	@Then("to check whether Outfile request is getting created using {string}")
//	public void to_check_whether_Out_file_request_is_getting_created_using(String Request_Type) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage=homePage.clickOutfileRequestCreatelink();
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.OutfileRequestCreation(Request_Type);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//		
//	}//end
//	
//	@Then("To View Created Outfile Request using {string},{string}")
//	public void to_view_Created_Outfile_Request_using(String Request_Type,String Status) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage=homePage.clickOutfileRequestViewlink();
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.OutfileRequestView(Request_Type, Status);
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.OutfileRequestViewScreenStatusCheck();
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//	}//end
//	
//	@Then("To Enable Israeli_Cheque_Outfile_Creation_Server")
//	public void To_Enable_Israeli_Cheque_Outfile_Creation_Server() throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		environmentPage=homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.checkIsraeli_Cheque_Outfile_Creation_Server();
//		environmentPage.LogOut();
//		driver.quit();
//	}//end
//	
//	@Then("to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using {string},{string},{string},{string} in payment list menu")
//	public void to_check_whether_payment_moves_to_PendingSettlement_for_IsraeliOutward_Payment_Flow_using_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//		
//	}//end
//	
//	@Then("to perform EOD and then SOD for IsraeliOutward Payment Flow")
//	public void to_perform_EOD_and_then_SOD_for_IsraeliOutward_Payment_Flow() throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		environmentPage = homePage.clickonEnvironmentRunLink();
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.clickEODandManage();
//		environmentPage.businessDate();
//		environmentPage.LogOut();
//		driver.quit();
//	}//end
//
//	
//	@Then("check whether payment moves to Completed Status for IsraeliOutward Payment Flow using {string},{string},{string},{string} in payment list menu")
//	public void to_check_whether_payment_moves_to_Completed_for_IsraeliOutward_Payment_Flow_using_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.QueuedToOutReplyToCompleted(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//		
//	}//end
//	
//	@Then("disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow")
//	public void disable_Israeli_Cheque_Outfile_Creation_Server_for_IsraeliOutward_Payment_Flow() throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		environmentPage=homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.disableIsraeli_Cheque_Outfile_Creation_Server();
//		environmentPage.LogOut();
//		driver.quit();
//	}//end
//	
//	@Then("to check whether payment moves to QueuedToOutReplyCheque status using {string},{string},{string},{string} in payment list menu")
//	public void to_check_whether_payment_moves_to_QueuedToOutReplyCheque_status_using_in_payment_list_menu(String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//		
//	}//end 
//	
//	@Given("user validates whether payment moved to Duplicate status for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_Duplicate_status_for_IsraeliOutward_Payment_using_filter_in_payment_list_menu(String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkInitialDuplicateStatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//	}//end
//
//	@Then("user goes to Duplicate menu for IsraeliOutward Payment Flow use the filter {string},{string},{string},{string} and click on Allow duplicate button and then clicks on confirm button")
//	public void user_goes_to_Duplicate_menu_for_IsraeliOutward_Payment_Flow_use_the_filter_and_click_on_Allow_duplicate_button_and_then_clicks_on_confirm_button(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.DuplicateMenuLink();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.allowDuplicate(ValueDateperiod, Reference, SubRef, ChequeNo);
//
//	}//end
//	
//	@Then("user validates whether payment moved to Repair status for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_Repair_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(String ValueDateperiod,
//			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win=new Windowhandle(driver);
//		loginPage=new LoginPage();
//		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage= homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.checkInitialRepairStatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//	}//end
//	
//	@Then("user goes to Repair menu for IsraeliOutward Payment Flow uses the filter {string},{string},{string},{string} repair the payment {string} click on Ok button and click on confirm button")
//	public void user_goes_to_Repair_menu_for_IsraeliOutward_Payment_Flow_uses_the_filter_repair_the_payment_click_on_Ok_button_and_click_on_confirm_button(String ValueDateperiod,
//			String Reference, String SubRef, String ChequeNo, String date) throws InterruptedException {
//	    Initialization();
//	    win=new Windowhandle(driver);
//	    loginPage=new LoginPage();
//	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	    driver.switchTo().frame("toc");
//	    israeliOutwardPaymentPage=homePage.repairMenuLink();
//	    israeliOutwardPaymentPage=israeliOutwardPaymentPage.repairPayment(ValueDateperiod, Reference, SubRef, ChequeNo, date);  
//	  
//	}//end
//	
//	@Then("To check whether File Status move to QueuedToOutwardReturned status using {string},{string},{string}")
//	public void To_check_whether_File_Status_move_to_QueuedToOutwardReturned_status_using(String FileName, String Period,String FileType) throws InterruptedException 
//	{
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage( );
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		israeliOutwardPaymentPage=homePage.clickFileManagerFileViewLink();
//		israeliOutwardPaymentPage=israeliOutwardPaymentPage.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//	
//		
//	}//end 
//	
//	@Then("to enable Israeli_Outward_Return_Server")
//	public void to_enable_Israeli_Outward_Return_Server() throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//		environmentPage=homePage.clickonEnvironmentRunLink();
//		environmentPage.clickonEnvironmentokbutton();
//		environmentPage.checkIsraeli_Outward_Return_Server();
//		environmentPage.LogOut();
//		driver.quit();
//	}//end
//
//	@Then("check whether payment moves to Returned status for IsraeliOutward Payment Flow using {string},{string},{string},{string} in payment list menu")
//	public void check_whether_payment_moves_to_Returned_status_for_IsraeliOutward_Payment_Flow_using_in_payment_list_menu(String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.QueuedToOutReplyToReturned(ValueDateperiod, Reference, SubRef, ChequeNo);
//		israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//	}//end 
//	
//	
//	@Then("to check whether file gets uploaded using {string},{string}")
//	public void to_check_whether_file_gets_uploaded_using(String FileType1, String FilePath1) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(IntfConstants.TIMEOUT);
//		driver.switchTo().frame("toc");
//	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//	    israeliOutwardPaymentPage=homePage.clickFileManagerFileUploadLink();
//	    israeliOutwardPaymentPage.uploadInwardFile(FileType1, FilePath1);
//	    israeliOutwardPaymentPage.israeliOutwardPageLogOut();
//	   
//	}//end
//	
//	@Then("user validates whether payment moved to QueuedToOutPresentCheque for IsraeliOutward Payment Flow using filter {string},{string},{string},{string} in payment list menu")
//	public void user_validates_whether_payment_moved_to_QueuedToOutPresentCheque_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(
//			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.QueuedToAccountVerificationToApprove(win, ValueDateperiod, Reference, SubRef,
//				ChequeNo);
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.paymentApproveLinkClick();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.approvePaymentforDuplicatePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.checkIsraeliOutwardPayment();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
//
//	}//end
//	
//	@Then("user goes to approve menu using {string},{string},{string},{string} and approves the payment")
//	public void user_goes_to_approve_menu_using_and_approves_the_payment(String ValueDateperiod,
//			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
//		Initialization();
//		win = new Windowhandle(driver);
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
//		driver.switchTo().frame("toc");
//		israeliOutwardPaymentPage = homePage.paymentApproveLinkClick();
//		israeliOutwardPaymentPage = israeliOutwardPaymentPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
//	}//end
//
//
//
//
//
//
//
//
//	
//
//
//
//
//
//
//}
