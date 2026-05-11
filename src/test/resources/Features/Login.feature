Feature: User Login

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid credentials "Shubham" and "password123"
    Then I should be redirected to the dashboard
