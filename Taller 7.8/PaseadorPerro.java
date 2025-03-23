public class PaseadorPerro 
{
    public String paseador;
    public int hora=16; // el valor de la hora actual se cambia manualmente
    public String poder;
    public PaseadorPerro()
    {
        paseador="Jaimito Gonzales";
    }
    public boolean Pasear(Perros ElPerro)
    {
        if(ElPerro.GetTomoAgua()>hora)
        {
            poder = "no puede";
            return(false);
        }
        else if ((hora-ElPerro.GetTomoAgua())<4)
        {
            poder = "no puede";
            return(false);
        }
        else
        {
            poder = "puede";
            return(true);
        }
    }
}
