package StepDefinition;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.EnvironmentPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.OutwardPaymentPage;
import com.pibc.qa.pages.SchedulePage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PDCMigrationStepDefination extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	EnvironmentPage envPage;
	OutwardPaymentPage outwardPage;
	EnvironmentPage environmentPage;
	SchedulePage schedulePage;
	Windowhandle win;
	
	@Given("user check whether payment moved to QueuedToPayment status using {string} and {string} in cheque data entry list menu")
	public void user_check_whether_payment_moved_to_QueuedToPayment_status_using_and_in_cheque_data_entry_list_menu(
			String ChequeNo, String PayerAccount) throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkPDC_Data_Migration_Server();
		environmentPage.checkPDC_FileBean_ChequeData_Server();
		environmentPage.checkCheque_Migration_Image_Tagging_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.clickonChequeDataEntryLink();
		outwardPage.chqDataEntryFilter(ChequeNo, PayerAccount);
	}//end

	@Then("user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using {string} and {string}")
	public void user_enables_Cheque_Outward_Payment_Creation_Server_and_checks_whether_Cheque_data_entry_gets_completed_using_and(
			String string, String string2) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkCheque_Outward_Payment_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end
	
	@Then("user check whether payment move to QueuedToAccountVerification status using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_QueuedToAccountVerification_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkInitialPaymentstatusforPDCFlow(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end
	
	@Then("user check whether payment move to Approve status using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_Approve_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.QueuedToAccountVerificationToApproveforPDC(win, ValueDateperiod, Reference, SubRef, ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.paymentapproveLink();
		outwardPage = outwardPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end
	
	@Then("user check whether payment move to QueuedToAddPDC status using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_QueuedToAddPDC_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end
	

	@Then("user check whether payment move to QueuedToPDCCommision status using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_QueuedToPDCCommision_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.QueuedToAddPDCToQueuedToPDCCommision(ValueDateperiod, Reference, SubRef,ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end


	@Then("check whether payment move to Future status using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_Future_status_using(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.QueuedToPDCCommisiontoFuture(ValueDateperiod, Reference, SubRef,ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
	
	}//end
	
	@Then("to delete payment from PDCDelete using {string},{string},{string},{string}")
	public void to_delete_payment_from_PDCDelete_using (String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.clickonPDC_DeleteLink();
		outwardPage.DeletePDC(ValueDateperiod,Reference,SubRef,ChequeNo);
	
	}//end
	
	@Then("check whether payment move to Approve status from PDC>>Delete using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_Approve_status_from_PDC_Delete_using(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.paymentapproveLink();
		outwardPage=outwardPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end
	
	@Then("check whether payment move to QueuedToDeletePDC status using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_QueuedToDeletePDC_status_using(String ValueDateperiod, String Reference, String SubRef,String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
	}//end
	
	@Then("check whether payment move to Delete status using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_Delete_status_using(String ValueDateperiod, String Reference, String SubRef,String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.QueuedToDeletePDCtoDelete(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end
	
	
	@Then("user check whether payment move to QueuedToOutPresentCheque status using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_QueuedToOutPresentCheque_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);

	}//end
	
	@Then("user check whether payment move to QueuedToOutFile status filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_QueuedToOutFile_status_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.movetoQueuedToOutFile(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
	}//end
	
	@Then("user check whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter {string},{string},{string},{string} in payment list menu")
	public void user_check_whether_payment_move_to_PendingAck_status_on_enabling_EGPS_CHEQUE_OUTFILE_scheduler_using_filter_in_payment_list_menu(String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		schedulePage=homePage.clickonScheduleModifyLink();
		schedulePage=schedulePage.modifyEGPS_CHEQUE_OUTFILE_Scheduler(ValueDateperiod, Reference, SubRef, ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
	}//end
	
	
	@Given("user check whether payment moved to QueuedToPayment status for PDCMigrationOutward flow using {string} and {string} in cheque data entry list menu")
	public void user_check_whether_payment_moved_to_QueuedToPayment_status_for_PDCMigrationOutward_flow_using_in_cheque_data_entry_list_menu(
			String ChequeNo, String PayerAccount) throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkPDC_Data_Migration_Server();
		environmentPage.checkPDC_FileBean_ChequeData_Server();
		environmentPage.checkCheque_Migration_Image_Tagging_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.clickonChequeDataEntryLink();
		outwardPage.chqDataEntryFilterforPDCDeleteFlow(ChequeNo, PayerAccount);
	}//end
	
	@Then("check whether payment move to Future status for PDCMigrationOutward flow using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_Future_status_for_PDCMigrationOutward_flow_using(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage=outwardPage.checkInitialFutureStatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	
	}//end

	@Then("to first perform EOD and then perform SOD")
	public void to_first_perform_EOD_and_then_perform_SOD() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		environmentPage = homePage.clickonEnvironmentRunLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.clickEODandManage();
		environmentPage.businessDate();
		environmentPage.LogOut();
		driver.quit();
	}//end
	
	@Then("user disable Cheque_Outward_Payment_Creation_Server")
	public void user_disable_Cheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage = homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.switchInactiveCheque_Outward_Payment();
		environmentPage.LogOut();
	}//end
	
	
	@Then("to validate whether payment gets modified using {string},{string},{string},{string},{string}")
	public void to_validate_whether_payment_gets_modified_using(
			String ValueDateperiod, String Reference, String SubRef,String ChequeNo,String PayerBIC) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.clickonPDCModify_Link();
		outwardPage=outwardPage.modifyRecord(ValueDateperiod, Reference, SubRef, ChequeNo, PayerBIC);
		outwardPage=outwardPage.okbuttontab();
		outwardPage=outwardPage.confirmbuttontab();
		outwardPage.outwardPageLogOut();
		driver.quit();
		
	}//end
	
	@Then("check whether payment move to Approve status from PDCModify using {string},{string},{string},{string}")
	public void check_whether_payment_move_to_Approve_status_from_PDCModify_using(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.checkPayment1();
		outwardPage=outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage=homePage.paymentapproveLink();
		outwardPage=outwardPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end

	@Then("check whether payment moves to Future status after QueuedToAddPDC status using {string},{string},{string},{string}")
	public void check_whether_payment_moves_to_Future_status_after_QueuedToAddPDC_status_using(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outwardPage = homePage.checkPayment1();
		outwardPage=outwardPage.QueuedToAddPDCtoFuture(ValueDateperiod, Reference, SubRef, ChequeNo);
	
	}//end
	

}//end of PDCMigrationStepDefination Class
