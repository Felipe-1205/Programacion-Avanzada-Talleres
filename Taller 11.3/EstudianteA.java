public class EstudianteA extends Calificaciones {
    public double nota1;
    public double nota2;
    public double nota3;

    EstudianteA(double nota1,double nota2,double nota3)
    {
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }

    @Override
    public double getpromedio()
    {
        return((nota1+nota2+nota3)/3);
    }
}
