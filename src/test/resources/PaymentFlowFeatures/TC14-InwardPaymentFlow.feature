#Author: Suvarna
Feature: Inward Payment flow feature

  @TC_14_02_PositiveInwardFlow
  Scenario Outline: Inward Payment flow
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30002274 |               |
      
  @TC_14_04_VIPInwardpaymentFlow
  Scenario Outline: VIP Inward payment Flow
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to InsufficientFund status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to InsufficientFundApprove status "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToVipChequeAcceptance using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToOutfile status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to PendingAck status on enabling EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE scheduler using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	 
    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30002612 |               |
      
   @TC_14_07_InwardPaymentReturnfromSignatureCheck
  Scenario Outline: Inward Payment Return from SignatureCheck flow
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheckApprove after gets rejected from SignatureCheck queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then validate whether payment move to QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToOutfile status after Rejected status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then user checks the scheduler status and enables the scheduler
    Then validate whether payment moves to PendingAck status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
 
    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |UpdatedPaymentType     |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30002274 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |ACH CHEQUE RETURN SEND |   
      
       @TC_14_10_InwardPaymentReturnflowReturnfromInsufficientFund
   Scenario Outline: Inward Payment Return from InsufficientFund flow
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheck using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to InsufficientFund status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to InsufficientFundApprove status after gets rejected from InsufficientFund queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then validate whether payment move to QueuedToFinalPosting from InsufficientFundApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToReturnCreation state using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000062 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |
      
      @TC_14_23_InwardPaymentflowwithExceptionfromQueuedToInitialPosting
  Scenario Outline: Inward Payment flow with QueuedToInitialPosting Exception
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Exception status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Exception to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck from Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000063 |               |
      
      @TC_14_26_InwardPaymentflowwithExceptionfromQueuedToFinalPosting
  Scenario Outline: Inward Payment flow with QueuedToFinalPosting Exception
    Given user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    And user validates whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheckApprove after gets rejected from SignatureCheck queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then validate whether payment move to QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Exception from QueuedToFinalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Exception to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToReturnCreation status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000064 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |


  
