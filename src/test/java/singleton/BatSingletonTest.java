package singleton;

import adapter.VoitureAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import superhero.Batman;

public class BatSingletonTest {

    @Test
    public void testGetInstance() {
        BatSingleton instance1 = BatSingleton.getInstance();
        BatSingleton instance2 = BatSingleton.getInstance();

        // Vérifier que les deux instances sont les mêmes
        Assertions.assertSame(instance1, instance2, "Les instances doivent être identiques");
    }

    @Test
    public void testGetBatman() {
        BatSingleton instance = BatSingleton.getInstance();
        Batman batman = instance.getBatman();

        // Vérifier que le Batman renvoyé n'est pas nul
        Assertions.assertNotNull(batman, "Le Batman ne doit pas être nul");

        // Vérifier que le Batman est une instance valide
        Assertions.assertTrue(batman instanceof Batman, "Le Batman doit être une instance de Batman");

        // Vérifier que le Batman est le même que celui utilisé dans le singleton
        Assertions.assertSame(batman, instance.getBatman(), "Le Batman doit être identique");
    }

    @Test
    public void testGetVoiture() {
        BatSingleton instance = BatSingleton.getInstance();
        VoitureAdapter batmobile = instance.getVoiture();

        // Vérifier que la Batmobile renvoyée n'est pas nulle
        Assertions.assertNotNull(batmobile, "La Batmobile ne doit pas être nulle");

        // Vérifier que la Batmobile est une instance valide
        Assertions.assertTrue(batmobile instanceof VoitureAdapter, "La Batmobile doit être une instance de VoitureAdapter");

        // Vérifier que la Batmobile est la même que celle utilisée dans le singleton
        Assertions.assertSame(batmobile, instance.getVoiture(), "La Batmobile doit être identique");
    }
}
