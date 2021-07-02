#Author: Pranjal
@RegressionGroupMenu
Feature: To Test Group Functionality

  @TC_10_01_AddGroupScenario
  Scenario Outline: Create Group
    Given user goes to administration and clicks on Group menu and add menu
    Then user enters "<Name>" "<SortPriority>" "<Details>" and checkbox on Admin and Non-Inquiry Users options and clicks on Ok button
    Then user goes to Approve screen and approve the record

    Examples: 
      | Name    | SortPriority | Details  |
      | Admin9  |            0 | Java GPS |
      | Admin10 |            0 | Java GPS |

  @TC_10_02_GroupModifyScenario
  Scenario Outline: Modify Group
    Given user goes to administration and clicks on Group menu and modify menu and enters "<Name>"
    Then user modifies "<name>" "<sortpriority>" and "<details>"
    Then user goes to Approve screen and approve the record

    Examples: 
      | name | Name   | sortpriority | details  |
      | Tester | ADMIN9 |            0 | Java GPS |

  @TC_10_03_GroupRemoveScenario
  Scenario Outline: Remove Group
    Given user goes to administration and clicks on Group menu and remove menu and enters "<Name>"
    And user removes the group profile
    Then user goes to Approve screen and approve the record

    Examples: 
      | Name    |
      | ADMIN10 |
