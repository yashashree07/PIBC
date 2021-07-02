#Author: Suvarna
Feature: Currency feature

 @TC_02_15_ModifyCurrencywithInvaliddataforEURCurrency
  Scenario Outline: To Modify EUR Currency with Invalid data
    Then User goes to Maintenance and open Currency Modify menu
    Then User try to modify "<ISOCode>" with "<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" with Invalid data

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | EUR     | happy        |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | EUR     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |
      | EUR     |happy         |            23 |            59 |             23 |             59 | N                  | Y                | hhjjkk   | ujn           |

  @TC_02_16_ModifyCurrencywithInvaliddataforILSCurrency
  Scenario Outline: To Modify ILS Currency with Invalid data
    Then User goes to Maintenance and open Currency Modify menu
    Then User try to modify "<ISOCode>" with "<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" with Invalid data

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | ILS     | happy        |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | ILS     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |
      | ILS     |happy         |            23 |            59 |             23 |             59 | N                  | Y                | hhjjkk   | ujn           |
      
  @TC_02_17_ModifyCurrencywithInvaliddataforUSDCurrency
  Scenario Outline: To Modify USD Currency with Invalid data
    Then User goes to Maintenance and open Currency Modify menu
    Then User try to modify "<ISOCode>" with "<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" with Invalid data

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | USD     | happy        |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | USD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |
      | USD     |happy         |            23 |            59 |             23 |             59 | N                  | Y                | hhjjkk   | ujn           |
      
  @TC_02_18_ModifyCurrencywithInvaliddataforJODCurrency
  Scenario Outline: To Modify JOD Currency with Invalid data
    Then User goes to Maintenance and open Currency Modify menu
    Then User try to modify "<ISOCode>" with "<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" with Invalid data

    Examples: 
      | ISOCode | CurrencyUnit | firstCutoffHH | firstCutoffMM | secondCutoffHH | secondCutoffMM | TruncateConversion | HolidayPoisition | ConvRate | ConvTolerance |
      | JOD     | happy        |            23 |            59 |             23 |             59 | N                  | Y                |        0 |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                | happppy  |             0 |
      | JOD     |            2 |            23 |            59 |             23 |             59 | N                  | Y                |        0 | happppyyyy    |
      | JOD     |happy         |            23 |            59 |             23 |             59 | N                  | Y                | hhjjkk   | ujn           |

  @TC_02_19_ModifyCurrencywithBlankdataforEURCurrency
  Scenario Outline: To modify EUR Currency with Blank data
    Then User goes to Maintenance and open Currency Modify menu
    Then User will keep "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

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

  @TC_02_20_ModifyCurrencywithBlankdataforILSCurrency
  Scenario Outline: To modify ILS Currency with Blank data
    Then User goes to Maintenance and open Currency Modify menu
    Then User will keep "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

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

  @TC_02_21_ModifyCurrencywithBlankdataforJODCurrency
  Scenario Outline: To modify JOD Currency with Blank data
    Then User goes to Maintenance and open Currency Modify menu
    Then User will keep "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

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

@TC_02_22_ModifyCurrencywithBlankdataforUSDCurrency
  Scenario Outline: To modify USD Currency with Blank data
    Then User goes to Maintenance and open Currency Modify menu
    Then User will keep "<ISOCode>","<CurrencyUnit>","<firstCutoffHH>","<firstCutoffMM>","<secondCutoffHH>","<secondCutoffMM>","<TruncateConversion>","<HolidayPoisition>","<ConvRate>","<ConvTolerance>" fields blank and click on NEXT button

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

  #@TC_02_23_DeleteCurrency
  #Scenario Outline: To Delete Currency
    #Then User goes to Maintenance and open Currency Delete menu
    #Then User delete the currency using "<ISOCode>","<Description>"
#
    #Examples: 
      #| ISOCode | Description          |
      #| EUR     | EURO                 |
      #| ILS     | Israeli new shekel   |
      #| USD     | United States dollar |
      #| JOD     | Jordanian dinar      |

  #@TC_02_24_ApprovedeletedCurrency
  #Scenario Outline: To Approve deleted Currency
    #Then User goes to Maintenance and open Currency Approve menu to Approve the Currency
    #Then User approve the currency using "<ISOCode>"
#
    #Examples: 
      #| ISOCode |
      #| EUR     |
      #| ILS     |
      #| USD     |
      #| JOD     |

  #@TC_02_25_ListDeletedCurrency
  #Scenario: To List Deleted Currency
    #Then User goes to Maintenance and open Currency List menu to List the Currency
    #Then User view the deleted Currency
