import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main 
{ 
  public static void main(String[] args) 
  { 
    Scanner in =new Scanner(System.in);
    System.out.println("Ingrese los nombres de los archivos separados por espacios en blanco:");
    String s = in.nextLine();
    String[] archivos = s.split(" ");
    String linea="";
    int i=0;
    int temp=0;
    try
    {
      while(archivos[i]!="")
      {
        try 
        {
          Scanner input = new Scanner(new File(archivos[i]));
          while (input.hasNextLine()) 
          {
            input.nextLine();
            temp++;
          }
          linea=linea+temp+" ";
          input.close();
        } 
        catch (FileNotFoundException ex) 
        {
          linea=linea+"File-not-found ";
        }
        finally
        {
          temp=0;
          i++;
        }
      }
    }
    catch (Exception ex) 
    {
    }
    String[] lineas =linea.split(" ");
    i=0;
    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.println("┃Nombre Archivo\t┃\tLineas");
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    try
    {
      while(archivos[i]!=null)
      {
        System.out.println("┃"+archivos[i]+"\t┃\t"+lineas[i]);
        i++;
      }
    }
    catch (Exception ex) 
    {
    }
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    in.close();
  }
}