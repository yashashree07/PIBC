package com.pibc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.TestUtil;

public class ProfilePage extends TestBase {

	//--------- Profile Page Xpath----------
	
	//Administration

	// user menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[15]/td[7]/input")
	WebElement chkboxUserList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[16]/td[7]/input")
	WebElement chkboxUserAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[17]/td[7]/input")
	WebElement chkboxUserModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[18]/td[7]/input")
	WebElement chkboxUserApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[19]/td[7]/input")
	WebElement chkboxUserBlock;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[20]/td[7]/input")
	WebElement chkboxUserRemove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[22]/td[7]/input")
	WebElement chkboxUserReportBuild;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[23]/td[7]/input")
	WebElement chkboxUserReportView;


	//group menu checkbox 
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[25]/td[7]/input")
	WebElement chkboxGroupList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[26]/td[7]/input")
	WebElement chkboxGroupAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[27]/td[7]/input")
	WebElement chkboxGroupModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[28]/td[7]/input")
	WebElement chkboxGroupApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[29]/td[7]/input")
	WebElement chkboxGroupBlock;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[30]/td[7]/input")
	WebElement chkboxGroupUnBlock;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[31]/td[7]/input")
	WebElement chkboxGroupRemove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[33]/td[7]/input")
	WebElement chkboxGroupReportBuild;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[34]/td[7]/input")
	WebElement chkboxGroupReportView;


	// Profile menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[36]/td[7]/input")
	WebElement chkboxProfileList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[37]/td[7]/input")
	WebElement chkboxProfileAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[38]/td[7]/input")
	WebElement chkboxProfileModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[39]/td[7]/input")
	WebElement chkboxProfileApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[40]/td[7]/input")
	WebElement chkboxProfileRemove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[42]/td[7]/input")
	WebElement chkboxProfileReportBuild;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[43]/td[7]/input")
	WebElement chkboxProfileReportView;

	//Scanner Profile menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[45]/td[7]/input")
	WebElement checkboxScanView;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[46]/td[7]/input")
	WebElement checkboxScanAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[47]/td[7]/input")
	WebElement checkboxScanModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[48]/td[7]/input")
	WebElement checkboxScanRemove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[49]/td[7]/input")
	WebElement checkboxScanApprove;

	//Scanner Profile Mapping menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[51]/td[7]/input")
	WebElement checkboxScanProfileMap;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[52]/td[7]/input")
	WebElement checkboxScanProfileMapList;

	//Environment menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[54]/td[7]/input")
	WebElement checkboxRun;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[55]/td[7]/input")
	WebElement checkboxShow;

	// Application Maintenance menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[58]/td[7]/input")
	WebElement checkboxParameterMaintenance;

	//User Authorization Matrix menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[60]/td[7]/input")
	WebElement checkboxMatrixList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[61]/td[7]/input")
	WebElement checkboxMatrixAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[62]/td[7]/input")
	WebElement checkboxMatrixModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[63]/td[7]/input")
	WebElement checkboxMatrixApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[64]/td[7]/input")
	WebElement checkboxMatrixDelete;

	// Generic Param Constant menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[66]/td[7]/input")
	WebElement checkboxGenericView;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[67]/td[7]/input")
	WebElement checkboxGenericModify;

	//Currency menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[69]/td[7]/input")
	WebElement checkboxCurrencyList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[70]/td[7]/input")
	WebElement checkboxCurrencyAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[71]/td[7]/input")
	WebElement checkboxCurrencyModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[72]/td[7]/input")
	WebElement checkboxCurrencyDelete;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[73]/td[7]/input")
	WebElement checkboxCurrencyApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[74]/td[7]/input")
	WebElement checkboxSampleFile;

	//Email Distribution List menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[77]/td[7]/input")
	WebElement checkboxDistList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[78]/td[7]/input")
	WebElement checkboxDistAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[79]/td[7]/input")
	WebElement checkboxDistApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[80]/td[7]/input")
	WebElement checkboxDistModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[81]/td[7]/input")
	WebElement checkboxDistDelete;

