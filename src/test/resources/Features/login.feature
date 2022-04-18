Feature: Test login scenerio

@smokeTest
  Scenario: Test Login with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login
    Then user is naviagetd to home page
