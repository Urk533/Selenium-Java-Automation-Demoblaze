Feature: Product Search

  Scenario: Search for a product
    Given I am on the homepage
    When I search for a product "Samsung galaxy s6"
    Then the results should display the product "Samsung galaxy s6"
