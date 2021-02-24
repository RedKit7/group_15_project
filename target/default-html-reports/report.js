$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Workgroups.feature");
formatter.feature({
  "name": "Workgroups function on Activity Stream",
  "description": "",
  "keyword": "Feature"
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
  "name": "the user logs in using following credentials \"human_resource_username\" and \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logs_in_using_following_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Workgroups\" module",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Join to the groups",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on join button under the groups",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.the_user_clicks_on_join_button_under_the_groups()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A message as \"Request has been sent\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.a_message_as_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});