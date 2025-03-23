public class Main 
{ 
    public static void main(String[] args) 
  { 
      Perros dog1 = new Perros("Max","Poodle");
      dog1.SetTomoAgua(12);
      System.out.println(dog1.nombre+" tomo agua a las "+dog1.GetTomoAgua()+" horas");
      Perros dog2 = new Perros("Canela","Bulldog");
      dog2.SetTomoAgua(13);
      System.out.println(dog2.nombre+" tomo agua a las "+dog2.GetTomoAgua()+" horas");
      PaseadorPerro paseador =new PaseadorPerro();
      System.out.println("puede "+paseador.paseador+" pasear a "+dog1.nombre+"?: "+paseador.Pasear(dog1));
      System.out.println("puede "+paseador.paseador+" pasear a "+dog2.nombre+"?: "+paseador.Pasear(dog2));
  }
}