  @services
  Feature: user is on the Meeting Rooms page


    Background:
      When the user logs in using following credentials "marketing_username" and "marketing_password"
      Then page title should be "Portal"



    @AZ-199
    Scenario: User can find the specific course.
      Given the user navigates to "Services" module
      When the user navigates to "Training" tab in Meeting Rooms page
      Then the user should be able see Find input

    @AZ-200
    Scenario: User can see his/her courses under MyCourses
      Given the user navigates to "Services" module
      And the user navigates to "Training" tab in Meeting Rooms page
      When the user navigates to "My Courses" tab in Course list page
      Then page title should be "Course report"

    @AZ-201
    Scenario: User can see his/her grades under Grade Book.
      Given the user navigates to "Services" module
      And the user navigates to "Training" tab in Meeting Rooms page
      When the user navigates to "Grade Book" tab in Course list page
      Then page title should be "Test results"

    @AZ-202
    Scenario: User can edit his/her Student's Profile.
      Given the user navigates to "Services" module
      And the user navigates to "Training" tab in Meeting Rooms page
      When the user navigates to "Profile" tab in Course list page
      Then page title should be "Student's Profile"
