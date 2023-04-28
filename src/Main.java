public class Main {
    public static void main(String[] args) {
        // Création d'un coiffeur (composition)
        Coiffeur coiffeur = new Coiffeur("John", 200);

        // Création de deux clients (composition)
        Client client1 = new Client("Alice", 25, 50);
        Client client2 = new Client("Bob", 30, 100);

        // Création d'un homme (association)
        // L'homme est associé au coiffeur via la référence "coiffeur" passée en paramètre du constructeur
        Homme homme = new Homme("John Doe", 25, 30, false, 200, coiffeur);

        // Ajout des clients au coiffeur (composition)
        coiffeur.recevoirClient(client1);
        coiffeur.recevoirClient(client2);

        // Le coiffeur réalise une coupe pour l'homme (association)
        // La méthode seFaireCouperLesCheveux() est appelée sur l'objet "homme", qui est associé au coiffeur
        // via la référence "coiffeur" passée en paramètre du constructeur de la classe Homme
        homme.seFaireCouperLesCheveux("Haut de gamme");

        // Affichage des informations
        coiffeur.afficher();
        client1.afficher();
        client2.afficher();
        homme.afficher();

        // Le client 1 paie le coiffeur (composition)
        coiffeur.recevoirPaiement(client1, 25);

        // Le client 2 paie le coiffeur (composition)
        coiffeur.recevoirPaiement(client2, 35);

        // Le coiffeur essaie de réaliser une coupe pour l'homme, mais il n'a pas assez d'argent (association)
        // La méthode seFaireCouperLesCheveux() est appelée sur l'objet "homme", qui est associé au coiffeur
        // via la référence "coiffeur" passée en paramètre du constructeur de la classe Homme
        homme.seFaireCouperLesCheveux("Standard");
    }
}
