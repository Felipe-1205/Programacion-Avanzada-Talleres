import java.time.LocalDate;
import java.time.Period;

public class Nacimiento 
{
    public int dia;
    public int mes;
    public int año;
    public Nacimiento(int dian, int mesn, int añon)
    {
        dia = dian;
        mes = mesn;
        año = añon;
    }
    public String edad()
    {
        LocalDate cumpleaños = LocalDate.of(año,mes,dia);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(cumpleaños,hoy);
        return(edad.getYears()+" años "+edad.getMonths()+" meses "+edad.getDays()+" dias ");
    }
}
