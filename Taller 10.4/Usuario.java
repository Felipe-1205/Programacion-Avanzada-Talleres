public class Usuario {
    private String user;
    private String contraseña;

    Usuario(String x,String y)
    {
        user=x;
        contraseña=y;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getUser() {
        return user;
    }

    
}
