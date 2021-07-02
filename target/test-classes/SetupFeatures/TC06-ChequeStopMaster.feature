#Author: Suvarna
Feature: Cheque Stop Master feature

  @TC_06_01_EnterChequeStopEntrywithBlankdataforEURCurrency
  Scenario Outline: To Enter Cheque stop details with Blank data for EUR currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User keep "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields blank and click on OK button

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      |          |        006 | EUR      |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 |          |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | EUR      |                     |                     |    1234567890 |
      | TNBCPS20 |        006 | EUR      |            30000006 |            30000006 |               |

  @TC_06_02_EnterChequeStopEntrywithBlankdataforILSCurrency
  Scenario Outline: To Enter Cheque stop details with Blank data for ILS currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User keep "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields blank and click on OK button

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      |          |        006 | ILS      |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 |          |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |                     |                     |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000006 |            30000006 |               |

  @TC_06_03_EnterChequeStopEntrywithBlankdataforUSDCurrency
  Scenario Outline: To Enter Cheque stop details with Blank data for USD currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User keep "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields blank and click on OK button

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      |          |        006 | USD      |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 |          |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | USD      |                     |                     |    1234567890 |
      | TNBCPS20 |        006 | USD      |            30000006 |            30000006 |               |

  @TC_06_04_EnterChequeStopEntrywithBlankdataforJODCurrency
  Scenario Outline: To Enter Cheque stop details with Blank data for JOD currency 
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User keep "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields blank and click on OK button

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      |          |        006 | JOD      |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 |          |            30000006 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |                     |                     |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            30000006 |            30000006 |               |

  @TC_06_05_EnterChequeStopEntrywithInvaliddataforEURCurrency
  Scenario Outline: To Enter Cheque stop details with Invalid data for EUR currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter invalid data in "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |                 123 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | EUR      |            30000006 |                 123 |    1234567890 |
      | TNBCPS20 |        006 | EUR      |            30000006 |            30000006 |          1234 |

  @TC_06_06_EnterChequeStopEntrywithInvaliddataforILSCurrency
  Scenario Outline: To Enter Cheque stop details with Invalid data for ILS currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter invalid data in "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | ILS      |                 123 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000006 |                 123 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000006 |            30000006 |          1234 |

  @TC_06_07_EnterChequeStopEntrywithInvaliddataforUSDCurrency
  Scenario Outline: To Enter Cheque stop details with Invalid data for USD currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter invalid data in "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | USD      |                 123 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            30000006 |                 123 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            30000006 |            30000006 |          1234 |

  @TC_06_08_EnterChequeStopEntrywithInvaliddataforJODCurrency
  Scenario Outline: To Enter Cheque stop details with Invalid data for JOD currency
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter invalid data in "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | JOD      |                 123 |            30000006 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            30000006 |                 123 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            30000006 |            30000006 |          1234 |

  @TC_06_09_EnterChequeStopEntrywithValiddata
  Scenario Outline: To Enter Cheque stop details with Valid data
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter valid data in "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |
      | TNBCPS20 |        006 | EUR      |            50000004 |            50000004 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000003 |            30000003 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000002 |            20000002 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000001 |            10000001 |    1234567890 |

  @TC_06_10_EnterChequeStopEntryforAlreadyexistingChequeEntry
  Scenario Outline: To Enter Cheque stop details for already existing Cheque entry
    Then User goes to Maintenance DB and open Cheque Stop Enter menu
    Then User enter valid data in "<Issuer>","<BranchCode>","<Currency>","<AccountNumber>" with already existing "<MinimumChequeNumber>","<MaximumChequeNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |

  @TC_06_11_ApproveChequeStopEntry
  Scenario Outline: To Approve Cheque stop entry
    Then User goes to Maintenance DB and open Cheque Stop Approve menu
    Then User approves Cheque stop entry using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |

  @TC_06_12_ApproveChequeStopEntrywithInvalidcriteria
  Scenario Outline: To Approve Cheque stop entry with Invalid criteria
    Then User goes to Maintenance DB and open Cheque Stop Approve menu
    Then User try to approve Cheque stop entry by giving invalid criteria using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000006 |            50000006 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000005 |            30000005 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000004 |            20000004 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000003 |            10000003 |    1234567890 |

  @TC_06_13_ChequeStopEntrySendtoRepairQueue
  Scenario Outline: To send Cheque stop entry to Repair queue
    Then User goes to Maintenance DB and open Cheque Stop Approve menu
    Then User send Cheque stop entry to repair queue using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000004 |            50000004 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000003 |            30000003 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000002 |            20000002 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000001 |            10000001 |    1234567890 |

  @TC_06_14_ModifyChequeStopEntrywithValiddata
  Scenario Outline: To modify Cheque stop entry with Valid data
    Then User goes to Maintenance DB and open Cheque Stop Modify menu
    Then User use "<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>" to modify "<Issuer>","<BranchCode>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000004 |            50000004 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000003 |            30000003 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000002 |            20000002 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000001 |            10000001 |    1234567890 |

  @TC_06_15_ApprovemodifiedChequeStopEntry
  Scenario Outline: To Approve modified Cheque stop entry
    Then User goes to Maintenance DB and open Cheque Stop Approve menu
    Then User approves Cheque stop entry using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000004 |            50000004 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000003 |            30000003 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000002 |            20000002 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000001 |            10000001 |    1234567890 |

  @TC_06_16_ModifyChequeStopEntrywithInvaliddata
  Scenario Outline: To modify Cheque stop entry with Invalid data
    Then User goes to Maintenance DB and open Cheque Stop Modify menu
    Then User use "<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>" to modify "<Issuer>","<BranchCode>","<AccountNumber>" fields with Invalid data

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |          1234 |

  @TC_06_17_ListChequeStopEntrywithInvalidData
  Scenario Outline: To List Cheque stop entry with Invalid data
    Then User goes to Maintenance DB and open Cheque Stop List menu
    Then User view the list using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |                  56 |                  56 |            45 |
      | TNBCPS20 |        006 | ILS      |                  89 |                 345 |             4 |
      | TNBCPS20 |        006 | USD      |                 123 |                 346 |             6 |
      | TNBCPS20 |        006 | JOD      |                2345 |                 876 |             7 |

  @TC_06_18_ListChequeStopEntrywithValidData
  Scenario Outline: To List Cheque stop entry with Valid data
    Then User goes to Maintenance DB and open Cheque Stop List menu
    Then User view the list with valid data using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |
      | TNBCPS20 |        006 | EUR      |            50000004 |            50000004 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000003 |            30000003 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000002 |            20000002 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000001 |            10000001 |    1234567890 |

  @TC_06_19_DeleteChequeStopEntrywithInvaliddata
  Scenario Outline: To Delete Cheque stop entry with Invalid data
    Then User goes to Maintenance DB and open Cheque Stop Delete menu
    Then User enter invalid data to delete Cheque Stop entry using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |         45 | EUR      | 67HJ                |               56778 | 7FDS3         |
      | TNBCPS20 |          6 | ILS      |               56778 | 67HJ                |    1234567890 |
      | TNBCPS20 |         89 | USD      | 096G                | 7FDS3               | 096G          |
      | TNBCPS20 |        005 | JOD      | 7FDS3               | 096G                |         56778 |

  @TC_06_20_DeleteChequeStopEntrywithValiddata
  Scenario Outline: To Delete Cheque stop entry with Valid data
    Then User goes to Maintenance DB and open Cheque Stop Delete menu
    Then User enter valid data to delete Cheque Stop entry using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |

  @TC_06_21_ListDeletedChequeStopEntry
  Scenario Outline: To List deleted Cheque stop entry
    Then User goes to Maintenance DB and open Cheque Stop List menu
    Then User view deleted Cheuqe stop entry using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber |
      | TNBCPS20 |        006 | EUR      |            50000005 |            50000005 |    1234567890 |
      | TNBCPS20 |        006 | ILS      |            30000004 |            30000004 |    1234567890 |
      | TNBCPS20 |        006 | USD      |            20000003 |            20000003 |    1234567890 |
      | TNBCPS20 |        006 | JOD      |            10000002 |            10000002 |    1234567890 |

  @TC_06_22_ChequeStopEntryBulkUpload
  Scenario Outline: To upload Cheque stop entry through Bulk upload
    Then User goes to Maintenance DB and open Cheque Stop Bulk Upload menu
    Then User uploads Cheque Stop entry through Bulk Upload using "<ChooseFile>"

    Examples: 
      | ChooseFile                                                                                                              |
      | E:\workspace\DEFAULT_WORKSPACE\PIBC\src\main\java\com\pibc\qa\config\ChequeStopBulkUploadSamplefile (1).xlsx            |