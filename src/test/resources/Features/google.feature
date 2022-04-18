Feature: Search functionality of google

  Scenario: Test Search on google
    Given Browser is open
    And user is on google search page
    When user enters text in search field
    And hit the enter key
    Then user is naviagetd to search results page
