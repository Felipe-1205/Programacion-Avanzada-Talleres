import java.io.File;
import java.util.Scanner;
public class Main 
{ 
  public static void main(String[] args) 
  {
    
    int opcion=0;
    String directiorio;
    File[] coleccion= new File[100];
    do
    {
      try
      {
        System.out.println("========================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.listar");
        System.out.println("2.Obtener archivo");
        System.out.println("3.salir");
        System.out.println("ingrese una opcion");
        opcion = sc.nextInt();
        if(opcion==1)
        {
          try 
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del directorio");
            directiorio=in.nextLine();
            File archivo =new File(directiorio);
            coleccion=archivo.listFiles();
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if(opcion==2)
        {
          try 
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del archivo a comprobar");
            String buscar=in.nextLine();
            int i=0;
            while(coleccion[i]!=null)
            {
              if(buscar.equals(coleccion[i].getName()))
              {
                System.out.println("Ok");
                break;
              }
              i++;
            }
            if(coleccion[i]==null)
                {
                  System.out.println("error al obtener el archivo");
                }
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if(opcion==3)
        {
          try 
          {
            System.out.println("Saliendo del sistema");
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else 
        {
          System.out.println("Ingrese un valor aporpiado");
        }
      }
      catch (Exception e) 
      {
        e.printStackTrace();
      }
    }
    while(opcion!=3);
  }
}