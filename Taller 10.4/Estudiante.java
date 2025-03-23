public class Estudiante extends Usuario {
    private double promedio;

    Estudiante(String x,String y, double z)
    {
        super(x,y);
        promedio=z;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double getPromedio() {
        return promedio;
    }
    
}
