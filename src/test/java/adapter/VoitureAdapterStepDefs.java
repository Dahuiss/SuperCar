package adapter;


import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import superhero.SuperHero;

public class VoitureAdapterStepDefs {

    private SuperHero superHero;
    private VoitureAdapter voitureAdapter;

    @Given("a superhero {string} with a level of {int}")
    public void a_superhero_with_a_level_of(String superheroName, int level) {
        superHero = new SuperHero(superheroName, "Test power ",level);
    }

    @When("I create a new superhero car with this superhero")
    public void i_create_a_new_superhero_car_with_this_superhero() {
        voitureAdapter = new VoitureAdapter(superHero);
    }

    @Then("the car should be owned by {string}")
    public void the_car_should_be_owned_by(String expectedOwner) {
        assertEquals(expectedOwner, voitureAdapter.getOwner());
    }

    @Then("the car should be of year {int}")
    public void the_car_should_be_of_year(int expectedYear) {
        assertEquals(expectedYear, voitureAdapter.getAnnee());
    }

    @Then("there should not be a superhero inside the car")
    public void there_should_not_be_a_superhero_inside_the_car() {
        assertFalse(voitureAdapter.heroInside());
    }

    @Given("a superhero car owned by {string}")
    public void a_superhero_car_owned_by_mobile(String superheroName) {
        superHero = new SuperHero(superheroName,"test pouvoir", 10);
        voitureAdapter = new VoitureAdapter(superHero);
    }

    @When("the superhero enters the car")
    public void the_superhero_enters_the_car() {
        voitureAdapter.enterSuperHero();
    }

    @Then("there should be a superhero inside the car")
    public void there_should_be_a_superhero_inside_the_car() {
        assertTrue(voitureAdapter.heroInside());
    }

    @When("the superhero exits the car")
    public void the_superhero_exits_the_car() {
        voitureAdapter.exitSuperHero();
    }

    @When("the car is in danger")
    public void the_car_is_in_danger() {
        // Assuming the car being in danger doesn't affect the state of the car or superhero
    }

    @When("the superhero is not inside the car")
    public void the_superhero_is_not_inside_the_car() {
        voitureAdapter.exitSuperHero();
    }

    @Then("I should get a message saying {string}")
    public void i_should_get_a_message_saying(String expectedMessage) {
        assertEquals(expectedMessage, voitureAdapter.callSuperHero());
    }
}
