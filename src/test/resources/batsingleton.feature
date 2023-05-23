Feature: BatSingleton

  Scenario Outline: Get instance should return the same instance
    Given a BatSingleton instance
    When getting the instance multiple times
    Then the same instance should be returned

  Scenario Outline: Get super hero should return <SuperHeroName>
    Given a BatSingleton instance
    When getting the super hero
    Then the super hero should be <SuperHeroName>
    And the super hero's power should be "<SuperHeroPower>"
    And the super hero's level should be <SuperHeroLevel>

    Examples:
      | SuperHeroName | SuperHeroPower | SuperHeroLevel |
      | Batman        | Voler          | 10000          |

  Scenario Outline: Get voiture should return <VoitureName>
    Given a BatSingleton instance
    When getting the voiture
    Then the voiture should be <VoitureName>
    And the voiture's owner should be "<VoitureOwner>"
    And the voiture's year should be <VoitureYear>

    Examples:
      | VoitureName | VoitureOwner | VoitureYear |
      | Batmobile   | Batmobile    | 2022        |

  Scenario Outline: Update super hero should update super hero properties
    Given a BatSingleton instance
    And the super hero is <SuperHeroName>
    When updating the super hero's power to "<NewSuperHeroPower>"
    And updating the super hero's level to <NewSuperHeroLevel>
    Then the super hero's power should be "<NewSuperHeroPower>"
    And the super hero's level should be <NewSuperHeroLevel>

    Examples:
      | SuperHeroName | NewSuperHeroPower | NewSuperHeroLevel |
      | Batman        | Invisibilité     | 15000            |
