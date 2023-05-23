Feature: BatSingleton

  Scenario : Retrieve instance of BatSingleton
    Given no instance of BatSingleton has been retrieved before
    When I retrieve the instance of BatSingleton
    Then I should get the same instance each time

  Scenario Outline: Retrieve Batman from BatSingleton
    Given an instance of BatSingleton has been retrieved
    When I retrieve <superHero> from BatSingleton
    Then I should get the instance of <superHero> with the name "<name>"

    Examples:
      | superHero  | name   |
      | Batman     | Batman |
      | Superwoman | Diana  |

  Scenario Outline: Retrieve Batmobile from BatSingleton
    Given the instance of BatSingleton has been retrieved
    When I retrieve the <vehicle> from BatSingleton
    Then I should get the instance of the <vehicle> with the owner "<owner>"

    Examples:
      | vehicle    | owner     |
      | Batmobile  | Batman    |
      | Jet        | Superman  |
