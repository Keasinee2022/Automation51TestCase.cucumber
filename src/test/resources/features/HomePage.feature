Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User is at Practice Automation Test
    Then Click on Shop menu
    Then click on Home menu

  Scenario: Home Page with three Sliders only
    And Test whether the Home page has Three Sliders only
    And The Home page must contains only three sliders

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |

  Scenario: Home page with three Arrivals only
    And Test whether the Home page has Three Arrivals only
    And Home page must contains only three Arrivals

  Scenario: Home page  Images in Arrivals should navigate
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket

  Scenario: Home page  Arrivals Images Description
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on Description tab for the book you clicked on.
    And There should be a description regarding that book the user clicked on

  Scenario: Home page Arrivals Images Reviews
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on Reviews tab for the book you clicked on.
    And There should be a Reviews regarding that book the user clicked on

  Scenario: Home page  Arrivals Images add to Basket
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price.
    And User can add a book by clicking on Add To Basket button which adds that book in to his Basket

  Scenario: Home page  Arrivals Add to Basket with more books
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price.
    And User can add a book by clicking on Add To Basket button which adds that book in to his Basket
    And Select more books than the books in stock.Ex if the stock has twenty books, try to add twenty one.
    And Click the add to basket button
    And It throws an error prompt like you must enter a value between One and twenty

  Scenario: Home Arrivals Add to Basket Items
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page.
    And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page

  Scenario: Home Arrivals Add to Basket Items Coupon
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page.
    And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
    And Enter the Coupon code as ‘krishnasakinala’ to get fifty rps off on the total.
    And User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give fifty rps off on the total price

  Scenario: Home-Arrivals-Add to Basket-Items-Coupon value less than four hundred fifty
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
    And Enter the Coupon code as ‘krishnasakinala’ to get Fifty rps off on the total.
    And User can not able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give Fifty rps off on the total price because the coupon is applicable for the book price more than four hundred fifty rps

  Scenario: Home Arrivals Add to Basket Item Remove book
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And Cick on Remove this icon in Check out page which removes that book from the grid
    And User has the feasibility to remove the book at the time of check out also

  Scenario: Home Arrivals Add to Basket Items Add book
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And Click on textbox value under quantity in Check out page to add or subtract books
    And After the above change ‘Update Basket’ button will turn into Clickable mode
    And click on Update Basket to reflect those changes
    And User has the feasibility to Update Basket at the time of check out

  Scenario: Home Arrivals Add to Basket Items Check out Book Final price
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And User can find the Total price of the book in the Check out grid.
    And User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out

  Scenario: Home Arrivals Add to Basket Items Check out Update Basket
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And Click on textbox value under quantity in Check out page to add or subtract books.
    And After the above change ‘Update Basket’ button will turn into Clickable mode.
    And Click on Update Basket to reflect those changes
    And User has the feasibility to Update Basket at the time of check out

  Scenario: Home Arrival  Add to Basket Items Check out Total and Subtotal condition
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And uUer can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And Total

  Scenario: Home Arrivals Add to Basket Items Check out functionality
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And User can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And click on Proceed to Check out button which navigates to payment gateway page.
    And Clicking on Proceed to Checkout button leads to payment gateway page
    And Clicking on Proceed to Checkout button leads to payment gateway page

  Scenario: Home Arrivals Add to Basket Items Check out Payment Gateway
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And User can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And Click on Proceed to Check out button which navigates to payment gateway page.
    And User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And User can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.

  Scenario: Home Arrivals Add to Basket Items Check out Payment Gateway Place order
    And The Home page must contains only three Arrivals
    And Click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket
    And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price
    And Click on Item link which navigates to proceed to check out page
    And User can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And Click on Proceed to Check out button which navigates to payment gateway page.
    And User can view Billing Details,Order Details,Additional details and Payment gateway details.
    Then User can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And Click on Place Order button to complete process
    And Clicking place-order button user completes the process where the page navigates to Order confirmation page
