@login
Feature: Login functionality of registered user

  Scenario: login via email and password
   Given user is home page
   When user clicks My Account
   Then user selects Login from given options
   And  user enters email "vishnu.vis2007@gmail.com" and password "vishnu@1"
   Then user is sucessfully logged in