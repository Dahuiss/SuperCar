Feature: Avenger Team Management
  As a user
  I want to manage the Avenger team
  So that I can add, remove, and display team level information

  Scenario Outline: Add a new member to the team
    Given I create an Avengers team with the given list
    When I add a new superhero named "<name>" with the power "<power>" and level <level>
    Then the size of the Avengers team should be <newSize>

    Examples:
      | name   | power       | level | newSize |
      | Marco  | fait du polo | 23   | 4       |
