package StepDefinition;

import org.junit.Assert;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.UserAuthorizationMatrixPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserAuthorizationMatrixStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	UserAuthorizationMatrixPage userAuthorizationMatrixPage;
	Windowhandle win;
	
	@Given("User login in system")
	public void user_login_in_system() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("User goes to Maintenance and open User Autorization Matrix Add menu")
	public void user_goes_to_Maintenance_and_open_User_Autorization_Matrix_Add_menu() throws InterruptedException {
	   driver.switchTo().frame("toc");
	   Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	   userAuthorizationMatrixPage=homePage.clickonUserAutorizationMatrixAddLink();
	}

	@Then("User kept mandatory fields blank")
	public void user_kept_mandatory_fields_blank() throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixwithBlankdata();
	}
	
	@Then("User enter valid data in {string},{string},{string} fields for user {string}")
	public void user_enter_valid_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Maker1,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforOutwardMaker1(credentials);
	}
	
	@Then("User goes to Maintenance and open User Autorization Matrix Approve menu")
	public void user_goes_to_Maintenance_and_open_User_Autorization_Matrix_Approve_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		userAuthorizationMatrixPage=homePage.clickonUserAutorizationMatrixApproveLink();
	}
	
	@Then("User approves the record")
	public void user_approves_the_record() throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.approvematrix();
	}
	
	@Then("User fill valid data in {string},{string},{string} fields for user {string}")
	public void user_fill_valid_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Checker1,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforOutwardChecker1(credentials);
	}
	
	@Then("User enter data in {string},{string},{string} fields for user {string}")
	public void user_enter_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Maker2,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforInwardMaker2(credentials);
	}
	
	@Then("User fill data in {string},{string},{string} fields for user {string}")
	public void user_fill_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Checker2,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforInwardChecker2(credentials);
	}
	
	@Then("User pass data in {string},{string},{string} fields for user {string}")
	public void user_pass_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Maker3,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforOnusMaker3(credentials);
	}
	
	@Then("User entered data in {string},{string},{string} fields for user {string}")
	public void user_entered_data_in_fields_for_user(String Name, String Stages, String PaymentTypes,String Checker3,DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.addMatrixdataforOnusChecker3(credentials);
	}
	
	@Then("User goes to Maintenance and open User Autorization Matrix List menu")
	public void user_goes_to_Maintenance_and_open_User_Autorization_Matrix_List_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    userAuthorizationMatrixPage=homePage.clickonUserAutorizationMatrixListLink();
	}
	
	@Then("user view list")
	public void user_view_list(DataTable credentials) throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.listMatrix(credentials);
	}

	@Then("User goes to Maintenance and open User Autorization Matrix Delete menu")
	public void user_goes_to_Maintenance_and_open_User_Autorization_Matrix_Delete_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    userAuthorizationMatrixPage=homePage.clickonUserAutorizationMatrixDeleteLink();
	}

	@Then("user delete the record")
	public void user_delete_the_record() throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.deleteMatrix();
	}
	
	@Then("User approves all deleted records")
	public void user_approves_all_deleted_records() throws InterruptedException {
		userAuthorizationMatrixPage=userAuthorizationMatrixPage.approvematrix1();
	}
	
}
