package StepDefinition;

import org.junit.Assert;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.ParticipantBankPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ParticipantBankStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ParticipantBankPage participantBankPage;
	Windowhandle win;

	@Then("User goes to Maintenance DB and open Participant Bank Add menu to add Participant Bank")
	public void user_goes_to_Maintenance_DB_and_open_Participant_Bank_Add_menu_to_add_Participant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankAddLink();
	}	
	
	@Then("User enter valid {string},{string} ,{string},{string} fields and click on OK button")
	public void user_enter_valid_fields_and_click_on_OK_button(String SwiftCode, String BankCode, String Name, String ShortName) throws InterruptedException {
		participantBankPage=participantBankPage.addvalidParticipantbankdata(SwiftCode, BankCode, Name, ShortName);
	}	
	
	@Then("User enter valid {string},{string} ,{string},{string} and selects {string} and enter {string} field as Branch and click on OK button")
	public void user_enter_valid_and_selects_and_enter_field_as_Branch_and_click_on_OK_button(String SwiftCode, String BankCode, String Name, String ShortName, String BankType, String BranchCode) throws InterruptedException {
		participantBankPage=participantBankPage.addvalidParticipantbankdata1(SwiftCode, BankCode, Name, ShortName, BankType,BranchCode);
	}
	
	@Then("User goes to Maintenance DB and open Participant Bank Approve menu")
	public void user_goes_to_Maintenance_DB_and_open_Participant_Bank_Approve_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankApproveLink();
	}
	
	@Then("User approves the added Participant bank with {string}")
	public void user_approves_the_added_Participant_bank_with(String SwiftCode) throws InterruptedException {
		participantBankPage=participantBankPage.approveParticipantBank(SwiftCode);
	}
	
	@Then("User send the added Participant bank to repair with {string}")
	public void user_send_the_added_Participant_bank_to_repair_with(String SwiftCode) throws InterruptedException {
		participantBankPage=participantBankPage.repairParticipantBank(SwiftCode);
	}
	
	@Then("User goes to Maintenance DB and open Participant Bank Modify menu to modify Participant Bank")
	public void user_goes_to_Maintenance_DB_and_open_Participant_Bank_Modify_menu_to_modify_Participant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankModifyLink();
	}
	
	@Then("User modify the {string},{string},{string},{string} and click on OK button with {string}")
	public void user_modify_the_and_click_on_OK_button_with(String Name, String BankCode, String BranchCode, String ShortName, String SwiftCode) throws InterruptedException {
		participantBankPage=participantBankPage.modifyParticipantBank(SwiftCode, Name, BankCode, BranchCode, ShortName);
	}
	
	@Then("User approves the record with {string}")
	public void user_approves_the_record_with(String SwiftCode) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankApproveLink();
		participantBankPage=participantBankPage.approveParticipantBank(SwiftCode);
	}
	
	@Then("User tries to modify the {string},{string},{string},{string},{string} and click on OK button with {string}")
	public void user_tries_to_modify_the_and_click_on_OK_button_with(String Name, String BankCode, String BankType, String BranchCode, String ShortName, String SwiftCode) throws InterruptedException {
		participantBankPage=participantBankPage.modifyParticipantBank1(SwiftCode, Name, BankCode, BankType, BranchCode, ShortName);
	}
	
	@Then("User enter invalid {string} and {string} and click on OK button with {string}")
	public void user_enter_invalid_and_and_click_on_OK_button_with(String BankCode, String BranchCode, String SwiftCode) throws InterruptedException {
		participantBankPage=participantBankPage.modifywithinvaliddata(SwiftCode, BankCode,BranchCode);
	}
	
	@Then("User fill invalid BankCode and BranchCode and click on OK button")
	public void user_fill_invalid_BankCode_and_BranchCode_and_click_on_OK_button(DataTable credentials) throws InterruptedException {
		participantBankPage=participantBankPage.modifywithinvaliddata1(credentials);
	}

	@Then("User put invalid BankCode and BranchCode and click on OK button")
	public void user_put_invalid_BankCode_and_BranchCode_and_click_on_OK_button(DataTable credentials) throws InterruptedException {
		participantBankPage=participantBankPage.modifywithinvaliddata2(credentials);
	}
	
	
	@Then("User goes to Maintenance DB and open Participant Bank List menu to list the added Participant Bank")
	public void user_goes_to_Maintenance_DB_and_open_Participant_Bank_List_menu_to_list_the_added_Participant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankListLink();
	}
	
	@Then("User select valid {string}, {string}, {string} and click on OK button")
	public void user_select_valid_and_click_on_OK_button(String SwiftCode, String BankCode, String ShortName) throws InterruptedException {
		participantBankPage=participantBankPage.participantBankListwithvaliddata(SwiftCode, BankCode, ShortName);
	}
	
	@Then("User select invalid {string}, {string}, {string} and click on OK button")
	public void user_select_invalid_and_click_on_OK_button(String SwiftCode, String BankCode, String ShortName) throws InterruptedException {
		participantBankPage=participantBankPage.participantBankListwithinvaliddata(SwiftCode, BankCode, ShortName);
	}
	
	@Then("User enter valid {string} ,{string},{string} fields and click on OK button to validate SwiftCode field")
	public void user_enter_invalid_fields_and_click_on_OK_button_to_validate_SwiftCode_field(String BankCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		participantBankPage=participantBankPage.validateSwiftCodefield(credentials);
	}

	@Then("User enter valid {string} ,{string},{string} fields and click on OK button to validate BankCode field")
	public void user_enter_invalid_fields_and_click_on_OK_button_to_validate_BankCode_field(String SwiftCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankAddLink();
		participantBankPage=participantBankPage.validateBankCodefield(credentials);
	}

	@Then("User will keep SwiftCode field blank and fill {string} ,{string},{string} fields to validate SwiftCode field")
	public void user_will_keep_SwiftCode_field_blank_and_fill_fields_to_validate_SwiftCode_field(String BankCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		participantBankPage=participantBankPage.validateSwiftCodefield(credentials);
	}

	@Then("User will keep BankCode field blank and fill {string} ,{string},{string} fields to validate BankCode field")
	public void user_will_keep_BankCode_field_blank_and_fill_fields_to_validate_BankCode_field(String SwiftCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankAddLink();
		participantBankPage=participantBankPage.validateBankCodefield(credentials);
	}

	@Then("User will keep Name field blank and fill {string} ,{string},{string} fields to validate Name field")
	public void user_will_keep_Name_field_blank_and_fill_fields_to_validate_Name_field(String SwiftCode, String BankCode, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankAddLink();
		participantBankPage=participantBankPage.validateNamefield(credentials);
	}

	@Then("User will keep ShortName field blank and fill {string} ,{string},{string} fields to validate ShortName field")
	public void user_will_keep_ShortName_field_blank_and_fill_fields_to_validate_ShortName_field(String SwiftCode, String BankCode, String Name,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankAddLink();
		participantBankPage=participantBankPage.validateShortNamefield(credentials);
	}
	
	@Then("User goes and approve the Participant bank with {string}")
	public void user_goes_and_approve_the_Participant_bank_with(String SwiftCode) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		participantBankPage=homePage.clickonDBParticipantBankApproveLink();
		participantBankPage=participantBankPage.approveParticipantBank(SwiftCode);
	}
}
