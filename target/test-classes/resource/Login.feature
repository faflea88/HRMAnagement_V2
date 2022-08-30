Feature: Login to HRM Application 
  
   @ValidCredentials
   Scenario Outline:: Login with valid credentials
      
    Given User is on Home page
    When user enters Email as "<email>" and Password as "<password>"
    And I click login button
    Then User should be able to login successfully
     Examples:
       |email|password|
       |Admin|admin123|
 
       
       @ValidCredentials
       Scenario: as a user I would to access the admin page and add new user
       Given I click admin menu
       When I click Add button 
       And I enter the value
       Then click save button 
       
       
       @ValidCredentials
       Scenario: as a user I would to seaarch admin 
       Given I on the admin screen
       When Enter username
       And I enter role
       Then enter employee name
       And enter status  
       
       
       @ValidCredentials
       Scenario: as a user I would to edit data admin
       Given I would click edit button
       When I update the valued
       And click the save button to edit
       Then success edit data 
       