public class Autobus implements Vehiculo {
    @Override
    public void Iniciar() {
        System.out.println("Arranca motores");
    }

    @Override
    public void Parar() {
        System.out.println("Frenado");
    }
    
}