	// Message menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[83]/td[7]/input")
	WebElement checkboxMessageView;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[84]/td[7]/input")
	WebElement checkboxMessageNew;

	//Schedule menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[86]/td[7]/input")
	WebElement checkboxScheduleList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[87]/td[7]/input")
	WebElement checkboxScheduleNew;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[88]/td[7]/input")
	WebElement checkboxScheduleModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[89]/td[7]/input")
	WebElement checkboxScheduleControl;

	//Calendar meny xpath
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[91]/td[7]/input")
	WebElement checkboxCalendarView;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[92]/td[7]/input")
	WebElement checkboxCalendarCreate;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[93]/td[7]/input")
	WebElement checkboxCalendarCreateBulk;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[94]/td[7]/input")
	WebElement checkboxCalendarModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[95]/td[7]/input")
	WebElement checkboxCalendarApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[96]/td[7]/input")
	WebElement checkboxCalendarDelete;

	//DB menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[101]/td[7]/input")
	WebElement checkboxReturnCodeMaintenance;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[102]/td[7]/input")
	WebElement checkboxReturnCodeList;

	//Participant menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[104]/td[7]/input")
	WebElement checkboxPBList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[105]/td[7]/input")
	WebElement checkboxPBAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[106]/td[7]/input")
	WebElement checkboxPBModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[107]/td[7]/input")
	WebElement checkboxPBApprove;

	//Israeli Participant Bank
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[109]/td[7]/input")
	WebElement checkboxIBList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[110]/td[7]/input")
	WebElement checkboxIBAdd;
	
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[111]/td[7]/input")
	WebElement checkboxIBModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[112]/td[7]/input")
	WebElement checkboxIBApprove;
	
	//cheque stop
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[114]/td[7]/input")
	WebElement checkboxChqList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[115]/td[7]/input")
	WebElement checkboxChqEnter;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[116]/td[7]/input")
	WebElement checkboxChqModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[117]/td[7]/input")
	WebElement checkboxChqApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[118]/td[7]/input")
	WebElement checkboxChqDelete;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[119]/td[7]/input")
	WebElement checkboxChqBulkUpload;

	//International Currency menu chkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[121]/td[7]/input")
	WebElement checkboxIntCurrList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[122]/td[7]/input")
	WebElement checkboxIntCurrAdd;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[123]/td[7]/input")
	WebElement checkboxDBload;
	
	//PMA Files View checkbox menu
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[126]/td[7]/input")
	WebElement checkboxPMAFileList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[128]/td[7]/input")
	WebElement checkboxPMAGroupList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[130]/td[7]/input")
	WebElement checkboxPMAItemList;

	//ACH Clearing menu  checkbox

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[133]/td[7]/input")
	WebElement checkboxACHClearingList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[134]/td[7]/input")
	WebElement checkboxACHClearingReprocess;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[135]/td[7]/input")
	WebElement checkboxACHGroupList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[136]/td[7]/input")
	WebElement checkboxACHItemList;

	//Payment Menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[138]/td[7]/input")
	WebElement checkboxPaymentList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[144]/td[7]/input")
	WebElement checkboxPaymentApprove;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[139]/td[7]/input")
	WebElement checkboxPaymentDuplicate;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[140]/td[7]/input")
	WebElement checkboxPaymentRepair;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[141]/td[7]/input")
	WebElement checkboxPaymentQualify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[142]/td[7]/input")
	WebElement checkboxPaymentSignCheck;

	//PDC menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[150]/td[7]/input")
	WebElement checkboxPDCModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[149]/td[7]/input")
	WebElement checkboxPDCDelete;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[151]/td[7]/input")
	WebElement checkboxPDCBatchModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[145]/td[7]/input")
	WebElement checkboxManualTray;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[146]/td[7]/input")
	WebElement checkboxInsufficentfund;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[152]/td[7]/input")
	WebElement checkboxGetAcctDetail;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[162]/td[7]/input")
	WebElement checkboxFileView;

