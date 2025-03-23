public class RepresentanteCamara extends Legislador {

    RepresentanteCamara(String nombre, int edad,String departamentoQueRepresenta) {
        super(nombre, edad, departamentoQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return"Camara de representates";
    }
}
