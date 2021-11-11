package ex2;

public class Client {

    public static void main(String args[]) {

        AvatarCommande clown = new AvatarCommande("Clown");
        AvatarCommande muscles = new AvatarCommande("Muscles");
        SuperPouvoirFactory factory = new SuperPouvoirFactory();

        clown.ajouterSuperPouvoir(factory, "TournadeFeu1", 500.5);
        clown.ajouterSuperPouvoir(factory, "TourbillonEau1", 550.0);

        muscles.ajouterSuperPouvoir(factory, "TournadeFeu1", 1000.0);
        muscles.ajouterSuperPouvoir(factory, "TourillonEau2", 1500.0);

        clown.afficherSuperPouvoirs();
        muscles.afficherSuperPouvoirs();

        }

    
}
