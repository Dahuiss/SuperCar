package superhero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe-test agilite.superhero.AvengersTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class AvengersTest
{
    private SuperHero mimi;
    private SuperHero mima;
    private SuperHero mimo;
    private List<SuperHero> members;


    /**
     * Constructeur de la classe-test agilite.superhero.AvengersTest
     */
    public AvengersTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        mimi = new SuperHero("mimi", "Voyager dans le temps", 23);
        mima = new SuperHero("mima", "Télépathie", 45);
        mimo = new SuperHero("mimo", "Lire dans les pensées", 40);
        members = new ArrayList<>();
        members.add(mimi);
        members.add(mima);
        members.add(mimo);
    }

    @Test
    public void testAddMember()
    {
        Avengers avengers1 = new Avengers(members);
        //avengers1.addMember(mimi);
        //avengers1.addMember(mima);
        //avengers1.addMember(mimo);
        SuperHero mimi2 = new SuperHero("marco", "fait du polo", 23);
        avengers1.addMember(mimi2);
        assertEquals(4, avengers1.getMembers().size());
    }

    @Test
    public void testRemoveMember() {
        Avengers avengers1 = new Avengers(members);
        //avengers1.addMember(mimi);
        //avengers1.removeMember(mimi);
        assertEquals(3, avengers1.getMembers().size());
    }

    @Test
    public void testTeamLevel() {
        Avengers avengers1 = new Avengers(members);
        //avengers1.addMember(mimi);
        //avengers1.addMember(mima);
        //avengers1.addMember(mimo);
        assertEquals(108, avengers1.teamLevel());
    }

    @Test
    public void testAddNullMember() {
        Avengers avengers1 = new Avengers(members);
        avengers1.addMember(null);
        assertEquals(4, avengers1.getMembers().size());
    }





}





