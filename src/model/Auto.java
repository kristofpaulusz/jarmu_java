package model;

import java.util.Random;

public class Auto extends Jarmu {
    private boolean defekt;
    
    
    public void kereketCserel() {
    defekt = false;
    };
    
    
    @Override
    public boolean halad() {
        
        Random myR = new Random();
        if (myR.nextInt(1, 4) == 1) {
            defekt = true;
        }
        if (defekt) {
            return false;
        }
        else {
            megerkezett = true;
            uzemanyag = false;
            return true;
                    }
    }
}
