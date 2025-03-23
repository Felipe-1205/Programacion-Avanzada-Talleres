import java.io.Serializable;

public class Empleado implements Serializable {

    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Empleado(int id, String nombres, String apellidos, String telefono)
    {
        this.apellidos = apellidos;
        this.id = id;
        this.nombres = nombres;
        this.telefono = telefono;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }
    public String getTelefono() {
        return telefono;
    }
}
