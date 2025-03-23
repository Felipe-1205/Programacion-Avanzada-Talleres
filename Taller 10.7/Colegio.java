public class Colegio {
    private String nombre;
    private String metodo;
    private int topnacional;

    Colegio(String w,String x,int y)
    {
        nombre=w;
        metodo=x;
        topnacional=y;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTopnacional(int topnacional) {
        this.topnacional = topnacional;
    }
    public int getTopnacional() {
        return topnacional;
    }
    public String getMetodo() {
        return metodo;
    }
    public String getNombre() {
        return nombre;
    }
}