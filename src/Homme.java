/**
 * Classe Homme représentant une personne de sexe masculin.
 */
public class Homme extends Personne{

    /** Longueur des cheveux de l'homme */
    private int longueurCheveux;

    /** Booléen indiquant si l'homme a un dégradé */
    private boolean degrade;

    /** Montant d'argent en possession de l'homme */
    private int argent;

    /** Coiffeur qui va réaliser la coupe de l'homme */
    private Coiffeur coiffeur;

    /**
     * Constructeur de la classe Homme.
     * @param nom Le nom de l'homme.
     * @param age L'âge de l'homme.
     * @param longueurCheveux La longueur des cheveux de l'homme.
     * @param degrade Indique si l'homme a un dégradé.
     * @param argent Le montant d'argent en possession de l'homme.
     * @param coiffeur Le coiffeur qui va réaliser la coupe de l'homme.
     */
    public Homme(String nom, int age, int longueurCheveux, boolean degrade, int argent, Coiffeur coiffeur) {
        super(nom, age);
        this.longueurCheveux = longueurCheveux;
        this.degrade = degrade;
        this.argent = argent;
        this.coiffeur = coiffeur;
    }

    /**
     * Modifie la longueur des cheveux de l'homme.
     * @param longueurCheveux La nouvelle longueur des cheveux.
     */
    public void setLongueurCheveux(int longueurCheveux) {
        this.longueurCheveux = longueurCheveux;
    }

    /**
     * Modifie le dégradé de l'homme.
     * @param degrade Le nouveau dégradé.
     */
    public void setDegrade(boolean degrade) {
        this.degrade = degrade;
    }

    /**
     * Modifie le montant d'argent en possession de l'homme.
     * @param argent Le nouveau montant d'argent.
     */
    public void setArgent(int argent) {
        this.argent = argent;
    }

    /**
     * Demande au coiffeur de réaliser une coupe sur l'homme.
     * @param coupe La coupe à réaliser.
     */
    public void seFaireCouperLesCheveux(String coupe) {
        coiffeur.realiserCoupe(this, coupe);
    }

    /**
     * Affiche les caractéristiques de l'homme.
     */
    public void afficher() {
        System.out.println("Homme avec une longueur de cheveux de " + longueurCheveux + " et un dégradé de " + degrade + " possédant " + argent + " euros.");
    }

    /**
     * Retourne le montant d'argent en possession de l'homme.
     * @return Le montant d'argent en possession de l'homme.
     */
    public int getArgent() {
        return argent;
    }
}
