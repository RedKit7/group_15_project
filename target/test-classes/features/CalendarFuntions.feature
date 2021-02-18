@wip
Feature: Calendar Functions

  Background:
    Given the user logs in using following credentials "<userName>" and "<password>"
    When the user navigates to "Calendar" module
    And page title should be "My Calendar"

  Scenario: user is able to display "My Calendar"
    Then user views daily, weekly and monthly and overall schedules

  Scenario: user is able to display Company Calendar
    And user navigates to "Company Calendar" tab in My Calendar page
    And page title should be "Company Calendar"
    Then user views daily, weekly and monthly and overall schedules


  Scenario Outline: user uses calendar search options
    Given the user logs in using following credentials "<userName>" and "<password>"
    When the user navigates to "Calendar" module
    And page title should be "My Calendar"
    And user search "<search options>"
    Examples:
      | search options |
      | invitations    |
      | organiser      |
      | participant    |

  Scenario: user can add new event to My Calendar
    And user adds new event to My Calendar with following info:
      | name      | Sprint Planning         |
      | startDate | 03/18/2021              |
      | startHour | 5:30 PM                 |
      | endDate   | 03/18/2021              |
      | endHour   | 7:15 PM                 |
      | timeZone  | Europe/Amsterdam        |
      | repeat    | weekly                  |
      | Location  | West Meeting Room       |
      | Attendee1 | hr2@cybertekschool.com  |
      | Attendee1 | hr77@cybertekschool.com |
    And "Spring Planning" is displayed on My Calendar page


