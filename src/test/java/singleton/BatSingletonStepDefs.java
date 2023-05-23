package singleton;

import car.voiture.Voiture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import superhero.SuperHero;


public class BatSingletonStepDefs {
    private BatSingleton instance;
    private SuperHero superhero;
    private Voiture car;


    @Given("the BatSingleton instance is created")
    public void the_bat_singleton_instance_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I get the superhero")
    public void i_get_the_superhero() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the superhero's name should be {string}")
    public void the_superhero_s_name_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the superhero's power should be {string}")
    public void the_superhero_s_power_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the superhero's level should be {int}")
    public void the_superhero_s_level_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I get the car")
    public void i_get_the_car() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the car's owner should be {string}")
    public void the_car_s_owner_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the car's year should be {int}")
    public void the_car_s_year_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
