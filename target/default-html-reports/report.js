$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CalendarFuntions.feature");
formatter.feature({
  "name": "Calendar Functions",
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
  "name": "the user navigates to \"Calendar\" module",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Calendar\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user is able to display Company Calendar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Company Calendar\" tab in My Calendar page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CalendarFunctionsStepDefs.user_navigates_to_tab_in_My_Calendar_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Event Calendar\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user views daily, weekly and monthly and overall schedules",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CalendarFunctionsStepDefs.user_views_daily_weekly_and_monthly_and_overall_schedules()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});