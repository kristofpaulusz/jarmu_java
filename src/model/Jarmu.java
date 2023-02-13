package model;

public abstract class Jarmu {
    protected boolean beinditva = false;
    protected boolean uzemanyag = true;
    protected boolean megerkezett = false;
    
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
