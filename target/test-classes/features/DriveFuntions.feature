@wip
Feature: Drive Functions in Activity Stream

  Background:
    When the user logs in using following credentials "marketing_username" and "marketing_password"
    Then page title should be "Portal"
    And the user navigates to "Drive" module
    Then page title should be "My Drive"

  @AZ-157
  Scenario: User displays the windows in the My Drive Function
    Given "My Drive" window should be displayed
    Then as the title "My Drive" should be displayed

  @AZ-161
  Scenario: User displays the windows in the Company Drive Function
    When "Company Drive" window should be displayed
    Then as the title "Company drive" should be displayed