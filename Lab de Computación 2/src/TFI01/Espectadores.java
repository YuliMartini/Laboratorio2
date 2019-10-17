package TFI01;

public class Espectadores extends Personas {

    private String nombre;
    private int edad;
    private String fila;
    private String silla;

    public Espectadores(String nombre, int edad, String fila, String silla){
        this.nombre = nombre;
        this.edad = edad;
        this.fila = fila;
        this.silla = silla;
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return "Espectador "+this.nombre+", EDAD: "+this.edad+", BUTACA: "+this.fila+this.silla;
    }

    public String getButaca(){
        return "Butaca: "+this.fila+this.silla;
    }
}
