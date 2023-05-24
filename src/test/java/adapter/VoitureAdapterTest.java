package adapter;

import adapter.VoitureAdapter;
import car.voiture.Voiture;
import org.junit.Assert;
import org.junit.Test;
import superhero.SuperHero;

import java.time.Year;

public class VoitureAdapterTest {

    @Test
    public void testVoitureAdapter() {
        SuperHero superHero = new SuperHero("John Doe", "Vol", 10);
        VoitureAdapter voitureAdapter = new VoitureAdapter(superHero);

        String expectedOwner = "John Doe-mobile";
        int expectedAnnee = superHero.getNiveau();
        boolean expectedHeroInside = false;

        Assert.assertEquals(expectedOwner, voitureAdapter.getOwner());
        Assert.assertEquals(expectedAnnee, voitureAdapter.getAnnee());
        Assert.assertEquals(expectedHeroInside, voitureAdapter.heroInside());

        voitureAdapter.enterSuperHero();
        expectedHeroInside = true;
        Assert.assertEquals(expectedHeroInside, voitureAdapter.heroInside());

        voitureAdapter.exitSuperHero();
        expectedHeroInside = false;
        Assert.assertEquals(expectedHeroInside, voitureAdapter.heroInside());

        String expectedCallSuperHero = "John Doe est appelé à la rescousse !";
        Assert.assertEquals(expectedCallSuperHero, voitureAdapter.callSuperHero());

        voitureAdapter.enterSuperHero();
        expectedCallSuperHero = "John Doe est prêt à intervenir !";
        Assert.assertEquals(expectedCallSuperHero, voitureAdapter.callSuperHero());
    }
}
