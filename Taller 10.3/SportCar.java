public class SportCar extends Car{
    private String tipoaleron;
    private String motor;

    public void guardaraleron()
    {
        System.out.println("El aleron quedo guardado");
    }
    public void turbo()
    {
        System.out.println("El carro ah activado el turbo");
    }

    public String toString() {
        return (super.toString()+" tiene un motor de: "+motor+" y un aleron de tipo "+ tipoaleron);
    }

    public void setTipoaleron(String tipoaleron) {
        this.tipoaleron = tipoaleron;
    }
   public void setMotor(String motor) {
       this.motor = motor;
   }
    public String getTipoaleron() {
        return tipoaleron;
    }
    public String getMotor() {
        return motor;
    }
}