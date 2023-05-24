Feature: Batman Singleton

  Scenario Outline: Verify instantiated SuperHero and Voiture
    Given I instantiate a BatSingeton
    When I request the instantiated SuperHero
    Then the SuperHero should have the name "<name>"
    And the SuperHero should have the power "<power>"
    And the SuperHero should have the level <level>
    When I request the instantiated Voiture
    Then the Voiture should have the owner "<owner>"
    And the Voiture should have the year <year>

  Examples:
    | name   | power   | level  | owner     | year |
    | Batman | Voler   | 10000  | Batmobile | 2022 |