Feature: Login Page Feature

  Scenario: Login with valid credentials
    Given Navigate to "Cashflow" application
    When Accept cookie browser
    Then Landing page is displayed
    When Click on Login button
    Then Login page is shown
    When Inserting username "ermalaliraj@yahoo.it"
    And Password "Test2022"
    And Click on Login button to do the login
    Then Home page is shown