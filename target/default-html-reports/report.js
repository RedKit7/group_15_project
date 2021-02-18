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
  "status": "skipped"
});
formatter.step({
  "name": "the user logs in using following credentials  \"userName\"and \"password\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on \"user menu\" in the Portal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_user_clicks_on_in_the_Portal_Page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User should be able to display \"Edit User Profile\" window by clicking on \"Edit Profile Settings\" menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Edit Profile Settings\" in the User Menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_user_clicks_on_in_the_User_Menu(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"xxx\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user logs in using following credentials  \"userName\"and \"password\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on \"user menu\" in the Portal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_user_clicks_on_in_the_Portal_Page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User should be able to display \"Contact Information\" by clicking on \"My Profile\" menu.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"My Profile\" in the User Menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.MyProfileStepDefs.the_user_clicks_on_in_the_User_Menu(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"yyy\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});