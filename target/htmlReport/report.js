$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/loginToLessons.feature");
formatter.feature({
  "line": 1,
  "name": "Login and open lessons area for members",
  "description": "",
  "id": "login-and-open-lessons-area-for-members",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid user name and password",
  "description": "",
  "id": "login-and-open-lessons-area-for-members;login-with-valid-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User open url \"http://localhost/wow/index.php\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User presented with WOW home page having title \"Welcome\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on Proceed To Lessons button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User presented with WOW home page having title \"Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Enter email \"john@test.com.au\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter password \"goodday\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User press login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User presented with WOW home page having title \"Login Success\"",
  "keyword": "Then "
});
formatter.match({
  "location": "wowStepsForLogin.user_launch_browser()"
});
formatter.result({
  "duration": 9972840300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/wow/index.php",
      "offset": 15
    }
  ],
  "location": "wowStepsForLogin.user_open_url(String)"
});
formatter.result({
  "duration": 622884500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 48
    }
  ],
  "location": "wowStepsForLogin.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 3121890000,
  "status": "passed"
});
formatter.match({
  "location": "wowStepsForLogin.user_click_on_Proceed_To_Lessons_button()"
});
formatter.result({
  "duration": 556014800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 48
    }
  ],
  "location": "wowStepsForLogin.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 3018615700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john@test.com.au",
      "offset": 18
    }
  ],
  "location": "wowStepsForLogin.user_Enter_email(String)"
});
formatter.result({
  "duration": 1717622300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "goodday",
      "offset": 21
    }
  ],
  "location": "wowStepsForLogin.user_Enter_password(String)"
});
formatter.result({
  "duration": 455782700,
  "status": "passed"
});
formatter.match({
  "location": "wowStepsForLogin.user_press_login_button()"
});
formatter.result({
  "duration": 489088900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Success",
      "offset": 48
    }
  ],
  "location": "wowStepsForLogin.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 2992555800,
  "status": "passed"
});
});