$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DriveFuntions.feature");
formatter.feature({
  "name": "Drive Functions in Activity Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
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
  "name": "the user logs in using following credentials \"userName\" and \"password\"",
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
  "name": "User displays the windows in the Drive Function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Drive\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.TasksStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"My Drive\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.azulcrm.step_definitions.MyProfileStepDefs.page_title_should_be(MyProfileStepDefs.java:16)\r\n\tat ✽.page title should be \"My Drive\"(file:///C:/Users/dunda/Desktop/Cybertek-SDET/Project/group_15_project_AzulCRM/src/test/resources/features/DriveFuntions.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"My Drive\" window should be displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.windowShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "as the title \"My Drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
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
  "name": "the user logs in using following credentials \"userName\" and \"password\"",
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
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "\"Company Drive\" window should be displayed",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.windowShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "as the title \"Company Drive\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Company Drive]\u003e but was:\u003c[(2) Portal]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.azulcrm.step_definitions.DriveFunctionsStepDefs.asTheTitleShouldBeDisplayed(DriveFunctionsStepDefs.java:37)\r\n\tat ✽.as the title \"Company Drive\" should be displayed(file:///C:/Users/dunda/Desktop/Cybertek-SDET/Project/group_15_project_AzulCRM/src/test/resources/features/DriveFuntions.feature:18)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});