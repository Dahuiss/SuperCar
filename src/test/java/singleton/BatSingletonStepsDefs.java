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

    @Given("an instance of BatSingleton has been retrieved before")
    public void an_instance_of_bat_singleton_has_been_retrieved_before() {
        batSingleton = BatSingleton.getInstance();
        assertSame(batSingleton, BatSingleton.getInstance());
    }
    @When("I retrieve {String} from BatSingleton")
    public void i_retrieve_from_bat_singleton(String string) {
        switch (string) {
            case "SuperHero":
                batSingleton.getSuperHero();
                break;
            case "Voiture":
                batSingleton.getVoiture();
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + string);
        }
    }
    @Then("I should get the instance of {String} with the name {String}")
    public void i_should_get_the_instance_of_with_the_name(String string, String string2) {
        switch (string) {
            case "SuperHero":
                assertSame("Batman", batSingleton.getSuperHero().getNom());
                break;
            case "Voiture":
                assertSame("Batmobile", batSingleton.getVoiture().getOwner());
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + string);
        }
    }

    @Given("the instance of BatSingleton has been retrieved")
    public void the_instance_of_bat_singleton_has_been_retrieved() {
        batSingleton = BatSingleton.getInstance();
        assertSame(batSingleton, BatSingleton.getInstance());
    }
    @When("I retrieve the {String} from BatSingleton")
    public void i_retrieve_the_from_bat_singleton(String string) {
        switch (string) {
            case "SuperHero":
                batSingleton.getSuperHero();
                break;
            case "Voiture":
                batSingleton.getVoiture();
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + string);
        }
    }
    @Then("I should get the instance of {String} with the owner {String}")
    public void i_should_get_the_instance_of_with_the_owner(String string, String string2) {
        switch (string) {
            case "SuperHero":
                assertSame("Batman", batSingleton.getSuperHero().getNom());
                break;
            case "Voiture":
                assertSame("Batmobile", batSingleton.getVoiture().getOwner());
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + string);
        }
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

