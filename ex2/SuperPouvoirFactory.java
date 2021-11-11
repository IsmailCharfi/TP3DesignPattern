package ex2;

import java.util.*;

public class SuperPouvoirFactory {
    
    private HashMap<String,SuperPouvoir> superPowers = new HashMap<>();

    public SuperPouvoir getSuperPouvoir(String nom ) {
        
        SuperPouvoir s = superPowers.get(nom);
        
        if(s == null) {
            s = new SuperPouvoir(nom);
            superPowers.put(nom, s);
        }
        
            return s;
    }

    
}




