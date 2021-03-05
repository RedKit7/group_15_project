@tasks
Feature: user is on the Tasks page

  Background:
    When the user logs in using following credentials "marketing_username" and "marketing_password"
    Then page title should be "Portal"

  @AZ-151
  Scenario: user is navigates to Tasks page
    When the user navigates to "Tasks" module
    Then the user should be able to display tasks "In progress" by clicking "All Tasks" tab

  @AZ-152
  Scenario: user is navigates to Tasks page
    Given the user navigates to "Tasks" module
    When page title should be "My tasks"
    And the user navigates to "Ongoing" tab in My Tasks page
    Then the user should be able to display tasks "Role: Ongoing" by clicking "Ongoing Tasks" tab