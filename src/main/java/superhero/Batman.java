package superhero;

public class Batman extends SuperHero{
    private Batman(String nom, String pouvoir, int niveau) {
        super(nom, pouvoir, niveau);
    }

    public static Batman creationBatman(){
        return new Batman("Batman", "Voler", 1000);
    }
}
