public class Main 
{ 
  public static void main(String[] args) 
  { 
      Figura triangulo = new Figura(4,5,7,8);
      System.out.println("el area del triangulo es "+triangulo.area(1));
      System.out.println("el perimetro del triangulo es "+triangulo.perimetro(1));
      Figura rectangulo = new Figura(5,6);
      System.out.println("el area del rectangulo es "+rectangulo.area(2));
      System.out.println("el perimetro del rectangulo es "+rectangulo.perimetro(2));
      Figura circulo = new Figura(7);
      System.out.println("el area del circulo es "+circulo.area(3));
      System.out.println("el perimetro del circulo es "+circulo.perimetro(3));
  }
}