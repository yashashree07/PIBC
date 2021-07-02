#Author: Suvarna
Feature: Currency feature

  @TC_02_01_AddCurrencywithBlankdataforEURCurrency
  Scenario Outline: To add Currency with Blank data for EUR currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User kept "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | EUR     |              |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |               |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |               |             23 |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |                |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |             23 |                | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 |                    | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  |                  |        0 |             0 |
      | EUR     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |          |             0 |
      | EUR     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |               |

  @TC_02_02_AddCurrencywithBlankdataforILSCurrency
  Scenario Outline: To add Currency with Blank data for ILS currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User kept "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | ILS     |              |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |               |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |               |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |                |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |                | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 |                    | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  |                  |        0 |             0 |
      | ILS     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |          |             0 |
      | ILS     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |               |

  @TC_02_03_AddCurrencywithBlankdataforJODCurrency
  Scenario Outline: To add Currency with Blank data for JOD currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User kept "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | JOD     |              |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |               |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |               |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |                |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |             23 |                | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 |                    | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 | N                  |                  |        0 |             0 |
      | JOD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |          |             0 |
      | JOD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |               |

  @TC_02_04_AddCurrencywithBlankdataforUSDCurrency
  Scenario Outline: To add Currency with Blank data for USD currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User kept "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | USD     |              |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |               |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |               |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |                |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |                | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 |                    | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  |                  |        0 |             0 |
      | USD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |          |             0 |
      | USD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |               |

  @TC_02_05_AddCurrencywithInvaliddataforEURCurrency
  Scenario Outline: To add Currency with Invalid data for EUR currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User fill Invalid data with "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | EUR     | gthhth       |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |

  @TC_02_06_AddCurrencywithInvaliddataforILSCurrency
  Scenario Outline: To add Currency with Invalid data for ILS currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User fill Invalid data with "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | ILS     | gthhth       |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |

  @TC_02_07_AddCurrencywithInvaliddataforJODCurrency
  Scenario Outline:	To add Currency with Invalid data for JOD currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User fill Invalid data with "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | JOD     | gthhth       |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |

  @TC_02_08_AddCurrencywithInvaliddataforUSDCurrency
  Scenario Outline: To add Currency with Invalid data for USD currency
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User fill Invalid data with "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | USD     | gthhth       |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |

  @TC_02_09_AddCurrencywithValiddata
  Scenario Outline: To add Currency with Valid data
    Then User goes to Maintenance and open Currency Add menu to Add the Currency
    Then User enter valid "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" and click on NEXT button

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |

  @TC_02_10_ApproveCurrency
  Scenario Outline: To Approve Currency
    Then User goes to Maintenance and open Currency Approve menu to Approve the Currency
    Then User approve the currency using "<ISOCode>"

    Examples: 
      | ISOCode |
      | EUR     |
      | ILS     |
      | USD     |
      | JOD     |

  @TC_02_11_ListCurrencyforvalidcriteria
  Scenario Outline: To List Currency for Valid criteria
    Then User goes to Maintenance and open Currency List menu to List the Currency
    Then User view the Currency list with "<ISOCode>","<Status>","<Description>"

    Examples: 
      | ISOCode | Status | Description          |
      | EUR     | All    | EURO                 |
      | ILS     | All    | Israeli new shekel   |
      | USD     | All    | United States dollar |
      | JOD     | All    | Jordanian dinar      |

  @TC_02_12_ListCurrencyforInvalidcriteria
  Scenario Outline: To List Currency for Invalid criteria
    Then User goes to Maintenance and open Currency List menu to List the Currency
    Then User view the Currency list with "<ISOCode>","<Status>"

    Examples: 
      | ISOCode | Status  |
      | EUR     | Approve |
      | ILS     | Approve |
      | USD     | Approve |
      | JOD     | Approve |

  @TC_02_13_ModifyCurrencywithValiddata
  Scenario Outline: To Modify Currency with valid data
    Then User goes to Maintenance and open Currency Modify menu
    Then User modify "<ISOCode>" with "<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>"

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            3 |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |

  @TC_02_14_ApproveModifiedCurrency
  Scenario Outline: To Approve modified Currency
    Then User goes to Maintenance and open Currency Approve menu to Approve the Currency
    Then User approve the currency using "<ISOCode>"

    Examples: 
      | ISOCode |
      | EUR     |
      | ILS     |
      | USD     |
      | JOD     |

 
  