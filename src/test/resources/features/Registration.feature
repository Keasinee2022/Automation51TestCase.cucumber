Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User is at Practice Automation Testing Homepage
    Then Click on My Account Menu

  Scenario: Registration sign in
    Then Enter registration Email address in Email Address textbox
    Then Enter your own password in the password textbox
    Then Click on registration button
    And User will be registered successfully and will be naviagated to the Homepage

  Scenario Outline: Email and password input
    Given I want to put <email> and <password> in the step

    Examples: 
      | email | password |
      |       |          |

  Scenario: Registration with invalid email
    Then Enter invalid Email Address in Email-Address textbox
    Then Enter your own password in password textbox
    Then Click on Register button
    And Registration must fail with a warning message(ie You must enter a valid email address)

 Scenario Outline: Title of your scenario outline
    Given I want to write a step with <email> and <password>

    Examples: 
      | email | password |
      |       |          |
  Scenario: Registration with empty email
    Then Enter empty Email Address in Email-Address textbox
    Then Enter your own password in password textbox
    Then Click on Register button
    And Registration must fail with a warning message(ie please provide valid email address)

 Scenario Outline: Title of your scenario outline
    Given I want to write a step with <email> and <password>

    Examples: 
      | email | password |
      |       |          |
  Scenario: Registration with empty password
    Then Enter valid Email Address in Email-Address textbox
    Then Enter empty password in password textbox
    Then Click on Register button
    And Registration must fail with a warning message(ie please enter an account password)

 Scenario Outline: Title of your scenario outline
    Given I want to write a step with <email> and <password>

    Examples: 
      | email | password |
      |       |          |
  Scenario: Registration with empty email and password
    Then Enter empty Email Address in Email-Address textbox
    Then Enter empty password in password textbox
    Then Click on Register button
    And Registration must fail with a warning message(ie please provide valid email address)

    
     Scenario Outline: Title of your scenario outline
    Given I want to write a step with <email> and <password>

    Examples: 
      | email | password |
      |       |          |