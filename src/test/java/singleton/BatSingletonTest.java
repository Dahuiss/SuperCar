package singleton;

import car.voiture.Voiture;
import org.junit.jupiter.api.Test;
import superhero.SuperHero;

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
        SuperHero batman = instance.getSuperHero();

        // Assert
        assertEquals("Batman", batman.getNom());
        assertEquals("Vol", batman.getPouvoir());
        assertEquals(10000, batman.getNiveau());
    }

    @Test
    void getVoiture_ShouldReturnBatmobile() {
        // Arrange
        BatSingleton instance = BatSingleton.getInstance();

        // Act
        Voiture batmobile = instance.getVoiture();

        // Assert
        assertEquals("Batmobile", batmobile.getOwner());
        assertEquals(2022, batmobile.getAnnee());
    }
}
