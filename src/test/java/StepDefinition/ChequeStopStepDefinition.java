package StepDefinition;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.ChequeStopPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Then;

public class ChequeStopStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ChequeStopPage chequeStopPage;
	Windowhandle win;

	@Then("User goes to Maintenance DB and open Cheque Stop Enter menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_Enter_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    chequeStopPage=homePage.clickonChequeStopEnterLink();
	}
	
	@Then("User keep {string},{string},{string},{string},{string},{string} fields blank and click on OK button")
	public void user_keep_fields_blank_and_click_on_OK_button(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.addChequeStopentrywithBlankdata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User enter invalid data in {string},{string},{string},{string},{string},{string}")
	public void user_enter_invalid_data_in(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.addChequeStopentrywithInvaliddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);			
	}
	
	@Then("User enter valid data in {string},{string},{string},{string},{string},{string}")
	public void user_enter_valid_data_in(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.addChequeStopentrywithValiddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User enter valid data in {string},{string},{string},{string} with already existing {string},{string}")
	public void user_enter_valid_data_in_with_already_existing(String Issuer, String BranchCode, String Currency, String AccountNumber, String MinimumChequeNumber, String MaximumChequeNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.addChequeStopentryforalreadyExistingdata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User goes to Maintenance DB and open Cheque Stop Approve menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_Approve_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeStopPage=homePage.clickonChequeStopApproveLink();
	}

	@Then("User approves Cheque stop entry using {string},{string},{string},{string},{string},{string} fields")
	public void user_approves_Cheque_stop_entry_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.approveChequeStopEntry(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User send Cheque stop entry to repair queue using {string},{string},{string},{string},{string},{string} fields")
	public void user_send_Cheque_stop_entry_to_repair_queue_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.sendtorepairChequeStopEntry(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User try to approve Cheque stop entry by giving invalid criteria using {string},{string},{string},{string},{string},{string} fields")
	public void user_try_to_approve_Cheque_stop_entry_by_giving_invalid_criteria_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.invalidCriteriaforApprove(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User goes to Maintenance DB and open Cheque Stop List menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_List_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeStopPage=homePage.clickonChequeStopListLink();
	}
	
	@Then("User view the list using {string},{string},{string},{string},{string},{string} fields")
	public void user_view_the_list_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.listChequeStopEntrywithInvaliddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User view the list with valid data using {string},{string},{string},{string},{string},{string} fields")
	public void user_view_the_list_with_valid_data_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.listChequeStopEntrywithValiddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User goes to Maintenance DB and open Cheque Stop Delete menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_Delete_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    chequeStopPage=homePage.clickonChequeStopDeleteLink();
	}

	@Then("User enter invalid data to delete Cheque Stop entry using {string},{string},{string},{string},{string},{string} fields")
	public void user_enter_invalid_data_to_delete_Cheque_Stop_entry_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.deleteChequeStopEntrywithInvaliddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User enter valid data to delete Cheque Stop entry using {string},{string},{string},{string},{string},{string} fields")
	public void user_enter_valid_data_to_delete_Cheque_Stop_entry_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.deleteChequeStopEntrywithinValiddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User view deleted Cheuqe stop entry using {string},{string},{string},{string},{string},{string} fields")
	public void user_view_deleted_Cheuqe_stop_entry_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.listdeletedChequeStopEntry(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}
	
	@Then("User goes to Maintenance DB and open Cheque Stop Modify menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_Modify_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    chequeStopPage=homePage.clickonChequeStopModifyLink();
	}

	@Then("User use {string},{string},{string} to modify {string},{string},{string} fields")
	public void user_use_to_modify_fields(String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String Issuer, String BranchCode, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.modifyChequeStopEntry(Currency, MinimumChequeNumber, MaximumChequeNumber, Issuer, BranchCode, AccountNumber);
	}
	
	@Then("User use {string},{string},{string} to modify {string},{string},{string} fields with Invalid data")
	public void user_use_to_modify_fields_with_Invalid_data(String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String Issuer, String BranchCode, String AccountNumber) throws InterruptedException {
		chequeStopPage=chequeStopPage.modifyChequeStopEntrywithInvaliddata(Currency, MinimumChequeNumber, MaximumChequeNumber, Issuer, BranchCode, AccountNumber);
	}
	
	@Then("User goes to Maintenance DB and open Cheque Stop Bulk Upload menu")
	public void user_goes_to_Maintenance_DB_and_open_Cheque_Stop_Bulk_Upload_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    chequeStopPage=homePage.clickonChequeStopBulkUploadLink();
	}

	@Then("User uploads Cheque Stop entry through Bulk Upload using {string}")
	public void user_uploads_Cheque_Stop_entry_through_Bulk_Upload_using(String ChooseFile) throws InterruptedException {
		chequeStopPage=chequeStopPage.uploadBulkChequeDataEntry(ChooseFile);
	}
}

