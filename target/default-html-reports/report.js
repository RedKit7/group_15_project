$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User Should be able to Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with wrong user credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user should not be able to login with \"\u003cwuser\u003e\" and \"\u003cwpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user should receive a warning message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "wuser",
        "wpassword"
      ]
    },
    {
      "cells": [
        "sadasdsa",
        "UserUser"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with wrong user credential",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the user should not be able to login with \"sadasdsa\" and \"UserUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_should_not_be_able_to_login_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should receive a warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_should_receive_a_warning_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});