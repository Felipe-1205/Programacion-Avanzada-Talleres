public class Area extends Figura {


    @Override
    public double AreaRectangulo(double x, double y) {
        return (x*y);
    }

    @Override
    public double AreaCuadrado(double x) {
        return (x*x);
    }

    @Override
    public double AreaCirculo(double x) {
        return (Math.PI*(x*x));
    }
}
