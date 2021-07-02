package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.Windowhandle;
import com.pibc.qa.pages.IsraeliInwardPaymentFlow;

public class HomePage extends TestBase {

	Windowhandle win = new Windowhandle(driver);
	@FindBy(xpath = "//a[contains(text(),'Environment')]")
	WebElement environmentLink;

	@FindBy(xpath = "//a[contains(text(),'Run')]")
	WebElement environmentRunLink;

	@FindBy(xpath = "//a[contains(text(),'Application')]")
	WebElement applicationLink;

	@FindBy(xpath="//a[contains(text(),'Cheque Data Entry')]")
	WebElement chequeDataEntryLink;
	
	@FindBy(xpath="//a[contains(text(),'List')]")
	WebElement chequeDataEntryListLink;
	
	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[7]/td[4]/a")
	WebElement maintenanceLink;

	@FindBy(xpath = "//a[contains(text(),'User Authorization Matrix')]")
	WebElement userAuthorizationMatrixLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement userAuthorizationMatrixAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement userAuthorizationMatrixApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement userAuthorizationMatrixDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement userAuthorizationMatrixListLink;

	@FindBy(xpath = "//a[contains(text(),'DB')]")
	WebElement dbLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement dbloadsLink;

	@FindBy(xpath = "//a[contains(text(),'Cheque Stop')]")
	WebElement chequeStopLink;

	@FindBy(xpath = "//a[contains(text(),'Enter')]")
	WebElement chequeStopEnterLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement chequeStopApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement chequeStopModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Bulk Upload')]")
	WebElement chequeStopBulkUploadLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement chequeStopListLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement chequeStopDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Schedule')]")
	WebElement scheduleLink;

	@FindBy(xpath = "//a[contains(text(),'Control')]")
	WebElement scheduleControlLink;

	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement scheduleNewLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement scheduleListLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement scheduleModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Currency')]")
	WebElement currencyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement currencyAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement currencyApproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement currencyListLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement currencyDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement currencyModifyLink;

	@FindBy(xpath = "//tr[15]//td[5]//a[1]")
	WebElement calendarLink;

	@FindBy(xpath = "//tr[17]//td[6]//a[1]")
	WebElement calendarCreateLink;

	@FindBy(xpath = "//a[contains(text(),'Create Bulk Calendar')]")
	WebElement calendarCreateBulkCalendarLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement calendarApproveLink;

	@FindBy(xpath = "//tr[16]//td[6]//a[1]")
	WebElement calendarViewLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement calendarDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Modify/Repair')]")
	WebElement calendarModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Participant Bank')]")
	WebElement participantBankLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement participantBankListLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement participantBankApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement participantBankModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement participantBankAddLink;
	
	@FindBy(xpath = "//a[contains(text(),'Israeli Participant Bank')]")
	WebElement israeliparticipantBankLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement israeliparticipantBankListLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement israeliparticipantBankApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement israeliparticipantBankModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement israeliparticipantBankAddLink;

	@FindBy(xpath = "//a[contains(text(),'International Currency')]")
	WebElement internationalCurrencyLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement internationalCurrencyListLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement internationalCurrencyAddLink;

	@FindBy(xpath = "//button[@class='btnLogout']")
	WebElement logoutBtn;

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	WebElement logoutOKBtn;

	@FindBy(xpath = "//a[contains(text(),'Corporate CMS')]")
	WebElement corporateCMSlink;

	@FindBy(xpath = "//a[contains(text(),'Industry Type')]")
	WebElement industryTypeLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement industryTypeaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement industryTypeapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement industryTypelistLink;

	@FindBy(xpath = "//a[contains(text(),'Business Group')]")
	WebElement businessGroupLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement businessGroupaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement businessGroupapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement businessGrouplistLink;

	@FindBy(xpath = "//a[contains(text(),'Accounting')]")
	WebElement accountingLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement accountingaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement accountingapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement accountingviewLink;

	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	WebElement customerLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement customerAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement customerApproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement customerListLink;

