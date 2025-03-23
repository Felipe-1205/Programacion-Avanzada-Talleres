public class Main 
{ 
  public static void main(String[] args) 
  { 
      Figura obj = new Figura(4);
      System.out.println("el area del circulo es "+obj.area());
      System.out.println("el perimetro del circulo es "+obj.perimetro());
      obj.setFigura(2);
      obj.setAlto(6);
      obj.setAncho(2);
      System.out.println("el area del rectangulo es "+obj.area());
      System.out.println("el perimetro del rectangulo es "+obj.perimetro());
      obj.setFigura(1);
      obj.setl1(4);
      obj.setl2(5);
      System.out.println("el area del triangulo es "+obj.area());
      System.out.println("el perimetro del triangulo es "+obj.perimetro());
  }
}