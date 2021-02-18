@wip
Feature: Drive Functions in Activity Stream

  Background:
    When the user logs in using following credentials  "userName"and "password"
    Then page title should be "Portal"

  Scenario: User displays the windows in the Drive Function
    And the user navigates to "Drive" module
    Then page title should be "My Tasks"
    Given following windows should be displayed
      | My Drive      |
      | Company Drive |
    Then the title should be changed as follows
      | My Drive      |
      | Company Drive |
