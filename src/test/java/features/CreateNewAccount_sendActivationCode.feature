Feature: Create new account - Send Activation Code

@SmokeTest
Scenario: Enter details and get activation code
Given User open desired browser
And User open WOW home page "http://localhost/wow/index.php"
Then User presented with WOW home page having title "Welcome"
And User click on Create an Account button
Then User presented with WOW home page having title "Registration Form"
And User type user name "Bon"
And User type email "Bon@test.com.au"
And User click on accept terms and condtion checkbox
And User press Send Activation Code button
Then User presented with a response "Great. Just one more step to go"