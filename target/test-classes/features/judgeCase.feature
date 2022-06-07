Feature: Judge Case
  As a user I want to press a case against Kevin and judge and vote for verdict

  @smoke
  Scenario: Judge the case and vote for verdict
    Given user navigate to "FINDING THE TRUTH" course
    Then  he clicks start
    When  he proceed to the Make a case against Kevin
    And   he select judges
    When  he vote "Guilty"
    Then  his verdict should be saved