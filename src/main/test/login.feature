
Feature: SauceDemo Website Testing

  Scenario: Purchase a product
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the login button
    And User adds "Sauce Labs Backpack" to the cart
    And User proceeds to checkout
    And User enters first name "Syed Arsalan", last name "Uddin", and postal code "462001"
    And User clicks on the continue button
    And User completes the order
    Then User should see the order confirmation

