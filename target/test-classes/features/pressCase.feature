Feature: Press a Case
  As a user I want to press a case and vote


  Scenario: Selecting a case
    Given user navigate to "Finding the truth" course
    Then he clicks start
    When he proceed to the Make a case against Kevin
    Then he should see a description containing "once you have watched it"