	//Report
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[178]/td[7]/input")
	WebElement checkboxTransactionReport;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[179]/td[7]/input")
	WebElement checkboxTransactionDetailReport;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[180]/td[7]/input")
	WebElement checkboxChqReconReport;

	//Client Scanner Tool menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[182]/td[7]/input")
	WebElement checkboxChqClientScannerTool;

	//Monitors menu checkbox 
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[184]/td[7]/input")
	WebElement checkboxMoneyTransferMonitor;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[185]/td[7]/input")
	WebElement checkboxPaymentTypeMonitor;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[187]/td[7]/input")
	WebElement checkboxStatusDisplaySet;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[188]/td[7]/input")
	WebElement checkboxPaymentTypeDisplaySet;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[189]/td[7]/input")
	WebElement checkboxPredefinedConfig;

	//Cheque Data Entry menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[191]/td[7]/input")
	WebElement checkboxChqDataList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[192]/td[7]/input")
	WebElement checkboxChqDataModify;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[193]/td[7]/input")
	WebElement checkboxChqDataDelete;

	//Advices menu checkbox
	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[196]/td[7]/input")
	WebElement checkboxAdviceList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[197]/td[7]/input")
	WebElement checkboxAdviceBatchList;

	@FindBy(xpath="//*[@id=\"palestine_islamic_bank-menu\"]/table/tbody/tr[198]/td[7]/input")
	WebElement checkboxReturnAdvicePMA;

	@FindBy(xpath="//button[@id='checkAllBtn']")
	WebElement btnChkAll;
	
	@FindBy(xpath="//button[@id='unCheckAllBtn']")
	WebElement btnUnChkAll;
	
	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement btnOk;
	
	@FindBy(xpath="//input[@value=\"Reset\"]")
	WebElement btnReset;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement cancelMsg;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement duplicaterecordMsg;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement btnOkErrorMsg;
	
	@FindBy(xpath="//*[@id=\"header_nav\"]/li[5]/a")
	WebElement btnRestartWorkFlow;
	
	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement confirmOK;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement profilenameTextfield;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btnSubmit;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel2;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecord;
	
	//Approve profile menus xpath
	
	@FindBy(xpath="//td[@class='cellcolorbg'][contains(text(),'1')]")
	WebElement approveRecord;
	
	@FindBy(xpath="//input[@name='reject']")
	WebElement rejectRecord;
	
	@FindBy(xpath="//input[@name='repair']")
	WebElement repairRecord;
	
	@FindBy(xpath="//input[@name='approve']")
	WebElement btnApprove;
	
	//Remove button
	@FindBy(xpath="//input[@value='Remove']")
	WebElement btnRemove;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecord;
	
	//Remove Message
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement removeMsg;
	
	// logout btn
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	
	// Constructor
	 public ProfilePage() {
		 PageFactory.initElements(driver, this);
	 }

