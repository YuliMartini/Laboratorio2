package TFI01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        int cantidad;
        String nombre;
        int edad;
        String silla;
        String fila;

        Salas s01 = new Salas(3, "SALA 01");
        s01.setPelicula("Joker");

        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de espectadores: ");
        cantidad = entrada.nextInt();
        Espectadores[] espectadores = new Espectadores[cantidad];

        try {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese NOMBRE: ");
                nombre = input.next();
                System.out.println("Ingrese EDAD: ");
                edad = input.nextInt();
                System.out.println("Ingrese FILA: ");
                fila = input.next();
                System.out.println("Ingrese SILLA: ");
                silla = input.next();
                espectadores[i] = new Espectadores(nombre, edad, fila, silla);
            }
        } catch (InputMismatchException e){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        }

        s01.setEspectadores(espectadores);
        System.out.println(s01.getEspectadores());

        Acomodadores a01 = new Acomodadores("Juan", 30);
        a01.setSala(s01);
        a01.setSueldo(50000);
        System.out.println(a01.toString());

        Empleados e01 = new Empleados("Maria", 28);
        System.out.println(e01.toString());

    }

}
