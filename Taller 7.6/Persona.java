public class Persona 
{
    public String nombre;
    public int dia;
    public int mes;
    public int año;
    public String nacimiento;
    public Persona()
    {
        nombre="Andres Marroquin";
        dia = 5;
        mes = 12;
        año = 2003;
    }    
    public void imprimir()
    {
        Nacimiento edad = new Nacimiento(dia,mes,año);
        nacimiento = edad.edad();
        System.out.println("Mi nombre es "+nombre+" y mi edad exacta es "+nacimiento);
    }
}
