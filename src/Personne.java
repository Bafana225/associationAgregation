public class Personne {

    /** Nom de la personne */
    protected String nom;

    /** Quantité d'argent en possession de la personne */
    private int argent;

    /**
     * Constructeur de la classe Personne.
     * @param nom Le nom de la personne.
     * @param argent La quantité d'argent en possession de la personne.
     */
    public Personne(String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
    }

    /**
     * Retourne le nom de la personne.
     * @return Le nom de la personne.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la quantité d'argent en possession de la personne.
     * @return La quantité d'argent en possession de la personne.
     */
    public int getArgent() {
        return argent;
    }

    /**
     * Modifie la quantité d'argent en possession de la personne.
     * @param argent La nouvelle quantité d'argent en possession de la personne.
     */
    public void setArgent(int argent) {
        this.argent = argent;
    }

    /**
     * Ajoute une quantité d'argent à la personne.
     * @param montant Le montant à ajouter.
     */
    public void ajouterArgent(int montant) {
        argent += montant;
    }

    /**
     * Enlève une quantité d'argent à la personne.
     * @param montant Le montant à enlever.
     */
    public void enleverArgent(int montant) {
        argent -= montant;
    }
}