	//Methods
	 public void createMaker(String profilename) {
		 
		 profilenameTextfield.sendKeys(profilename);
		 //user menu checkbox
		 chkboxUserList.click();
		 chkboxUserAdd.click();
		 chkboxUserModify.click();
		 chkboxUserBlock.click();
		 chkboxUserRemove.click();
		 chkboxUserReportBuild.click();
		 chkboxUserReportView.click();
		 
		 //group menu checkbox
		 chkboxGroupList.click();
		 chkboxGroupAdd.click();
		 chkboxGroupModify.click();
		 chkboxGroupBlock.click();
		 chkboxGroupUnBlock.click();
		 chkboxGroupRemove.click();
		 chkboxGroupReportBuild.click();
		 chkboxGroupReportView.click();
		 
		 //profile menu checkbox
		 chkboxProfileList.click();
		 chkboxProfileAdd.click();
		 chkboxProfileModify.click();
		 chkboxProfileRemove.click();
		 chkboxProfileReportBuild.click();
		 chkboxProfileReportView.click();
		 
		 //scanner profile menu checkbox
		 checkboxScanView.click();
		 checkboxScanAdd.click();
		 checkboxScanModify.click();
		 checkboxScanRemove.click();
		 checkboxScanProfileMap.click();
		 
		 //scanner profile menu mapping checkbox
		 checkboxScanProfileMap.click();
		 checkboxScanProfileMapList.click();
		 
		 //Enviornment menu checkbox
		 checkboxRun.click();
		 checkboxShow.click();
		 
		 //Maintenance menu checkbox
		 checkboxParameterMaintenance.click();
		 
		 //user authorization matrix menu
		 checkboxMatrixList.click();
		 checkboxMatrixAdd.click();
		 checkboxMatrixModify.click();
		 checkboxMatrixDelete.click();
		 
		 //Generic Param constant checkbox
		 checkboxGenericView.click();
		 checkboxGenericModify.click();
		 
		//Currency menu checkbox
		 checkboxCurrencyList.click();
		 checkboxCurrencyAdd.click();
		 checkboxCurrencyModify.click();
		 checkboxCurrencyDelete.click();
		 checkboxSampleFile.click();
		 
		//Email Distribution List menu checkbox
		 checkboxDistList.click();
		 checkboxDistAdd.click();
		 checkboxDistModify.click();
		 checkboxDistDelete.click();
		 
		// Message menu checkbox
		 checkboxMessageView.click();
		 checkboxMessageNew.click();
		 
		//Schedule menu checkbox
		 checkboxScheduleList.click();
		 checkboxScheduleNew.click();
		 checkboxScheduleModify.click();
		 checkboxScheduleControl.click();
		 
		//Calendar menu xpath
		 checkboxCalendarView.click();
		 checkboxCalendarCreate.click();
		 checkboxCalendarCreateBulk.click();
		 checkboxCalendarModify.click();
		 checkboxCalendarDelete.click();
		 
		//DB menu checkbox
		 checkboxReturnCodeMaintenance.click();
		 checkboxReturnCodeList.click();
		 
		//Participant menu checkbox
		 checkboxPBList.click();
		 checkboxPBAdd.click();
		 checkboxPBModify.click();
		 
		 //Israeli Participant menu checkbox
		 checkboxIBList.click();
		 checkboxIBAdd.click();
		 checkboxIBModify.click();
		 
		 //cheque stop menu checkbox
		 checkboxChqList.click();
		 checkboxChqEnter.click();
		 checkboxChqModify.click();
		 checkboxChqDelete.click();
		 checkboxChqBulkUpload.click();
		 
		//International Currency menu checkbox
		 checkboxIntCurrList.click();
		 checkboxIntCurrAdd.click();
		 
		//PMA Files View checkbox menu
		 checkboxPMAFileList.click();
		 checkboxPMAGroupList.click();
		 checkboxPMAItemList.click();
		 
		//ACH Clearing menu checkbox
		 checkboxACHClearingList.click();
		 checkboxACHClearingReprocess.click();
		 checkboxACHGroupList.click();
		 checkboxACHItemList.click();
		 
		//Payment Menu checkbox
		 checkboxPaymentList.click();
		 checkboxPaymentDuplicate.click();
		 checkboxPaymentRepair.click();
		 checkboxPaymentQualify.click();
		 checkboxPaymentSignCheck.click();
		 
		//PDC menu checkbox
		 checkboxPDCModify.click();
		 checkboxPDCDelete.click();
		 checkboxPDCBatchModify.click();
		 checkboxManualTray.click();
		 checkboxInsufficentfund.click();
		 checkboxGetAcctDetail.click();
		 checkboxFileView.click();
		 
		//Report menu checkbox
		 checkboxTransactionReport.click();
		 checkboxTransactionDetailReport.click();
		 checkboxChqReconReport.click();
		 
		//Client Scanner Tool menu checkbox
		 checkboxChqClientScannerTool.click();
		 
		//Monitors menu checkbox 
		 checkboxMoneyTransferMonitor.click();
		 checkboxPaymentTypeMonitor.click();
		 checkboxStatusDisplaySet.click();
		 checkboxPaymentTypeDisplaySet.click();
		 checkboxPredefinedConfig.click();
		 
		//Cheque Data Entry menu checkbox
		 checkboxChqDataList.click();
		 checkboxChqDataModify.click();
		 checkboxChqDataDelete.click();
		 
		//Advices menu checkbox
		 checkboxAdviceList.click();
		 checkboxAdviceBatchList.click();
		 checkboxReturnAdvicePMA.click();
		 
		 btnOk.click();
		 confirmOK.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
	 }

