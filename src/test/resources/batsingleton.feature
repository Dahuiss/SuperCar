Feature: BatSingleton

  Scenario Outline: Verify the functionality of BatSingleton
    Given the BatSingleton instance is created
    When I get the superhero
    Then the superhero's name should be "<superheroName>"
    And the superhero's power should be "<superheroPower>"
    And the superhero's level should be <superheroLevel>

    When I get the car
    Then the car's owner should be "<carOwner>"
    And the car's year should be <carYear>

    Examples:
      | superheroName | superheroPower | superheroLevel | carOwner  | carYear |
      | Batman        | Voler          | 10000          | Batmobile | 2022    |
