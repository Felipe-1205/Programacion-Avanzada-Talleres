public class Tree extends Plant {
    private boolean frutas;
    private int tamaño;

    Tree(String x,boolean y, int z)
    {
        super(x);
        frutas=y;
        tamaño=z;
    }

    public void setFrutas(boolean frutas) {
        this.frutas = frutas;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public int getTamaño() {
        return tamaño;
    }
    public boolean getFrutas() {
        return frutas;
    }
    

}
