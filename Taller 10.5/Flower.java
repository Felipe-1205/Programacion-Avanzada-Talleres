public class Flower extends Plant {
    private String color;
    private String petalos;

    Flower(String x,String y, String z)
    {
        super(x);
        color=y;
        petalos=z;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPetalos(String petalos) {
        this.petalos = petalos;
    }
    public String getPetalos() {
        return petalos;
    }
    
    
}
