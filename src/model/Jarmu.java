package model;

public abstract class Jarmu {
    protected boolean beinditva;
    protected boolean uzemanyag;
    protected boolean megerkezett;
    
    public void beindit() {
    beinditva = true;
    };
    public void leallit() {
    beinditva = false;
    };
    public boolean tankol() {
    return true;
    }
    public boolean halad() {
    return true;
    };
    
}
