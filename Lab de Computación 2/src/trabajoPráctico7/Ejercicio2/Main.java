package trabajoPr�ctico7.Ejercicio2;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un n�mero entre 1 y 100.
 * Si el usuario introduce un n�mero fuera de ese rango el programa lanzar� una excepci�n propia.
 * El mensaje de la excepci�n ser� �El n� est� fuera de rango�.*/

import static trabajoPr�ctico7.Ejercicio2.Exception.pedirDatos;

public class Main {

	public static void main(String[] args){
		
		System.out.println("TRABAJO PR�CTICO N� 7: EJERCICIO 2 ");
		System.out.println("----------------------------------");
		
		pedirDatos();
		
	}
}