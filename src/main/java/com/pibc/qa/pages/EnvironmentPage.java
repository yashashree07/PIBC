package com.pibc.qa.pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.Windowhandle;

public class EnvironmentPage extends TestBase {
	
	Windowhandle win = new Windowhandle(driver);
	
	@FindBy(id = "palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:sodExecutor")
	WebElement sodcheckbox;

	@FindBy(id = "TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:sodExecutorc2")
	WebElement sodStatus;

	@FindBy(id = "TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:eodExecutorc2")
	WebElement eodStatus;

	@FindBy(id = "modalDialogContinue")
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"preconditionEnforceAdvice\"]/table/tbody/tr/td[2]/input")
	WebElement manageBtn;

	@FindBy(name = "env.run.continue")
	WebElement returnButton;

	@FindBy(id = "palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:eodExecutor")
	WebElement eodcheckbox;

	@FindBy(id = "palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps")
	WebElement bdcheckbox;

	@FindBy(id = "SET_BUSINESS_DATE_ACTION")
	WebElement setBusinessDateButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	WebElement bdSubmitbutton;

	@FindBy(id = "SWITCH_RESOURCE_ACTION")
	WebElement switchResourceButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement environmentokbutton;

	@FindBy(xpath = "//*[@id='adviceId' and @class='visible']")
	WebElement buttonVisibility;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:envEventServerc2")
	WebElement envEventServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:envEventServer")
	WebElement envEventServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:emailServerc2")
	WebElement emailServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:emailServer")
	WebElement emailServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:AutoSODServerc2")
	WebElement AutoSODServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:AutoSODServer")
	WebElement AutoSODServercheckbox;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:AutoEODServer")
	WebElement AutoEODServerstatus;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps:AutoEODServerc2")
	WebElement AutoEODServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Vip_Cheque_Acceptance_Serverc2")
	WebElement Vip_Cheque_Acceptance_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Vip_Cheque_Acceptance_Server")
	WebElement Vip_Cheque_Acceptance_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:BatchChequePaymentCreationServerc2")
	WebElement BatchChequePaymentCreationServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:BatchChequePaymentCreationServer")
	WebElement BatchChequePaymentCreationServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Batch_Modification_Serverc2")
	WebElement Batch_Modification_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Batch_Modification_Server")
	WebElement Batch_Modification_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Outward_Payment_Creation_Serverc2")
	WebElement Cheque_Outward_Payment_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Outward_Payment_Creation_Server")
	WebElement Cheque_Outward_Payment_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Return_Creation_Serverc2")
	WebElement Return_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Return_Creation_Server")
	WebElement Return_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Clearing_File_Input_Serverc2")
	WebElement ACH_Clearing_File_Input_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Clearing_File_Input_Server")
	WebElement ACH_Clearing_File_Input_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Clearing_Inward_Payment_Creation_Serverc2")
	WebElement ACH_Clearing_Inward_Payment_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Clearing_Inward_Payment_Creation_Server")
	WebElement ACH_Clearing_Inward_Payment_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Response_Process_Serverc2")
	WebElement ACH_Response_Process_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ACH_Response_Process_Server")
	WebElement ACH_Response_Process_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:File_Routing_Serverc2")
	WebElement File_Routing_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:File_Routing_Server")
	WebElement File_Routing_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:AchClearingMQOutputServerc2")
	WebElement AchClearingMQOutputServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:AchClearingMQOutputServer")
	WebElement AchClearingMQOutputServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:AchClearingMQInputServerc2")
	WebElement AchClearingMQInputServerstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:AchClearingMQInputServer")
	WebElement AchClearingMQInputServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ATM_Processing_ChequeData_Serverc2")
	WebElement ATM_Processing_ChequeData_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:ATM_Processing_ChequeData_Server")
	WebElement ATM_Processing_ChequeData_Servercheckbox;

	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Leaf_Creation_Serverc2")
	WebElement Cheque_Leaf_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Leaf_Creation_Server")
	WebElement Cheque_Leaf_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Inventory_File_Download_Serverc2")
	WebElement Cheque_Inventory_File_Download_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Inventory_File_Download_Server")
	WebElement Cheque_Inventory_File_Download_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Data_Migration_Serverc2")
	WebElement PDC_Data_Migration_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Data_Migration_Server")
	WebElement PDC_Data_Migration_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_FileBean_ChequeData_Serverc2")
	WebElement PDC_FileBean_ChequeData_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_FileBean_ChequeData_Server")
	WebElement PDC_FileBean_ChequeData_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Migration_Image_Tagging_Serverc2")
	WebElement Cheque_Migration_Image_Tagging_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Cheque_Migration_Image_Tagging_Server")
	WebElement Cheque_Migration_Image_Tagging_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Account_Verification_Serverc2")
	WebElement Account_Verification_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Account_Verification_Server")
	WebElement Account_Verification_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Out_Present_Cheque_Serverc2")
	WebElement Out_Present_Cheque_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Out_Present_Cheque_Server")
	WebElement Out_Present_Cheque_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Out_Reply_Cheque_Serverc2")
	WebElement Out_Reply_Cheque_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Out_Reply_Cheque_Server")
	WebElement Out_Reply_Cheque_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Add_PDC_Serverc2")
	WebElement Add_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Add_PDC_Server")
	WebElement Add_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Delete_PDC_Serverc2")
	WebElement Delete_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Delete_PDC_Server")
	WebElement Delete_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Amendment_Serverc2")
	WebElement PDC_Amendment_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Amendment_Server")
	WebElement PDC_Amendment_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Replacement_Serverc2")
	WebElement PDC_Replacement_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Replacement_Server")
	WebElement PDC_Replacement_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Contra_Posting_Serverc2")
	WebElement PDC_Contra_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Contra_Posting_Server")
	WebElement PDC_Contra_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Posting_Serverc2")
	WebElement Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Posting_Server")
	WebElement Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Contra_Posting_Serverc2")
	WebElement Contra_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Contra_Posting_Server")
	WebElement Contra_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Initial_Posting_Serverc2")
	WebElement Initial_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Initial_Posting_Server")
	WebElement Initial_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Final_Posting_Serverc2")
	WebElement Final_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Final_Posting_Server")
	WebElement Final_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Commission_Serverc2")
	WebElement PDC_Commission_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:PDC_Commission_Server")
	WebElement PDC_Commission_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Add_PDC_Serverc2")
	WebElement Onus_Add_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Add_PDC_Server")
	WebElement Onus_Add_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Delete_PDC_Serverc2")
	WebElement Onus_Delete_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Delete_PDC_Server")
	WebElement Onus_Delete_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Initial_Posting_Serverc2")
	WebElement Onus_Initial_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Initial_Posting_Server")
	WebElement Onus_Initial_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Final_Posting_Serverc2")
	WebElement Onus_Final_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Onus_Final_Posting_Server")
	WebElement Onus_Final_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_Cheque_Serverc2")
	WebElement Israeli_Inward_Cheque_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_Cheque_Server")
	WebElement Israeli_Inward_Cheque_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_ImageMapping_Serverc2")
	WebElement Israeli_Inward_ImageMapping_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_ImageMapping_Server")
	WebElement Israeli_Inward_ImageMapping_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_Return_Serverc2")
	WebElement Israeli_Inward_Return_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Inward_Return_Server")
	WebElement Israeli_Inward_Return_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Cheque_Outfile_Creation_Serverc2")
	WebElement Israeli_Cheque_Outfile_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Cheque_Outfile_Creation_Server")
	WebElement Israeli_Cheque_Outfile_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Outward_ImageIdMapping_Serverc2")
	WebElement Israeli_Outward_ImageIdMapping_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Outward_ImageIdMapping_Server")
	WebElement Israeli_Outward_ImageIdMapping_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Outward_Return_Serverc2")
	WebElement Israeli_Outward_Return_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Outward_Return_Server")
	WebElement Israeli_Outward_Return_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_PDC_Data_Migration_Serverc2")
	WebElement Israeli_PDC_Data_Migration_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_PDC_Data_Migration_Server")
	WebElement Israeli_PDC_Data_Migration_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Cheque_Migration_Image_Tagging_Serverc2")
	WebElement Israeli_Cheque_Migration_Image_Tagging_Serverstatus;
	
	@FindBy(id="palestine,palestine/palestine_islamic_bank,palestine/palestine_islamic_bank/gps,palestine/palestine_islamic_bank/gps:Israeli_Cheque_Migration_Image_Tagging_Server")
	WebElement Israeli_Cheque_Migration_Image_Tagging_Servercheckbox;
	
	@FindBy(xpath ="//*[@id=\"pageBody\"]/form/table[2]/tbody/tr[4]/td/div/table/tbody/tr[1]/td/select")
	WebElement preconditionsFilterDropdown;

	@FindBy(name ="RUN_INTEGRATED_JOB_REEVALUATE")
	WebElement reEvaluateBtn;
 
	@FindBy(id ="RUN_INTEGRATED_JOB_CONFIRM")
	WebElement proceedBtn;
	
	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td/span")
	WebElement businessDateSubmitBtnMsg;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public EnvironmentPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonEnvironmentokbutton() throws InterruptedException {
//		win.handlewin();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentokbutton.click();
	}

	/*public void businessDate() throws InterruptedException {
		String Status = sodStatus.getText();
		String StatusEod = eodStatus.getText();
		if (Status.equals("Not Performed") && StatusEod.equals("Not Performed")) {
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		} else if (Status.equals("Performed") && StatusEod.equals("Not Performed")) {
			System.out.println("SOD is already performed");
		} else if (Status.equals("Performed") && StatusEod.equals("Performed")) {
			System.out.println("SOD is already performed");
			System.out.println("EOD is already performed");
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		}

	}*/
	
	public void businessDate() throws InterruptedException {
		String Status = sodStatus.getText();
		String StatusEod = eodStatus.getText();
		if (Status.equals("Not Performed") && StatusEod.equals("Not Performed")) {
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			String businessDateSubmitButtonMessage="New Business Date does not match system date";
			if(businessDateSubmitBtnMsg.getText().contains(businessDateSubmitButtonMessage))
			{
				bdSubmitbutton.click();
			}
			performSOD();
		} else if (Status.equals("Performed") && StatusEod.equals("Not Performed")) {
			System.out.println("SOD is already performed");
		} else if (Status.equals("Performed") && StatusEod.equals("Performed")) {
			System.out.println("SOD is already performed");
			System.out.println("EOD is already performed");
			bdcheckbox.click();
			setBusinessDateButton.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			bdSubmitbutton.click();
			String businessDateSubmitButtonMessage="New Business Date does not match system date";
			if(businessDateSubmitBtnMsg.getText().contains(businessDateSubmitButtonMessage))
			{
				bdSubmitbutton.click();
			}
			performSOD();
		}

	}//end


	public void returnBtnStatus() throws InterruptedException {
		boolean waitForReturnBtn = true;
		while (waitForReturnBtn) {
			if (null != buttonVisibility) {
				returnButton.click();
				waitForReturnBtn = false;
			} else {
				System.out.println(new Date() + " start time");
				Thread.sleep(IntfConstants.TIMEOUT);
				System.out.println(new Date() + " start time");
			}
		}
	}

	public void performSOD() throws InterruptedException {
		sodcheckbox.click();
		switchResourceButton.click();
		continuebutton.click();
		returnBtnStatus();
	}
	
	
	//Function for EOD Outward Flow
		public void clickEODandManage() throws InterruptedException
		{
			eodcheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			switchResourceButton.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//			returnBtnStatus();
			manageBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			
			Select sel=new Select (preconditionsFilterDropdown);
			sel.selectByVisibleText("All");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			
			System.out.println("entering inside");
			List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(list);
			for (WebElement el : list)
			{
				if(!el.isSelected())
					el.click();
				Thread.sleep(100);
			}
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			reEvaluateBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			proceedBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			returnBtnStatus();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			
		}//end 


	public void checkenvEventServer() throws InterruptedException {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Inactive")) {
			envEventServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkenvEventServer1();
		} else {
			System.out.println("envEventServer is already running");
		}
	}

	public void checkenvEventServer1() {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Active")) {
			System.out.println("envEventServer is started");
		} else {
			System.out.println("envEventServer is failed to start");
		}
	}

	public void checkemailServer() throws InterruptedException {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Inactive")) {
			emailServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkemailServer1();
		} else {
			System.out.println("emailServer is already running");
		}
	}

	public void checkemailServer1() {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Active")) {
			System.out.println("emailServer is started");
		} else {
			System.out.println("emailServer is failed to start");
		}
	}

	public void checkAutoSODServer() throws InterruptedException {
		String statusAutoSODServer = AutoSODServerstatus.getText();
		if (statusAutoSODServer.equals("Inactive")) {
			AutoSODServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAutoSODServer1();
		} else {
			System.out.println("AutoSODServer is already running");
		}
	}

	public void checkAutoSODServer1() {
		String statusAutoSODServer = AutoSODServerstatus.getText();
		if (statusAutoSODServer.equals("Active")) {
			System.out.println("AutoSODServer is started");
		} else {
			System.out.println("AutoSODServer is failed to start");
		}
	}
	
	public void checkAutoEODServer() throws InterruptedException {
		String statusAutoEODServer = AutoEODServerstatus.getText();
		if (statusAutoEODServer.equals("Inactive")) {
			AutoEODServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAutoEODServer1();
		} else {
			System.out.println("AutoEODServer is already running");
		}
	}

	public void checkAutoEODServer1() {
		String statusAutoEODServer = AutoEODServerstatus.getText();
		if (statusAutoEODServer.equals("Active")) {
			System.out.println("AutoEODServer is started");
		} else {
			System.out.println("AutoEODServer is failed to start");
		}
	}
	
	public void checkVip_Cheque_Acceptance_Server() throws InterruptedException {
		String statusVip_Cheque_Acceptance_Server = Vip_Cheque_Acceptance_Serverstatus.getText();
		if (statusVip_Cheque_Acceptance_Server.equals("Inactive")) {
			Vip_Cheque_Acceptance_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkVip_Cheque_Acceptance_Server1();
		} else {
			System.out.println("Vip_Cheque_Acceptance_Server is already running");
		}
	}

	public void checkVip_Cheque_Acceptance_Server1() {
		String statusVip_Cheque_Acceptance_Server = Vip_Cheque_Acceptance_Serverstatus.getText();
		if (statusVip_Cheque_Acceptance_Server.equals("Active")) {
			System.out.println("Vip_Cheque_Acceptance_Server is started");
		} else {
			System.out.println("Vip_Cheque_Acceptance_Server is failed to start");
		}
	}

	public void checkBatchChequePaymentCreationServer() throws InterruptedException {
		String statusBatchChequePaymentCreationServer = BatchChequePaymentCreationServerstatus.getText();
		if (statusBatchChequePaymentCreationServer.equals("Inactive")) {
			BatchChequePaymentCreationServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkBatchChequePaymentCreationServer1();
		} else {
			System.out.println("BatchChequePaymentCreationServer is already running");
		}
	}

	public void checkBatchChequePaymentCreationServer1() {
		String statusBatchChequePaymentCreationServer = BatchChequePaymentCreationServerstatus.getText();
		if (statusBatchChequePaymentCreationServer.equals("Active")) {
			System.out.println("BatchChequePaymentCreationServer is started");
		} else {
			System.out.println("BatchChequePaymentCreationServer is failed to start");
		}
	}

	public void checkBatch_Modification_Server() throws InterruptedException {
		String statusBatch_Modification_Server = Batch_Modification_Serverstatus.getText();
		if (statusBatch_Modification_Server.equals("Inactive")) {
			Batch_Modification_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkBatch_Modification_Server1();
		} else {
			System.out.println("Batch_Modification_Server is already running");
		}
	}

	public void checkBatch_Modification_Server1() {
		String statusBatch_Modification_Server = Batch_Modification_Serverstatus.getText();
		if (statusBatch_Modification_Server.equals("Active")) {
			System.out.println("Batch_Modification_Server is started");
		} else {
			System.out.println("Batch_Modification_Server is failed to start");
		}
	}

	public void checkCheque_Outward_Payment_Creation_Server	() throws InterruptedException {
		String statusCheque_Outward_Payment_Creation_Server	= Cheque_Outward_Payment_Creation_Serverstatus.getText();
		if (statusCheque_Outward_Payment_Creation_Server.equals("Inactive")) {
			Cheque_Outward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Outward_Payment_Creation_Server1();
		} else {
			System.out.println("Cheque_Outward_Payment_Creation_Server is already running");
		}
	}

	public void checkCheque_Outward_Payment_Creation_Server1() {
		String statusCheque_Outward_Payment_Creation_Server = Cheque_Outward_Payment_Creation_Serverstatus.getText();
		if (statusCheque_Outward_Payment_Creation_Server.equals("Active")) {
			System.out.println("Cheque_Outward_Payment_Creation_Server is started");
		} else {
			System.out.println("Cheque_Outward_Payment_Creation_Server is failed to start");
		}
	}

	public void checkReturn_Creation_Server() throws InterruptedException {
		String statusReturn_Creation_Server = Return_Creation_Serverstatus.getText();
		if (statusReturn_Creation_Server.equals("Inactive")) {
			Return_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkReturn_Creation_Server1();
		} else {
			System.out.println("Return_Creation_Server is already running");
		}
	}

	public void checkReturn_Creation_Server1() {
		String statusReturn_Creation_Server = Return_Creation_Serverstatus.getText();
		if (statusReturn_Creation_Server.equals("Active")) {
			System.out.println("Return_Creation_Server is started");
		} else {
			System.out.println("Return_Creation_Server is failed to start");
		}
	}

	public void checkACH_Clearing_File_Input_Server() throws InterruptedException {
		String statusACH_Clearing_File_Input_Server = ACH_Clearing_File_Input_Serverstatus.getText();
		if (statusACH_Clearing_File_Input_Server.equals("Inactive")) {
			ACH_Clearing_File_Input_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Clearing_File_Input_Server1();
		} else {
			System.out.println("ACH_Clearing_File_Input_Server is already running");
		}
	}

	public void checkACH_Clearing_File_Input_Server1() {
		String statusACH_Clearing_File_Input_Server = ACH_Clearing_File_Input_Serverstatus.getText();
		if (statusACH_Clearing_File_Input_Server.equals("Active")) {
			System.out.println("ACH_Clearing_File_Input_Server is started");
		} else {
			System.out.println("ACH_Clearing_File_Input_Server is failed to start");
		}
	}

	public void checkACH_Clearing_Inward_Payment_Creation_Server() throws InterruptedException {
		String statusACH_Clearing_Inward_Payment_Creation_Server = ACH_Clearing_Inward_Payment_Creation_Serverstatus.getText();
		if (statusACH_Clearing_Inward_Payment_Creation_Server.equals("Inactive")) {
			ACH_Clearing_Inward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Clearing_Inward_Payment_Creation_Server1();
		} else {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is already running");
		}
	}

	public void checkACH_Clearing_Inward_Payment_Creation_Server1() {
		String statusACH_Clearing_Inward_Payment_Creation_Server = ACH_Clearing_Inward_Payment_Creation_Serverstatus.getText();
		if (statusACH_Clearing_Inward_Payment_Creation_Server.equals("Active")) {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is started");
		} else {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is failed to start");
		}
	}

	public void checkACH_Response_Process_Server() throws InterruptedException {
		String statusACH_Response_Process_Server = ACH_Response_Process_Serverstatus.getText();
		if (statusACH_Response_Process_Server.equals("Inactive")) {
			ACH_Response_Process_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Response_Process_Server1();
		} else {
			System.out.println("ACH_Response_Process_Server is already running");
		}
	}

	public void checkACH_Response_Process_Server1() {
		String statusACH_Response_Process_Server = ACH_Response_Process_Serverstatus.getText();
		if (statusACH_Response_Process_Server.equals("Active")) {
			System.out.println("ACH_Response_Process_Server is started");
		} else {
			System.out.println("ACH_Response_Process_Server is failed to start");
		}
	}

	public void CheckFile_Routing_Server() throws InterruptedException {
		String statusFile_Routing_Server = File_Routing_Serverstatus.getText();
		if (statusFile_Routing_Server.equals("Inactive")) {
			File_Routing_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFile_Routing_Server1();
		} else {
			System.out.println("File_Routing_Server is already running");
		}
	}

	public void checkFile_Routing_Server1() {
		String statusFile_Routing_Server = File_Routing_Serverstatus.getText();
		if (statusFile_Routing_Server.equals("Active")) {
			System.out.println("File_Routing_Server is started");
		} else {
			System.out.println("File_Routing_Server is failed to start");
		}
	}

	public void checkAchClearingMQOutputServer() throws InterruptedException {
		String statusAchClearingMQOutputServer = AchClearingMQOutputServerstatus.getText();
		if (statusAchClearingMQOutputServer.equals("Inactive")) {
			AchClearingMQOutputServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchClearingMQOutputServer1();
		} else {
			System.out.println("AchClearingMQOutputServer is already running");
		}
	}

	public void checkAchClearingMQOutputServer1() {
		String statusAchClearingMQOutputServer = AchClearingMQOutputServerstatus.getText();
		if (statusAchClearingMQOutputServer.equals("Active")) {
			System.out.println("AchClearingMQOutputServer is started");
		} else {
			System.out.println("AchClearingMQOutputServer is failed to start");
		}
	}

	public void checkAchClearingMQInputServer() throws InterruptedException {
		String statusAchClearingMQInputServer = AchClearingMQInputServerstatus.getText();
		if (statusAchClearingMQInputServer.equals("Inactive")) {
			AchClearingMQInputServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchClearingMQInputServer1();
		} else {
			System.out.println("AchClearingMQInputServer is already running");
		}
	}

	public void checkAchClearingMQInputServer1() {
		String statusAchClearingMQInputServer = AchClearingMQInputServerstatus.getText();
		if (statusAchClearingMQInputServer.equals("Active")) {
			System.out.println("AchClearingMQInputServer is started");
		} else {
			System.out.println("AchClearingMQInputServer is failed to start");
		}
	}

	public void checkCheque_Leaf_Creation_Server() throws InterruptedException {
		String statusCheque_Leaf_Creation_Server = Cheque_Leaf_Creation_Serverstatus.getText();
		if (statusCheque_Leaf_Creation_Server.equals("Inactive")) {
			Cheque_Leaf_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Leaf_Creation_Server1();
		} else {
			System.out.println("Cheque_Leaf_Creation_Server is already running");
		}
	}

	public void checkCheque_Leaf_Creation_Server1() {
		String statusCheque_Leaf_Creation_Server = Cheque_Leaf_Creation_Serverstatus.getText();
		if (statusCheque_Leaf_Creation_Server.equals("Active")) {
			System.out.println("Cheque_Leaf_Creation_Server is started");
		} else {
			System.out.println("Cheque_Leaf_Creation_Server is failed to start");
		}
	}

	public void checkCheque_Inventory_File_Download_Server() throws InterruptedException {
		String statusCheque_Inventory_File_Download_Server = Cheque_Inventory_File_Download_Serverstatus.getText();
		if (statusCheque_Inventory_File_Download_Server.equals("Inactive")) {
			Cheque_Inventory_File_Download_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Inventory_File_Download_Server1();
		} else {
			System.out.println("Cheque_Inventory_File_Download_Server is already running");
		}
	}

	public void checkCheque_Inventory_File_Download_Server1() {
		String statusCheque_Inventory_File_Download_Server = Cheque_Inventory_File_Download_Serverstatus.getText();
		if (statusCheque_Inventory_File_Download_Server.equals("Active")) {
			System.out.println("Cheque_Inventory_File_Download_Server is started");
		} else {
			System.out.println("Cheque_Inventory_File_Download_Server is failed to start");
		}
	}

	
	public void checkPDC_Data_Migration_Server() throws InterruptedException {
		String statusPDC_Data_Migration_Server = PDC_Data_Migration_Serverstatus.getText();
		if (statusPDC_Data_Migration_Server.equals("Inactive")) {
			PDC_Data_Migration_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Data_Migration_Server1();
		} else {
			System.out.println("PDC_Data_Migration_Server is already running");
		}
	}

	public void checkPDC_Data_Migration_Server1() {
		String statusPDC_Data_Migration_Server = PDC_Data_Migration_Serverstatus.getText();
		if (statusPDC_Data_Migration_Server.equals("Active")) {
			System.out.println("PDC_Data_Migration_Server is started");
		} else {
			System.out.println("PDC_Data_Migration_Server is failed to start");
		}
	}

	public void checkPDC_FileBean_ChequeData_Server() throws InterruptedException {
		String statusPDC_FileBean_ChequeData_Server = PDC_FileBean_ChequeData_Serverstatus.getText();
		if (statusPDC_FileBean_ChequeData_Server.equals("Inactive")) {
			PDC_FileBean_ChequeData_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_FileBean_ChequeData_Server1();
		} else {
			System.out.println("PDC_FileBean_ChequeData_Server is already running");
		}
	}

	public void checkPDC_FileBean_ChequeData_Server1() {
		String statusPDC_FileBean_ChequeData_Server = PDC_FileBean_ChequeData_Serverstatus.getText();
		if (statusPDC_FileBean_ChequeData_Server.equals("Active")) {
			System.out.println("PDC_FileBean_ChequeData_Server is started");
		} else {
			System.out.println("PDC_FileBean_ChequeData_Server is failed to start");
		}
	}

	public void checkCheque_Migration_Image_Tagging_Server() throws InterruptedException {
		String statusCheque_Migration_Image_Tagging_Server = Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusCheque_Migration_Image_Tagging_Server.equals("Inactive")) {
			Cheque_Migration_Image_Tagging_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Migration_Image_Tagging_Server1();
		} else {
			System.out.println("Cheque_Migration_Image_Tagging_Server is already running");
		}
	}

	public void checkCheque_Migration_Image_Tagging_Server1() {
		String statusCheque_Migration_Image_Tagging_Server = Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusCheque_Migration_Image_Tagging_Server.equals("Active")) {
			System.out.println("Cheque_Migration_Image_Tagging_Server is started");
		} else {
			System.out.println("Cheque_Migration_Image_Tagging_Server is failed to start");
		}
	}

	public void checkAccount_Verification_Server() throws InterruptedException {
		String statusAccount_Verification_Server = Account_Verification_Serverstatus.getText();
		if (statusAccount_Verification_Server.equals("Inactive")) {
			Account_Verification_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAccount_Verification_Server1();
		} else {
			System.out.println("Account_Verification_Server is already running");
		}
	}

	public void checkAccount_Verification_Server1() {
		String statusAccount_Verification_Server = Account_Verification_Serverstatus.getText();
		if (statusAccount_Verification_Server.equals("Active")) {
			System.out.println("Account_Verification_Server is started");
		} else {
			System.out.println("Account_Verification_Server is failed to start");
		}
	}

	public void checkOut_Present_Cheque_Server() throws InterruptedException {
		String statusOut_Present_Cheque_Server = Out_Present_Cheque_Serverstatus.getText();
		if (statusOut_Present_Cheque_Server.equals("Inactive")) {
			Out_Present_Cheque_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOut_Present_Cheque_Server1();
		} else {
			System.out.println("Out_Present_Cheque_Server is already running");
		}
	}

	public void checkOut_Present_Cheque_Server1() {
		String statusOut_Present_Cheque_Server = Out_Present_Cheque_Serverstatus.getText();
		if (statusOut_Present_Cheque_Server.equals("Active")) {
			System.out.println("Out_Present_Cheque_Server is started");
		} else {
			System.out.println("Out_Present_Cheque_Server is failed to start");
		}
	}

	public void checkOut_Reply_Cheque_Server() throws InterruptedException {
		String statusOut_Reply_Cheque_Server = Out_Reply_Cheque_Serverstatus.getText();
		if (statusOut_Reply_Cheque_Server.equals("Inactive")) {
			Out_Reply_Cheque_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOut_Reply_Cheque_Server1();
		} else {
			System.out.println("Out_Reply_Cheque_Server is already running");
		}
	}

	public void checkOut_Reply_Cheque_Server1() {
		String statusOut_Reply_Cheque_Server = Out_Reply_Cheque_Serverstatus.getText();
		if (statusOut_Reply_Cheque_Server.equals("Active")) {
			System.out.println("Out_Reply_Cheque_Server is started");
		} else {
			System.out.println("Out_Reply_Cheque_Server is failed to start");
		}
	}

	public void checkAdd_PDC_Server() throws InterruptedException {
		String statusAdd_PDC_Server = Add_PDC_Serverstatus.getText();
		if (statusAdd_PDC_Server.equals("Inactive")) {
			Add_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAdd_PDC_Server1();
		} else {
			System.out.println("Add_PDC_Server is already running");
		}
	}

	public void checkAdd_PDC_Server1() {
		String statusAdd_PDC_Server = Add_PDC_Serverstatus.getText();
		if (statusAdd_PDC_Server.equals("Active")) {
			System.out.println("Add_PDC_Server is started");
		} else {
			System.out.println("Add_PDC_Server is failed to start");
		}
	}

	public void checkDelete_PDC_Server() throws InterruptedException {
		String statusDelete_PDC_Server = Delete_PDC_Serverstatus.getText();
		if (statusDelete_PDC_Server.equals("Inactive")) {
			Delete_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDelete_PDC_Server1();
		} else {
			System.out.println("Delete_PDC_Server is already running");
		}
	}

	public void checkDelete_PDC_Server1() {
		String statusDelete_PDC_Server = Delete_PDC_Serverstatus.getText();
		if (statusDelete_PDC_Server.equals("Active")) {
			System.out.println("Delete_PDC_Server is started");
		} else {
			System.out.println("Delete_PDC_Server is failed to start");
		}
	}

	public void checkInitial_Posting_Server() throws InterruptedException {
		String statusInitial_Posting_Server = Initial_Posting_Serverstatus.getText();
		if (statusInitial_Posting_Server.equals("Inactive")) {
			Initial_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInitial_Posting_Server1();
		} else {
			System.out.println("Initial_Posting_Server is already running");
		}
	}

	public void checkInitial_Posting_Server1() {
		String statusInitial_Posting_Server = Initial_Posting_Serverstatus.getText();
		if (statusInitial_Posting_Server.equals("Active")) {
			System.out.println("Initial_Posting_Server is started");
		} else {
			System.out.println("Initial_Posting_Server is failed to start");
		}
	}
	
	public void checkFinal_Posting_Server() throws InterruptedException {
		String statusFinal_Posting_Server = Final_Posting_Serverstatus.getText();
		if (statusFinal_Posting_Server.equals("Inactive")) {
			Final_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFinal_Posting_Server1();
		} else {
			System.out.println("Final_Posting_Server is already running");
		}
	}

	public void checkFinal_Posting_Server1() {
		String statusFinal_Posting_Server = Final_Posting_Serverstatus.getText();
		if (statusFinal_Posting_Server.equals("Active")) {
			System.out.println("Final_Posting_Server is started");
		} else {
			System.out.println("Final_Posting_Server is failed to start");
		}
	}
	
	public void checkPDC_Commission_Server() throws InterruptedException {
		String statusPDC_Commission_Server = PDC_Commission_Serverstatus.getText();
		if (statusPDC_Commission_Server.equals("Inactive")) {
			PDC_Commission_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Commission_Server1();
		} else {
			System.out.println("PDC_Commission_Server is already running");
		}
	}

	public void checkPDC_Commission_Server1() {
		String statusPDC_Commission_Server = PDC_Commission_Serverstatus.getText();
		if (statusPDC_Commission_Server.equals("Active")) {
			System.out.println("PDC_Commission_Server is started");
		} else {
			System.out.println("PDC_Commission_Server is failed to start");
		}
	}
	
	public void checkOnus_Add_PDC_Server() throws InterruptedException {
		String statusOnus_Add_PDC_Server = Onus_Add_PDC_Serverstatus.getText();
		if (statusOnus_Add_PDC_Server.equals("Inactive")) {
			Onus_Add_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnus_Add_PDC_Server1();
		} else {
			System.out.println("Onus_Add_PDC_Server is already running");
		}
	}

	public void checkOnus_Add_PDC_Server1() {
		String statusOnus_Add_PDC_Server = Onus_Add_PDC_Serverstatus.getText();
		if (statusOnus_Add_PDC_Server.equals("Active")) {
			System.out.println("Onus_Add_PDC_Server is started");
		} else {
			System.out.println("Onus_Add_PDC_Server is failed to start");
		}
	}
	
	public void checkOnus_Delete_PDC_Server() throws InterruptedException {
		String statusOnus_Delete_PDC_Server = Onus_Delete_PDC_Serverstatus.getText();
		if (statusOnus_Delete_PDC_Server.equals("Inactive")) {
			Onus_Delete_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnus_Delete_PDC_Server1();
		} else {
			System.out.println("Onus_Delete_PDC_Server is already running");
		}
	}

	public void checkOnus_Delete_PDC_Server1() {
		String statusOnus_Delete_PDC_Server = Onus_Delete_PDC_Serverstatus.getText();
		if (statusOnus_Delete_PDC_Server.equals("Active")) {
			System.out.println("Onus_Delete_PDC_Server is started");
		} else {
			System.out.println("Onus_Delete_PDC_Server is failed to start");
		}
	}
	
	public void checkOnus_Initial_Posting_Server() throws InterruptedException {
		String statusOnus_Initial_Posting_Server = Onus_Initial_Posting_Serverstatus.getText();
		if (statusOnus_Initial_Posting_Server.equals("Inactive")) {
			Onus_Initial_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnus_Initial_Posting_Server1();
		} else {
			System.out.println("Onus_Initial_Posting_Server is already running");
		}
	}

	public void checkOnus_Initial_Posting_Server1() {
		String statusOnus_Initial_Posting_Server = Onus_Initial_Posting_Serverstatus.getText();
		if (statusOnus_Initial_Posting_Server.equals("Active")) {
			System.out.println("Onus_Initial_Posting_Server is started");
		} else {
			System.out.println("Onus_Initial_Posting_Server is failed to start");
		}
	}
	
	public void checkOnus_Final_Posting_Server() throws InterruptedException {
		String statusOnus_Final_Posting_Server = Onus_Final_Posting_Serverstatus.getText();
		if (statusOnus_Final_Posting_Server.equals("Inactive")) {
			Onus_Final_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnus_Final_Posting_Server1();
		} else {
			System.out.println("Onus_Final_Posting_Server is already running");
		}
	}

	public void checkOnus_Final_Posting_Server1() {
		String statusOnus_Final_Posting_Server = Onus_Final_Posting_Serverstatus.getText();
		if (statusOnus_Final_Posting_Server.equals("Active")) {
			System.out.println("Onus_Final_Posting_Server is started");
		} else {
			System.out.println("Onus_Final_Posting_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Inward_Cheque_Server() throws InterruptedException {
		String statusIsraeli_Inward_Cheque_Server = Israeli_Inward_Cheque_Serverstatus.getText();
		if (statusIsraeli_Inward_Cheque_Server.equals("Inactive")) {
			Israeli_Inward_Cheque_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Inward_Cheque_Server1();
		} else {
			System.out.println("Israeli_Inward_Cheque_Server is already running");
		}
	}

	public void checkIsraeli_Inward_Cheque_Server1() {
		String statusIsraeli_Inward_Cheque_Server = Israeli_Inward_Cheque_Serverstatus.getText();
		if (statusIsraeli_Inward_Cheque_Server.equals("Active")) {
			System.out.println("Israeli_Inward_Cheque_Server is started");
		} else {
			System.out.println("Israeli_Inward_Cheque_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Inward_ImageMapping_Server() throws InterruptedException {
		String statusIsraeli_Inward_ImageMapping_Server = Israeli_Inward_ImageMapping_Serverstatus.getText();
		if (statusIsraeli_Inward_ImageMapping_Server.equals("Inactive")) {
			Israeli_Inward_ImageMapping_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Inward_ImageMapping_Server1();
		} else {
			System.out.println("Israeli_Inward_ImageMapping_Server is already running");
		}
	}

	public void checkIsraeli_Inward_ImageMapping_Server1() {
		String statusIsraeli_Inward_ImageMapping_Server = Israeli_Inward_ImageMapping_Serverstatus.getText();
		if (statusIsraeli_Inward_ImageMapping_Server.equals("Active")) {
			System.out.println("Israeli_Inward_ImageMapping_Server is started");
		} else {
			System.out.println("Israeli_Inward_ImageMapping_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Inward_Return_Server() throws InterruptedException {
		String statusIsraeli_Inward_Return_Server = Israeli_Inward_Return_Serverstatus.getText();
		if (statusIsraeli_Inward_Return_Server.equals("Inactive")) {
			Israeli_Inward_Return_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Inward_Return_Server1();
		} else {
			System.out.println("Israeli_Inward_Return_Server is already running");
		}
	}

	public void checkIsraeli_Inward_Return_Server1() {
		String statusIsraeli_Inward_Return_Server = Israeli_Inward_Return_Serverstatus.getText();
		if (statusIsraeli_Inward_Return_Server.equals("Active")) {
			System.out.println("Israeli_Inward_Return_Server is started");
		} else {
			System.out.println("Israeli_Inward_Return_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Cheque_Outfile_Creation_Server() throws InterruptedException {
		String statusIsraeli_Cheque_Outfile_Creation_Server = Israeli_Cheque_Outfile_Creation_Serverstatus.getText();
		if (statusIsraeli_Cheque_Outfile_Creation_Server.equals("Inactive")) {
			Israeli_Cheque_Outfile_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Cheque_Outfile_Creation_Server1();
		} else {
			System.out.println("Israeli_Cheque_Outfile_Creation_Server is already running");
		}
	}

	public void checkIsraeli_Cheque_Outfile_Creation_Server1() {
		String statusIsraeli_Cheque_Outfile_Creation_Server = Israeli_Cheque_Outfile_Creation_Serverstatus.getText();
		if (statusIsraeli_Cheque_Outfile_Creation_Server.equals("Active")) {
			System.out.println("Israeli_Cheque_Outfile_Creation_Server is started");
		} else {
			System.out.println("Israeli_Cheque_Outfile_Creation_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Outward_ImageIdMapping_Server() throws InterruptedException {
		String statusIsraeli_Outward_ImageIdMapping_Server = Israeli_Outward_ImageIdMapping_Serverstatus.getText();
		if (statusIsraeli_Outward_ImageIdMapping_Server.equals("Inactive")) {
			Israeli_Outward_ImageIdMapping_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Outward_ImageIdMapping_Server1();
		} else {
			System.out.println("Israeli_Outward_ImageIdMapping_Server is already running");
		}
	}

	public void checkIsraeli_Outward_ImageIdMapping_Server1() {
		String statusIsraeli_Outward_ImageIdMapping_Server = Israeli_Outward_ImageIdMapping_Serverstatus.getText();
		if (statusIsraeli_Outward_ImageIdMapping_Server.equals("Active")) {
			System.out.println("Israeli_Outward_ImageIdMapping_Server is started");
		} else {
			System.out.println("Israeli_Outward_ImageIdMapping_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Outward_Return_Server() throws InterruptedException {
		String statusIsraeli_Outward_Return_Server = Israeli_Outward_Return_Serverstatus.getText();
		if (statusIsraeli_Outward_Return_Server.equals("Inactive")) {
			Israeli_Outward_Return_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Outward_Return_Server1();
		} else {
			System.out.println("Israeli_Outward_Return_Server is already running");
		}
	}

	public void checkIsraeli_Outward_Return_Server1() {
		String statusIsraeli_Outward_Return_Server = Israeli_Outward_Return_Serverstatus.getText();
		if (statusIsraeli_Outward_Return_Server.equals("Active")) {
			System.out.println("Israeli_Outward_Return_Server is started");
		} else {
			System.out.println("Israeli_Outward_Return_Server is failed to start");
		}
	}
	
	public void checkIsraeli_PDC_Data_Migration_Server() throws InterruptedException {
		String statusIsraeli_PDC_Data_Migration_Server = Israeli_PDC_Data_Migration_Serverstatus.getText();
		if (statusIsraeli_PDC_Data_Migration_Server.equals("Inactive")) {
			Israeli_PDC_Data_Migration_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_PDC_Data_Migration_Server1();
		} else {
			System.out.println("Israeli_PDC_Data_Migration_Server is already running");
		}
	}

	public void checkIsraeli_PDC_Data_Migration_Server1() {
		String statusIsraeli_PDC_Data_Migration_Server = Israeli_PDC_Data_Migration_Serverstatus.getText();
		if (statusIsraeli_PDC_Data_Migration_Server.equals("Active")) {
			System.out.println("Israeli_PDC_Data_Migration_Server is started");
		} else {
			System.out.println("Israeli_PDC_Data_Migration_Server is failed to start");
		}
	}
	
	public void checkIsraeli_Cheque_Migration_Image_Tagging_Server() throws InterruptedException {
		String statusIsraeli_Cheque_Migration_Image_Tagging_Server = Israeli_Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusIsraeli_Cheque_Migration_Image_Tagging_Server.equals("Inactive")) {
			Israeli_Cheque_Migration_Image_Tagging_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIsraeli_Cheque_Migration_Image_Tagging_Server1();
		} else {
			System.out.println("Israeli_Cheque_Migration_Image_Tagging_Server is already running");
		}
	}

	public void checkIsraeli_Cheque_Migration_Image_Tagging_Server1() {
		String statusIsraeli_Cheque_Migration_Image_Tagging_Server = Israeli_Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusIsraeli_Cheque_Migration_Image_Tagging_Server.equals("Active")) {
			System.out.println("Israeli_Cheque_Migration_Image_Tagging_Server is started");
		} else {
			System.out.println("Israeli_Cheque_Migration_Image_Tagging_Server is failed to start");
		}
	}
	
	public void disableCheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Cheque_Outward_Payment_Creation_Servercheckbox.click();
		switchResourceButton.click();
		returnBtnStatus();
		System.out.println("Cheque_Outward_Payment_Creation_Server stopped");
	}
	
	public void disableIsraeli_Inward_Cheque_Server() throws InterruptedException {
		Israeli_Inward_Cheque_Servercheckbox.click();
		switchResourceButton.click();
		returnBtnStatus();
		System.out.println("Israeli_Inward_Cheque_Server stopped");
	}
	
	//-------  method for Cheque_Outward_Payment_Creation_Server inactive-----//
	
		public void switchInactiveCheque_Outward_Payment() throws InterruptedException {
			Cheque_Outward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			
		}
	
	public void LogOut() {
		logOutBtn.click();
		logoutBtn.click();
	}
	
	public void disableIsraeli_Cheque_Outfile_Creation_Server() throws InterruptedException {
		Israeli_Cheque_Outfile_Creation_Servercheckbox.click();
		switchResourceButton.click();
		returnBtnStatus();
		System.out.println("Israeli_Cheque_Outfile_Creation_Server stopped");
	}
	
	
}
