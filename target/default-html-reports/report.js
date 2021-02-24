$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Logout.feature");
formatter.feature({
  "name": "User Logs Out",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user logs out from portal",
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
  "name": "user logs out from portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LogoutStepDefs.user_logs_out_from_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});