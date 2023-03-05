Feature: Google search functionality with Scenario Outline
  User Story: As a user, when I am on the google page
  I should be able to search whatever I want and see relevant information

  @scenarioOutline
  Scenario Outline: Google search testing with scenario Outline
    Given User is on the google page
    When User searches for "<country>" capital
    Then user should see "<capital>" in the result
    Examples:
      | country | capital |
      |USA| Washington, D.C |
      |France |Paris|
      |Haiti|Por-au-Prince|
      |Turkey|Ankara|
      |Ukraine|Kyiv|