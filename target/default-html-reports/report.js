$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Tasks.feature");
formatter.feature({
  "name": "user is on the Tasks page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tasks"
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
formatter.scenario({
  "name": "user is navigates to Tasks page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tasks"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Tasks\" module",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to display tasks \"In progress\" by clicking \"All Tasks\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_should_be_able_to_display_tasks_by_clicking_tab(java.lang.String,java.lang.String)"
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
formatter.scenario({
  "name": "user is navigates to Tasks page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tasks"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Tasks\" module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"My tasks\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Ongoing\" tab in My Tasks page",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_tab_in_My_Tasks_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to display tasks \"Role: Ongoing\" by clicking \"Ongoing Tasks\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_should_be_able_to_display_tasks_by_clicking_tab(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});