public class Perros 
{
    public String nombre;
    public String raza;
    public int hora;
    public Perros(String a, String b)
    {
        nombre = a;
        raza = b;
    }
    public void SetTomoAgua(int h)
    {
        hora = h;
    }
    public int GetTomoAgua()
    {
        return(hora);
    }
}
