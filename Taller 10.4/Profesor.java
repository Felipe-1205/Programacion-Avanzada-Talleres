public class Profesor extends Usuario {
    private String asignatura;

    Profesor(String x,String y, String z)
    {
        super(x,y);
        asignatura=z;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public String getAsignatura() {
        return asignatura;
    }
    
}
