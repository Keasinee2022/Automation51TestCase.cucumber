Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User is at Practice Automation Testing Homepage
    Then Click on Shop Menu

  Scenario: Shop Filter By Price Functionality
    Then Adjust the filter by price between 150 to 450 rps
    Then Now click on Filter button
    And User can view books only between 150 to 450 rps price

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  Scenario: Shop Product Categories Functionality
    Then Click any of the product links available in the product category
    And Now user can view only that particular produc

  Scenario: Shop Default Sorting by Popularity Functionality
    Then Click on Sort by Popularity item in Default sorting dropdown
    And Now user can view the popular products only

  Scenario: Shop Default Sorting by Average Functionality
    Then Click on Sort by Average ratings in Default sorting dropdown
    And Now user can view the popular products only

  Scenario: Shop Default Sorting by Newness Functionality
    Then Click on Sort by Newness ratings in Default sorting dropdown
    And Now user can view the popular products only

  Scenario: Shop Default Sorting by Low to High Functionality
    Then Click on Sort by Low to High Item in Default sorting dropdown
    And Now user can view the popular products only

  Scenario: Shop Default Sorting by High to low Functionality
    Then Click on Sort by High to Low Item in Default sorting dropdown
    And Now user can view the popular products only

  Scenario: Shop Read More Functionality
    Then Click on read more button in home page
    Then Read More option indicates the Out Of Stock.
    And User cannot add the product which has read more option as it was out of stock

  Scenario: Shop Sale Functionality
    Then Click on Sale written product in home page
    Then User can clearly view the actual price with old price striken for the sale written products

  Scenario: Shop Add to Basket-View Basket Functionality
    Then Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price .
    And click on View Basket link which navigates to proceed to check out page.
    And user can find total and subtotal values just above the Proceed to Checkout button.Ω The total always < subtotal because taxes are added in the subtotal
    And click on Proceed to Check out button which navigates to payment gateway page.
    And User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And click on Place Order button to complete process
    And On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.

  Scenario: Shop Add to Basket-View Basket through Item link
    Then Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price .
    And click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And click on Proceed to Check out button which navigates to payment gateway page.
    And User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And click on Place Order button to complete process
    And On clicking place order button user completes his process where the page navigates to Order confirmation page

  Scenario: Shop Add to Basket-View Basket-Tax Functionality
    Then Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price .
    Then click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And The tax rate variers for India compared to other countries
    And Tax rate for indian should be 2% and for abroad it should be 5%
