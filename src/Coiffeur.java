import java.util.ArrayList;
import java.util.List;

public class Coiffeur {

    private String nom;
    private int argent;
    private List<Client> clients;

    public Coiffeur(String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
        clients = new ArrayList<>();
    }

    public void recevoirClient(Client client) {
        clients.add(client);
    }

    public void renvoyerClient(Client client) {
        clients.remove(client);
    }

    public void realiserCoupe(Personne personne, String coupe) {
        int prix = 25;
        if (personne instanceof Homme) {
            if (coupe.equals("Haut de gamme")) {
                prix = 35;
            }
        } else if (personne instanceof Femme) {
            prix = 35;
            if (coupe.equals("Standard")) {
                prix = 20;
            }
        }
        if (argent >= prix) {
            argent -= prix;
            personne.setArgent(personne.getArgent() - prix);
            System.out.println(nom + " réalise une coupe de " + coupe + " pour " + personne.getNom() + " pour " + prix + " euros.");
        } else {
            System.out.println("Pas assez d'argent pour réaliser la coupe.");
        }
    }


    public void afficher() {
        System.out.println("Coiffeur " + nom + " a " + argent + " euros et " + clients.size() + " clients.");
        System.out.println("Liste des clients :");
        for (Client client : clients) {
            client.afficher();
        }
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }
}
