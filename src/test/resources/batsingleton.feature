Feature: Accessing Batman's Superhero and Batmobile

  Scenario Outline: Retrieve Batman's Superhero and Batmobile
    Given the BatSingleton instance is available
    When I retrieve the Superhero object from the BatSingleton
    Then the Superhero's name should be "Batman"
    And the Superhero's power should be "Voler"
    And the Superhero's level should be 10000
    And I retrieve the Batmobile object from the BatSingleton
    Then the Batmobile's owner should be "Batmobile"
    And the Batmobile's manufacturing year should be 2022

    Examples:
      | Description                               |
      | Retrieve Batman's details from singleton  |
      | Retrieve Batmobile details from singleton |

  Scenario Outline: Ensure Singleton instance is the same
    Given multiple instances of BatSingleton are created
    When I retrieve the instance of BatSingleton from different objects
    Then all instances should refer to the same object

    Examples:
      | Description                                         |
      | Retrieve BatSingleton instance multiple times       |
      | Access BatSingleton instance from different objects |
