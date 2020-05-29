$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateNewAccount_sendActivationCode.feature");
formatter.feature({
  "line": 1,
  "name": "Create new account - Send Activation Code",
  "description": "",
  "id": "create-new-account---send-activation-code",
  "keyword": "Feature"
});
formatter.before({
  "duration": 337500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Enter details and get activation code",
  "description": "",
  "id": "create-new-account---send-activation-code;enter-details-and-get-activation-code",
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
  "name": "User open desired browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User open WOW home page \"http://localhost/wow/index.php\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User presented with WOW home page having title \"Welcome\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on Create an Account button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User presented with WOW home page having title \"Registration Form\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User type user name \"Bon\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User type email \"Bon@test.com.au\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on accept terms and condtion checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User press Send Activation Code button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User presented with a response \"Great. Just one more step to go\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef_wowHomePage.user_open_desired_browser()"
});
formatter.result({
  "duration": 7535818400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/wow/index.php",
      "offset": 25
    }
  ],
  "location": "stepDef_wowHomePage.user_open_WOW_home_page(String)"
});
formatter.result({
  "duration": 969537600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 48
    }
  ],
  "location": "stepDef_wowHomePage.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 3048347100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_wowHomePage.user_click_on_Create_an_Account_button()"
});
formatter.result({
  "duration": 3686279800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration Form",
      "offset": 48
    }
  ],
  "location": "stepDef_wowHomePage.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 2923761800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bon",
      "offset": 21
    }
  ],
  "location": "stepDef_wowRegistrationPage.user_type_user_name(String)"
});
formatter.result({
  "duration": 317358600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bon@test.com.au",
      "offset": 17
    }
  ],
  "location": "stepDef_wowRegistrationPage.user_type_email(String)"
});
formatter.result({
  "duration": 433949100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_wowRegistrationPage.user_click_on_accept_terms_and_condtion_checkbox()"
});
formatter.result({
  "duration": 164062400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_wowRegistrationPage.user_press_Send_Activation_Code_button()"
});
formatter.result({
  "duration": 3756870300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Great. Just one more step to go",
      "offset": 32
    }
  ],
  "location": "stepDef_wowRegistrationPage.user_presented_with_a_response(String)"
});
formatter.result({
  "duration": 3026334200,
  "status": "passed"
});
formatter.after({
  "duration": 1688778400,
  "status": "passed"
});
formatter.uri("LoginWithValidCredentials.feature");
formatter.feature({
  "line": 1,
  "name": "Login with valid credentials and go to lessons area for members",
  "description": "",
  "id": "login-with-valid-credentials-and-go-to-lessons-area-for-members",
  "keyword": "Feature"
});
formatter.before({
  "duration": 112700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid user name and password",
  "description": "",
  "id": "login-with-valid-credentials-and-go-to-lessons-area-for-members;login-with-valid-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open desired browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User open WOW home page \"http://localhost/wow/index.php\"",
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
  "location": "stepDef_wowHomePage.user_open_desired_browser()"
});
formatter.result({
  "duration": 4329664700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/wow/index.php",
      "offset": 25
    }
  ],
  "location": "stepDef_wowHomePage.user_open_WOW_home_page(String)"
});
formatter.result({
  "duration": 648327600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 48
    }
  ],
  "location": "stepDef_wowHomePage.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 2894177400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_wowHomePage.user_click_on_Proceed_To_Lessons_button()"
});
formatter.result({
  "duration": 3470633200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 48
    }
  ],
  "location": "stepDef_wowHomePage.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 2881741900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john@test.com.au",
      "offset": 18
    }
  ],
  "location": "stepDef_wowLoginPage.user_Enter_email(String)"
});
formatter.result({
  "duration": 430872200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "goodday",
      "offset": 21
    }
  ],
  "location": "stepDef_wowLoginPage.user_Enter_password(String)"
});
formatter.result({
  "duration": 320733900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_wowLoginPage.user_press_login_button()"
});
formatter.result({
  "duration": 3270280000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Success",
      "offset": 48
    }
  ],
  "location": "stepDef_wowHomePage.user_presented_with_WOW_home_page_having_title(String)"
});
formatter.result({
  "duration": 3000747200,
  "status": "passed"
});
formatter.after({
  "duration": 1068430600,
  "status": "passed"
});
});