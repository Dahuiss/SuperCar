package superhero;
import java.util.List;

public class Avengers implements SuperHeroTeam {
    
    private List<SuperHero> members;

    public Avengers(List<SuperHero> members) {
        this.members = members;
    }

    /**
     * Ajoute un super-héros à l'équipe des Avengers.
     *
     * @param hero le super-héros à ajouter à l'équipe
     */
    @Override
    public void addMember(SuperHero hero) {
        if(members.contains(hero))
            throw new IllegalArgumentException("Le super-héros " + hero.getNom() + " est déjà membre des Avengers.");
        else {
            this.members.add(hero);
        }
    }
    
    /**
     * Supprime un super-héros de l'équipe des Avengers.
     *
     * @param hero le super-héros à supprimer de l'équipe
     */
    @Override
    public void removeMember(SuperHero hero) {
        if(!members.contains(hero))
            throw new IllegalArgumentException("Le super-héros " + hero.getNom() + " n'est pas membre des Avengers.");
        else
            this.members.remove(hero);
    }
    
    /**
     * Calcule et retourne le niveau total de l'équipe des Avengers en additionnant les niveaux de tous les membres.
     *
     * @return le niveau total de l'équipe des Avengers
     */
    @Override
    public int teamLevel() {
        int totalLevel = 0;
        for (SuperHero hero : members) {
            totalLevel = totalLevel + hero.getNiveau();
        }
        return totalLevel;   
    }

    /**
     * Affiche le niveau total de l'équipe des Avengers en additionnant les niveaux de tous les membres.
     */
    @Override
    public String displayTeamLevel() {
        int totalLevel = teamLevel();
        return "Les Avengers ont un niveau total de " + totalLevel + ", équivalent à celui de " + totalLevel + " super-héros.";
    }

    public List<SuperHero> getMembers() {
        return members;
    }


}

