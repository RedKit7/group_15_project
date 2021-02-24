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
    },
    {
      "cells": [
        "helpdesk1@cybertekschool.com",
        "sassasda"
      ]
    },
    {
      "cells": [
        "asfdasda",
        "paasdasd"
      ]
    },
    {
      "cells": [
        "null",
        "null"
      ]
    },
    {
      "cells": [
        "helpdesk1@cybertekschool.com",
        "null"
      ]
    },
    {
      "cells": [
        "null",
        "UserUser"
      ]
    },
    {
      "cells": [
        "asfdasda",
        "null"
      ]
    },
    {
      "cells": [
        "null",
        "asfdasda"
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
  "name": "the user should not be able to login with \"helpdesk1@cybertekschool.com\" and \"sassasda\"",
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
  "name": "the user should not be able to login with \"asfdasda\" and \"paasdasd\"",
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
  "name": "the user should not be able to login with \"null\" and \"null\"",
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
  "name": "the user should not be able to login with \"helpdesk1@cybertekschool.com\" and \"null\"",
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
  "name": "the user should not be able to login with \"null\" and \"UserUser\"",
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
  "name": "the user should not be able to login with \"asfdasda\" and \"null\"",
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
  "name": "the user should not be able to login with \"null\" and \"asfdasda\"",
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