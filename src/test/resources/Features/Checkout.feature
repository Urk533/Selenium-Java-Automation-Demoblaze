Feature: Checkout Process

  Scenario: Complete the checkout process
    Given I am at the checkout page
    When I enter shipping details: "Shubham", "KATHMANDU", "CHABAHIL", "123456789", "05", "2026"
    And I select the payment method and place the order
    Then the order confirmation should be displayed
