Feature: Israeli Outward Payment flow feature


@TC_19_01_IsraeliOutwardPaymentFlow  
  Scenario Outline: To test the Israeli outward payment flow
    Given user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using "<ChequeNo>" and "<PayerAccount>" in cheque data entry list menu
    Then user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Flow using "<ChequeNo>" and "<PayerAccount>"
    Then user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow 
		Then to check whether Outfile request is getting created using "<Request_Type>"
    Then To View Created Outfile Request using "<Request_Type>","<Status1>"
   	Then To Enable Israeli_Cheque_Outfile_Creation_Server
   	Then to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		#Then to perform EOD and then SOD for IsraeliOutward Payment Flow
		#Then to check whether payment moves to QueuedToOutReplyCheque status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	#Then check whether payment moves to Completed Status for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		Then disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow
		
		 	Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | PayerAccount |ChequeNumber  |Request_Type       |Status1                    |
      |                 | Cheque No | EQUAL  | 30000299 |  1376832300  | 0030000299   |Israeli send cheque|QueuedToFileCreation       |