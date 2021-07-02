package StepDefinition;

import java.io.IOException;

import org.junit.BeforeClass;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.ScannerProfilePage;
import com.pibc.qa.util.Windowhandle;

//import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScannerProfileStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ScannerProfilePage scanProfilePage;
	Windowhandle win;

	@Given("user is on Administration menu and clicks on Scanner profile menu and Add submenu")
	public void user_is_on_Administration_menu_and_clicks_on_Scanner_profile_menu_and_Add_submenu()
			throws InterruptedException {

		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		scanProfilePage = homePage.addScan();
	}

	@Then("user adds name {string} in textfield and clicks checkall button and ok button")
	public void user_adds_name_in_textfield_and_clicks_checkall_button_and_ok_button(String profilename)
			throws InterruptedException, IOException {
		Thread.sleep(3000);
		scanProfilePage.addScanProfile(profilename);
	}

	@Then("user approves the record from approve menu")
	public void user_approves_the_record_from_approve_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		scanProfilePage = homePage.approveScan();
		scanProfilePage = scanProfilePage.approveRecord();
	}

	// -----Modify Methods------//
	@Given("user is on Administration menu and clicks on Scanner profile menu and Modify submenu {string}")
	public void user_is_on_Administration_menu_and_clicks_on_Scanner_profile_menu_and_Modify_submenu(String profilename)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		scanProfilePage = homePage.modifyScan(profilename);
	}

	@Then("user modifies the profile and clicks on Ok button")
	public void user_modifies_the_profile_and_clicks_on_Ok_button() throws InterruptedException {
		scanProfilePage.modifyRecord();
	}

	// ----Remove Methods------//
	@Given("user is on Administration menu and clicks on Scanner profile menu and Remove submenu {string}")
	public void user_is_on_Administration_menu_and_clicks_on_Scanner_profile_menu_and_Remove_submenu(String profile)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		scanProfilePage = homePage.removeScan(profile);
	}

	@Then("user removes the profile and clicks on Ok button")
	public void user_removes_the_profile_and_clicks_on_Ok_button() {
		scanProfilePage.removeRecord();
	}

	/*
	 * @After public void quitBrowser() { driver.quit(); }
	 */
}
