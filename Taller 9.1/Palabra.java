import java.io.Serializable;

public class Palabra implements Serializable
{
    private String nombrePalabra;
    private int cantidadveces;

    public Palabra(String nombrePalabra,int cantidadveces)
    {
        this.cantidadveces=cantidadveces;
        this.nombrePalabra=nombrePalabra;
    }
    public void setCantidadveces(int cantidadveces) {
        this.cantidadveces = cantidadveces;
    }
    public void setNombrePalabra(String nombrePalabra) {
        this.nombrePalabra = nombrePalabra;
    }
    public int getCantidadveces() {
        return cantidadveces;
    }
    public String getNombrePalabra() {
        return nombrePalabra;
    }
}
