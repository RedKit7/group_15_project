
Feature: user is on the Tasks page

  Background:
    When the user logs in using following credentials "userName" and "password"
    Then page title should be "Portal"

  Scenario: user is navigates to Tasks page
    When the user navigates to "Tasks" module
    Then the user should be able to display tasks "In Progress" by clicking "All Tasks" tab

  Scenario: user is navigates to Tasks page
    Given the user navigates to "Tasks" module
    When page title should be "My Tasks"
    And the user navigates to "Ongoing" tab in My Tasks page
    Then the user should be able to display tasks "Ongoing Tasks" by clicking "Ongoing Tasks" tab