#Author: Suvarna
Feature: Participant Bank feature

  @TC_07_01_AddParticipantBankwithValiddatawithHeadOffice
  Scenario Outline: To Add Participant Bank with Valid data for Bank Type Head Office
    Then User goes to Maintenance DB and open Participant Bank Add menu to add Participant Bank
    Then User enter valid "<SwiftCode>","<BankCode>" ,"<Name>","<ShortName>" fields and click on OK button

    Examples: 
      | SwiftCode | BankCode | Name | ShortName |
      | TNBCPS20  |       27 | TNBC | TNBC      |
      | ALDNPS20  |       82 | ALDN | ALDN      |

  @TC_07_02_ApproveParticipantBank
  Scenario Outline: To Approve the Participant Bank
    Then User goes to Maintenance DB and open Participant Bank Approve menu
    Then User approves the added Participant bank with "<SwiftCode>"

    Examples: 
      | SwiftCode |
      | TNBCPS20  |

  @TC_07_03_AddParticipantBankwithValiddataWithBranch
  Scenario Outline: To Add Participant Bank with Valid data for Bank Type Branch
    Then User goes to Maintenance DB and open Participant Bank Add menu to add Participant Bank
    Then User enter valid "<SwiftCode>","<BankCode>" ,"<Name>","<ShortName>" and selects "<BankType>" and enter "<BranchCode>" field as Branch and click on OK button
    Then User goes and approve the Participant bank with "<SwiftCode>"

    Examples: 
      | SwiftCode   | BankCode | Name | ShortName | BankType | BranchCode |
      | TNBCPS20006 |       27 | TNBC | TNBC      | Branch   |        006 |
      | TNBCPS20003 |       27 | TNBC | TNBC      | Branch   |        003 |
      | TNBCPS20002 |       27 | TNBC | TNBC      | Branch   |        002 |
      | TNBCPS20001 |       27 | TNBC | TNBC      | Branch   |        001 |

  @TC_07_04_SendToRepairqueueParticipantBank
  Scenario Outline: To send the Participant Bank to Repair queue
    Then User goes to Maintenance DB and open Participant Bank Approve menu
    Then User send the added Participant bank to repair with "<SwiftCode>"

    Examples: 
      | SwiftCode   |
      | ALDNPS20    |

  #@TC_07_05_ModifyParticipantBankforHeadOfficewithValiddata
  #Scenario Outline: To Modify the Participant Bank for Bank type Head Office
    #Then User goes to Maintenance DB and open Participant Bank Modify menu to modify Participant Bank
    #Then User modify the "<Name>","<BankCode>","<BranchCode>","<ShortName>" and click on OK button with "<SwiftCode>"
    #Then User approves the record with "<SwiftCode>"
#
    #Examples: 
      #| SwiftCode | Name | BankCode | BranchCode | ShortName |
      #| TNBCPS20  | TNBC |       27 |         | TNBC      |

  #@TC_07_06_ModifyParticipantBankforBranchwithValiddata
  #Scenario Outline: To Modify the Participant Bank for Bank type Branch
    #Then User goes to Maintenance DB and open Participant Bank Modify menu to modify Participant Bank
    #Then User tries to modify the "<Name>","<BankCode>","<BankType>","<BranchCode>","<ShortName>" and click on OK button with "<SwiftCode>"
    #Then User approves the record with "<SwiftCode>"
#
    #Examples: 
      #| SwiftCode   | Name | BankCode | BankType | BranchCode | ShortName |
      #| TNBCPS20002 | TNBC |       27 | Branch   |        002 | TNBC      |

  @TC_07_07_ModifyParticipantBankforHeadOfficewithInvaliddata
  Scenario Outline: To Modify the Participant Bank for Bank type Head Office with Invalid data
    Then User goes to Maintenance DB and open Participant Bank Modify menu to modify Participant Bank
    Then User enter invalid "<BankCode>" and "<BranchCode>" and click on OK button with "<SwiftCode>"

    Examples: 
      | SwiftCode | BankCode | BranchCode |
      | TNBCPS20  |      456 |      12345 |

  @TC_07_08_ModifyParticipantBankforBranchwithInvaliddata
  Scenario: To Modify the Participant Bank for Bank type Branch with Invalid data
    Then User goes to Maintenance DB and open Participant Bank Modify menu to modify Participant Bank
    Then User fill invalid BankCode and BranchCode and click on OK button
      | TNBCPS20003 | 4567 | 12345 |
    Then User put invalid BankCode and BranchCode and click on OK button
      | TNBCPS20003 | 123 |

  @TC_07_09_AddParticipantBankwithInvaliddata
  Scenario: To Add Participant Bank with Invalid data
    Then User goes to Maintenance DB and open Participant Bank Add menu to add Participant Bank
    Then User enter valid "BankCode" ,"Name","ShortName" fields and click on OK button to validate SwiftCode field
      | ALHUFBGKJG    | 90 | TNBC | TNBC |
      | ALDNPS20    | 90 | TNBC | TNBC |
      | PQRSPS20777 | 90 | TNBC | TNBC |
    Then User enter valid "SwiftCode" ,"Name","ShortName" fields and click on OK button to validate BankCode field
      | TNBCPS20 | 899 | TNBC | TNBC |
      | TNBCPS20 |  82 | TNBC | TNBC |

  @TC_07_10_AddParticipantBankwithBlankdata
  Scenario: To Add Participant Bank with Blank data
    Then User goes to Maintenance DB and open Participant Bank Add menu to add Participant Bank
    Then User will keep SwiftCode field blank and fill "BankCode" ,"Name","ShortName" fields to validate SwiftCode field
      |             | 27 | TNBC | TNBC |
      | ALDNPS20    | 27 | TNBC | TNBC |
      | PQRSPS20777 | 27 | TNBC | TNBC |
    Then User will keep BankCode field blank and fill "SwiftCode" ,"Name","ShortName" fields to validate BankCode field
      | TNBCPS20 |    | TNBC | TNBC |      |
      | TNBCPS20 | 82 | TNBC |      | TNBC |
    Then User will keep Name field blank and fill "SwiftCode" ,"BankCode","ShortName" fields to validate Name field
      | TNBCPS20 | 27 |  | TNBC |
    Then User will keep ShortName field blank and fill "SwiftCode" ,"BankCode","Name" fields to validate ShortName field
      | TNBCPS20 | 27 | TNBC |  |

  @TC_07_11_ListParticipantBankwithValiddata
  Scenario Outline: To validate list of Participant Bank with Valid data
    Then User goes to Maintenance DB and open Participant Bank List menu to list the added Participant Bank
    Then User select valid "<SwiftCode>", "<BankCode>", "<ShortName>" and click on OK button

    Examples: 
      | SwiftCode   | BankCode | ShortName |
      | TNBCPS20006 |       27 | TNBC      |
      | TNBCPS20    |       27 | TNBC      |

  @TC_07_12_ListParticipantBankwithInvaliddata
  Scenario Outline: To validate list of Participant Bank with Invalid data
    Then User goes to Maintenance DB and open Participant Bank List menu to list the added Participant Bank
    Then User select invalid "<SwiftCode>", "<BankCode>", "<ShortName>" and click on OK button

    Examples: 
      | SwiftCode | BankCode | ShortName |
      | testing   | test     | test      |
