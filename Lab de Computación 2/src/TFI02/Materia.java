package TFI02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Materia implements Informacion, Comparable<Estudiante>{

    private String nombre;
    private String titular;

    Set<Estudiante> coleccionDeEstudiantes;

    public Materia(String nombre, String titular, Set<Estudiante>coleccionDeEstudiantes) {

        this.nombre = nombre;
        this.titular = titular;
        this.coleccionDeEstudiantes = coleccionDeEstudiantes;
    }

    public Materia(String nombre, String titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public void agregarEstudiantes(Estudiante estudiante) {
        coleccionDeEstudiantes.add(estudiante);
        System.out.println(estudiante.toString()+" agregado correctamente.");
    }

    public void eliminarEstudiante(String nombre) {
        Iterator<Estudiante> iterador = coleccionDeEstudiantes.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " eliminado.");
            }
        }
    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }

    @Override
    public int verCantidad() {
        int cont = 0;
        for(Estudiante estudiantes:coleccionDeEstudiantes){
            cont++;
        }
        return cont;
    }

    @Override
    public void listarContenidos() {
        TreeSet<Estudiante> ordenarEstudiantes = new TreeSet<Estudiante>();

        for(Estudiante estudiantes:coleccionDeEstudiantes){
            ordenarEstudiantes.add(estudiantes);
        }
        for (Estudiante estudiantes : ordenarEstudiantes) {
            System.out.println(estudiantes.toString());
        }
    }

    @Override
    public int compareTo(Estudiante estudiante) {
        if(this.nombre.length() < estudiante.getNombre().length()) return -1;
        if(this.nombre.length() > estudiante.getNombre().length()) return 1;
        else return 0;
    }
}
