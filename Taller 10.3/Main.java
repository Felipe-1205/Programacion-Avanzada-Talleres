public class Main 
{ 
  public static void main(String[] args) 
  { 
    SportCar car = new SportCar();
    car.setMarca("Nissan");
    car.setModelo("GT-R");
    car.setMotor("V6 doble turbo de 3.8 litros VR38DETT");
    car.setTipoaleron("ala");
    System.out.println(car.toString());
  }
}