package singleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BatSingletonStepsDefs {
    private BatSingleton batSingleton;

    @Given("no instance of BatSingleton has been retrieved before")
    public void no_instance_of_bat_singleton_has_been_retrieved_before() {
        batSingleton = null;
    }

    @When("I retrieve the instance of BatSingleton")
    public void i_retrieve_the_instance_of_bat_singleton() {
        batSingleton = BatSingleton.getInstance();
    }

    @Then("I should get the same instance each time")
    public void i_should_get_the_same_instance_each_time() {
        BatSingleton newInstance = BatSingleton.getInstance();
        assertSame(batSingleton, newInstance);
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
                batSingleton.getBatman();
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
                assertSame("Batman", batSingleton.getBatman().getNom());
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
                batSingleton.getBatman();
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
                assertSame("Batman", batSingleton.getBatman().getNom());
                break;
            case "Voiture":
                assertSame("Batmobile", batSingleton.getVoiture().getOwner());
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + string);
        }
    }

}
