import java.util.Objects;


/**
 * Classe Femme représentant une personne de sexe féminin.
 * Elle hérite de la classe Personne via le constructeur et le mot clé "super()".
 * Elle prend en paramètre la formule choisie et modifie les attributs de l'objet instancié à l'issue.
 */
public class Femme extends Personne{

    /** Longueur des cheveux de la femme */
    private int longueurCheveux;

    /** Longueur des extensions de la femme */
    private int longueurExtensions;

    /**
     * Constructeur de la classe Femme.
     * @param nom Le nom de la femme.
     * @param argent La quantité d'argent en possession de la femme.
     */
    public Femme(String nom, int argent) {
        super(nom, argent);
    }

    /**
     * Coiffe la femme en fonction de la formule choisie.
     * Modifie les attributs de la classe en conséquence.
     * @param formuleChoisie La formule choisie pour la coiffure.
     */
    public void coiffer(String formuleChoisie) {
        if (Objects.equals(formuleChoisie, "standard")) {
            longueurCheveux = 49;
            longueurExtensions = 0;
        } else if (Objects.equals(formuleChoisie, "Haut de gamme")) {
            longueurCheveux = 35;
            longueurExtensions = 26;
        } else {
            System.out.println("Mauvaise valeur entrée.");
            longueurCheveux = 0;
            longueurExtensions = 0;
        }
    }

    /**
     * Retourne la longueur des cheveux de la femme.
     * @return La longueur des cheveux.
     */
    public int getLongueurCheveux() {
        return longueurCheveux;
    }

    /**
     * Retourne la longueur des extensions de la femme.
     * @return La longueur des extensions.
     */
    public int getLongueurExtensions() {
        return longueurExtensions;
    }
}
