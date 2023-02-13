package teszt;

import model.Auto;

public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }

    public JarmuTeszt() {
//        mintaSablonteszt();
        haladAutoBeinditasNelkul();
        hakadAutoBeinditassal();
        haladDefekttel();
        benzinNelkulHalad();
        kerekcsereUtanHalad();
    }

    private void mintaSablonteszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "neem egyenlök";
    }

    private void haladAutoBeinditasNelkul() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "beíndítás nélkül is haladt";
    }

    private void hakadAutoBeinditassal() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert vart == kapott : "nem haladt";
    }

    private void haladDefekttel() {
        Auto auto = new Auto(true);
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert vart == kapott : "defektell haladt";
    }

    private void benzinNelkulHalad() {
        Auto auto = new Auto();
        auto.beindit();
        auto.halad();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert vart == kapott : "benzin nélkül haladt";
    }

    private void kerekcsereUtanHalad() {
        Auto auto = new Auto(true);
        auto.beindit();
        auto.kereketCserel();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert vart == kapott : "kerékcser után nem halad";
    }
    
    
  
}
