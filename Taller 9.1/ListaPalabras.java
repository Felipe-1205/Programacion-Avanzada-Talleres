import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ListaPalabras{ 
  public static void main(String[] args) throws ClassNotFoundException, IOException
  { 
    try 
    {
      Scanner input = new Scanner(new File("palabras.txt")); 
      String frase=input.nextLine();
      input.close();
      frase=frase.toLowerCase();
      String[] palabras = frase.split(" ");
      Arrays.sort(palabras);
      int i=0,cont=1;
      File f = new File("palabras.obj");
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      while(palabras[i]!=null)
      {
        if(palabras[i].equals(palabras[i+1]))
        {
          cont++;
        }
        else
        {
          oos.writeObject(new Palabra(palabras[i],cont));
          cont=1;
        }
        i++;
      }
      oos.close();
    } 
    catch (Exception ex) 
    { 
      ex.printStackTrace(); 
    }
    ObjectInputStream ois=null;
    Palabra mayor=new Palabra("ninguna",0);
    try 
    {
      File f = new File("palabras.obj");  
      FileInputStream fis = new FileInputStream(f);
      ois = new ObjectInputStream(fis);
     do
      {
        Palabra p = (Palabra) ois.readObject();
        System.out.println("************************************");
        System.out.println("Palabra: "+p.getNombrePalabra());
        System.out.println("Repeticiones: "+p.getCantidadveces());
        if(mayor.getCantidadveces()<p.getCantidadveces())
        {
          mayor.setCantidadveces(p.getCantidadveces());
          mayor.setNombrePalabra(p.getNombrePalabra());
        }
      }
      while(true);
    }
    catch (IOException ex ) 
    { 
      System.out.println("************************************");
    }
    finally
    {
      ois.close();
    }
    System.out.println("La palabra mas repetida es:");
    System.out.println("Palabra: "+mayor.getNombrePalabra());
    System.out.println("Repeticiones: "+mayor.getCantidadveces());
    System.out.println("************************************");
  }
}
