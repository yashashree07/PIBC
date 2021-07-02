Feature: IsraeliParticipant Bank feature

  @TC_07_13_AddIsraeliParticipantBankwithValiddatawithHeadOffice
  Scenario Outline: To Add IsraeliParticipant Bank with Valid data for Bank Type Head Office
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Add menu to add IsraeliParticipant Bank
    Then User enter valid "<SwiftCode>","<BankCode>" ,"<Name>","<ShortName>" fields in IsraeliBankPage and click on OK button

    Examples: 
      | SwiftCode | BankCode | Name                         | ShortName |
      |BYAHILIT   |       04 | Mercantile Discount Bank Ltd | BYAH04000 |
      |LUMIILIT   |       10 | Mercantile Discount Bank Ltd | LUMI10000 |

  @TC_07_14_ApproveIsraeliParticipantBank
  Scenario Outline: To Approve the IsraeliParticipant Bank
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Approve menu
    Then User approves the added IsraeliParticipant bank with "<SwiftCode>"

    Examples: 
      | SwiftCode |
      | BYAHILIT  |

  @TC_07_15_AddIsraeliParticipantBankwithValiddataWithBranch
  Scenario Outline: To Add IsraeliParticipant Bank with Valid data for Bank Type Branch
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Add menu to add IsraeliParticipant Bank
    Then User enter valid "<SwiftCode>","<BankCode>" ,"<Name>","<ShortName>" and selects "<BankType>" and enter "<BranchCode>" field as Branch in IsraeliBankPage and click on OK button

    Examples: 
      | SwiftCode   | BankCode | Name                         | ShortName      | BankType | BranchCode  |
      | BYAHILIT030 |      04  | Mercantile Discount Bank Ltd | BYAH04030      | Branch   |        030 |

  @TC_07_16_SendToRepairqueueIsraeliParticipantBank
  Scenario Outline: To send the IsraeliParticipant Bank to Repair queue
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Approve menu
    Then User send the added IsraeliParticipant bank to repair with "<SwiftCode>"

    Examples: 
      | SwiftCode   |
      | LUMIILIT    |
      | BYAHILIT030|

 # @TC_07_17_ModifyIsraeliParticipantBankforHeadOfficewithValiddata 
  #Scenario Outline: To Modify the IsraeliParticipant Bank for Bank type Head Office
    #Then User goes to Maintenance DB and open IsraeliParticipant Bank Modify menu to modify IsraeliParticipant Bank
    #Then User modify the "<Name>","<BankCode>","<BranchCode>","<ShortName>" in IsraeliBankPage and click on OK button with "<SwiftCode>"
    #Then User approves the record in IsraeliBankPage with "<SwiftCode>"
