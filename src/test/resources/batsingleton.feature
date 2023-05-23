Feature: US_OO3 - Vérifier qu'on instancie correctement

  Scenario: Verifier les details du superhero Batman
    Given un objet de type SuperHero
    When je demande les informations du superhero Batman
    Then Je dois avoir le nom "<nom>" et le pouvoir "<pouvoir>" et le niveau "<niveau>"

