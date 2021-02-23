$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MyProfile.feature");
formatter.feature({
  "name": "As a user, I should be able to see My Profile.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MyProfile"
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
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logs_in_using_following_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"user-block\" in the Portal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_user_clicks_on_in_the_Portal_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to display \"Contact Information\" by clicking on \"My Profile\" menu.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyProfile"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"My Profile\" in the User Menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.theUserClicksOnInTheUserMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Contact Information should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_Contact_Information_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});