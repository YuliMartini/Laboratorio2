package TFI02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Facultad implements Informacion, Comparable<Carrera> {

    private String nombre;

    Set<Carrera> coleccionDeCarreras;

    public Facultad(String nombre, Set<Carrera>coleccionDeCarreras) {

        this.nombre = nombre;
        this.coleccionDeCarreras = coleccionDeCarreras;
    }

    public void agregarCarrera(Carrera carrera) {
        coleccionDeCarreras.add(carrera);
        System.out.println(carrera.toString()+" agregada correctamente.");
    }

    public void eliminarCarrera(String nombre) {
        Iterator<Carrera> iterador = coleccionDeCarreras.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println("Carrera "+nombre+ " eliminada.");
            }
        }
    }

    /*public void eliminarEstudiante(Estudiante estudiante, Set<Estudiante> coleccionDeEstudiantes) {
        Iterator<Estudiante> iterador = coleccionDeEstudiantes.iterator();
        while(iterador.hasNext()) {
            estudiante = iterador.next().getNombre();
            if(estudiante.equals(nombre)){
                iterador.remove();
                System.out.println(nombre + " eliminado.");
            }
        }
    }*/

    @Override
    public int verCantidad() {
        int cont = 0;
        for(Carrera carreras:coleccionDeCarreras){
            cont++;
        }
        return cont;
    }

    @Override
    public void listarContenidos() {
        TreeSet<Carrera> ordenarCarreras = new TreeSet<Carrera>();

        for(Carrera carreras:coleccionDeCarreras){
            ordenarCarreras.add(carreras);
        }
        for (Carrera carreras : ordenarCarreras) {
            System.out.println(carreras.toString());
        }
    }

    @Override
    public int compareTo(Carrera carrera) {
        if(this.nombre.length() < carrera.getNombre().length()) return -1;
        if(this.nombre.length() > carrera.getNombre().length()) return 1;
        else return 0;
    }
}