	@FindBy(xpath = "//a[contains(text(),'Static Data')]")
	WebElement staticDataLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement dbLoadsLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[12]/td[6]/a")
	WebElement ifsccodeLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement ifsccodelistLink;

	@FindBy(xpath = "//a[contains(text(),'Mandate Management')]")
	WebElement mandateManagementLink;

	@FindBy(xpath = "//a[contains(text(),'Amend Mandate')]")
	WebElement amendMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Accept Mandates')]")
	WebElement acceptMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Approve Mandate')]")
	WebElement approveMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Modify Mandate')]")
	WebElement modifyMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Create MMS OutFile')]")
	WebElement createMMSoutfileLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[10]/td[4]/a")
	WebElement paymentLink;

	@FindBy(xpath="//a[contains(text(),'PDC')]")
	WebElement pdcLink;
	
	@FindBy(xpath="//a[contains(text(),'Delete')]")
	WebElement pdcDeleteLink;
	
	@FindBy(xpath="//tr[19]//td[6]//a[1]")
	WebElement pdcModifyLink;
	
	@FindBy(xpath="//*[@id=\"menuBody\"]/table/tbody/tr[23]/td[6]/a")
	WebElement PDCModifyLink;
	
	@FindBy(xpath="//*[@id=\"menuBody\"]/table/tbody/tr[19]/td[5]/a")
	WebElement insufficientFundLink;
	
	@FindBy(xpath="//a[contains(text(),'Insufficient Fund Approve')]")
	WebElement insufficientFundApproveLink;
	
	@FindBy(xpath="//a[contains(text(),'Manual Tray')]")
	WebElement manualTrayLink;
	
	@FindBy(xpath = "//a[contains(text(),'List All')]")
	WebElement paymentListAllLink;

	@FindBy(xpath="//a[contains(text(),'Duplicate')]")
	WebElement paymentDuplicateLink;
	
	@FindBy(xpath="//a[contains(text(),'Qualify Receive')]")
	WebElement paymentQualifyReceiveLink;
	
	@FindBy(xpath="//a[contains(text(),'Repair')]")
	WebElement paymentRepairLink;
	
	@FindBy(xpath="//*[@id=\"menuBody\"]/table/tbody/tr[17]/td[5]/a")
	WebElement paymentApproveLink;
	
	@FindBy(xpath="//*[@id=\"menuBody\"]/table/tbody/tr[15]/td[5]/a")
	WebElement signatureCheckLink;
	
	@FindBy(xpath="//a[contains(text(),'Signature Check Approve')]")
	WebElement signatureCheckApproveLink;
	
	// WebElements

	@FindBy(xpath = "//a[contains(text(),'Administration')]")
	WebElement administrationMenu;

	// User Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'User')]")
	WebElement userMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement userList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement userAdd;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement userOk;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement userModify;

	@FindBy(name = "userName")
	WebElement modifyUserNameTxtField;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement userApprove;

	// User-Approve page btn
	@FindBy(xpath = "//input[@value='OK']")
	WebElement approveOkBtn;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement userBlock;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement blockUserNameTxtField;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement userRemove;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement removeUserNameTextField;

	// Group Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Group')]")
	WebElement groupMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement groupList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement groupAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement groupModify;

	@FindBy(name = "groupName")
	WebElement grpModifyTextField;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnModifyOk;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement groupApprove;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement groupOk;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement groupBlock;

	@FindBy(xpath = "//a[contains(text(),'Unblock')]")
	WebElement groupUnblock;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement groupRemove;

	@FindBy(name = "groupName")
	WebElement groupTextfield;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnGroupOk;

	// Profile Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Profiles')]")
	WebElement profileMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement profileList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement profileAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement profileModify;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement profileApprove;

	@FindBy(name = "profileName")
	WebElement textFieldProfileName;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement approvePageBtnOk;

	@FindBy(xpath = "//input[@type=\"reset\"]")
	WebElement approvePageBtnReset;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement profileRemove;

	@FindBy(name = "profileName")
	WebElement textfieldRemoveProfile;

	// Scanner Profile Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Scanner Profile')]")
	WebElement scannerProfileMenu;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement scannerProfileView;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement scannerProfileAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement scannerProfileModify;

