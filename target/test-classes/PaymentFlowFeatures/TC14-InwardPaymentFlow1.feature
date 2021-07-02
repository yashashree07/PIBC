#Author: Suvarna
Feature: Inward Payment flow feature

 @TC_14_13_DuplicateCheque
  Scenario Outline: Inward Payment flow for Duplicate Cheque
    Then check whether Inward Payment is duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate list displayed for duplicate cheques "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Given User is into the system
    Then user validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then user validate whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then user validate whether payment move to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000010 |               |

  @TC_14_16_DuplicateToQualifyReceiveCheque
  Scenario Outline: Inward Payment flow for sending Duplicate Cheque to Qualify Receive queue
    Then check whether Inward Payment is duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then to send payment to Qualify Receive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<Reason>"
    Then validate whether payment move to Qualify Receive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | Reason |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000013 |               | Return |
      
      #@TC_14_18_QualifyReceiveCheque
  #Scenario Outline: Inward Payment flow which is in Qualify Receive queue
    #Then check whether Inward Payment is in Qualify receive using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate list displayed for Qualify Receive cheques "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<CheckkAccNo>","<ValueDate>","<PayerBICCode>"
    #Then validate whether payment move to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    #Then validate whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate whether payment move to SignatureCheck using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate whether payment move to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
#button issue/configuration issue
    #Examples: 
      #| ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ValueDate | PayerBICCode | CheckkAccNo |
      #|                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000007 |               | 18/01/21  | TNBCPS20006  |  1001005616 |

  #@TC_14_21_ReturnfromQualifyReceive
  #Scenario Outline: Inward Payment return flow from Qualify Receive queue
    #Then check whether Inward Payment is in Qualify receive using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then to return cheque from Qualify Receive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    #Then validate whether payment move to QueuedToReturnCreation status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate whether payment move to Rejected status from Qualify Receive using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
#Payer details are mandatory while returning paymnent
    #Examples: 
      #| ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |
      #|                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000013 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |

  @TC_14_29_StopChequefunctionality
  Scenario Outline: Check Stop cheque functionality for Inward flow
    Then To check whether cheque details get added in Stop cheque list using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields
    Then To check whether stop cheque functionality is working properly or not using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo |
      | PIBCPS20 |        845 | ILS      |            30000007 |            30000007 |               |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000007 |