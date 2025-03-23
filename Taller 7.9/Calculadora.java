public class Calculadora 
{
    public double x;
    public double y;
    public Calculadora()
    {
        x=0;
        y=0;
    }

    public Calculadora(double a, double b)
    {
        x=a;
        y=b;
    }
    public void setx(double a)
    {
        x=a;
    }
    public void sety(double a)
    {
        y=a;
    }
    public double suma()
    {
        return(x+y);
    }
    public double suma(double a, double b)
    {
        x=a;
        y=b;
        return(x+y);
    }
    public double resta()
    {
        return(x-y);
    }
    public double resta(double a, double b)
    {
        x=a;
        y=b;
        return(x-y);
    }public double multiplicacion()
    {
        return(x*y);
    }
    public double multiplicacion(double a, double b)
    {
        x=a;
        y=b;
        return(x*y);
    }public double division()
    {
        return(x/y);
    }
    public double division(double a, double b)
    {
        x=a;
        y=b;
        return(x/y);
    }
}
