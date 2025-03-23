public class Figura 
{
    public double altura;
    public double ancho;
    public double radio;
    public double l1;
    public double l2;
    public Figura(double x, double y, double z, double w)
    {
        altura = y;
        ancho = x;
        l1 = z;
        l2 = w;
    }
    public Figura(double x, double y)
    {
        altura = y;
        ancho = x;
    }
    public Figura(double x)
    {
        radio = x;
    }
    public double area(int TipoFigura)
    {
        if(TipoFigura==1)
        {
            return((altura*ancho)/2);
        }
        else if(TipoFigura==2)
        {
            return(altura*ancho);
        }
        else if(TipoFigura==3)
        {
            return(radio*radio*Math.PI);
        }
        else
        {
            return(-1);
        }
    }
    public double perimetro(int TipoFigura)
    {
        if(TipoFigura==1)
        {
            return(ancho+l1+l2);
        }
        else if(TipoFigura==2)
        {
            return((2*altura)+(2*ancho));
        }
        else if(TipoFigura==3)
        {
            return(2*radio*Math.PI);
        }
        else
        {
            return(-1);
        }
    }
}
