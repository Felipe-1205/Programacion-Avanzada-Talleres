public class Main 
{ 
  public static void main(String[] args) 
  { 
    Estudiante s = new Estudiante();
    s.setEdad(17);
    s.setID(1031);
    s.setNombre("Andres Marroquin");
    s.setPromedio(4);

    System.out.println(s.toString());
    
  }
}