public class Main 
{ 
  public static void main(String[] args) 
  { 
    Legislador pers =new Senador("Jaimito",34,"cundinamarca");
    System.out.println(pers.getCamaraEnQueTrabaja());
    pers = new RepresentanteCamara("Pepito", 56, "Guajira");
    System.out.println(pers.getCamaraEnQueTrabaja());
  }
}