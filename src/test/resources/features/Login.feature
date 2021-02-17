Feature: User Should be able to Login

  Background:
    Given user navigates to login page


  Scenario: User enters valid info
    When user logs in with valid username and password
    Then Account summary page should be displayed


  