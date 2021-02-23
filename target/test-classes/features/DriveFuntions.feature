@wip
Feature: Drive Functions in Activity Stream

  Background:
    When the user logs in using following credentials "userName" and "password"
    Then page title should be "Portal"


  Scenario: User displays the windows in the Drive Function
    And the user navigates to "Drive" module
    Then page title should be "My Drive"
    Given "My Drive" window should be displayed
    Then as the title "My Drive" should be displayed


  Scenario:
    When "Company Drive" window should be displayed
    Then as the title "Company Drive" should be displayed