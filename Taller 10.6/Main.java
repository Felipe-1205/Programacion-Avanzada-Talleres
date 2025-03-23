public class Main 
{ 
  public static void main(String[] args) 
  { 

    TV tv = new TV("Samsung","HD Smart tv","1366 x 768",32);
    System.out.println("El Tv "+tv.getMarca()+" "+tv.getModelo()+" Tiene una resolucion de "+tv.getResolucion()+" y un tamaño de "+tv.getTamaño()+" pulgadas");

  }
}