Feature: Login and open lessons area for members

@SmokeTest
Scenario: Login with valid user name and password
Given User launch browser
And User open url "http://localhost/wow/index.php"
Then User presented with WOW home page having title "Welcome"
And User click on Proceed To Lessons button
Then User presented with WOW home page having title "Login"
And User Enter email "john@test.com.au"
And User Enter password "goodday"
And User press login button
Then User presented with WOW home page having title "Login Success"
