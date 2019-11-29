package TFI02;

public class Profesor extends Persona{

    private double basico;
    private int antiguedad;
    private String nombre;
    private int legajo;

    public Profesor(int legajo, String nombre, double basico, int antiguedad){
        super(legajo, nombre);
        this.antiguedad = antiguedad;
        this.basico = basico;
    }

    public double getBasico() {
        return basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        this.basico = ((basico+basico*0.1)*antiguedad);
        return basico;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
        "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                '}';
    }

    @Override
    public void modificarDatos() {

    }
}
