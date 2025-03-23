public class Bicicleta implements Vehiculo{

    @Override
    public void Iniciar() {
        System.out.println("Comienza a pedalear");
    }

    @Override
    public void Parar() {
        System.out.println("Usa el freno de mano");
    }
    
}