	 public void createChecker(String ProfileName) throws InterruptedException, IOException {
		 
		 
		 // validation of cancel button
		 btnCancel.click();
		 Thread.sleep(3000);
		 String actualCancelMsg=cancelMsg.getText();
		 String expctCancelMsg="Operation Add new profile was cancelled.";
		 if(actualCancelMsg.equals(expctCancelMsg)) {
			 System.out.println("-----Profile Cancel Button Validated------");
		 }else {
			 System.out.println("-----Profile Cancel Button is not Validated------");
			 TestUtil.takeScreenshot(actualCancelMsg, expctCancelMsg);
		 }
		 btnRestartWorkFlow.click();
		 
		 
		 // validation of uncheckall button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 Thread.sleep(3000);
		 btnUnChkAll.click();
		 btnRestartWorkFlow.click();
		 
		 
		 // Validation of Reset button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 btnReset.click();
		 Thread.sleep(4000);
		 btnRestartWorkFlow.click();
		 
		 // Validation of OK button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnOk.click();
		 
		 String actualOkErrorMsg=btnOkErrorMsg.getText();
		 String expctOkErrorMsg="You must select some menu checkboxes";
		 if(actualOkErrorMsg.equals(expctOkErrorMsg)) {
			 System.out.println("-----Profile Ok button Validated-----");
		 }else {
			 System.out.println("-----Profile Ok button not Validated-----");
			 TestUtil.takeScreenshot(actualOkErrorMsg, expctOkErrorMsg);
		 }
		 Thread.sleep(3000);
		 btnRestartWorkFlow.click();
		 Thread.sleep(3000);
		 
		// Validation of Duplicate record
		 
		/* profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 btnOk.click();
		 
		 String actualDuplicateMsg= duplicaterecordMsg.getText();
		 String expctDuplicateMsg="Profile already exists";
		 
		 if(actualDuplicateMsg.equals(expctDuplicateMsg)) {
			 System.out.println("------Duplicate Record Validation is working-------");
		 }else {
			 System.out.println("------Duplicate Record Validation is not working------- ");
		 }
		 
		 Thread.sleep(3000);
		 btnRestartWorkFlow.click();
		 btnLogout.click();
		 extBtnLogout.click();*/
		 
		 // Positive Add profile
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 Thread.sleep(3000);
		 btnOk.click();
		 confirmOK.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
	 }
	 
	 
	 public ProfilePage modifyRecord(String profileName) throws InterruptedException {
		 
		 Thread.sleep(3000);
		// btnOk.click();
		 modifyRecord.click();
		 profilenameTextfield.clear();
		 profilenameTextfield.sendKeys(profileName);
		 btnOk.click();
		 Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		 confirmOK.click();
		 Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
	 }
	 
	 public ProfilePage removeRecord() throws IOException {
		 
		 removeRecord.click();
		 btnRemove.click();
		 
		 String actualRemoveMsg=removeMsg.getText();
		 String expctRemoveMsg="Operation Remove profile executed successfully.  placed in APPROVE queue.";
		 
		 if(actualRemoveMsg.contains(expctRemoveMsg)) {
			 System.out.println("------Remove Message is validated------");
		 }else {
			 System.out.println("------Remove Message is not validated--------");
			 TestUtil.takeScreenshot(actualRemoveMsg, expctRemoveMsg);
		 }
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
	 }
	 
	 public ProfilePage approveRecord() throws InterruptedException {
		 Thread.sleep(3000);
		 approveRecord.click();
		 btnApprove.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
		 
	 }
}
