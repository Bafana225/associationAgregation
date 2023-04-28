public class Client extends Personne {

    private int argent;

    public Client(String nom, int age, int argent) {
        super(nom, age);
        this.argent = argent;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void payer(int montant, Coiffeur coiffeur) {
        if (argent >= montant) {
            argent -= montant;
            coiffeur.setArgent(coiffeur.getArgent() + montant);
            System.out.println(nom + " paie " + montant + " euros au coiffeur.");
        } else {
            System.out.println("Pas assez d'argent pour payer.");
        }
    }

    public void afficher() {
        System.out.println("Client " + getNom() + " âgé de " + " ans et possédant " + argent + " euros.");
    }
}
