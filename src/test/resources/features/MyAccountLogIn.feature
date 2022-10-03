Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User is at Practice Automation Testing Homepage
    Then Click on My Account Menu

  Scenario: Log in with valid username and password

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <username> and <password>

    Examples: 
      | username | password |
      |          |          |

  Scenario: Log in with incorrect username and incorrect password
    Then Enter incorrect username in username textbox
    Then Enter incorrect password in password textbox.
    Then Click on login button
    And Proper error must be displayed(ie Invalid username) and prompt to enter login again

  Scenario: Log in with correct username and empty password.
    Then Enter valid username in username textbox
    Then Now enter empty password in the password textbox
    Then Click on login button.
    And Proper error must be displayed(ie Invalid password) and prompt to enter login again

  Scenario: Log in with empty username and valid password.
    Then Enter empty username in username textbox
    Then Now enter valid password in the password textbox
    Then Click on login button.
    And Proper error must be displayed(ie Invalid username) and prompt to enter login again

  Scenario: Log in with empty username and empty password.
    Then Enter empty username in username textbox
    Then Now enter valid password in the password textbox
    Then Click on login button.
    And Proper error must be displayed(ie required username) and prompt to enter login again

  Scenario: Log in Password should be masked
    Then Enter the password field with some characters.
    And The password field should display the characters in asterisks or bullets such that the password is not visible on the screen

  Scenario: Login-Handles case sensitive
    Then Enter the case changed username in username textbox
    Then Enter the case chenged password in the password tetxbox
    Then Now click on login button
    Then Login must fail saying incorrect username/password.

  Scenario: Login-Authentication
    Then Enter the case changed username in username textbox
    Then Enter the case chenged password in the password tetxbox
    Then Now click on login button
    Then Once your are logged in, sign out of the site
    Then Now press back button
    Then User shouldn’t be signed in to his account rather a general webpage must be visible
