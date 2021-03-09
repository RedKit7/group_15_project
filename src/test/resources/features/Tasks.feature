@tasks
Feature: user is on the Tasks page

  Background:
    Given user logs in with valid user info
    When the user navigates to "Tasks" module

  Scenario: user navigates to Tasks page
    When the user navigates to "Tasks" module
    Then the user should be able to display tasks "In progress" by clicking "All Tasks" tab

  Scenario: user navigates to Tasks page
    Given the user navigates to "Tasks" module
    When page title should be "My tasks"
    And the user navigates to "Ongoing" tab in My Tasks page
    Then the user should be able to display tasks "Role: Ongoing" by clicking "Ongoing Tasks" tab

  @AZ-181 @wip
  Scenario: user displays the tasks he/she assisted
    Then the user navigates to "Assisting" tab in My Tasks page
    And the user can display "Assisted Tasks" page

  @AZ-182 @wip
  Scenario: user displays the ongoing tasks
    Then the user navigates to "Ongoing" tab in My Tasks page
    And the user can display "Ongoing Tasks" page

  @AZ-183 @wip
  Scenario: user displays the tasks set by him/her
    Then the user navigates to "Set by me" tab in My Tasks page
    And the user can display "Set by me Tasks" page

  @AZ-184 @wip
  Scenario: user displays the active projects
    Then the user navigates to "Projects" tab in My Tasks page
    And the user can display "Projects" page

  @AZ-185 @wip
  Scenario: user displays the efficiency tab
    Then the user navigates to "Efficiency" tab in My Tasks page
    And the user can display "Efficiency" page

  @AZ-186 @wip
  Scenario: user displays the recycle bin tab
    Then the user navigates to "Recycle Bin" tab in My Tasks page
    And the user can display "Recycle Bin" page

  @AZ-187 @wip
  Scenario: user displays the new tasks window
    Then the user navigates to New Task page
    And the New Task window is displayed


