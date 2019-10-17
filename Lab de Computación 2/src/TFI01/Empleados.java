package TFI01;

public class Empleados extends Personas {

    private double sueldo;
    private String nombre;
    private int edad;

    public Empleados(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Empleados(){}

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "Empleado "+this.nombre+", EDAD: "+this.edad;
    }
}
