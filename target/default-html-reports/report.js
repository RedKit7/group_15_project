$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Company.feature");
formatter.feature({
  "name": "As a user, I should be able to use functions under Company menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Company"
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
  "name": "the user navigates to \"Company\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can display \"Add News\" window by clicking on \"Add News\" button.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Company"
    },
    {
      "name": "@AZ-190"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Add News\" button in Company Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CompanyStepDefs.the_user_clicks_on_button_in_Company_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see Add News Pop-up Window",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CompanyStepDefs.the_user_should_be_able_to_see_Add_News_Pop_up_Window()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});