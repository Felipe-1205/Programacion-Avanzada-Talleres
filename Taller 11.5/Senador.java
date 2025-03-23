public class Senador extends Legislador {

    Senador(String nombre, int edad, String departamentoQueRepresenta) {
        super(nombre, edad, departamentoQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "El senado";
    }
    
}
