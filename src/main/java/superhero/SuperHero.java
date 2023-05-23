package superhero;

/**
 * Cette classe représente un super-héros avec un nom, un pouvoir et un niveau de force.
 * Les instances de cette classe sont immuables : leurs valeurs ne peuvent pas être modifiées après leur création.
 * 
 * @version 1.0
 */
public class SuperHero {
    private String nom;
    private String pouvoir;
    private int niveau;
    
    /**
     * Constructeur qui crée un nouvel objet SuperHero avec les paramètres spécifiés.
     *
     * @param nom le nom du super-héros
     * @param pouvoir le pouvoir du super-héros
     * @param niveau le niveau de force du super-héros
     */
    public SuperHero(String nom, String pouvoir, int niveau) {
        this.nom = nom;
        this.pouvoir = pouvoir;
        this.niveau = niveau;
    }
    
    /**
     * Retourne le nom de ce super-héros.
     *
     * @return le nom de ce super-héros
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Retourne le pouvoir de ce super-héros.
     *
     * @return le pouvoir de ce super-héros
     */
    public String getPouvoir() {
        return pouvoir;
    }
    
    /**
     * Retourne le niveau de force de ce super-héros.
     *
     * @return le niveau de force de ce super-héros
     */
    public int getNiveau() {
        return niveau;
    }

    public void setPouvoir(String newSuperHeroPower) {
        this.pouvoir = newSuperHeroPower;
    }

    public void setNiveau(int newSuperHeroLevel) {
        this.niveau = newSuperHeroLevel;
    }
}
