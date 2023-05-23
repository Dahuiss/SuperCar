package superhero;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test SuperHeroTest.
 *
 *   
 * @version 1.0
 */
public class SuperHeroTest
{
    private SuperHero hero;
    
    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() 
    {
        hero = new SuperHero("Spiderman", "Toile d'araignée", 5);
    }
    
    @Test
    public void testGetNom()
    {
        SuperHero superHer1 = new SuperHero("Iron Man", "Technologie", 10);
        assertEquals("Iron Man", superHer1.getNom());
    }

    @Test
    public void SuperHeroTest()
    {
        assertEquals(5, hero.getNiveau());
        assertEquals("Spiderman", hero.getNom());
        assertEquals("Toile d'araignée", hero.getPouvoir());
    }

    @Test
    public void testGetNiveau()
    {
        assertEquals(5, hero.getNiveau());
    }

    @Test
    public void testGetPouvoir()
    {
        assertEquals("Toile d'araignée", hero.getPouvoir());
    }


    @Test
    public void testSetPouvoir() {
        String newPouvoir = "Super Force";
        hero.setPouvoir(newPouvoir);
        assertEquals(newPouvoir, hero.getPouvoir());
    }

    @Test
    public void testSetNiveau() {
        int newNiveau = 20;
        hero.setNiveau(newNiveau);
        assertEquals(newNiveau, hero.getNiveau());
    }
     /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() 
    {
        hero = null;
    }

}








