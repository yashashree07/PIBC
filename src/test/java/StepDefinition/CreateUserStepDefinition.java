package StepDefinition;

import java.util.concurrent.TimeUnit;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.UserPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateUserStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	UserPage userPage;
	Windowhandle win;

	@Given("user goes to administration and users and click on Add menu")
	public void user_goes_to_administration_and_users_and_click_on_Add_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.createUser();
	}

	@Given("user enters {string} and {string} and selects {string} ,{string} and enters {string}  {string} and clicks on Ok button")
	public void user_enters_and_and_selects_and_enters_and_clicks_on_Ok_button(String UserName, String FullName,
			String Profile,String AuthMatrix, String Password, String VerifyPassword) {
		userPage.addUser(UserName, FullName, Profile, AuthMatrix,Password, VerifyPassword);
	}

	@Then("user goes to Approve screen and approves the record")
	public void user_goes_to_Approve_screen_and_approves_the_record() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.approveMenu();
		userPage = userPage.approveUser();

	}

	// User Validation Method
	@Then("user clicks on ok button for validation message")
	public void user_clicks_on_ok_button_for_validation_message() throws InterruptedException {
		userPage.validationMessage();
	}

	// User Modify Methods
	@Then("user goes to administration and users and click on Modify menu and enters {string}")
	public void user_goes_to_administration_and_users_and_click_on_Modify_menu_and_enters(String username)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.modifyUser(username);
	}

	@Then("user then modifies {string} {string} and clicks on Ok")
	public void user_then_modifies_and_clicks_on_Ok(String userName, String fullName) throws InterruptedException {
		userPage.modifyRecord(userName, fullName);
	}

	@Then("user then approves the modified record")
	public void user_then_approves_the_modified_record() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.approveMenu();
		userPage = userPage.approveUser();
	}

	// User Block/Unblock Method
	@Then("user goes to administration and users and click on Block\\/Unblock menu and enters {string}")
	public void user_goes_to_administration_and_users_and_click_on_Block_Unblock_menu_and_enters(String userName)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.blockUser(userName);
	}

	@Then("blocks the user profile")
	public void blocks_the_user_profile() {
		userPage.blockRecord();
	}

	@Then("user then approves the record")
	public void user_then_approves_the_record() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.approveMenu();
		userPage = userPage.approveUser();

	}

	// User Remove Method
	@Then("user goes to administration and users and click on Remove menu and enters {string}")
	public void user_goes_to_administration_and_users_and_click_on_Remove_menu_and_enters(String userName)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userPage = homePage.removeUser(userName);
	}

	@Then("removes the user profile")
	public void removes_the_user_profile() throws InterruptedException {

		userPage.removeRecord();
	}

	@After
	public void quitBrowser() {
		driver.quit();
	}
}

