Feature: Register

  Scenario: Sucessful Register with Valid Credentials
    Given User Lanch Chrome browser
    When User open URL "https://demowebshop.tricentis.com/register"
    And User enters First name as "Shubham" and Last name as "Yetonde" and Email as "shubhamyetonde865@gmail.com" and password "Password@12345" and Confirm password as "Password@12345"
    And Click on Register button
    Then Page title Should be "Demo Web Shop"
    When User click on Log out link
    Then Page title after logout should be "demowebshop.tricentis.com/"
    And Close browser
