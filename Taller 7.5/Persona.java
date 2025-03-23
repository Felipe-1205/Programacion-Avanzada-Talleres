import java.time.LocalDate;
import java.time.Period;

public class Persona 
{
    public String nombre;
    public int dia;
    public int mes;
    public int año;
    public Persona()
    {
        nombre="Andres Marroquin";
        dia = 18;
        mes = 7;
        año = 2004;
    }    
    public void imprimir()
    {
        LocalDate cumpleaños = LocalDate.of(año,mes,dia);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(cumpleaños, hoy);
        System.out.println("Mi nombre es "+nombre+" y mi edad exacta es "+edad.getYears()+" años "+edad.getMonths()+" meses "+edad.getDays()+" dias ");
    }
}
