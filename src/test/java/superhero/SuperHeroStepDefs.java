package superhero;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperHeroStepDefs {
    private Avengers avengers;


    @Given("I create an Avengers team with the given list")
    public void i_create_an_avengers_team_with_the_given_list() {
        List<SuperHero> members = new ArrayList<>();
        members.add(new SuperHero("Mimi", "Voyager dans le temps", 23));
        members.add(new SuperHero("Mima", "Télépathie", 45));
        members.add(new SuperHero("Mimo", "Lire dans les pensées", 40));
        this.avengers = new Avengers(members);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("I add a new superhero named {string} with the power {string} and level {int}")
    public void i_add_a_new_superhero_named_with_the_power_and_level(String string, String string2, Integer int1) {
        this.avengers.addMember(new SuperHero(string, string2, int1));
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the size of the Avengers team should be {int}")
    public void the_size_of_the_avengers_team_should_be(Integer int1) {
        assertEquals(this.avengers.getMembers().size(), int1.intValue());
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

/*    @Given("a list of three superheroes: Mimi, Mima, and Mimo")
    public void a_list_of_three_superheroes_mimi_mima_and_mimo() {
        List<SuperHero> members = new ArrayList<>();
        members.add(new SuperHero("Mimi", "Voyager dans le temps", 23));
        members.add(new SuperHero("Mima", "Télépathie", 45));
        members.add(new SuperHero("Mimo", "Lire dans les pensées", 40));
        avengers = new Avengers(members);
    }*/
}
