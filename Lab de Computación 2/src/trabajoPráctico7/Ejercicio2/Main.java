package trabajoPráctico7.Ejercicio2;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un número entre 1 y 100.
 * Si el usuario introduce un número fuera de ese rango el programa lanzará una excepción propia.
 * El mensaje de la excepción será “El nº está fuera de rango”.*/

import static trabajoPráctico7.Ejercicio2.Exception.pedirDatos;

public class Main {

	public static void main(String[] args){
		
		System.out.println("TRABAJO PRÁCTICO N° 7: EJERCICIO 2 ");
		System.out.println("----------------------------------");
		
		pedirDatos();
		
	}
}