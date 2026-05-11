Feature: Checkout Process

  Scenario: Complete the checkout process
    Given I am at the checkout page
    When I enter shipping details: "Shubham yetonde", "PUNE", "MOSHI", "123456789", "07", "2025"
    And I select the payment method and place the order
    Then the order confirmation should be displayed
