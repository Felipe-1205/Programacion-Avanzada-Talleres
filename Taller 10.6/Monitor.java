public class Monitor {
    
    private String marca;
    private String modelo;

    Monitor(String x, String y)
    {
        marca=x;
        modelo=y;
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
