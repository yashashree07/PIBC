#Author: Suvarna
Feature: User Autorization Matrix feature

  @TC_08_01_AddUserAutorizationMatrixwithBlankdata
  Scenario: To add User Autorization Matrix with Blank data
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User kept mandatory fields blank

  @TC_08_02_AddUserAutorizationMatrixwithValiddataforOutwardFlow
  Scenario: To add User Autorization Matrix with Valid data
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User enter valid data in "Name","Stages","PaymentTypes" fields for user "Maker1"
      | Test1           | LIST                 | REPAIR                      | TRANSACTION DETAIL REPORT | DUPLICATE | DELETE PDC | MODIFY PDC | BATCH MODIFY | TRANSACTION REPORT |
      | ACH CHEQUE SEND | OUTWARD CHEQUE BATCH | OUTWARD CHEQUE BATCH MODIFY |                           |           |            |            |              |                    |             
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record
    Given User login in system
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User fill valid data in "Name","Stages","PaymentTypes" fields for user "Checker1"
      | Test2           | LIST                 | APPROVE                     | TRANSACTION DETAIL REPORT | DUPLICATE | MANUAL TRAY | TRANSACTION REPORT |
      | ACH CHEQUE SEND | OUTWARD CHEQUE BATCH | OUTWARD CHEQUE BATCH MODIFY |                           |           |             |                    |
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record

  @TC_08_03_AddUserAutorizationMatrixwithValiddataforInwardFlow
  Scenario: To add User Autorization Matrix with Valid data
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User enter data in "Name","Stages","PaymentTypes" fields for user "Maker2"
      | Test3              | LIST                      | TRANSACTION DETAIL REPORT | QUALIFY RECEIVE | DUPLICATE | INSUFFICIENT FUND | SIGNATURE CHECK | TRANSACTION REPORT |
      | ACH CHEQUE RECEIVE | ACH CHEQUE RETURN RECEIVE | ACH CHEQUE RETURN SEND    |                 |           |                   |                 |                    |
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record
    Given User login in system
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User fill data in "Name","Stages","PaymentTypes" fields for user "Checker2"
      | Test4              | LIST                      | APPROVE                | TRANSACTION DETAIL REPORT | DUPLICATE | MANUAL TRAY | INSUFFICIENT FUND APPROVE | SIGNATURE CHECK APPROVE | TRANSACTION REPORT |
      | ACH CHEQUE RECEIVE | ACH CHEQUE RETURN RECEIVE | ACH CHEQUE RETURN SEND |                           |           |             |                           |                         |                    |
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record

  @TC_08_04_AddUserAutorizationMatrixwithValiddataforOnusFlow
  Scenario: To add User Autorization Matrix with Valid data
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User pass data in "Name","Stages","PaymentTypes" fields for user "Maker3"
      | Test5           | LIST                  | REPAIR                       | TRANSACTION DETAIL REPORT | QUALIFY RECEIVE | DUPLICATE | INSUFFICIENT FUND | SIGNATURE CHECK | DELETE PDC | MODIFY PDC | BATCH MODIFY | TRANSACTION REPORT |
      | INTERNAL CHEQUE | BATCH INTERNAL CHEQUE | BATCH INTERNAL CHEQUE MODIFY |                           |                 |           |                   |                 |            |            |              |                    |
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record
    Given User login in system
    Then User goes to Maintenance and open User Autorization Matrix Add menu
    Then User entered data in "Name","Stages","PaymentTypes" fields for user "Checker3"
      | Test6           | LIST                  | APPROVE                      | TRANSACTION DETAIL REPORT | DUPLICATE | MANUAL TRAY | INSUFFICIENT FUND APPROVE | SIGNATURE CHECK APPROVE | TRANSACTION REPORT |
      | INTERNAL CHEQUE | BATCH INTERNAL CHEQUE | BATCH INTERNAL CHEQUE MODIFY |                           |           |             |                           |                         |                    |
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves the record

  @TC_08_05_ListUserAutorizationMatrix
  Scenario: To list User Autorization Matrix
    Then User goes to Maintenance and open User Autorization Matrix List menu
    Then user view list
      | Test1 | Test2 | Test3 | Test4 | Test5 | Test6 |
      
      @TC_08_06_DeleteUserAutorizationMatrix
  Scenario: To Delete User Autorization Matrix
    Then User goes to Maintenance and open User Autorization Matrix Delete menu
    Then user delete the record
    Then User goes to Maintenance and open User Autorization Matrix Approve menu
    Then User approves all deleted records

