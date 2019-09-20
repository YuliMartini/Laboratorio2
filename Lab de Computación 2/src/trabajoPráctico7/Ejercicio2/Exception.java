package trabajoPráctico7.Ejercicio2;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un número entre 1 y 100.
 * Si el usuario introduce un número fuera de ese rango el programa lanzará una excepción propia.
 * El mensaje de la excepción será “El nº está fuera de rango”.*/

public class Exception {
	
	public static void pedirDatos() throws NumFueraDeRango {
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Ingrese un número del 1 al 100: ");
        int numero = entrada.nextInt();

        if(numero < 1 || numero > 100) {
        	throw new NumFueraDeRango("El número está fuera de rango.");
        } else {
        	System.out.println("¡Número correcto!");
        }
	}
}
