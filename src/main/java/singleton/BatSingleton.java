package singleton;

import car.voiture.Voiture;
import superhero.SuperHero;

public class BatSingleton {
    private static BatSingleton instance;
    private SuperHero superHero;
    private Voiture voiture;

    private BatSingleton() {
        superHero = new SuperHero("Batman", "Voler", 10000);
        voiture = new Voiture("Batmobile", 2022);
    }

    public static BatSingleton getInstance() {
        if (instance == null) {
            synchronized (BatSingleton.class) {
                if (instance == null) {
                    instance = new BatSingleton();
                }
            }
        }
        return instance;
    }

    public SuperHero getSuperHero() {
        return superHero;
    }

    public Voiture getVoiture() {
        return voiture;
    }
}
