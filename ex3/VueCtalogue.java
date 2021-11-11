package ex3;

import java.util.*;

public class VueCtalogue {
    
	protected List<VueProduit> produits = new ArrayList<>();
    protected Version version;

    

	public  VueCtalogue(Version ver) {
        produits.add(new VueProduit("wiii"));
        produits.add(new VueProduit("pc"));
        produits.add(new VueProduit("play4"));
        this.version = ver;
    }

    public void affiche() {
        version.affiche(produits);
    }
}