$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DriveFuntions.feature");
formatter.feature({
  "name": "Drive Functions in Activity Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials \"userName\" and \"password\"",
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
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(MyProfileStepDefs.java:12)\r\n\tat ✽.page title should be \"Portal\"(file:///C:/Users/dunda/Desktop/Cybertek-SDET/Project/group_15_project_AzulCRM/src/test/resources/features/DriveFuntions.feature:6)\r\n",
  "status": "pending"
});
formatter.scenario({
  "name": "User displays the windows in the Drive Function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Drive\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"My Drive\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"My Drive\" window should be displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.windowShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "as the title \"My Drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials \"userName\" and \"password\"",
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
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(MyProfileStepDefs.java:12)\r\n\tat ✽.page title should be \"Portal\"(file:///C:/Users/dunda/Desktop/Cybertek-SDET/Project/group_15_project_AzulCRM/src/test/resources/features/DriveFuntions.feature:6)\r\n",
  "status": "pending"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "\"Company Drive\" window should be displayed",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.windowShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "as the title \"Company Drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});