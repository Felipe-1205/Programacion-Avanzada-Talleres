import java.util.*;

public class Main 
{ 
  public static void main(String[] args) 
  { 
    List<Integer> numeros =new ArrayList<>();
    int numero,suma=0;
    do
    {
      System.out.println("Ingrese el valor que quiere agregar al array (si desea terminar ingrese -999)");
      Scanner in = new Scanner(System.in);
      numero = in.nextInt();
      if(numero!=-999)
      {
        numeros.add(numero);
      }
    }
    while(numero!=-999);
    System.out.println("Los valores ingresados son "+numeros);
    for (int i = 0; i < numeros.size(); i++) 
    {
      suma=suma+numeros.get(i);
    }
    System.out.println("La suma de los valores ingresados es: "+suma);
    System.out.println("El promedio de los valores ingresados es: "+(suma/numeros.size()));
    Collections.sort(numeros);
    int mediana;
    if (numeros.size() % 2 == 0) 
    {
      mediana = (numeros.get((numeros.size() / 2)-1) + numeros.get((numeros.size() / 2))) / 2;
    } else 
    {
      mediana = numeros.get((numeros.size() / 2));
    }
    System.out.println("La mediana de los valores ingresados es "+mediana);
  }
}
