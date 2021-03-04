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
  "name": "the user logs in using following credentials \"marketing_username\" and \"marketing_password\"",
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
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Drive\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"My Drive\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User displays the windows in the My Drive Function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@AZ-157"
    }
  ]
});
formatter.step({
  "name": "\"My Drive\" window should be displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.windowShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "as the title \"My Drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
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
  "name": "the user logs in using following credentials \"marketing_username\" and \"marketing_password\"",
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
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Drive\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"My Drive\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User displays the windows in the Company Drive Function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@AZ-161"
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
  "status": "passed"
});
formatter.step({
  "name": "as the title \"Company drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});