#Author: Pranjal

@RegressionProfileFeatureMenu
Feature: To test profile functionality

 
  @TC_11_01_MakerProfileScenario
  Scenario Outline: To Create Maker Profile
    Given user is on Administration menu and clicks on Profile menu and Add menu
    Then user enters the profile name "<ProfileName>" and clicks on checkboxes and ok button 
    Then user approves the record

    Examples: 
      | ProfileName  | 
      | Maker1			 | 
  

  
  @TC_11_02_CheckerProfileScenario
  Scenario Outline: To Create Checker Profile
    Given user is on Administration menu and clicks on Profile menu and Add menu
    Then user enters the profile name "<Profilename>" and clicks on all checkboxes and ok button 
    Then user approves the record

    Examples: 
      | Profilename  | 
      | Checker3		 |
     	| Checker5		 | 
     
     
     @TC_11_03_ProfileModifyScenario
     Scenario Outline: To Modify the profile 
     Given user is on Administration menu and clicks on Profile menu and Modify menu and enters "<profilename>"
     Then user modifies "<ProfileName>" the record and clicks on ok button
     Then user approves the record
     
     Examples:
    |profilename |ProfileName	|
    |		Maker1		 |  Maker2		|
    
    @TC_11_04_ProfileRemoveScenario
    Scenario Outline: To Remove the profile
    Given user is on Administration menu and clicks on Profile menu and Remove menu and enters "<profilename>"
    Then user removes the profile
    And user approves the record
    
    Examples:
    |profilename|
    |	Checker3	 |