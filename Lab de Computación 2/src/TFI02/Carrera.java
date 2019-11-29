package TFI02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Carrera implements Informacion, Comparable<Materia> {

    private String nombre;
    Set<Materia> coleccionDeMaterias;

    public Carrera(String nombre, Set<Materia> coleccionDeMaterias) {
        this.nombre = nombre;
        this.coleccionDeMaterias = coleccionDeMaterias;
    }

    public void agregarMateria(Materia materia) {
        coleccionDeMaterias.add(materia);
        System.out.println(materia.toString()+" agregada correctamente.");
    }

    public void eliminarMateria(String nombre) {
        Iterator<Materia> iterador = coleccionDeMaterias.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " eliminada.");
            }
        }
    }

    public void encontrarMateria(String nombre){
        for (Materia materia : coleccionDeMaterias) {
            if(materia.getNombre().equals(nombre)) {
                System.out.println(materia.toString() + " encontrada.");
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int verCantidad() {
        int cont = 0;
        for(Materia materias:coleccionDeMaterias){
            cont++;
        }
        return cont;
    }

    @Override
    public void listarContenidos() {

        TreeSet<Materia> ordenarMaterias = new TreeSet<Materia>();

        for(Materia materias:coleccionDeMaterias){
            ordenarMaterias.add(materias);
        }
        for (Materia materias : ordenarMaterias) {
            System.out.println(materias.toString());
        }
    }

    @Override
    public int compareTo(Materia materia) {
        if(this.nombre.length() < materia.getNombre().length()) return -1;
        if(this.nombre.length() > materia.getNombre().length()) return 1;
        else return 0;
    }
}
