Feature: Home Page Navigation

  Scenario: Launch the Demoblaze website
    Given I launch the Demoblaze website
    Then I should see the homepage loaded successfully

  Scenario: Navigate to different sections
    Given I launch the Demoblaze website
    When I navigate to the "Laptops" section
    Then I should see the "Laptops" category displayed

  Scenario: Navigate to Phones section
    Given I launch the Demoblaze website
    When I navigate to the "Phones" section
    Then I should see the "Phones" category displayed

  Scenario: Navigate to Monitors section
    Given I launch the Demoblaze website
    When I navigate to the "Monitors" section
    Then I should see the "Monitors" category displayed
