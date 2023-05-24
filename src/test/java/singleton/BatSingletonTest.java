package singleton;

import adapter.VoitureAdapter;
import car.voiture.Voiture;
import org.junit.jupiter.api.Test;
import singleton.BatSingleton;
import superhero.Batman;
import superhero.SuperHero;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BatSingletonTest {
    @Test
    void getInstance_ShouldReturnSameInstance() {
        // Arrange
        // Act
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();
        // Assert
        assertSame(instance1, instance2);
    }

    @Test
    void getSuperHero_ShouldReturnBatman() {
        // Arrange
        BatSingleton instance = BatSingleton.getInstance();
        // Act
        Batman batman = instance.getBatman();
        // Assert
        assertEquals("Batman", batman.getNom());
        assertEquals("Voler", batman.getPouvoir());
        assertEquals(1000, batman.getNiveau());
    }

    @Test
    void getVoiture_ShouldReturnBatmobile() {
        // Arrange
        BatSingleton instance = BatSingleton.getInstance();
        // Act
        VoitureAdapter batmobile = instance.getVoiture();
        // Assert
        assertEquals("Batman-mobile", batmobile.getOwner());
        assertEquals(1000, batmobile.getAnnee());
    }

}
