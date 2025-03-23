public class BuenPunto extends MiPunto 
{
     public BuenPunto(double x, double y )
     {
         super(x,y);
     }
     public double distancia()
     {
        return(Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2)));
     }
}