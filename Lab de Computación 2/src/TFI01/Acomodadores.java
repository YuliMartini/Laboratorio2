package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores {

    private Salas sala;
    private String nombre;
    private int edad;


    public Acomodadores(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Acomodador "+this.nombre+", EDAD: "+this.edad+", SALA: "+this.sala;
    }

    @Override
    public String getTipo() {
        return "Acomodador";
    }
}
