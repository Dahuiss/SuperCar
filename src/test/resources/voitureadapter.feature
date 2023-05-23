Feature:US_005 - Superhero Car adapter

  As a user
  I want to be able to control a car adapted for a superhero
  So that the superhero can interact with his car properly

  Scenario Outline: Initialize a superhero car
    Given a superhero "<superhero_name>" with a level of <level>
    When I create a new superhero car with this superhero
    Then the car should be owned by "<superhero_name>-mobile"
    And the car should be of year <level>
    And there should not be a superhero inside the car

    Examples:
      | superhero_name | level |
      | John Doe       | 10    |
      | Jane Doe       | 15    |
      | Batman         | 20    |

  Scenario Outline: Superhero enters and exits the car
    Given a superhero car owned by "<superhero_name>-mobile"
    When the superhero enters the car
    Then there should be a superhero inside the car
    When the superhero exits the car
    Then there should not be a superhero inside the car

    Examples:
      | superhero_name |
      | John Doe       |
      | Jane Doe       |
      | Batman         |

  Scenario Outline: Call for superhero when in danger
    Given a superhero car owned by "<superhero_name>"
    When the car is in danger
    And the superhero is not inside the car
    Then I should get a message saying "<superhero_name> est appelé à la rescousse !"
    When the superhero enters the car
    And the car is in danger
    Then I should get a message saying "<superhero_name> est prêt à intervenir !"

    Examples:
      | superhero_name |
      | John Doe       |
      | Jane Doe       |
      | Batman         |