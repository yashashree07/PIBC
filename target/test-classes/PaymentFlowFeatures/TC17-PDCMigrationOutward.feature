@OutwardPDCMigrationFeature
Feature: To test the PDC migration functionality


 		
 	  @TC_17_01_OutwardPaymentPDCDDeleteflow 
    Scenario Outline: Outward PDC Delete Payment flow
    Given user check whether payment moved to QueuedToPayment status for PDCMigrationOutward flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then check whether payment move to Future status for PDCMigrationOutward flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then to delete payment from PDCDelete using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to Approve status from PDC>>Delete using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to QueuedToDeletePDC status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to Delete status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
 		
 		  Examples: 
     | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
     |                 | Cheque No | EQUAL  | 30000018 |   1376832300  |

 
		@TC_17_02_OutwardPaymentPDCDModifyflow 
    Scenario Outline: Outward PDC Modify Payment flow
    Given user check whether payment moved to QueuedToPayment status for PDCMigrationOutward flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then check whether payment move to Future status for PDCMigrationOutward flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then to delete payment from PDCDelete using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to Approve status from PDC>>Delete using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to QueuedToDeletePDC status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then check whether payment move to Delete status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then to validate whether payment gets modified using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>","<PayerBIC>"
    Then check whether payment move to Approve status from PDCModify using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    Then user check whether payment move to QueuedToAddPDC status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then check whether payment moves to Future status after QueuedToAddPDC status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
    #Then to first perform EOD and then SOD 
  	#Then user check whether payment move to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 		#Then user check whether payment move to Approve status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 	  #Then user check whether payment move to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #And user check whether payment move to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user check whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user disable Cheque_Outward_Payment_Creation_Server 
  
    
    Examples: 
     | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |PayerBIC    |
     |                 | Cheque No | EQUAL  | 30000115 |   1376832300  |HBHOPS20409 |


 		@TC_17_07_OutwardPaymentPDCDNormalflow 
    Scenario Outline: Outward PDC Normal Payment flow
 		Given user check whether payment moved to QueuedToPayment status for PDCMigrationOutward flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then check whether payment move to Future status for PDCMigrationOutward flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
  	Then to first perform EOD and then perform SOD 
   	Then user check whether payment move to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 		Then user check whether payment move to Approve status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 	  Then user check whether payment move to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And user check whether payment move to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user check whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server 
  
  
    Examples: 
     | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
     |                 | Cheque No | EQUAL  | 30000022 |   1376832300  |

 	