	@FindBy(xpath = "//input[@name='profileName']")
	WebElement scannerProfileModifyTextField;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement scannerProfileApprove;

	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement btnSubmit;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement scannerProfileRemove;

	@FindBy(xpath = "//input[@name='profileName']")
	WebElement scannerProfileRemoveTextField;

	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement btnRemoveSubmit;

	// Scanner Profile Mapping Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Scanner Profile Mapping')]")
	WebElement scannerProfileMapMenu;

	@FindBy(xpath = "//a[contains(text(),'Profile Mapping')]")
	WebElement profileMapping;

	@FindBy(xpath = "//a[contains(text(),'Profile Mapping List')]")
	WebElement profileMappingList;
	
	//for IsraeliParticipantBanksSetup
	
	@FindBy(xpath = "//a[contains(text(),'Israeli Participant Bank')]")
	WebElement IsraeliparticipantBankLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement IsraeliparticipantBankListLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement IsraeliparticipantBankApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement IsraeliparticipantBankModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement IsraeliparticipantBankAddLink;
	
	@FindBy(xpath="//a[contains(text(),'File Manager')]")
    WebElement fileManagerLink;
	
	@FindBy(xpath="//a[contains(text(),'File Upload')]")
	WebElement fileUploadLink;
	
	@FindBy(xpath="//a[contains(text(),'File View')]")
	WebElement fileViewLink;
	
	@FindBy(xpath="//a[contains(text(),'Outfile Request')]")
	WebElement outfileRequestLink;
	
	@FindBy(xpath="//a[contains(text(),'Create')]")
	WebElement createLink;

