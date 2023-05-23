package singleton;


import car.voiture.Voiture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import superhero.SuperHero;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatSingletonStepsDefs {
    private BatSingleton batSingleton;
    private SuperHero superHero;
    private Voiture voiture;

    @Given("a BatSingleton instance")
    public void createBatSingletonInstance() {
        batSingleton = BatSingleton.getInstance();
    }

    @When("getting the instance multiple times")
    public void getInstanceMultipleTimes() {
        // No action required, the instance is already created
    }

    @Then("the same instance should be returned")
    public void assertSameInstanceReturned() {
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();
        assertEquals(instance1, instance2);
    }

    @When("getting the super hero")
    public void getSuperHero() {
        superHero = batSingleton.getSuperHero();
    }

    @Then("the super hero should be {string}")
    public void assertSuperHeroName(String superHeroName) {
        assertEquals(superHeroName, superHero.getNom());
    }

    @Then("the super hero's power should be {string}")
    public void assertSuperHeroPower(String superHeroPower) {
        assertEquals(superHeroPower, superHero.getPouvoir());
    }

    @Then("the super hero's level should be {int}")
    public void assertSuperHeroLevel(int superHeroLevel) {
        assertEquals(superHeroLevel, superHero.getNiveau());
    }

    @When("getting the voiture")
    public void getVoiture() {
        voiture = batSingleton.getVoiture();
    }

    @Then("the voiture should be {string}")
        public void assertVoitureName(String voitureName) {
        assertEquals(voitureName, voiture.getOwner());
    }

    @Then("the voiture's owner should be {string}")
    public void assertVoitureOwner(String voitureOwner) {
        assertEquals(voitureOwner, voiture.getOwner());
    }

    @Then("the voiture's year should be {int}")
    public void assertVoitureYear(int voitureYear) {
        assertEquals(voitureYear, voiture.getAnnee());
    }

    @When("updating the super hero's power to {string}")
    public void updateSuperHeroPower(String newSuperHeroPower) {
        superHero.setPouvoir(newSuperHeroPower);
    }

    @When("updating the super hero's level to {int}")
    public void updateSuperHeroLevel(int newSuperHeroLevel) {
        superHero.setNiveau(newSuperHeroLevel);
    }

    @Then("the super hero's power should be {string}")
    public void assertNewSuperHeroPower(String newSuperHeroPower) {
        assertEquals(newSuperHeroPower, superHero.getPouvoir());
    }

    @Then("the super hero's level should be {int}")
    public void assertNewSuperHeroLevel(int newSuperHeroLevel) {
        assertEquals(newSuperHeroLevel, superHero.getNiveau());
    }
}

