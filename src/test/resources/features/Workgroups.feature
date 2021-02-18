
Feature: Workgroups function on Activity Stream
  Background:
    Given the user logs in using following credentials "userName" and "password"
    When the user navigates to "Workgroups" module

  Scenario: Join to the groups
    When the user clicks on join button under the groups
    Then A message as "Request has been sent" should be displayed

  Scenario: Adding groups to the favorites
    When the user clicks on the star next to the group name
    And clicks on search box
    And clicks on favorites
    Then The groups which are added to favorites should be displayed
