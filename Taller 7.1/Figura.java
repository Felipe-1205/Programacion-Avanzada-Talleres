public class Figura 
{
    public int altura;
    public int ancho;
    public Figura()
    {
        altura = 2;
        ancho = 3;
    }
    public int area(int tipofigura)
    {
        if(tipofigura==1)
        {
            return((altura*ancho)/2);
        }
        else if(tipofigura==2)
        {
            return(altura*ancho);
        }
        else
        {
            return(-1);
        }
    }
}
