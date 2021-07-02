#Author: Suvarna
Feature: Calendar feature

  @TC_05_01_CreateCalendarwithBlankdata
  Scenario Outline: To Create Calendar with Blank data
    Then User goes to Maintenance and open Calendar Add menu to add Calendar
    Then User add Calendar with "<ISOCode>","<PaymentType>","<Month>" and kept "<Year>" blank

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   |      |
      | ILS     | Any         | All   |      |
      | USD     | Any         | All   |      |
      | JOD     | Any         | All   |      |

  @TC_05_02_CreateCalendarwithInvaliddata
  Scenario Outline: To Create Calendar with Invalid data
    Then User goes to Maintenance and open Calendar Add menu to add Calendar
    Then User add Calendar with "<ISOCode>","<PaymentType>","<Month>" and enter invalid "<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | gdg  |
      | ILS     | Any         | All   | gds  |
      | USD     | Any         | All   | gdsg |
      | JOD     | Any         | All   | gds  |
      | ILS     | Any         | All   | 0000 |  
      | EUR     | Any         | All   | -202 |

  @TC_05_03_CreateCalendarwithValiddata
  Scenario Outline: To Create Calendar with Valid data
    Then User goes to Maintenance and open Calendar Add menu to add Calendar
    Then User add Calendar with "<ISOCode>","<PaymentType>","<Month>","<Year>","<Daytype>"

    Examples: 
      | ISOCode | PaymentType | Month | Year | Daytype |
      | EUR     | Any         | All   | 2060 |         |
      | ILS     | Any         | All   | 2060 |         |
      | USD     | Any         | All   | 2060 |         |
      | JOD     | Any         | All   | 2060 |         |
      | EUR     | Any         | All   | 2061 |         |
      | ILS     | Any         | All   | 2061 |         |
      | USD     | Any         | All   | 2061 |         |
      | JOD     | Any         | All   | 2061 |         |
      | EUR     | Any         | All   | 2062 |         |
      | ILS     | Any         | All   | 2062 |         |
      | USD     | Any         | All   | 2062 |         |
      | JOD     | Any         | All   | 2062 |         |

  @TC_05_04_AddExistingYearScenario
  Scenario Outline: To check Existing Calendar
    Then User goes to Maintenance and open Calendar Add menu to add Calendar
    Then User try to add existing Calendar with "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2060 |
      | ILS     | Any         | All   | 2060 |
      | USD     | Any         | All   | 2060 |
      | JOD     | Any         | All   | 2060 |

  @TC_05_05_ApproveCalendar
  Scenario Outline: To Approve Calendar
    Then User goes to Maintenance and open Calendar Approve menu to approve Calendar
    Then User Approves Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2060 |
      | ILS     | Any         | All   | 2060 |
      | USD     | Any         | All   | 2060 |
      | JOD     | Any         | All   | 2060 |

  @TC_05_06_RejectCalendar
  Scenario Outline: To Reject Calendar
    Then User goes to Maintenance and open Calendar Approve menu to approve Calendar
    Then User Rejects Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2061 |
      | ILS     | Any         | All   | 2061 |
      | USD     | Any         | All   | 2061 |
      | JOD     | Any         | All   | 2061 |

  @TC_05_07_CalendarSendtoRepairQueue
  Scenario Outline: To send Calendar to Repair queue from Approve Screen
    Then User goes to Maintenance and open Calendar Approve menu to approve Calendar
    Then User send Calendar to Repair queue using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2062 |
      | ILS     | Any         | All   | 2062 |
      | USD     | Any         | All   | 2062 |
      | JOD     | Any         | All   | 2062 |

  @TC_05_08_CreateBulkCalendarwithInvaliddata
  Scenario Outline: To Create BulkCalendar with Invalid data
    Then User goes to Maintenance and open Calendar Create Bulk Calendar menu
    Then User add Calendar details with "<ISOCode>","<PaymentType>","<FromYear>","<ToYear>"

    Examples: 
      | ISOCode | PaymentType | FromYear | ToYear |
      | EUR     | Any         | name     | nam    |
      | ILS     | Any         | namw     | name   |
      | ILS     | Any         |     2019 |   2018 |
      | USD     | Any         |     2019 |        |
      | JOD     | Any         | @#$      | %^%^   |
      | EUR     | Any         | 0000     | 0000   |

  @TC_05_09_CreateBulkCalendarwithValiddata
  Scenario Outline: To Create BulkCalendar with Valid data
    Then User goes to Maintenance and open Calendar Create Bulk Calendar menu
    Then User enter Calendar details with "<ISOCode>","<PaymentType>","<FromYear>","<ToYear>"

    Examples: 
      | ISOCode | PaymentType | FromYear | ToYear |
      | EUR     | Any         |     2065 |   2070 |
      | ILS     | Any         |     2065 |   2070 |
      | USD     | Any         |     2065 |   2070 |
      | JOD     | Any         |     2065 |   2070 |

  @TC_05_10_CreateBulkCalendarwithExistingdata
  Scenario Outline: To Create BulkCalendar with Existing data
    Then User goes to Maintenance and open Calendar Create Bulk Calendar menu
    Then User fill Calendar details with "<ISOCode>","<PaymentType>","<FromYear>","<ToYear>"

    Examples: 
      | ISOCode | PaymentType | FromYear | ToYear |
      | EUR     | Any         |     2065 |   2070 |
      | ILS     | Any         |     2065 |   2070 |
      | USD     | Any         |     2065 |   2070 |
      | JOD     | Any         |     2065 |   2070 |

  @TC_05_11_ViewCalendarwithInvaliddata
  Scenario Outline: To View Calendar with Invalid data
    Then User goes to Maintenance and open Calendar View menu
    Then User view Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>" and "<Status>"

    Examples: 
      | ISOCode | PaymentType | Month | Year | Status |
      | EUR     | Any         | All   | @##$ | All    |
      | ILS     | Any         | All   | hbjj | All    |
      | USD     | Any         | All   | gh   | All    |
      | JOD     | Any         | All   | hfg  | All    |

  @TC_05_12_ViewCalendarwithValiddata
  Scenario Outline: To View Calendar with Valid data
    Then User goes to Maintenance and open Calendar View menu
    Then User view Calendar using valid "<ISOCode>","<PaymentType>","<Month>","<Year>" and "<Status>"

    Examples: 
      | ISOCode | PaymentType | Month | Year | Status |
      | EUR     | Any         | All   | 2060 | All    |
      | ILS     | Any         | All   | 2060 | All    |
      | USD     | Any         | All   | 2060 | All    |
      | JOD     | Any         | All   | 2060 | All    |

  @TC_05_13_Modify/RepairCalendarwithValiddata
  Scenario Outline: To Modify Calendar with Valid data
    Then User goes to Maintenance and open Calendar Modify menu
    Then User modify Calendar using valid "<ISOCode>","<PaymentType>","<Month>","<Year>","<Daytype>"

    Examples: 
      | ISOCode | PaymentType | Month | Year | Daytype |
      | EUR     | Any         | All   | 2060 |         |
      | ILS     | Any         | All   | 2060 |         |
      | USD     | Any         | All   | 2060 |         |
      | JOD     | Any         | All   | 2060 |         |

  @TC_05_14_ApproveCalendar
  Scenario Outline: To Approve Calendar
    Then User goes to Maintenance and open Calendar Approve menu to approve Calendar
    Then User Approves Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2060 |
      | ILS     | Any         | All   | 2060 |
      | USD     | Any         | All   | 2060 |
      | JOD     | Any         | All   | 2060 |

  @TC_05_15_Modify/RepairCalendarwithInvaliddata
  Scenario Outline: To Modify Calendar with Invalid data
    Then User goes to Maintenance and open Calendar Modify menu
    Then User modify Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 8888 |
      | ILS     | Any         | All   |  123 |
      | USD     | Any         | All   | 8888 |
      | JOD     | Any         | All   | 9888 |

  @TC_05_16_DeleteCalendarwithValiddata
  Scenario Outline: To Delete Calendar with Valid data
    Then User goes to Maintenance and open Calendar Delete menu
    Then User delete Calendar with "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2060 |
      | ILS     | Any         | All   | 2060 |
      | USD     | Any         | All   | 2060 |
      | JOD     | Any         | All   | 2060 |

  @TC_05_17_DeleteCalendarwithInvaliddata
  Scenario Outline: To Delete Calendar with Invalid data
    Then User goes to Maintenance and open Calendar Delete menu
    Then User delete Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   |  123 |
      | ILS     | Any         | All   |  456 |
      | USD     | Any         | All   | 7890 |
      | JOD     | Any         | All   | 9999 |

  @TC_05_18_ApproveDeletedCalendar
  Scenario Outline: To Approve deleted Calendar
    Then User goes to Maintenance and open Calendar Approve menu to approve Calendar
    Then User Approves Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>"

    Examples: 
      | ISOCode | PaymentType | Month | Year |
      | EUR     | Any         | All   | 2060 |
      | ILS     | Any         | All   | 2060 |
      | USD     | Any         | All   | 2060 |
      | JOD     | Any         | All   | 2060 |

  @TC_05_19_ViewDeletedCalendarwithValiddata
  Scenario Outline: To View deleted Calendar
    Then User goes to Maintenance and open Calendar View menu
    Then User view Calendar using "<ISOCode>","<PaymentType>","<Month>","<Year>" and "<Status>"
 
    Examples: 
      | ISOCode | PaymentType | Month | Year | Status |
      | EUR     | Any         | All   | 2060 | All    |
      | ILS     | Any         | All   | 2060 | All    |
      | USD     | Any         | All   | 2060 | All    |
      | JOD     | Any         | All   | 2060 | All    |
