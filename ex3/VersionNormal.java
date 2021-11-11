package ex3;

import java.util.List;

public class VersionNormal implements Version{

	public void affiche(List<VueProduit> produits) {
		
		for(int i=0 ; i<produits.size(); i++) {

			if(i%3 == 0) 
				System.out.println("");
			
			produits.get(i).affiche();

			if(i != produits.size()-1) 
			    System.out.print("***********");		
	    }

    }
}