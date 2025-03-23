public class Figura 
{
    private double altura=0;
    private double ancho=0;
    private double radio=0;
    private double l1=0;
    private double l2=0;
    private int tipoFigura;

    public Figura(double x, double y,double z,double w)
    {
        altura = y;
        ancho = x;
        l1 = z;
        l2 = w;
        tipoFigura = 1;
    }
    public Figura(double x, double y)
    {
        altura = y;
        ancho = x;
        tipoFigura = 2;
    }
    public Figura(double x)
    {
        radio = x;
        tipoFigura = 3;
    }

    public void setFigura(int x) 
    {
        tipoFigura = x;
    }
    public void setRadio(double x) 
    {
        radio = x;
    }
    public void setl1(double x) 
    {
        l1 = x;
    }
    public void setl2(double x) 
    {
        l2 = x;
    }
    public void setAlto(double x) 
    {
        altura = x;
    }
    public void setAncho(double x) 
    {
        ancho = x;
    }
    
    public double area()
    {
        if(tipoFigura==1)
        {
            return((altura*ancho)/2);
        }
        else if(tipoFigura==2)
        {
            return(altura*ancho);
        }
        else if(tipoFigura==3)
        {
            return(radio*radio*Math.PI);
        }
        else
        {
            return(-1);
        }
    }
    public double perimetro()
    {
        if(tipoFigura==1)
        {
            return(ancho+l1+l2);
        }
        else if(tipoFigura==2)
        {
            return((2*altura)+(2*ancho));
        }
        else if(tipoFigura==3)
        {
            return(2*radio*Math.PI);
        }
        else
        {
            return(-1);
        }
    }
}
