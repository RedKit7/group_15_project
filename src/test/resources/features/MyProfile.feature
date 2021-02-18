@MyProfile
Feature: As a user, I should be able to see My Profile.

  Background:
    Given the user logs in with valid username and password
    Then the user clicks on "user menu" in the Portal Page

  Scenario: User should be able to display "Edit User Profile" window by clicking on "Edit Profile Settings" menu
    When the user clicks on "Edit Profile Settings" in the User Menu
    Then the user should be able to display Edit Profile Settings window


  Scenario: User should be able to display "Contact Information" by clicking on "My Profile" menu.
    When the user clicks on "My Profile" in the User Menu
    Then the user should be able to display Contact Information
