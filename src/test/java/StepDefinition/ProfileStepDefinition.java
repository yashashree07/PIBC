package StepDefinition;

import java.io.IOException;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.ProfilePage;
import com.pibc.qa.util.Windowhandle;

//import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProfileStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ProfilePage profilePage;
	Windowhandle win;

	@Given("user is on Administration menu and clicks on Profile menu and Add menu")
	public void user_is_on_Administration_menu_and_clicks_on_Profile_menu_and_Add_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		profilePage = homePage.createProfile();
	}

	@Then("user enters the profile name {string} and clicks on checkboxes and ok button")
	public void user_enters_the_profile_name_and_clicks_on_checkboxes_and_ok_button(String profilename) {

		profilePage.createMaker(profilename);
	}

	@Then("user approves the record")
	public void user_approves_the_record() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		profilePage = homePage.approveProfile();
		profilePage = profilePage.approveRecord();

	}

	// checker profile method
	@Then("user enters the profile name {string} and clicks on all checkboxes and ok button")
	public void user_enters_the_profile_name_and_clicks_on_all_checkboxes_and_ok_button(String profilename)
			throws InterruptedException, IOException {

		profilePage.createChecker(profilename);

	}

	// ----Profile Modify Method--------//
	@Given("user is on Administration menu and clicks on Profile menu and Modify menu and enters {string}")
	public void user_is_on_Administration_menu_and_clicks_on_Profile_menu_and_Modify_menu_and_enters(String profilename)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		profilePage = homePage.modifyProfile(profilename);

	}

	@Then("user modifies {string} the record and clicks on ok button")
	public void user_modifies_the_record_and_clicks_on_ok_button(String profileName) throws InterruptedException {
		profilePage = profilePage.modifyRecord(profileName);
	}

	@Given("user is on Administration menu and clicks on Profile menu and Remove menu and enters {string}")
	public void user_is_on_Administration_menu_and_clicks_on_Profile_menu_and_Remove_menu_and_enters(String profilename)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		profilePage = homePage.removeProfile(profilename);

	}

	@Then("user removes the profile")
	public void user_removes_the_profile() throws IOException {

		profilePage.removeRecord();
	}

}

