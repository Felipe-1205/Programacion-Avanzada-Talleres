public class Main 
{ 
  public static void main(String[] args) 
  { 
    Tree arb = new Tree("Pino",false,4);
    Flower flow = new Flower("Margarita", "Blanco", "obalados");

    System.out.println("El arbol "+arb.getNombre()+" tiene una altura de "+arb.getTamaño()+" metros tiene frutas para reclectar?: "+arb.getFrutas());
    System.out.println("La flor "+flow.getNombre()+" de color "+flow.getColor()+" tiene uno petalos "+flow.getPetalos());
  }
}