	@FindBy(xpath="//a[contains(text(),'List')]")
	WebElement outFileRequestViewLink;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public EnvironmentPage clickonEnvironmentRunLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentRunLink.click();
		win.handlewin();
		return new EnvironmentPage();
	}

	public InternationalCurrencyPage clickonDBInternationalCurrencyListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		internationalCurrencyLink.click();
		internationalCurrencyListLink.click();
		win.handlewin();
		return new InternationalCurrencyPage();
	}

	public InternationalCurrencyPage clickonDBInternationalCurrencyAddLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		maintenanceLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		dbLink.click();
		internationalCurrencyLink.click();
		internationalCurrencyAddLink.click();
		win.handlewin();
		return new InternationalCurrencyPage();
	}

	public ParticipantBankPage clickonDBParticipantBankListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		participantBankLink.click();
		participantBankListLink.click();
		win.handlewin();
		return new ParticipantBankPage();
	}

	public ParticipantBankPage clickonDBParticipantBankAddLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		participantBankLink.click();
		participantBankAddLink.click();
		win.handlewin();
		return new ParticipantBankPage();
	}

	public ParticipantBankPage clickonDBParticipantBankApproveLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		participantBankLink.click();
		participantBankApproveLink.click();
		win.handlewin();
		return new ParticipantBankPage();
	}

	public ParticipantBankPage clickonDBParticipantBankModifyLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		participantBankLink.click();
		participantBankModifyLink.click();
		win.handlewin();
		return new ParticipantBankPage();
	}

	public DBLoadPage clickonDBDBLoadsLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		dbloadsLink.click();
		win.handlewin();
		return new DBLoadPage();
	}

	public SchedulePage clickonScheduleNewLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		scheduleLink.click();
		scheduleNewLink.click();
		win.handlewin();
		return new SchedulePage();
	}

	public SchedulePage clickonScheduleControlLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		scheduleLink.click();
		scheduleControlLink.click();
		win.handlewin();
		return new SchedulePage();
	}

	public SchedulePage clickonScheduleListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		scheduleLink.click();
		scheduleListLink.click();
		win.handlewin();
		return new SchedulePage();
	}

	public SchedulePage clickonScheduleModifyLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		scheduleLink.click();
		scheduleModifyLink.click();
		win.handlewin();
		return new SchedulePage();
	}

	public CurrencyPage clickonCurrencyAddLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		currencyLink.click();
		currencyAddLink.click();
		win.handlewin();
		return new CurrencyPage();
	}

	public CurrencyPage clickonCurrencyApproveLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		currencyLink.click();
		currencyApproveLink.click();
		win.handlewin();
		return new CurrencyPage();
	}

	public CurrencyPage clickonCurrencyListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		currencyLink.click();
		currencyListLink.click();
		win.handlewin();
		return new CurrencyPage();
	}

	public CurrencyPage clickonCurrencyModifyLink() throws InterruptedException {
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		maintenanceLink.click();
		currencyLink.click();
		currencyModifyLink.click();
		win.handlewin();
		return new CurrencyPage();
	}

	public CurrencyPage clickonCurrencyDeleteLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		currencyLink.click();
		currencyDeleteLink.click();
		win.handlewin();
		return new CurrencyPage();
	}

	public CalendarPage clickonCalendarCreateLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarCreateLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public CalendarPage clickonCalendarViewLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarViewLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public CalendarPage clickonCalendarCreateBulkCalendarLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarCreateBulkCalendarLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public CalendarPage clickonCalendarApproveLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarApproveLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public CalendarPage clickonCalendarDeleteLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarDeleteLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public CalendarPage clickonCalendarModifyLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		calendarModifyLink.click();
		win.handlewin();
		return new CalendarPage();
	}

	public ChequeStopPage clickonChequeStopEnterLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		chequeStopEnterLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public ChequeStopPage clickonChequeStopApproveLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		chequeStopApproveLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public ChequeStopPage clickonChequeStopListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		chequeStopListLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public ChequeStopPage clickonChequeStopDeleteLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		chequeStopDeleteLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public ChequeStopPage clickonChequeStopModifyLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		chequeStopModifyLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public ChequeStopPage clickonChequeStopBulkUploadLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		dbLink.click();
		chequeStopLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeStopBulkUploadLink.click();
		win.handlewin();
		return new ChequeStopPage();
	}

	public UserAuthorizationMatrixPage clickonUserAutorizationMatrixAddLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		userAuthorizationMatrixLink.click();
		userAuthorizationMatrixAddLink.click();
		win.handlewin();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage clickonUserAutorizationMatrixApproveLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		userAuthorizationMatrixLink.click();
		userAuthorizationMatrixApproveLink.click();
		win.handlewin();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage clickonUserAutorizationMatrixListLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		userAuthorizationMatrixLink.click();
		userAuthorizationMatrixListLink.click();
		win.handlewin();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage clickonUserAutorizationMatrixDeleteLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		userAuthorizationMatrixLink.click();
		userAuthorizationMatrixDeleteLink.click();
		win.handlewin();
		return new UserAuthorizationMatrixPage();
	}

	public UserPage createUser() throws InterruptedException {
		administrationMenu.click();
		userMenu.click();
		userAdd.click();
		win.handlewin();
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		userOk.click();
		return new UserPage();
	}

	public UserPage modifyUser(String username) throws InterruptedException {

		Thread.sleep(3000);
		administrationMenu.click();
		userMenu.click();
		userModify.click();
		win.handlewin();
		modifyUserNameTxtField.sendKeys(username);
		okBtn.click();

		return new UserPage();
	}

	public UserPage blockUser(String userName) throws InterruptedException {
		administrationMenu.click();
		userMenu.click();
		userBlock.click();
		win.handlewin();
		blockUserNameTxtField.sendKeys(userName);
		okBtn.click();

		return new UserPage();

	}

	public UserPage approveMenu() throws InterruptedException {
		administrationMenu.click();
		userMenu.click();
		userApprove.click();
		win.handlewin();
//		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveOkBtn.click();
		return new UserPage();
	}

	public UserPage removeUser(String userName) throws InterruptedException {
		administrationMenu.click();
		userMenu.click();
		userRemove.click();
		win.handlewin();
		removeUserNameTextField.sendKeys(userName);
		okBtn.click();
		return new UserPage();

	}

	// ----------------------Group Menu Methods--------------------------------//

	public GroupPage createGroup() throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		groupAdd.click();
		win.handlewin();
		return new GroupPage();

	}

	public GroupPage approveGroup() throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		groupApprove.click();
		win.handlewin();
		groupOk.click();
		return new GroupPage();
	}

	public GroupPage modifyGroup(String name) throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		groupModify.click();
		win.handlewin();
		grpModifyTextField.sendKeys(name);
		btnModifyOk.click();
		return new GroupPage();
	}

	public GroupPage removeGroup(String name) throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		groupRemove.click();
		win.handlewin();
		groupTextfield.sendKeys(name);
		btnGroupOk.click();

		return new GroupPage();
	}

	// --------------------------Profile Menu
	// Methods----------------------------------------//

	public ProfilePage createProfile() throws InterruptedException {

		administrationMenu.click();
		profileMenu.click();
		profileAdd.click();
		win.handlewin();
		return new ProfilePage();

	}

	public ProfilePage modifyProfile(String profilename) throws InterruptedException {
		administrationMenu.click();
		profileMenu.click();
		profileModify.click();
		win.handlewin();
		textFieldProfileName.sendKeys(profilename);
		btnOk.click();

		return new ProfilePage();

	}

	public ProfilePage removeProfile(String ProfileName) throws InterruptedException {

		administrationMenu.click();
		profileMenu.click();
		profileRemove.click();
		win.handlewin();
		textfieldRemoveProfile.sendKeys(ProfileName);
		btnOk.click();
		return new ProfilePage();
	}

	public ProfilePage approveProfile() throws InterruptedException {

		administrationMenu.click();
		profileMenu.click();
		profileApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.handlewin();
		approvePageBtnOk.click();
		return new ProfilePage();

	}

	// ------------------------Scanner Profile Menu
	// Methods---------------------------//

	public ScannerProfilePage addScan() throws InterruptedException {

		administrationMenu.click();
		scannerProfileMenu.click();
		scannerProfileAdd.click();
		win.handlewin();
		return new ScannerProfilePage();
	}

	public ScannerProfilePage approveScan() throws InterruptedException {

		administrationMenu.click();
		scannerProfileMenu.click();
		scannerProfileApprove.click();
		win.handlewin();
		btnSubmit.click();
		return new ScannerProfilePage();
	}

	public ScannerProfilePage modifyScan(String profilename) throws InterruptedException {
		administrationMenu.click();
		scannerProfileMenu.click();
		scannerProfileModify.click();
		win.handlewin();
		scannerProfileModifyTextField.sendKeys(profilename);
		btnSubmit.click();
		return new ScannerProfilePage();

	}

	public ScannerProfilePage removeScan(String profile) throws InterruptedException {
		administrationMenu.click();
		scannerProfileMenu.click();
		scannerProfileRemove.click();
		win.handlewin();
		scannerProfileRemoveTextField.sendKeys(profile);
		btnRemoveSubmit.click();
		return new ScannerProfilePage();
	}
	
	public PaymentFlow checkPayment() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentListAllLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonSignatureCheckLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		signatureCheckLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonSignatureCheckApproveLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		signatureCheckApproveLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonDuplicateLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentDuplicateLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonQualifyReceive() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentQualifyReceiveLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonRepairLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentRepairLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonApproveLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentApproveLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonManualTrayLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		manualTrayLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonInsufficientFundLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		insufficientFundLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonInsufficientFundApproveLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		insufficientFundApproveLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public OnusPaymentFlow clickonChequeDataEntryListLink() throws InterruptedException {
		applicationLink.click();
		chequeDataEntryLink.click();
		chequeDataEntryListLink.click();
		win.handlewin();
		return new OnusPaymentFlow();
	}
	
	public PaymentFlow clickonPDCDeleteLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcDeleteLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow clickonPDCModifyLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcModifyLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	//-------PDC Flows Methods for Onus flow---------------
	public PaymentFlow clickPDCModifyLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		PDCModifyLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	
	// ---------------Outward Payment Flow Xpath and
		// method-----------------------------//

		public OutwardPaymentPage clickonChequeDataEntryLink() throws InterruptedException {

			applicationLink.click();
			chequeDataEntryLink.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			chequeDataEntryListLink.click();
			win.handlewin();
			return new OutwardPaymentPage();
		}

		public OutwardPaymentPage checkPayment1() throws InterruptedException {
			applicationLink.click();
			paymentLink.click();
			paymentListAllLink.click();
			win.handlewin();
			return new OutwardPaymentPage();
		}
		
	public OutwardPaymentPage paymentapproveLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentApproveLink.click();
		win.handlewin();
		return new OutwardPaymentPage();
	}

	//----Duplicate menu---//
	public OutwardPaymentPage duplicateMenu() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentDuplicateLink.click();
		win.handlewin();
		return new OutwardPaymentPage();
	}
	
	//--------Repair menu---//
	public OutwardPaymentPage repairMenu() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		paymentRepairLink.click();
		win.handlewin();
		return new OutwardPaymentPage();	
	}
	
	//for IsraeliParticipantBank Setup
    public IsraeliParticipantBank clickonDBIsraeliParticipantBankListLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		maintenanceLink.click();
		dbLink.click();
		IsraeliparticipantBankLink.click();
		IsraeliparticipantBankListLink.click();
		win.handlewin();
		return new IsraeliParticipantBank();
	}
	
	//for IsraeliParticipantBank Setup
	public IsraeliParticipantBank clickonDBIsraeliParticipantBankAddLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		maintenanceLink.click();
		dbLink.click();
		IsraeliparticipantBankLink.click();
		IsraeliparticipantBankAddLink.click();
		win.handlewin();
		return new IsraeliParticipantBank();
	}
	
	//for IsraeliParticipantBank Setup
	public IsraeliParticipantBank clickonDBIsraeliParticipantBankApproveLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		maintenanceLink.click();
		dbLink.click();
		IsraeliparticipantBankLink.click();
		IsraeliparticipantBankApproveLink.click();
		win.handlewin();
		return new IsraeliParticipantBank();
	}
	
	//for IsraeliParticipantBank Setup
	public IsraeliParticipantBank clickonDBIsraeliParticipantBankModifyLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		maintenanceLink.click();
		dbLink.click();
		IsraeliparticipantBankLink.click();
		IsraeliparticipantBankModifyLink.click();
		win.handlewin();
		return new IsraeliParticipantBank();
	}
	//----------OutwardPDCDelete-------------------
	public OutwardPaymentPage clickonPDC_DeleteLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcDeleteLink.click();
		win.handlewin();
		return new OutwardPaymentPage();
	}//end
	
	public OutwardPaymentPage clickonPDCModify_Link() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		pdcLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		PDCModifyLink.click();
		win.handlewin();
		return new OutwardPaymentPage();
	}
	
	//-------------ISRAELI INWARD PAYMENT FLOW METHOD------------------
	
	public IsraeliInwardPaymentFlow clickonFileManagerFileUploadLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileManagerLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileUploadLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}//end 
	
	public IsraeliInwardPaymentFlow clickChequeDataEntryLink() throws InterruptedException {
		applicationLink.click();
		chequeDataEntryLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeDataEntryListLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}//end
	
	public IsraeliInwardPaymentFlow clickonFileManagerFileViewLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileManagerLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileViewLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}//end 

