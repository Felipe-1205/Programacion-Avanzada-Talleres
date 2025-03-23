public class Car {
    private String marca;
    private String modelo;

    public void arrancar()
    {
        System.out.println("El carro ah prendido");
    }
    public void avanzar()
    {
        System.out.println("El carro se esta moviendo");
    }

    public String toString() {
        return ("El carro de marca "+marca+" de modelo "+modelo);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
}
