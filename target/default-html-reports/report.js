$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User Should be able to Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with user credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials \"helpdesk_username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logs_in_using_following_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Portal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(MyProfileStepDefs.java:12)\r\n\tat ✽.page title should be \"Portal\"(file:///C:/Users/ev/IdeaProjects/group_15_project/src/test/resources/features/Login.feature:7)\r\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});