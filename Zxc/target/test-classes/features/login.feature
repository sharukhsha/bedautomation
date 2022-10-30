Feature: feature to test login functunality

  Scenario: verify feature to test login functunality
    Given browser is open
    When user enter usename and password
    And hits login button
    Then user is navigated to homepage
