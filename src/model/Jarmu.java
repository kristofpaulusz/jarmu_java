package model;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;
    
    public void beindit() {};
    public void leallit() {};
    public boolean tankol() {
    return true;
    }
    abstract public boolean halad();
    
}
