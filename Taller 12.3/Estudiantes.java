public class Estudiantes {
    private int id;
    private int nota;
    private String nombre;

    Estudiantes(int id, int nota,String nombre)
    {
        this.id=id;
        this.nota=nota;
        this.nombre=nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNota() {
        return nota;
    }
}