public class Main 
{ 
  public static void main(String[] args) 
  { 
    Estudiante est = new Estudiante("Andres","1234",4);
    Profesor prof = new Profesor("Juan", "abcd", "Intrdocuccion a la programacion");

    System.out.println("El profesor "+prof.getUser()+" dicta la materia "+prof.getAsignatura());
    System.out.println("El estudiante "+est.getUser()+" tiene un primedio "+est.getPromedio());
    
  }
}