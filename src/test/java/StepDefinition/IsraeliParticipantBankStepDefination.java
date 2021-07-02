package StepDefinition;

import org.junit.Assert;
import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.IsraeliParticipantBank;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class IsraeliParticipantBankStepDefination extends TestBase{
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	IsraeliParticipantBank IsraeliparticipantBank;
	Windowhandle win;

	@Then("User goes to Maintenance DB and open IsraeliParticipant Bank Add menu to add IsraeliParticipant Bank")
	public void user_goes_to_Maintenance_DB_and_open_IsraeliParticipant_Bank_Add_menu_to_add_IsraeliParticipant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankAddLink();
	}	
	
	@Then("User enter valid {string},{string} ,{string},{string} fields in IsraeliBankPage and click on OK button")
	public void user_enter_valid_fields_in_IsraeliBankPage_and_click_on_OK_button(String SwiftCode, String BankCode, String Name, String ShortName) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.addvalidIsraeliParticipantbankdata(SwiftCode, BankCode, Name, ShortName);
	}	
	
	@Then("User enter valid {string},{string} ,{string},{string} and selects {string} and enter {string} field as Branch in IsraeliBankPage and click on OK button")
	public void user_enter_valid_and_selects_and_enter_field_as_Branch_inIsraeliBankPage_and_click_on_OK_button(String SwiftCode, String BankCode, String Name, String ShortName, String BankType, String BranchCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.addvalidIsraeliParticipantbankdata1(SwiftCode, BankCode, Name, ShortName, BankType,BranchCode);
	}
	
	@Then("User goes to Maintenance DB and open IsraeliParticipant Bank Approve menu")
	public void user_goes_to_Maintenance_DB_and_open_IsraeliParticipant_Bank_Approve_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankApproveLink();
	}
	
	@Then("User approves the added IsraeliParticipant bank with {string}")
	public void user_approves_the_added_IsraeliParticipant_bank_with(String SwiftCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.approveIsraeliParticipantBank(SwiftCode);
	}
	
	@Then("User send the added IsraeliParticipant bank to repair with {string}")
	public void user_send_the_added_IsraeliParticipant_bank_to_repair_with(String SwiftCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.repairIsraeliParticipantBank(SwiftCode);
	}
	
	@Then("User goes to Maintenance DB and open IsraeliParticipant Bank Modify menu to modify IsraeliParticipant Bank")
	public void user_goes_to_Maintenance_DB_and_open_IsraeliParticipant_Bank_Modify_menu_to_modify_IsraeliParticipant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankModifyLink();
	}
	
	@Then("User modify the {string},{string},{string},{string} in IsraeliBankPage and click on OK button with {string}")
	public void user_modify_the_inIsraeliBankPage_and_click_on_OK_button_with(String Name, String BankCode, String BranchCode, String ShortName, String SwiftCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.modifyIsraeliParticipantBank(SwiftCode, Name, BankCode, BranchCode, ShortName);
	}
	
	@Then("User approves the record in IsraeliBankPage with {string}")
	public void user_approves_the_record_inIsraeliBankPage_with(String SwiftCode) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankApproveLink();
		IsraeliparticipantBank=IsraeliparticipantBank.approveIsraeliParticipantBank(SwiftCode);
	}
	
	@Then("User tries to modify the {string},{string},{string},{string},{string} in IsraeliBankPage and click on OK button with {string}")
	public void user_tries_to_modify_the_inIsraeliBankPage_and_click_on_OK_button_with(String Name, String BankCode, String BankType, String BranchCode, String ShortName, String SwiftCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.modifyIsraeliParticipantBank1(SwiftCode, Name, BankCode, BankType, BranchCode, ShortName);
	}
	
	@Then("User enter invalid {string} and {string} in IsraeliBankPage and click on OK button with {string}")
	public void user_enter_invalid_inIsraeliBankPage_and_click_on_OK_button_with(String BankCode, String BranchCode, String SwiftCode) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.modifywithinvaliddata(SwiftCode, BankCode,BranchCode);
	}
	
	@Then("User fill invalid BankCode and BranchCode in IsraeliBankPage and click on OK button")
	public void user_fill_invalid_BankCode_and_BranchCode_inIsraeliBankPage_and_click_on_OK_button(DataTable credentials) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.modifywithinvaliddata1(credentials);
	}

	@Then("User put invalid BankCode and BranchCode in IsraeliBankPage and click on OK button")
	public void user_put_invalid_BankCode_and_BranchCode_inIsraeliBankPage_and_click_on_OK_button(DataTable credentials) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.modifywithinvaliddata2(credentials);
	}
	
	
	@Then("User goes to Maintenance DB and open IsraeliParticipant Bank List menu to list the added IsraeliParticipant Bank")
	public void user_goes_to_Maintenance_DB_and_open_IsraeliParticipant_Bank_List_menu_to_list_the_added_IsraeliParticipant_Bank() throws InterruptedException {
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankListLink();
	}
	
	@Then("User select valid {string}, {string}, {string} in IsraeliBankPage and click on OK button")
	public void user_select_valid_inIsraeliBankPage_and_click_on_OK_button(String SwiftCode, String BankCode, String ShortName) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.IsraeliparticipantBankListwithvaliddata(SwiftCode, BankCode, ShortName);
	}
	
	@Then("User select invalid {string}, {string}, {string} in IsraeliBankPage and click on OK button")
	public void user_select_invalid_inIsraeliBankPage_and_click_on_OK_button(String SwiftCode, String BankCode, String ShortName) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.IsraeliparticipantBankListwithinvaliddata(SwiftCode, BankCode, ShortName);
	}
	
	@Then("User enter valid {string} ,{string},{string} fields in IsraeliBankPage and click on OK button to validate SwiftCode field")
	public void user_enter_invalid_fields_inIsraeliBankPage_and_click_on_OK_button_to_validate_SwiftCode_field(String BankCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.validateSwiftCodefield(credentials);
	}

	@Then("User enter valid {string} ,{string},{string} fields in IsraeliBankPage and click on OK button to validate BankCode field")
	public void user_enter_invalid_fields_inIsraeliBankPage_and_click_on_OK_button_to_validate_BankCode_field(String SwiftCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankAddLink();
		IsraeliparticipantBank=IsraeliparticipantBank.validateBankCodefield(credentials);
	}

	@Then("User will keep SwiftCode field blank and fill {string} ,{string},{string} fields in IsraeliBankPage to validate SwiftCode field")
	public void user_will_keep_SwiftCode_field_inIsraeliBankPage_blank_and_fill_fields_to_validate_SwiftCode_field(String BankCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		IsraeliparticipantBank=IsraeliparticipantBank.validateSwiftCodefield(credentials);
	}

	@Then("User will keep BankCode field blank and fill {string} ,{string},{string} fields in IsraeliBankPage to validate BankCode field")
	public void user_will_keep_BankCode_field_blank_and_fill_fields_inIsraeliBankPage_to_validate_BankCode_field(String SwiftCode, String Name, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankAddLink();
		IsraeliparticipantBank=IsraeliparticipantBank.validateBankCodefield(credentials);
	}

	@Then("User will keep Name field blank and fill {string} ,{string},{string} fields in IsraeliBankPage to validate Name field")
	public void user_will_keep_Name_field_blank_and_fill_fields_inIsraeliBankPage_to_validate_Name_field(String SwiftCode, String BankCode, String ShortName,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankAddLink();
		IsraeliparticipantBank=IsraeliparticipantBank.validateNamefield(credentials);
	}

	@Then("User will keep ShortName field blank and fill {string} ,{string},{string} fields in IsraeliBankPage to validate ShortName field")
	public void user_will_keep_ShortName_field_blank_and_fill_fields_inIsraeliBankPage_to_validate_ShortName_field(String SwiftCode, String BankCode, String Name,DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankAddLink();
		IsraeliparticipantBank=IsraeliparticipantBank.validateShortNamefield(credentials);
	}

}
