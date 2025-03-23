public class Universidad extends Colegio {
    private int carreras;

    Universidad(String w,String x,int y,int z)
    {
        super(w,x,y);
        carreras =z;
    }

    public int getCarreras() {
        return carreras;
    }
    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }
}
