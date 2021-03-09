@MessagePage
Feature: As a user, I should be able to use the message functionality on Activity Stream (SP4)
  Background:
    Given the user logs in using following credentials "human_resource_username" and "password"
  @AZ-176
  Scenario: User can like a message
    When the user clicks the like button under the message
    Then a like symbol should be displayed at the bottom of the message
  @AZ-177
  Scenario: User can add a message to favorites
    When the user clicks on the star in the upper right corner of the message at the top of the page
    When the user clicks on filter and search box
    And clicks on favorites
    Then the favorite message should be displayed in the opened page
  @AZ-178
  Scenario: User can copy the link of a message
    When the user clicks on the more button at the bottom of the message
    And clicks on copy Link button in the opened window
    Then the link of the message should be copied in the clipboard
  @AZ-179
  Scenario: User can add recipients to a message
    When the user clicks on the more button at the bottom of the message
    And clicks on Add recipients button in the opened window
    Then clicks on Employees and departments button
    And clicks on Mike Smith on the opened window
    Then Mike Smith should be displayed in To-box
