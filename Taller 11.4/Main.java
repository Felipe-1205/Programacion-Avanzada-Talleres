public class Main 
{ 
  public static void main(String[] args) 
  { 
    Area[] figuras = new Area[13];
    for (int i = 0; i < figuras.length; i++) {
      figuras[i]=new Area();
    }
    System.out.println(figuras[0].AreaRectangulo(23,34));
    System.out.println(figuras[0].AreaRectangulo(41,67));
    System.out.println(figuras[0].AreaRectangulo(12,4));
    System.out.println(figuras[0].AreaRectangulo(23,7));
    System.out.println(figuras[0].AreaCuadrado(25));
    System.out.println(figuras[0].AreaCuadrado(62));
    System.out.println(figuras[0].AreaCuadrado(25));
    System.out.println(figuras[0].AreaCuadrado(26));
    System.out.println(figuras[0].AreaCirculo(4));
    System.out.println(figuras[0].AreaCirculo(9));
    System.out.println(figuras[0].AreaCirculo(51));
    System.out.println(figuras[0].AreaCirculo(35));
    System.out.println(figuras[0].AreaCirculo(17));
    
  }
}