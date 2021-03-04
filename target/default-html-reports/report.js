$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Workgroups.feature");
formatter.feature({
  "name": "Workgroups function on Activity Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@workGroupsFunction"
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
      "name": "@workGroupsFunction"
    },
    {
      "name": "@AZ-158"
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
  "name": "Adding groups to the favorites",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@workGroupsFunction"
    },
    {
      "name": "@AZ-159"
    }
  ]
});
formatter.step({
  "name": "the user clicks on the star next to the group name",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.the_user_clicks_on_the_star_next_to_the_group_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.clicks_on_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on favorites",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.clicks_on_favorites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The groups which are added to favorites should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.WorkgroupsStepDefs.the_groups_which_are_added_to_favorites_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});