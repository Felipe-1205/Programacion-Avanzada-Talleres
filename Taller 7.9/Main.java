public class Main 
{ 
    public static void main(String[] args) 
  { 
      Calculadora cal1= new Calculadora();
      Calculadora cal2= new Calculadora(4.5,5);

      System.out.println(cal2.suma());
      System.out.println(cal2.resta());
      System.out.println(cal2.multiplicacion());
      System.out.println(cal2.division());
      cal1.setx(3);
      cal1.sety(5.7);
      System.out.println(cal1.suma());
      System.out.println(cal1.resta());
      System.out.println(cal1.multiplicacion());
      System.out.println(cal1.division());
      System.out.println(cal1.suma(6.7,89));
      System.out.println(cal1.resta(45,7.8));
      System.out.println(cal1.multiplicacion(5,9.12));
      System.out.println(cal1.division(50,0.5));
      

  }
}