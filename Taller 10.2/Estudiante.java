public class Estudiante extends Persona {
    private double promedio;

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double getPromedio() {
        return promedio;
    }
    public String toString() {
        return (super.toString()+" tiene un promedio de: "+promedio);
    }
    
}
