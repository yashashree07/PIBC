package StepDefinition;

import org.junit.Assert;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.DBLoadPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.IsraeliParticipantBank;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.pages.ParticipantBankPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Then;

public class DBLoadStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	DBLoadPage dbLoadPage;
	ParticipantBankPage	participantBankPage;
	IsraeliParticipantBank IsraeliparticipantBank;
	Windowhandle win;

	@Then("User goes to Maintenance DB and open DB Loads menu to upload Participant Banks")
	public void user_goes_to_Maintenance_DB_and_open_DB_Loads_menu_to_upload_Participant_Banks() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		dbLoadPage=homePage.clickonDBDBLoadsLink();	
	}
	
	@Then("User uploads IFSC list using {string},{string} and {string}")
	public void user_uploads_IFSC_list_using_and(String Loadtype, String ForceUpdate, String FileName) throws InterruptedException {
		dbLoadPage=dbLoadPage.addParticipantBank(Loadtype, ForceUpdate, FileName);
	}
	
	@Then("User view Participant Bank list")
	public void user_view_Participant_Bank_list() throws InterruptedException {
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
		participantBankPage=homePage.clickonDBParticipantBankListLink();
		participantBankPage=participantBankPage.listParticipantBank();
	}
	
	@Then("User view IsraeliParticipant Bank list")
	public void user_view_IsraeliParticipant_Bank_list() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		IsraeliparticipantBank=homePage.clickonDBIsraeliParticipantBankListLink();
		IsraeliparticipantBank=IsraeliparticipantBank.listIsraeliParticipantBank();
	}
}
