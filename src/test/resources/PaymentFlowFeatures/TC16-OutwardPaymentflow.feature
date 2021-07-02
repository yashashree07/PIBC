#Author: Pranjal
#@OutwardFlow
Feature: To test the noutward payment functionality

  @TC_16_01_OutwardPaymentFlow 
  Scenario Outline: To test the outward payment flow
    Given user checks whether payment move to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And user enable Cheque_Outward_Payment_Creation_Server and check whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then user validate whether payment move to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user validate whether payment move to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And user validate whether payment move to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user To validate whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server in enviornment server

    Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
      |                 | Cheque No | EQUAL  | 30000473 |     |
	#Does not move from QueuedToAccountVerification to Approve DB Query Issue same as ONUS.
  #@TC_16_06_DuplicateOutward
  #Scenario Outline: To test duplicate outward payment flow
    #Given user checks whether payment move to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    #And user enable Cheque_Outward_Payment_Creation_Server and check whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    #Given user validate whether payment move to Duplicate status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user goes to Duplicate menu use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and click on Allow duplicate button and click on confirm button
    #And user goes to approve menu use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and approves the payment
    #Then user validate whether payment move to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user validate whether payment move to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #And user validate whether payment move to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user To validate whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user disable Cheque_Outward_Payment_Creation_Server in enviornment server
#db update query issue
    #Examples: 
      #| valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
      #|                 | Cheque No | EQUAL  | 30000211 |    1376832300 |

  #@TC_16_11_RepairOutward
  #Scenario Outline: To test duplicate outward payment flow
    #Given user checks whether payment move to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    #And user enable Cheque_Outward_Payment_Creation_Server and check whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    #Then user validate whether payment move to Repair status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user goes to Repair menu use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" repair the payment "<Date>" click on Ok button and click on confirm button
    #And user goes to approve menu use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and approves the payment
    #Then user validate whether payment move to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user validate whether payment move to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #And user validate whether payment move to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user To validate whether payment move to PendingAck status on enabling EGPS_CHEQUE_OUTFILE scheduler using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    #Then user disable Cheque_Outward_Payment_Creation_Server in enviornment server
#db update query issue
    #Examples: 
      #| valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account | Date     |
      #|                 | Cheque No | EQUAL  | 30000211 |    1376832300 | 18/01/21 |
