@wip
Feature: Calendar Functions

  Scenario: user is able to display "My Calendar"
    Given the user logs in using credentials "username" and "password"
    Then user navigates to "calendar" module
    And "My Calendar" page is displayed
    Then user views daily, weekly and monthly and overall schedules

  Scenario: user is able to display Company Calendar
    Given user is logged in
    Then user navigates to "Calendar" module
    And user navigates to "Company Calendar" tab
    And "Company Calendar" page is displayed
    Then user views daily, weekly and monthly and overall schedules


  Scenario Outline: user uses calendar search options
    Given user is logged in
    Then user navigates to "Calendar" module
    And user search "<search options>"
    Examples:
      | search options |
      | invitations    |
      | organiser      |
      | participant    |

  Scenario: user can add new event to My Calendar
    Given user is logged in
    Then user navigates to "calendar" module
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


