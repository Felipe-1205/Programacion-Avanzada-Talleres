import java.util.*;

public class Main 
{ 
  public static void main(String[] args) 
  { 
    List<Estudiantes> estudiantes =new ArrayList<>();
    int opcion;
    do
    {
      System.out.println("(1) agregar estudiante");
      System.out.println("(2) buscar estudiante pr id");
      System.out.println("(3) modificar un estudiante");
      System.out.println("(4) eliminar estudiante");
      System.out.println("(5) insertar un estudiante en una posición dada");
      System.out.println("(6) Salir");
      System.out.print("Ingrese una opcion: ");
      Scanner in = new Scanner(System.in);
      opcion = in.nextInt();
      if(opcion==1)
      {
        System.out.print("Ingrese el nombre del estudiante: ");
        Scanner in4 = new Scanner(System.in);
        String nombre = in4.nextLine();
        System.out.print("Ingrese el id del estudiante: ");
        Scanner in2 = new Scanner(System.in);
        int id = in2.nextInt();
        System.out.print("Ingrese la nota del estudiante: ");
        Scanner in3 = new Scanner(System.in);
        int nota = in3.nextInt();

        estudiantes.add(new Estudiantes(id,nota,nombre));
        
      }
      else if(opcion==2)
      {
        System.out.print("Ingrese el id del estudiante que quiere buscar: ");
        Scanner in2 = new Scanner(System.in);
        int id = in2.nextInt();
        for (int i = 0; i < estudiantes.size(); i++) 
        {
          if(id==estudiantes.get(i).getId())
          {
            System.out.println("("+estudiantes.get(i).getId()+") "+estudiantes.get(i).getNombre()+" "+estudiantes.get(i).getNota());
            break;
          }
        }
      }
      else if(opcion==3)
      {
        System.out.print("Ingrese el id que desea editar: ");
        Scanner in4 = new Scanner(System.in);
        int idn = in4.nextInt();
        System.out.println("(1) cambiar nomnbre");
        System.out.println("(2) cambiar nota");
        System.out.print("Ingrese una opcion a editar: ");
        Scanner in2 = new Scanner(System.in);
        int opcion2 = in2.nextInt();
        if(opcion2==1)
        {
          System.out.print("Ingrese el nuevo nombre: ");
          Scanner in3 = new Scanner(System.in);
          String nombre = in3.nextLine();
          for (int i = 0; i < estudiantes.size(); i++) 
          {
            if(idn==estudiantes.get(i).getId())
            {
              estudiantes.get(i).setNombre(nombre);
              break;
            }
          }
        }
        else if(opcion2==2)
        {
          System.out.print("Ingrese la nueva nota: ");
          Scanner in3 = new Scanner(System.in);
          int nota = in3.nextInt();
          for (int i = 0; i < estudiantes.size(); i++) 
          {
            if(idn==estudiantes.get(i).getId())
            {
              estudiantes.get(i).setNota(nota);
              break;
            }
          }
        }
        else 
        {
          System.out.println("Se a ingresado un dato erroneo se va a redireccionar al menu");
        }
      }
      else if(opcion==4)
      {
        System.out.print("Ingrese el id del estudiante que quiere eliminar: ");
        Scanner in2 = new Scanner(System.in);
        int id = in2.nextInt();
        for (int i = 0; i < estudiantes.size(); i++) 
        {
          if(id==estudiantes.get(i).getId())
          {
            estudiantes.remove(i);
            break;
          }
        }
      }
      else if(opcion==5)
      {
        System.out.print("Ingrese el nombre del estudiante: ");
        Scanner in4 = new Scanner(System.in);
        String nombre = in4.nextLine();
        System.out.print("Ingrese el id del estudiante: ");
        Scanner in2 = new Scanner(System.in);
        int id = in2.nextInt();
        System.out.print("Ingrese la nota del estudiante: ");
        Scanner in3 = new Scanner(System.in);
        int nota = in3.nextInt();
        System.out.print("Ingrese la posicion en la que desea guardar el estudiante: ");
        Scanner in5 = new Scanner(System.in);
        int lugar = in5.nextInt();

        estudiantes.set(lugar, new Estudiantes(id,nota,nombre));
      }
      else if(opcion==6)
      {
        System.out.println("saliendo del sistema");
      }
      else
      {
        System.out.println("Ingrese un valor apropiado");
      }
    }
    while(opcion!=6);
  }
}