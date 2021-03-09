Feature:Filter and search functions on Activity Stream

  Background:
    Given user logs in with valid user info
    Then page title should be "Portal"
    And user should be able to click Filter and Search box


  Scenario Outline: 1-1 User can select the date
    Given the user should be able to select "<date>" from Date section
    Examples:
      | date            |
      | Any date        |
      | Yesterday       |
      | Current day     |
      | This week       |
      | This month      |
      | Current quarter |
      | Last 7 days     |
      | Last 30 days    |
      | Last 60 days    |
      | Last 90 days    |
      | Last week       |
      | Last month      |

  Scenario: 1-2 User can select the "Last N days"
    Given the user should be able to select "Last N days" from Date section
    And the user should be able to select a "days" from Last N days
      | 1  |
      | 20 |
      | 80 |


  Scenario Outline: 1-3 User can select the "Month"
    Given the user should be able to select "Month" from Date section
    Then the user should be able to select a "<Month>" and a "<Year>" from Month
    Examples:
      | Month     | Year |
      | January   | 2012 |
      | February  | 2015 |
      | March     | 2004 |
      | April     | 2021 |
      | May       | 2020 |
      | June      | 2015 |
      | July      | 2007 |
      | August    | 2009 |
      | September | 2019 |
      | October   | 2025 |
      | November  | 2003 |
      | December  | 2011 |


  Scenario Outline: 1-4 User can select the "Quarter"
    Given the user should be able to select "<Quarter>" from Date section
    Then the user should be able to select a "<Quarter>" and a "<Year>" from Quarter
    Examples:
      | Quarter | Year |
      | 1       | 2011 |
      | 2       | 2015 |
      | 3       | 2004 |
      | 4       | 2021 |

  Scenario Outline: 1-5 User can select the "Year"
    Given the user should be able to select "year" from Date section
    Then the user should be able to select a "<Year>" from year
    Examples:
      | Year |
      | 2020 |
      | 2015 |
      | 2004 |
      | 2021 |
      | 2019 |


  Scenario Outline: 1-6 User can select the valid "Exact date"
    Given the user should be able to select "Exact date" from Date section
    Then the user should be able to select a valid "<Exact date>" from exact date
    Examples:
      | Exact date |
      | 01/10/2021 |
      | 17/5/2020  |
      | 31/12/2019 |
      | 03/06/2015 |

  Scenario Outline: 1-7 User cannot select the invalid "Exact date"
    Given the user should be able to select "Exact date" from Date section
    Then the user should not be able to select an invalid "<Exact date>" from exact date
    Examples:
      | Exact date  |
      | 41/10/2021  |
      | 17/35/2020  |
      | 31/12/20199 |
      | 33/16/12015 |


  Scenario Outline: 1-8 User can select the valid "Custom range"
    Given the user should be able to select "Custom range" from Date section
    Then the user should be able to select a valid range between "<date1>" and "<date2>"
    Examples:
      | date1      | date2      |
      | 02/01/2020 | 09/01/2020 |
      | 20/07/2017 | 10/11/2021 |
      | 31/01/2019 | 02/02/2019 |
      | 31/01/2018 | 31/03/2020 |

  Scenario Outline: 1-9 User can select the invalid "Custom range"
    Given the user should be able to select "Custom range" from Date section
    Then the user should not be able to select an invalid range between "<date1>" and "<date2>"
    Examples:
      | date1       | date2       |
      | 42/01/2020  | 09/15/2020  |
      | 20/77/2017  | 100/11/2021 |
      | 31/01/20199 | 02/02/2019  |
      | 31/01/2021  | 31/03/2020  |


  Scenario Outline: 2- User can select one or more "<type>"
    Given the user should be able to select one or more "<type>" from Type section
    Examples:
      | type                    |
      | Posts                   |
      | Announcements           |
      | Appreciations           |
      | Polls                   |
      | Conversations           |
      | Working time management |
      | Work reports            |
      | Calendar                |
      | External source data    |
      | Photo gallery           |
      | Wiki                    |
      | Workflows               |


  Scenario Outline: 3- User can search by "<Author>"
    Given the user should be able to search by "<Author>"
    Examples:
      | Author                 |
      | Asiya                  |
      | Alex Deep              |
      | Mike Smith             |
      | hr2@cybertekschool.com |


  Scenario Outline: 4- User can search by "<To>"
    Given the user should be able to search by "<To>" from To
    Examples:
      | To                     |
      | Asiya                  |
      | Alex Deep              |
      | Mike Smith             |
      | hr2@cybertekschool.com |


  Scenario Outline: 5- User can Add "<field>"
    Given the user should be able to add "<field>"
    Examples:
      | field     |
      | Favorites |
      | Tag       |
      | Extranet  |


  Scenario Outline: 6- User can search by filters only with one of "<followings>"
    Given the user should be able to search with one of "<followings>"
    Examples:
      | followings    |
      | Work          |
      | Favorites     |
      | My Activity   |
      | Announcements |
      | Workflows     |

  
  Scenario Outline: 7- User can save a filter
    Given the user should be able to click Save Filter button
    Then the user should be able to give "<any name>" and click save button
    Examples:
      | any name      |
      | FIRST SEARCH  |
      | SECOND SEARCH |
      | THIRD SEARCH  |