#logout button is missing on page
    #Examples: 
      #| SwiftCode | Name                        | BankCode | BranchCode  | ShortName |
      #| LUMIILIT  |Mercantile Discount Bank Ltd |     10   |         000 |LUMI10000  |

 # @TC_07_18_ModifyIsraeliParticipantBankforBranchwithValiddata 
  #Scenario Outline: To Modify the IsraeliParticipant Bank for Bank type Branch
    #Then User goes to Maintenance DB and open IsraeliParticipant Bank Modify menu to modify IsraeliParticipant Bank
    #Then User tries to modify the "<Name>","<BankCode>","<BankType>","<BranchCode>","<ShortName>" in IsraeliBankPage and click on OK button with "<SwiftCode>"
    #Then User approves the record in IsraeliBankPage with "<SwiftCode>"

    #Examples: 
      #| SwiftCode   | Name                         | BankCode | BankType | BranchCode | ShortName |
      #|BYAHILIT030  | Mercantile Discount Bank Ltd |        04| Branch   |        030| BYAH04030 |
	#logout buttton missing on page
  @TC_07_19_ModifyIsraeliParticipantBankforHeadOfficewithInvaliddata
  Scenario Outline: To Modify the IsraeliParticipant Bank for Bank type Head Office with Invalid data
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Modify menu to modify IsraeliParticipant Bank
    Then User enter invalid "<BankCode>" and "<BranchCode>" in IsraeliBankPage and click on OK button with "<SwiftCode>"

    Examples: 
      | SwiftCode | BankCode | BranchCode |
      |LUMIILIT   |      456 |      12345 |

  @TC_07_20_ModifyIsraeliParticipantBankforBranchwithInvaliddata
  Scenario: To Modify the IsraeliParticipant Bank for Bank type Branch with Invalid data
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Modify menu to modify IsraeliParticipant Bank
    Then User fill invalid BankCode and BranchCode in IsraeliBankPage and click on OK button
      | BYAHILIT030 | 4567 | 12345 |
    Then User put invalid BankCode and BranchCode in IsraeliBankPage and click on OK button
      | BYAHILIT030 | 123 |

  @TC_07_21_AddIsraeliParticipantBankwithInvaliddata
  Scenario: To Add IsraeliParticipant Bank with Invalid data
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Add menu to add IsraeliParticipant Bank
    Then User enter valid "BankCode" ,"Name","ShortName" fields in IsraeliBankPage and click on OK button to validate SwiftCode field
       | LUMIILIT657890   | 10   |Mercantile Discount Bank Ltd   | LUMI10000 |
       | BYAHILIT | 10   |Mercantile Discount Bank Ltd   | LUMI10000 |
       | ALDNPS2012345| 10   | Mercantile Discount Bank Ltd  | LUMI10000 |
    Then User enter valid "SwiftCode" ,"Name","ShortName" fields in IsraeliBankPage and click on OK button to validate BankCode field
      |ARISILIT   | 899 | Mercantile Discount Bank Ltd | BYAH04000 |
      |ARISILIT   |  04 | Mercantile Discount Bank Ltd | BYAH04000 |

  @TC_07_22_AddIsraeliParticipantBankwithBlankdata
  Scenario: To Add IsraeliParticipant Bank with Blank data
    Then User goes to Maintenance DB and open IsraeliParticipant Bank Add menu to add IsraeliParticipant Bank
    Then User will keep SwiftCode field blank and fill "BankCode" ,"Name","ShortName" fields in IsraeliBankPage to validate SwiftCode field
      |             | 46 | Mercantile Discount Bank Ltd | TNBC |
      | LUMIILIT    | 46 | Mercantile Discount Bank Ltd | TNBC |
      | LUMIILIT657 | 46 | Mercantile Discount Bank Ltd | TNBC |
    Then User will keep BankCode field blank and fill "SwiftCode" ,"Name","ShortName" fields in IsraeliBankPage to validate BankCode field
      | TNBCPS20 |    | TNBC | TNBC |      |
      | TNBCPS20 | 82 | TNBC |      | TNBC |
    Then User will keep Name field blank and fill "SwiftCode" ,"BankCode","ShortName" fields in IsraeliBankPage to validate Name field
      | SBINILIT | 34 |  | BYAH04000 |
    Then User will keep ShortName field blank and fill "SwiftCode" ,"BankCode","Name" fields in IsraeliBankPage to validate ShortName field
      | SBINILIT | 34 | Mercantile Discount Bank Ltd  |  |

  @TC_07_23_ListIsraeliParticipantBankwithValiddata 
  Scenario Outline: To validate list of IsraeliParticipant Bank with Valid data
    Then User goes to Maintenance DB and open IsraeliParticipant Bank List menu to list the added IsraeliParticipant Bank
    Then User select valid "<SwiftCode>", "<BankCode>", "<ShortName>" in IsraeliBankPage and click on OK button

    Examples: 
      | SwiftCode   | BankCode | ShortName |
      | BYAHILIT030 |       27 | BYAH04030 |
      | BYAHILIT    |       04  | BYAH0400  |

 # @TC_07_24_ListIsraeliParticipantBankwithInvaliddata Cancel Operation Message not displayed on page on clicking cancel button
  #Scenario Outline: To validate list of IsraeliParticipant Bank with Invalid data
    #Then User goes to Maintenance DB and open IsraeliParticipant Bank List menu to list the added IsraeliParticipant Bank
    #Then User select invalid "<SwiftCode>", "<BankCode>", "<ShortName>" in IsraeliBankPage and click on OK button
#
    #Examples: 
      #| SwiftCode | BankCode | ShortName |
      #| testing   | test     | test      |
