package singleton;

import adapter.VoitureAdapter;
import car.voiture.Voiture;
import superhero.Batman;
import superhero.SuperHero;

public class BatSingleton {
    private static BatSingleton instance;
    private Batman batman;
    private VoitureAdapter batmobile;

    protected BatSingleton() {
        batman = Batman.creationBatman();
        batmobile = new VoitureAdapter(batman);
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

    public Batman getBatman() {
        return batman;
    }

    public VoitureAdapter getVoiture() {
        return batmobile;
    }
}