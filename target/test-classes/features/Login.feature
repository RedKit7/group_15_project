
Feature: User Should be able to Login
#Zeynep
  @wip
   Scenario:Login with user credential
    When the user logs in using following credentials "helpdesk_username" and "password"
    Then page title should be "Portal"


  Scenario Outline:Login with user credential wit
    When the user logs in using following credentials "<userName>" and "<password>"
    Then page title should be "Portal"
    Examples:
      | userName                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |


  Scenario Outline:Login with wrong user credential
    When the user should not be able to login with "<wuser>" and "<wpassword>"
    Then The user should receive a warning message
    Examples:
      | wuser                        | wpassword |
      | sadasdsa                     | UserUser  |
      | helpdesk1@cybertekschool.com | sassasda  |
      | asfdasda                     | paasdasd  |
      | null                         | null      |
      | helpdesk1@cybertekschool.com | null      |
      | null                         | UserUser  |
      | asfdasda                     | null      |
      | null                         | asfdasda  |



