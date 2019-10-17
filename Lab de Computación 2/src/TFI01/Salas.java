package TFI01;

public class Salas {

    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Espectadores[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        if(espectadores.length > capacidad){
            System.out.println("La cantidad de espectadores supera la capacidad de la sala.");
        }else {
            this.espectadores = espectadores;
        }
    }

    @Override
    public String toString() {
        return "Sala "+this.nombre+", capacidad: "+this.capacidad;
    }
}
