package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.CalendarPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Then;

public class CalendarStepDefinition extends TestBase{
	LoginPage loginPage=new LoginPage();
	HomePage homePage=new HomePage();
	CalendarPage calendarPage;
	Windowhandle win;

	@Then("User goes to Maintenance and open Calendar Add menu to add Calendar")
	public void user_goes_to_Maintenance_and_open_Calendar_Add_menu_to_add_Calendar() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    calendarPage=homePage.clickonCalendarCreateLink();
	}
	
	@Then("User add Calendar with {string},{string},{string} and kept {string} blank")
	public void user_add_Calendar_with_and_kept_blank(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.createCalendar1(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User add Calendar with {string},{string},{string} and enter invalid {string}")
	public void user_add_Calendar_with_and_enter_invalid(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.createCalendar1(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User add Calendar with {string},{string},{string},{string},{string}")
	public void user_add_Calendar_with(String ISOCode, String PaymentType, String Month, String Year,String Daytype) throws InterruptedException {
		calendarPage=calendarPage.createCalendar(ISOCode, PaymentType, Month, Year,Daytype);
	}
	
	@Then("User try to add existing Calendar with {string},{string},{string},{string}")
	public void user_try_to_add_existing_Calendar_with(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException, IOException {
		calendarPage=calendarPage.addexistingCalendar(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User goes to Maintenance and open Calendar Approve menu to approve Calendar")
	public void user_goes_to_Maintenance_and_open_Calendar_Approve_menu_to_approve_Calendar() throws InterruptedException {
		driver.switchTo().frame("content");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		homePage.LogOut();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarPage=homePage.clickonCalendarApproveLink();
	}

	@Then("User Approves Calendar using {string},{string},{string},{string}")
	public void user_Approves_Calendar_using(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.approveCalendar(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User Rejects Calendar using {string},{string},{string},{string}")
	public void user_Rejects_Calendar_using(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.rejectCalendar(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User send Calendar to Repair queue using {string},{string},{string},{string}")
	public void user_send_Calendar_to_Repair_queue_using(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.sendtorepairqueue(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User goes to Maintenance and open Calendar Create Bulk Calendar menu")
	public void user_goes_to_Maintenance_and_open_Calendar_Create_Bulk_Calendar_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarPage=homePage.clickonCalendarCreateBulkCalendarLink();
	}
	
	@Then("User add Calendar details with {string},{string},{string},{string}")
	public void user_add_Calendar_details_with(String ISOCode, String PaymentType, String FromYear, String ToYear) throws InterruptedException {
		calendarPage=calendarPage.addBulkCalendarwithInvaliddata(ISOCode, PaymentType, FromYear, ToYear);
	}
	
	@Then("User enter Calendar details with {string},{string},{string},{string}")
	public void user_enter_Calendar_details_with(String ISOCode, String PaymentType, String FromYear, String ToYear) throws InterruptedException {
		calendarPage=calendarPage.addBulkCalendarwithValiddata(ISOCode, PaymentType, FromYear, ToYear);
	}
	
	@Then("User fill Calendar details with {string},{string},{string},{string}")
	public void user_fill_Calendar_details_with(String ISOCode, String PaymentType, String FromYear, String ToYear) throws InterruptedException {
		calendarPage=calendarPage.addExistingCalendar(ISOCode, PaymentType, FromYear, ToYear);
	}
	
	@Then("User goes to Maintenance and open Calendar View menu")
	public void user_goes_to_Maintenance_and_open_Calendar_View_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    calendarPage=homePage.clickonCalendarViewLink();
	}

	@Then("User view Calendar using {string},{string},{string},{string} and {string}")
	public void user_view_Calendar_using_and(String ISOCode, String PaymentType, String Month, String Year,String Status) throws InterruptedException {
		calendarPage=calendarPage.viewCalendarwithInvaliddata(ISOCode, PaymentType, Month, Year, Status);
	}
	
	@Then("User view Calendar using valid {string},{string},{string},{string} and {string}")
	public void user_view_Calendar_using_valid_and(String ISOCode, String PaymentType, String Month, String Year,String Status) throws InterruptedException {
		calendarPage=calendarPage.viewCalendarwithValiddata(ISOCode, PaymentType, Month, Year, Status);
	}
	
	@Then("User goes to Maintenance and open Calendar Modify menu")
	public void user_goes_to_Maintenance_and_open_Calendar_Modify_menu() throws InterruptedException {
	   driver.switchTo().frame("toc");
	   Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	   calendarPage=homePage.clickonCalendarModifyLink();
	}

	@Then("User modify Calendar using valid {string},{string},{string},{string},{string}")
	public void user_modify_Calendar_using_valid(String ISOCode, String PaymentType, String Month, String Year, String Daytype) throws InterruptedException {
		calendarPage=calendarPage.modifyCalendarwithValiddata(ISOCode, PaymentType, Month, Year,Daytype);
	}
	
	@Then("User modify Calendar using {string},{string},{string},{string}")
	public void user_modify_Calendar_using(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.modifyCalendarwithInvaliddata(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User goes to Maintenance and open Calendar Delete menu")
	public void user_goes_to_Maintenance_and_open_Calendar_Delete_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    calendarPage=homePage.clickonCalendarDeleteLink();
	}

	@Then("User delete Calendar with {string},{string},{string},{string}")
	public void user_delete_Calendar_with(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.deleteCalendar(ISOCode, PaymentType, Month, Year);
	}
	
	@Then("User delete Calendar using {string},{string},{string},{string}")
	public void user_delete_Calendar_using(String ISOCode, String PaymentType, String Month, String Year) throws InterruptedException {
		calendarPage=calendarPage.deleteCalendar1(ISOCode, PaymentType, Month, Year);
	}
}
