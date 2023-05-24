package singleton;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import superhero.SuperHero;
import car.voiture.Voiture;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BatSingletonStepDefs {

    private BatSingleton batSingleton;
    private SuperHero superHero;
    private Voiture voiture;
@Given("I instantiate the Batman singleton")
public void i_have_accessed_the_batman_singleton() {
    batSingleton = BatSingleton.getInstance();
    throw new io.cucumber.java.PendingException();
}
@When("I request the instantiated SuperHero")
public void i_request_the_instantiated_super_hero() {
    superHero = batSingleton.getSuperHero();
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the SuperHero should have the name {string}")
public void the_super_hero_should_have_the_name(String string) {
    Assert.assertEquals(string, superHero.getNom());
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the SuperHero should have the power {string}")
public void the_super_hero_should_have_the_power(String string) {
    Assert.assertEquals(string, superHero.getPouvoir());
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the SuperHero should have the level {int}")
public void the_super_hero_should_have_the_level(Integer int1) {
    Assert.assertEquals(Optional.ofNullable(int1), Optional.of(superHero.getNiveau()));
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("I request the instantiated Voiture")
public void i_request_the_instantiated_voiture() {
    voiture = batSingleton.getVoiture();
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the Voiture should have the owner {string}")
public void the_voiture_should_have_the_owner(String string) {
    Assert.assertEquals(string, voiture.getOwner());
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the Voiture should have the year {int}")
public void the_voiture_should_have_the_year(Integer int1) {
    Assert.assertEquals(int1, Optional.of(Optional.of(voiture.getAnnee())));
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}