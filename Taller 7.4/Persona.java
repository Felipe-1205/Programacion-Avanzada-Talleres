public class Persona 
{
    public String nombre;
    public int año;
    public Persona()
    {
        nombre="Andres Marroquin";
        año = 2003;
    }    
    public void imprimir(int añoactual)
    {
        System.out.println("Mi nombre es "+nombre+" y cumplo "+(añoactual-año)+" este año");
    }
}
