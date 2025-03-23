public class Persona implements Ingeniero, Arquitecto {
    private String Nombre;
    private int edad;

    Persona(String nombre,int edad)
    {
        this.Nombre=nombre;
        this.edad=edad;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return Nombre;
    }
    
    @Override
    public void programar()
    {
        System.out.println("Programando ando");
    }
    @Override
    public void construir()
    {
        System.out.println("Construyendo");
    }
    public void ingeniero(Ingeniero ingeniero) { 
        ingeniero.programar();
    } 
    
    public void arquitecto(Arquitecto arquitecto) { 
        arquitecto.construir();
    } 
    
}
