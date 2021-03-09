@Company
  Feature: As a user, I should be able to use functions under Company menu

    Background:
      Given the user logs in using following credentials "human_resource_username" and "password"
      Then the user navigates to "Company" module


    Scenario: User can display "News" window by clicking on "News" button.
      When the user clicks on "News" button in Company Page
      Then page title should be "Important information"

    Scenario: User can display "Add News" window by clicking on "Add News" button.
      When the user clicks on "Add News" button in Company Page
      Then the user should be able to see Add News Pop-up Window

    Scenario: User can display "Official Information" by clicking on "Official Information" tab.
      When the user clicks on "Official Information" tab in Company Page
      Then page title should be "Company"

    Scenario: User can see "Our Life" window by clicking on "Our Life" tab.
      When the user clicks on "Our Life" tab in Company Page
      Then page title should be "Company life"

    Scenario: User can see "About Company" window by clicking on "About Company" Tab.
      When the user clicks on "About Company" tab in Company Page
      Then the user should be able to see "History" tab in About Company Window

    Scenario: User can see an album and photos page by clicking "Photo Gallery" tab.
      When the user clicks on "Photo Gallery" tab in Company Page
      Then page title should be "Photo gallery"

    Scenario: User can display video player window by clicking "Video" tab.
      When the user clicks on "Video" tab in Company Page
      Then the user should be able to click "Video" button in the upper right corner in Company Tabs

    Scenario: User can display vacancy button by clicking "Career" tab.
      When the user clicks on "Career" tab in Company Page
      Then the user should be able to click "Vacancies" button in the upper right corner in Company Tabs

    Scenario: User can display the news under Business News(RSS) menu.
      When the user clicks on "Business News (RSS)" tab in Company Page
      Then the user should be able to see RSS Feed as header title

