package model;

import java.util.Random;

public class Auto extends Jarmu {
    private boolean defekt;

    public Auto() {
        super();
    }
    public Auto(boolean defekt) {
        super();
        this.defekt = defekt;
    }
    
    public void kereketCserel() {
    defekt = false;
    };
    
    
    @Override
    public boolean halad() {
        if (beinditva && !defekt && uzemanyag) {
            Random myR = new Random();
            if (myR.nextInt(1, 4) == 1) {
                defekt = true;
                kereketCserel();
            }
            megerkezett = true;
            uzemanyag = false;
            return true;
        } else return false;
}
}
