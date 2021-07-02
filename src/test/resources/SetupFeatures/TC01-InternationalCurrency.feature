#Author: Suvarna
Feature: InternationalCurrency feature

  @TC_01_01_AddInternationalCurrencywithInvaliddata
  Scenario Outline: To Add International Currency with invalid data
    Then User goes to Maintenance DB and open International Currency Add menu to Add the International currency
    Then User enter invalid "<CurrencyCODE>","<CountryCode>","<CurrencyName>" and click on OK button

    Examples: 
      | CurrencyCODE | CountryCode | CurrencyName         |
      |          123 | PS          | EURO                 |
      |          345 | PS          | Israeli new shekel   |
      |          567 | PS          | United States dollar |
      |          789 | PS          | Jordanian dinar      |

 @TC_01_02_AddInternationalCurrencywithBlankdata
  Scenario: To Add International Currency with blank data
    Then User goes to Maintenance DB and open International Currency Add menu to Add the International currency
    Then User keep "CurrencyCODE","CountryCode","CurrencyName" fields blank and click on OK button

  @TC_01_03_AddInternationalCurrencywithValiddata
  Scenario Outline: To Add International Currency with valid data
    Then User goes to Maintenance DB and open International Currency Add menu to Add the International currency
    Then User enter valid "<CurrencyCODE>","<CountryCode>","<CurrencyName>","<CurrencyFractions>" and click on OK button

    Examples: 
      | CurrencyCODE | CountryCode | CurrencyName         | CurrencyFractions |
      | EUR          | PS          | EURO                 |                 2 |
      | ILS          | PS          | Israeli new shekel   |                 2 |
      | USD          | PS          | United States dollar |                 2 |
      | JOD          | PS          | Jordanian dinar      |                 3 |

  @TC_01_04_ListInternationalCurrencywithValiddata
  Scenario Outline: To validate list of International Currency with valid data
    Then User goes to Maintenance DB and open International Currency List menu to list the added currency
    Then User select valid "<CurrencyCODE>","<CountryCode>","<CurrencyName>" and click on OK button

    Examples: 
      | CurrencyCODE | CountryCode | CurrencyName |
      | EUR          | PS          |              |
      | ILS          | PS          |              |
      | USD          | PS          |              |
      | JOD          | PS          |              |


  @TC_01_05_ListInternationalCurrencywithInvaliddata
  Scenario Outline: To validate list of International Currency with Invalid data
    Then User goes to Maintenance DB and open International Currency List menu to list the added currency
    Then User select invalid "<CountryCode>","<CurrencyName>" and click on OK button

    Examples: 
      | CountryCode | CurrencyName |
      |         435 |          767 |
