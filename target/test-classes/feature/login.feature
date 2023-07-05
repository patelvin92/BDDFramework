#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login section testing
  I want to use this template for my feature file

  @tag1
  Scenario Outline: To check login functionality
    Given The user must be on Home page by clicking url "https://www.demoblaze.com/"
    When Click on Login option from Header section of Home page
    And Enter valid details in <Username> and <Password> fields
    And Click on Login button
    Then The user should be navigated to his/her account

    Examples: 
      | username | password |
      | Vinit    | Test@123 |
      | Patel    | Asdf@123 |
      | Vp       | Qwerty   |
