package adapter;
import car.voiture.Voiture;
import superhero.SuperHero;

import java.time.Year;

public class VoitureAdapter extends Voiture {

    private SuperHero superHero;
    private boolean isHeroInside;

    public VoitureAdapter(SuperHero superHero) {
        super(superHero.getNom()+"-mobile", superHero.getNiveau());
        this.superHero = superHero;
        this.isHeroInside = false;
    }

    // Vérifier si le super-héro est à l'intérieur de la voiture
    public boolean heroInside() {
        return this.isHeroInside;
    }

    // Faire entrer le super-héro dans la voiture
    public void enterSuperHero() {
        this.isHeroInside = true;
    }

    // Faire sortir le super-héro de la voiture
    public void exitSuperHero() {
        this.isHeroInside = false;
    }

    // Faire appel au super-héros lorsque la voiture est en danger
    public String callSuperHero() {
        if (isHeroInside) {
            return superHero.getNom() + " est prêt à intervenir !";
        } else {
            return superHero.getNom() + " est appelé à la rescousse !";
        }
    }

}