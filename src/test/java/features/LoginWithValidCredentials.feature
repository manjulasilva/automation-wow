Feature: Login with valid credentials and go to lessons area for members

@SmokeTest @RegressionTest
Scenario: Login with valid user name and password
Given User open desired browser
And User open WOW home page "http://localhost/wow/index.php"
Then User presented with WOW home page having title "Welcome"
And User click on Proceed To Lessons button
Then User presented with WOW home page having title "Login"
And User Enter email "john@test.com.au"
And User Enter password "goodday"
And User press login button
Then User presented with WOW home page having title "Login Success"
