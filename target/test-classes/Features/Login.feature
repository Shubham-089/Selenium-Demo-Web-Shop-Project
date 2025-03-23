Feature: User Login

  Scenario: Verify successful login with valid credentials
    Given User is on the Login Page
    When User enters valid "shubhamyetonde865@gmail.com" and "Pass@12345"
    And Clicks on the Login button
    Then User should be redirected to the homepage

  Scenario: Verify login with invalid credentials
    Given User is on the Login Page
    When User enters invalid "wronguser@example.com" and "wrongpass"
    And Clicks on the Login button
    Then An error message should be displayed
