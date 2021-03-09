$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Logout.feature");
formatter.feature({
  "name": "User Logs Out",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "new deneme",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with valid user info",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DefaultLoginStefDefs.user_logs_in_with_valid_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on filter and search box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LogoutStepDefs.theUserClicksOnFilterAndSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a list of date options",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LogoutStepDefs.userCreatesAListOfDateOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});