Feature: feature tests thw signup fuctonality of the ijmeet application

  Background: chrome browser should be opened

  Scenario: To fill signup form empty and find the result
    Given user is on signup page
    When user leaves full name empty and clicks on Signup button
    Then user should see an error message

  Scenario: Type Number As a First Name
    Given user is on signup page
    When user enter the full name "Aakash"
