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
  "status": "skipped"
});
formatter.step({
  "name": "the user logs in using following credentials \"userName\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logs_in_using_following_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"Portal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
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
  "name": "following windows should be displayed",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the title should be changed as follows",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});