public class TV extends Monitor{
    private int tamaño;
    private String resolucion;

    TV(String x,String y, String z,int w)
    {
        super(x,y);
        resolucion=z;
        tamaño=w;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public String getResolucion() {
        return resolucion;
    }
    public int getTamaño() {
        return tamaño;
    }

}