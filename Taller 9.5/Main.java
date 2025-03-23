import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main 
{ 
  public static void main(String[] args) 
  {
    
    int opcion=0;
    File[] coleccion= new File[100];
    File[] arjav= new File[100];
    do
    {
      try
      {
        System.out.println("========================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.listar");
        System.out.println("2.Obtener archivo");
        System.out.println("3.listar archivos .jav");
        System.out.println("4.leer archivo .jav");
        System.out.println("5.eliminar archivos .jav");
        System.out.println("6. salir");
        System.out.println("ingrese una opcion");
        opcion = sc.nextInt();
        if(opcion==1)
        {
          try 
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del directorio");
            String directiorio=in.nextLine();
            File archivo =new File(directiorio);
            coleccion=archivo.listFiles();

            Scanner in2 = new Scanner(System.in);
            System.out.println("Ingrese el nombre del archivo ,jav donde se almacenara la lista (no colocar el .jav al final)");
            String arch=in2.nextLine();
            arch=arch+".jav";
            File jav =new File(arch);
            jav.createNewFile();

            PrintWriter writer = new PrintWriter(jav, "UTF-8");
            int i=0;
            while(coleccion[i]!=null)
            {
              writer.println(coleccion[i].getName());
              i++;
            }
            writer.close();
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
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del directorio de la carpeta actual");
            String directiorio=in.nextLine();
            File archivo =new File(directiorio);
            arjav=archivo.listFiles();
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if(opcion==4)
        {
          try 
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del Archivo.jav a leer");
            String archivos=in.nextLine();
            Scanner input = new Scanner(new File(archivos));
            while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(line);
            }
          input.close();
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if(opcion==5)
        {
          try 
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Ingrese el nombre del Archivo.jav a borrar");
            String archivos=in.nextLine();
            File archi = new File(archivos);
            archi.delete();
            int i=0;
            while(arjav[i]!=null)
            {
              if(archivos.equals(arjav[i].getName()))
              {
                arjav[i]=null;
                break;
              }
              i++;
            }
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if(opcion==6)
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