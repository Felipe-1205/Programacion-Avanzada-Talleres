public class Main 
{ 
  public static void main(String[] args) 
  { 
    Calificaciones est = new EstudianteA(300,400,500); 
    System.out.println(est.getpromedio()); 
    est = new EstudianteB(250,450,300,150); 
    System.out.println(est.getpromedio()); 
  }
}