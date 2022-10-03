Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User is at Practice Automation Test
    Then Click on My account menu
    Then Enter registered username in username textbox
    Then Enter registered password in password textbox
    Then Click on login btn
    And User must successfully login in the homepage

  Scenario: My account Dashboard
    Then Click on Myaccount link which leads to Dashboard
    And User must view Dashboard of the site

  Scenario Outline: Username and password input
    Given I want to put <email> and <password> in the step

    Examples: 
      | username | password |
      |          |          |

  Scenario: My account orders1
    Then Click on Myaccount link
    And Click on Orders link
    And User must view their orders on clicking orders link

  Scenario: My account orders2
    Then Click on Myaccount link
    And Click on Orders link
    And Click view button
    And User must view his Order details,customer details and billing details on clicking view button

  Scenario: My account orders3
    Then Click on Myaccount link
    Then Click on Orders link
    Then Click view button
    And User must view Order Number Ordered date and Status of the order on clicking view butt

  Scenario: My Accounts Address Functionality1
    Then Click on Myaccount link which leads to Dashboard
    Then Click on Address link
    And User must view billing address and ship address

  Scenario: My Accounts Address Functionality2
    Then Click on Myaccount link
    Then Click on Address link
    Then Click Edit on Shipping Address
    And User can Edit Shipping address

  Scenario: My Accounts Account Details
    Then Click on Myaccount link
    Then Click on Account details
    And User can view account details where he can change his pasword also

  Scenario: My Account log out
    Then Click on My Account link
    Then Click on Logout button
    And On clicking logout,User successfully comes out from the site
