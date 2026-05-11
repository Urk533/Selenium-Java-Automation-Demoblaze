Feature: Shopping Cart

  Scenario: Add and remove products from cart
    Given I have added "Samsung galaxy s6" to the cart
    When I remove "Samsung galaxy s6" from the cart
    Then the total price should be updated correctly
