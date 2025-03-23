public class Persona {
    private String nombre;
    private int edad;
    private int ID;

    public int getEdad() {
        return edad;
    }
    public int getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        
        return ("El estudiante "+nombre+" de "+edad+" años, con un ID de "+ID);
    }
    
}