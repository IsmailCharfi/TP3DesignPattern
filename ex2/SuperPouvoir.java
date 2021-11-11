package ex2;

public class SuperPouvoir {

    private String nom;
    private String description;

    
    public SuperPouvoir(String nom) {
        this.nom = nom;
        description = " superPower is  " + nom;
    }

    public void afficherDetail(Double prix) {
        System.out.println("Nom du SuperPouvoir :"+ this.nom+ "\n Description :"+this.description+ "\n prix :"+prix );	
        }
    
}






