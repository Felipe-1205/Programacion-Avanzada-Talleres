import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;

public class Main 
{ 
  public static void main(String[] args) throws ClassNotFoundException, IOException
  { 
    ObjectInputStream ois;
    Empleado[] p=new Empleado[200];
    try 
    {
      File f = new File("directorio.obj");  
      FileInputStream fis = new FileInputStream(f);
      ois = new ObjectInputStream(fis);
      int i=0;
      while(true)
      {
        p[i]= (Empleado) ois.readObject();
        i++;
      }
    }
    catch(EOFException e)
    {
      if(p[0]==null)
      {
        p[0] = new Empleado(1,"Andres","Marroquin","3005524519");
        System.out.println("No se encontraron datos asi que se creo un usuario de base");
      }
      else
      {
        System.out.println("Datos leidos");
      }
    }
    catch(IOException e)
    {}
    
    try
    {
      int opcion;
      do
      {
        System.out.println("========================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Buscar contacto");
        System.out.println("2. Editar contacto");
        System.out.println("3. Agregar contacto");
        System.out.println("4. Imprimir todos lo contactos");
        System.out.println("5. Guardar y salir");
        System.out.println("ingrese una opcion");
        opcion = sc.nextInt();
        if(opcion==1)
        {
          try
          {
          int opcion2;
          do
          {
            System.out.println("========================================================================");
            Scanner in = new Scanner(System.in);
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por paellido");
            System.out.println("3. Buscar por id");
            System.out.println("4. Salir");
            System.out.println("ingrese una opcion");
            opcion2 = in.nextInt();
            System.out.println("========================================================================");
            if(opcion2==1)
            {
              try 
              {
                Scanner in2 = new Scanner(System.in);
                System.out.println("ingrese el nombre con el que desea buscar");
                String buscarn = in2.nextLine();
                int i=0;
                while(p[i]!=null)
                {
                  if(buscarn.equals(p[i].getNombres()))
                  {
                    System.out.println("El telefono de "+p[i].getNombres()+" es: "+p[i].getTelefono());
                    break;
                  }
                  i++;
                }
                if(p[i]==null)
                {
                  System.out.println("No se encontro nada con este nombre se le redireccionara al anterior menu");
                }
              } 
              catch (Exception e) 
              {
                e.printStackTrace();
              }
            }
            else if(opcion2==2)
            {
              try
              {
                Scanner in2 = new Scanner(System.in);
                System.out.println("ingrese el apellido con el que desea buscar");
                String buscara = in2.nextLine();
                int i=0;
                while(p[i]!=null)
                {
                  if(buscara.equals(p[i].getApellidos()))
                  {
                    System.out.println("El telefono de "+p[i].getApellidos()+" es: "+p[i].getTelefono());
                    break;
                  }
                  i++;
                }
                if(p[i]==null)
                {
                  System.out.println("No se encontro nada con este apellido se le redireccionara al anterior menu");
                }
              }
              catch (Exception e) 
              {
                e.printStackTrace();
              }
            }
            else if(opcion2==3)
            {
              try
              {
              Scanner in2 = new Scanner(System.in);
              System.out.println("ingrese el id con el que desea buscar");
              int buscarid = in2.nextInt();
              int i=0;
              while(p[i]!=null)
              {
                if(buscarid==p[i].getId())
                {
                  System.out.println("El telefono de "+p[i].getId()+" es: "+p[i].getTelefono());
                  break;
                }
                i++;
              }
              if(p[i]==null)
              {
                System.out.println("No se encontro nada con este ID se le redireccionara al anterior menu");
              }
            }
            catch (Exception e) 
            {
              e.printStackTrace();
            }
            }
            else if(opcion2==4)
            {
              System.out.println("Volviendo al menu principal");
            }
            else
            {
              System.out.println("Porfavor elija una opcion correcta");
            }
          }
          while(opcion2!=4);
        }
      catch (Exception e) 
      {
        e.printStackTrace();
      }
        }
        else if (opcion==2)
        {
          try
          {
            System.out.println("========================================================================");
          Scanner in2 = new Scanner(System.in);
          System.out.println("ingrese el id del usuario que desea editar");
          int idb = in2.nextInt();
          int i=0;
          while(p[i]!=null)
          {
            if(idb==p[i].getId())
            {
              System.out.println("========================================================================");
              Scanner in = new Scanner(System.in);
              System.out.println("Que deseas modificar");
              System.out.println("1. Nombre");
              System.out.println("2. Apelldio");
              System.out.println("3. Telefono");
              System.out.println("4. Cancelar");
              int opcion2 = in.nextInt();
              System.out.println("========================================================================");
              if(opcion2==1)
              {
                Scanner in3 = new Scanner(System.in);
                System.out.println("ingrese el Nombre nuevo");
                String temp = in3.nextLine();
                p[i].setNombres(temp);
              }
              else if(opcion2==2)
              {
                Scanner in3 = new Scanner(System.in);
                System.out.println("ingrese el Apellido nuevo");
                String temp = in3.nextLine();
                p[i].setApellidos(temp);
              }
              else if(opcion2==3)
              {
                Scanner in3 = new Scanner(System.in);
                System.out.println("ingrese el Telefono nuevo");
                String temp = in3.nextLine();
                p[i].setTelefono(temp);
              }
              else if(opcion2==4)
              {
                System.out.println("Volviendo al menu principal");
                break;
              }
            }
            i++;
          }
          if(p[i]==null)
          {
            System.out.println("No se encontro nada con este id");
          }
        }
        catch (Exception e) 
        {
          e.printStackTrace();
        }
        }
        else if (opcion==3)
        {
          try{
          int i=0;
          while(true)
          {
            if(p[i]==null)
            {
              System.out.println("========================================================================");
              Scanner in2 = new Scanner(System.in);
              System.out.println("Ingrese los nombres");
              String ntemp = in2.nextLine();
              Scanner in3 = new Scanner(System.in);
              System.out.println("Ingrese los apellidos");
              String atemp = in3.nextLine();
              Scanner in4 = new Scanner(System.in);
              System.out.println("Ingrese el numero");
              String ttemp = in4.nextLine();
              p[i]= new Empleado((p[i-1].getId()+1), ntemp, atemp, ttemp);
              System.out.println("el id de su contacto es: "+p[i].getId());
              break;
            }
            i++;
          }
        }
        catch (Exception e) 
        {
          e.printStackTrace();
        }
        }
        else if(opcion==4)
        {
          try
          {
            int i=0;
            System.out.println("========================================================================");
            System.out.println("ID\tNombres\t\t\tApellidos\t\t\tTelefono");
            System.out.println("========================================================================");
            while(p[i]!=null)
            {
              System.out.println(p[i].getId()+"\t"+p[i].getNombres()+"\t\t\t"+p[i].getApellidos()+"\t\t\t"+p[i].getTelefono());
              i++;
            }
          }
          catch (Exception e) 
          {
            e.printStackTrace();
          }
        }
        else if (opcion==5)
        {
          try 
          {
            File f = new File("directorio.obj");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            int i=0;
            while(p[i]!=null)
            {
              oos.writeObject(p[i]);
              i++;
            }
            oos.close();
          } 
          catch (Exception ex) 
          { 
            ex.printStackTrace(); 
          }
        }
        else
        {
          System.out.println("Porfavor elija una opcion correcta");
        }
      }
      while(opcion!=5);
    }
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  }
}