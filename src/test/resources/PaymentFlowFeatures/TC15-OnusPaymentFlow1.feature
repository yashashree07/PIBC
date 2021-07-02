#Author: Suvarna
Feature: Onus Payment flow feature

@TC_15_03_Onuspaymentflow-VIP
  Scenario Outline: Onus VIP Payment flow
    Then To check whether Cheque data entry move to QueuedToPayment status using "<ChequeNo>","<AccountNumber>"
    Then To check whether Cheque data entry gets Completed using "<ChequeNo>","<AccountNumber>"
    Then disable Cheque_Outward_Payment_Creation_Server
    Then check whether payment move to QueuedToAccountVerification and then to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then check whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to Completed status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType     | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | INTERNAL CHEQUE | Cheque No | EQUAL  | 30000210 |               |
      
      @TC_15_04_Onusreturnpaymentflow-VIP
  Scenario Outline: Onus VIP Return Payment flow
    Then To check whether Cheque data entry move to QueuedToPayment status using "<ChequeNo>","<AccountNumber>"
    Then To check whether Cheque data entry gets Completed using "<ChequeNo>","<AccountNumber>"
    Then disable Cheque_Outward_Payment_Creation_Server
    Then check whether payment move to QueuedToAccountVerification and then to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then check whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to SignatureCheckApprove after gets rejected from SignatureCheck queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then check whether payment move to QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment move to Returned using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType     | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |
      |                 | INTERNAL CHEQUE | Cheque No | EQUAL  | 30000211 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |

  #@TC_15_05_OnusDuplicateCheque     
  #Scenario Outline: Onus Duplicate Payment flow
    #Then To check whether Cheque data entry move to QueuedToPayment status using "<ChequeNo>","<AccountNumber>"
    #Then To check whether Cheque data entry gets Completed using "<ChequeNo>","<AccountNumber>"
    #Then disable Cheque_Outward_Payment_Creation_Server
    #Then To check whether Onus Payment is duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then To validate list displayed for duplicate cheques using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then check whether payment move to QueuedToAccountVerification and then to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    #Then check whether payment move to QueuedToInitialPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then check whether payment move to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then check whether payment move to SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then check whether payment move to QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then check whether payment move to Completed status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
#db update query issue
    #Examples: 
      #| ValueDateperiod | PaymentType     | Reference | SubRef | ChequeNo | AccountNumber |
      #|                 | INTERNAL CHEQUE | Cheque No | EQUAL  | 30000216 |               |
      
    @TC_15_07_ToCancelfromRepair
  Scenario Outline: Onus Payment flow for sending to Cancel status from Repair queue
    Then To check whether Cheque data entry move to QueuedToPayment status using "<ChequeNo>","<AccountNumber>"
    Then To check whether Cheque data entry gets Completed using "<ChequeNo>","<AccountNumber>"
    Then disable Cheque_Outward_Payment_Creation_Server
    Then validate whether payment move to Repair queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then to send payment to Canceled status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<Reason>"
    Then to check whether payment gets Canceled using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType     | Reference | SubRef | ChequeNo | AccountNumber | Reason |
      |                 | INTERNAL CHEQUE | Cheque No | EQUAL  | 30000212 |               | Return |   