$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DefaultLogin.feature");
formatter.feature({
  "name": "Default Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Default Login Function",
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
  "name": "user logs in with valid user info",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DefaultLoginStefDefs.user_logs_in_with_valid_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});