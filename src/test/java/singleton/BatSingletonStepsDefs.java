package singleton;

import car.voiture.Voiture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import singleton.BatSingleton;
import superhero.SuperHero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BatSingletonStepsDefs {
    private BatSingleton batSingleton;
    private SuperHero retrievedSuperhero;
    private Voiture retrievedBatmobile;

    @Given("the BatSingleton instance is available")
    public void theBatSingletonInstanceIsAvailable() {
        batSingleton = BatSingleton.getInstance();
    }

    @When("I retrieve the Superhero object from the BatSingleton")
    public void iRetrieveTheSuperheroObjectFromTheBatSingleton() {
        retrievedSuperhero = batSingleton.getSuperHero();
    }

    @Then("the Superhero's name should be {string}")
    public void theSuperheroNameShouldBe(String expectedName) {
        assertEquals(expectedName, retrievedSuperhero.getNom());
    }

    @Then("the Superhero's power should be {string}")
    public void theSuperheroPowerShouldBe(String expectedPower) {
        assertEquals(expectedPower, retrievedSuperhero.getPouvoir());
    }

    @Then("the Superhero's level should be {int}")
    public void theSuperheroLevelShouldBe(int expectedLevel) {
        assertEquals(expectedLevel, retrievedSuperhero.getNiveau());
    }

    @When("I retrieve the Batmobile object from the BatSingleton")
    public void iRetrieveTheBatmobileObjectFromTheBatSingleton() {
        retrievedBatmobile = batSingleton.getVoiture();
    }

    @Then("the Batmobile's owner should be {string}")
    public void theBatmobileOwnerShouldBe(String expectedOwner) {
        assertEquals(expectedOwner, retrievedBatmobile.getOwner());
    }

    @Then("the Batmobile's manufacturing year should be {int}")
    public void theBatmobileManufacturingYearShouldBe(int expectedYear) {
        assertEquals(expectedYear, retrievedBatmobile.getAnnee());
    }

    @Given("multiple instances of BatSingleton are created")
    public void multipleInstancesOfBatSingletonAreCreated() {
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();
        assertSame(instance1, instance2);
    }

    @When("I retrieve the instance of BatSingleton from different objects")
    public void iRetrieveTheInstanceOfBatSingletonFromDifferentObjects() {
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();
        assertSame(instance1, instance2);
    }

    @Then("all instances should refer to the same object")
    public void allInstancesShouldReferToTheSameObject() {
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();
        assertSame(instance1, instance2);
    }
}
