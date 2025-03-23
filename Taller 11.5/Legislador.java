public abstract class Legislador extends Persona {

    private String departamentoQueRepresenta ;

    Legislador(String nombre, int edad,String departamentoQueRepresenta) {
        super(nombre, edad);
        this.departamentoQueRepresenta = departamentoQueRepresenta;
    }
    
    public abstract String getCamaraEnQueTrabaja();

    public String getDepartamentoQueRepresenta() {
        return departamentoQueRepresenta;
    }
    public void setDepartamentoQueRepresenta(String departamentoQueRepresenta) {
        this.departamentoQueRepresenta = departamentoQueRepresenta;
    }
    
}
