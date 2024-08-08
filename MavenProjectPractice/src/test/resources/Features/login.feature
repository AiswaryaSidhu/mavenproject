Feature: To test the login functionallity

  Scenario: To test if user able to login successful with the valid credentials
    Given User is on login page
    When Give the username and password
    And click on login button
    Then Land on home page
