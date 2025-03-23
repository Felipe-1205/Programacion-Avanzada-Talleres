public class Main 
{ 
  public static void main(String[] args) 
  { 
    Persona persona = new Persona("Ana Maria", 20); 
    persona.ingeniero(persona);
    persona.arquitecto(persona); 
  }
}