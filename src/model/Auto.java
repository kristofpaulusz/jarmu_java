package model;

import java.util.Random;

public class Auto extends Jarmu {
    private boolean defekt;
    
    
    public void kereketCserel() {
    defekt = false;
    };
    
    
    @Override
    public boolean halad() {
        uzemanyag = false;
        Random myR = new Random();
        if (myR.nextInt(1, 4) == 1) {
            defekt = true;
        }
        if (defekt) {
            return false;
        }
        else return true;
    }
}