//-trail
	public OutwardPaymentPage clickFileManagerFileUploadLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileManagerLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileUploadLink.click();
		win.handlewin();
		return new OutwardPaymentPage();
	}//end 
	
	public void LogOut() {
		logoutBtn.click();
		logoutOKBtn.click();
		driver.quit();
	}
	
//	-----ISRAELI------
	public IsraeliInwardPaymentFlow checkPaymentIsraeliInwardFlow() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentListAllLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
		
	}//end
	
	public IsraeliInwardPaymentFlow clickSignatureCheckLink() throws InterruptedException {
		applicationLink.click();
		paymentLink.click();
		signatureCheckLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow clickSignatureCheckApproveLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		signatureCheckApproveLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}
	public IsraeliInwardPaymentFlow clickonOutfileRequestCreatelink() throws InterruptedException 
	{
		applicationLink.click();
		fileManagerLink.click();
		outfileRequestLink.click();
		createLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}//end
	
	public IsraeliInwardPaymentFlow clickonOutfileRequestViewlink() throws InterruptedException {
		applicationLink.click();
		fileManagerLink.click();
		outfileRequestLink.click();
		outFileRequestViewLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}//end
	
	public IsraeliInwardPaymentFlow clickInsufficientFundLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		insufficientFundLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow clickInsufficientFundApproveLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		applicationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		paymentLink.click();
		insufficientFundApproveLink.click();
		win.handlewin();
		return new IsraeliInwardPaymentFlow();
	}
	
}
