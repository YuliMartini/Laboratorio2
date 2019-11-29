package TFI02;

public class Estudiante extends Persona{

    private String nombre;
    private int legajo;

    public Estudiante(int legajo, String nombre) {
        super(legajo, nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getLegajo() {
        return legajo;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
