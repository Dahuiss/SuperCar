package superhero;

/**
 * Cette interface définit les opérations qu'une équipe de super-héros doit fournir :
 * l'ajout et la suppression de membres, l'affichage du niveau total de l'équipe et le retour du niveau total de l'équipe.
 *
 * @version 1.0
 */
public interface SuperHeroTeam {
    
    /**
     * Ajoute un super-héros à l'équipe.
     *
     * @param hero le super-héros à ajouter à l'équipe
     */
    void addMember(SuperHero hero);

    /**
     * Supprime un super-héros de l'équipe.
     *
     * @param hero le super-héros à supprimer de l'équipe
     */
    void removeMember(SuperHero hero);
    
    /**
     * Affiche le niveau total de l'équipe en additionnant les niveaux de tous les membres.
     */
    String displayTeamLevel();
    
    /**
     * Retourne le niveau total de l'équipe en additionnant les niveaux de tous les membres.
     *
     * @return le niveau total de l'équipe
     */
    int teamLevel();
}
