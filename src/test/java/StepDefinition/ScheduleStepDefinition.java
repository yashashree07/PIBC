package StepDefinition;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.SchedulePage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ScheduleStepDefinition extends TestBase {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	SchedulePage schedulePage;
	Windowhandle win;
	
	@Then("User goes Maintenance and open Schedule Control menu")
	public void user_goes_Maintenance_and_open_Schedule_Control_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    schedulePage=homePage.clickonScheduleControlLink();
	}
	
	@Then("User Activate the Scheduler Service")
	public void user_Activate_the_Scheduler_Service() throws InterruptedException {
		schedulePage=schedulePage.checkSchedulerstatus();
	}
	
	@Then("User list the Scheduler")
	public void user_list_the_Scheduler() throws InterruptedException {
		schedulePage=schedulePage.listSchedulers();
	}
	
	@Then("User goes Maintenance and open Schedule New menu")
	public void user_goes_Maintenance_and_open_Schedule_New_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		schedulePage = homePage.clickonScheduleNewLink();
	}

	@Then("User add {string} with invalid StartTime")
	public void user_add_with_invalid_StartTime(String StartTime,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.addSchedulerwithInvalidStartTime(credentials);
	}

	@Then("User add {string} with invalid EndTime")
	public void user_add_with_invalid_EndTime(String EndTime,DataTable credentials) {
		schedulePage=schedulePage.addSchedulerwithInvalidEndTime(credentials);
	}
	
	@Then("User add {string} with StartTime field blank")
	public void user_add_with_StartTime_field_blank(String StartTime,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.addSchedulerwithBlankStartTime(credentials);
	}

	@Then("User add {string} with EndTime field blank")
	public void user_add_with_EndTime_field_blank(String EndTime,DataTable credentials) {
		schedulePage=schedulePage.addSchedulerwithBlankEndTime(credentials);
	}
	
	@Then("User add {string},{string},{string},{string},{string},{string},{string}")
	public void user_add(String Scheduler, String StartTime, String EndTime, String FrequencyHH, String FrequenyMM,
			String FrequencySS, String SettlementCycle) throws InterruptedException {
		schedulePage = schedulePage.addSchedulerwithvaliddata(Scheduler, StartTime, EndTime, FrequencyHH, FrequenyMM,
				FrequencySS, SettlementCycle);
	}

	@Then("User tries to add already existing {string}")
	public void user_tries_to_add_already_existing(String Scheduler) throws InterruptedException {
		schedulePage = schedulePage.addExistingScheduler(Scheduler);
	}

	@Then("User goes Maintenance and open Schedule Modify menu")
	public void user_goes_Maintenance_and_open_Schedule_Modify_menu() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    schedulePage=homePage.clickonScheduleModifyLink();
	}
	
	@Then("User modify EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyEGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILEScheduler(credentials);
	}

	@Then("User modify EGPS_VIP_CHEQUE_OUTFILE scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_EGPS_VIP_CHEQUE_OUTFILE_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyEGPS_VIP_CHEQUE_OUTFILEScheduler(credentials);
	}

	@Then("User modify PRE_ISF_SCHEDULER scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_PRE_ISF_SCHEDULER_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyPRE_ISF_SCHEDULERScheduler(credentials);
	}

	@Then("User modify ONUS_CHEQUE_AUTO_RETURN scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_ONUS_CHEQUE_AUTO_RETURN_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyONUS_CHEQUE_AUTO_RETURNScheduler(credentials);
	}

	@Then("User modify CHEQUE_AUTO_RETURN scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_CHEQUE_AUTO_RETURN_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyCHEQUE_AUTO_RETURNScheduler(credentials);
	}

	@Then("User modify EGPS_CHEQUE_OUTFILE scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_EGPS_CHEQUE_OUTFILE_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyEGPS_CHEQUE_OUTFILEScheduler(credentials);
	}

	@Then("User modify EGPS_CHEQUE_RETURN_OUTFILE scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_EGPS_CHEQUE_RETURN_OUTFILE_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyEGPS_CHEQUE_RETURN_OUTFILEScheduler(credentials);
	}
	
	@Then("User modify FINAL_ISF_SCHEDULER scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_FINAL_ISF_SCHEDULER_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyFINAL_ISF_SCHEDULER(credentials);
	}

	@Then("User modify ISRAELI_CHEQUE_AUTO_RETURN scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_ISRAELI_CHEQUE_AUTO_RETURN_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyISRAELI_CHEQUE_AUTO_RETURN(credentials);
	}

	@Then("User modify ISRAELI_CHEQUE_STOP_SCHEDULER scheduler with {string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_ISRAELI_CHEQUE_STOP_SCHEDULER_scheduler_with(String SchedulerStatus, String StartTime, String EndTime, String FrequencyHH, String FrequencyMM, String FrequencySS, String SettlementCycle,DataTable credentials) throws InterruptedException {
		schedulePage=schedulePage.modifyISRAELI_CHEQUE_STOP_SCHEDULER(credentials);
	}
	
	@Then("User goes Maintenance and open Schedule List menu")
	public void user_goes_Maintenance_and_open_Schedule_List_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		schedulePage = homePage.clickonScheduleListLink();
	}

	@Then("User Select valid criteria using {string} and click on OK button")
	public void user_Select_valid_criteria_using_and_click_on_OK_button(String SchedulerStatus) throws InterruptedException {
		schedulePage=schedulePage.listAllSchedulers(SchedulerStatus);
	}

	@Then("User Select {string} and click on OK button")
	public void user_Select_and_click_on_OK_button(String SchedulerStatus) throws InterruptedException {
		schedulePage=schedulePage.listEnabledSchedulers(SchedulerStatus);
	}
	
	@Then("User Select {string} and Click on OK button")
	public void user_Select_and_Click_on_OK_button(String SchedulerStatus) throws InterruptedException {
		schedulePage=schedulePage.listDisabledSchedulers(SchedulerStatus);
	}
}
