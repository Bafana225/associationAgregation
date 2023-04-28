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

    public void afficher() {
        System.out.println("Client " + getNom() + " âgé de " + " ans et possédant " + argent + " euros.");
    }
}
