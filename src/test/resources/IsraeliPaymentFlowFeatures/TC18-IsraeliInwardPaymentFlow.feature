Feature: Israeli Inward Payment flow feature

  @TC_18_01_PositiveIsraeliInwardPaymentFlow 
  Scenario Outline: Israeli Inward Payment flow
    Then To check whether IsraeliInward file gets uploaded using "<FileType>","<FilePath>"
    Then To check whether file status changes to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether file status changes to Completed status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment move to QueuedToIntitalPosting status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from SignatureCheck for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to PendingSettlement for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		#Then to perform EOD and then SOD for IsraeliInward Payment Flow
    #Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<StartValueDate>"
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber | FileType                   | FilePath                                                                                      | Period | FileName | StartValueDate |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 31911218 |               | ISRAELI_CHEQUE_INWARD_FILE | D:\\Ruchit\\Automation\\Projects\\Data\\Israile\\PIBCDataFiles\\CV12_TO_RASHUT01_20210217.TXT |        |          |                |

  @TC_18_02_IsraeliInwardPaymentReturnfromSignatureCheck 
  Scenario Outline: Israeli Inward Payment Return from SignatureCheck flow
    Then To check whether IsraeliInward file gets uploaded using "<FileType>","<FilePath>"
    Then To check whether file status changes to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether file status changes to Completed status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment move to QueuedToIntitalPosting status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets Returned from SignatureCheck for IraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>"
    Then validate whether payment move to SignatureCheckApprove after gets Returned from SignatureCheck queue for IraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to QueuedToFinalPosting after SignatureCheckApprove for IraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToIsraeliReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether Out file request is getting created using "<Request_Type>"
    Then to view Created Outfile Request using "<Request_Type>","<Status1>"
    Then to enable Israeli_Cheque_Outfile_Creation_Server
    Then validate whether payment moves to Completed for IsraeliInward Payment Flow using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then disable Israeli_Cheque_Outfile_Creation_Server

    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber | FileType                   | FilePath                                                                                      | Period | FileName                      | ReasonCode1 | ReasonCode2      | ReasonCode3 | ReasonCode4  | UpdatedPaymentType         | Request_Type               | Status1              |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 31911219 |               | ISRAELI_CHEQUE_INWARD_FILE | D:\\Ruchit\\Automation\\Projects\\Data\\Israile\\PIBCDataFiles\\CV12_TO_RASHUT02_20210217.TXT |        | CV12_TO_RASHUT02_20210217.TXT | 02-Balance  | 03-Closed Drawer | 04-Tug die  | 05-Suspended | ISRAELI CHEQUE RETURN SEND | Israeli return send cheque | QueuedToFileCreation |

  @TC_18_03_IsraeliInwardPaymentInsufficientFundFlow
  Scenario Outline: Israeli Inward Payment InsufficientFund flow
    Then To check whether IsraeliInward file gets uploaded using "<FileType>","<FilePath>"
    Then To check whether file status changes to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether file status changes to Completed status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment move to QueuedToIntitalPosting status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck status after QueuedToInitialPosting for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment gets approved from SignatureCheckQueue for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment goes to InsufficientFund status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from InsufficientFund for IsraeliInward Payment Flow "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to InsufficientFundApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from InsufficientFundApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to PendingSettlement for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then to perform EOD and then SOD for IsraeliInward Payment Flow
    #Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<StartValueDate>"
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber | FileType                   | FilePath                                                                                      | Period | FileName                      | StartValueDate |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 31911222 |               | ISRAELI_CHEQUE_INWARD_FILE | D:\\Ruchit\\Automation\\Projects\\Data\\Israile\\PIBCDataFiles\\CV12_TO_RASHUT04_20210217.TXT |        | CV12_TO_RASHUT05_20210217.TXT | 08/02/21       |
	
	#ongoing Insuff does not work due to DB related Error
	 
  @TC_18_04_IsraeliInwardPaymentReturnflowReturnfromInsufficientFund 
  Scenario Outline: Israeli Inward Payment Return from InsufficientFund flow
    Then To check whether IsraeliInward file gets uploaded using "<FileType>","<FilePath>"
    Then To check whether file status changes to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether file status changes to Completed status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment move to QueuedToAccountVerification status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment move to QueuedToIntitalPosting status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck status after QueuedToInitialPosting for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then check whether payment gets approved from SignatureCheckQueue for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment goes to InsufficientFund status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    #Then validate whether payment gets returned from InsufficientFund for IsraeliInward Payment Flow "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" "<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>"
    Then validate whether payment move to InsufficientFundApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from InsufficientFundApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   #Then validate whether payment move to QueuedToFinalPosting after return from InsufficientFund for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToIsraeliReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether Out file request is getting created using "<Request_Type>"
    Then to view Created Outfile Request using "<Request_Type>","<Status1>"
    Then to enable Israeli_Cheque_Outfile_Creation_Server
    Then validate whether payment moves to Completed for IsraeliInward Payment Flow using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then disable Israeli_Cheque_Outfile_Creation_Server

    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber | FileType                   | FilePath                                             | Period | FileName    | ReasonCode1 | ReasonCode2      | ReasonCode3 | ReasonCode4  | UpdatedPaymentType         | Request_Type               | Status1              |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30443383 |               | ISRAELI_CHEQUE_INWARD_FILE | E:\\PIBC_PRJ\\ISRAELI_CHEQUE_UPLOAD_DIR\\PLST_13.zip |        | PLST_13.zip | 02-Balance  | 03-Closed Drawer | 04-Tug die  | 05-Suspended | ISRAELI CHEQUE RETURN SEND | Israeli return send cheque | QueuedToFileCreation |
	#Insuff Fund issue DB