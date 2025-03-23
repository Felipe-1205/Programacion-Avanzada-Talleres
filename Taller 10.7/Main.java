public class Main 
{ 
  public static void main(String[] args) 
  { 
    Universidad uni = new Universidad("Javeriana","virtual",94,47);
    Colegio col = new Colegio("GCRB","alternancia",234);

    System.out.println("El colegio "+col.getNombre()+" que se estudia con el metodo "+col.getMetodo()+" esta en el top "+col.getTopnacional());
    System.out.println("La  univerisidad "+uni.getNombre()+" que se estudia con el metodo "+uni.getMetodo()+" esta en el top "+uni.getTopnacional()+" y tiene un total de "+uni.getCarreras()+" carreras");
    
  }
}