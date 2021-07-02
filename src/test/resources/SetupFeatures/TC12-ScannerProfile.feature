#Author: Pranjal

@RegressionScannerProfileFeatureMenu
Feature: To test scanner profile functionality

  @TC_12_01_ScanAddScanProfile
  Scenario Outline: To add scanner profile
    Given user is on Administration menu and clicks on Scanner profile menu and Add submenu
    Then user adds name "<Profilename>" in textfield and clicks checkall button and ok button
    And user approves the record from approve menu

    Examples: 
      | Profilename |
      | Maker2     |
      |	Maker3		|
      
   @TC_12_02_ScanModifyScanProfile
   Scenario Outline: To modify scanner profile
      Given user is on Administration menu and clicks on Scanner profile menu and Modify submenu "<profile>"
      Then user modifies the profile and clicks on Ok button
      And user approves the record from approve menu
      
      Examples:
      |profile  |
      |MAKER3	|
      
     
    @TC_12_03_ScanRemoveScanProfile
    Scenario Outline: To remove scanner profile 
    Given user is on Administration menu and clicks on Scanner profile menu and Remove submenu "<profile>"
    Then user removes the profile and clicks on Ok button
    And user approves the record from approve menu
      
     Examples:
     |profile| 
     |MAKER2|