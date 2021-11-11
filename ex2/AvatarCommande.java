package ex2;

import java.util.*;

public class AvatarCommande {
    
    public String nom;

    public ArrayList<Double> prixDeVenteSuperPouvoirs = new ArrayList<>();
    public ArrayList<SuperPouvoir> superPouvoirs = new ArrayList<>();

    public AvatarCommande(String nom) {
        this.nom=nom;
    }

    public void ajouterSuperPouvoir(SuperPouvoirFactory factory,String nom, Double prixDeVente) {
        superPouvoirs.add(factory.getSuperPouvoir(nom));
        prixDeVenteSuperPouvoirs.add(prixDeVente);
    }

    public void afficherSuperPouvoirs() {
        System.out.println("L'avatar : "+nom);
        int i=0;
        for (SuperPouvoir sp : superPouvoirs)	{	
            sp.afficherDetail(prixDeVenteSuperPouvoirs.get(i));
            i++;
        }
    }

    
}

