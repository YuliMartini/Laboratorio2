package trabajoPr�ctico7.Ejercicio2;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un n�mero entre 1 y 100.
 * Si el usuario introduce un n�mero fuera de ese rango el programa lanzar� una excepci�n propia.
 * El mensaje de la excepci�n ser� �El n� est� fuera de rango�.*/

public class Exception {
	
	public static void pedirDatos() throws NumFueraDeRango {
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Ingrese un n�mero del 1 al 100: ");
        int numero = entrada.nextInt();

        if(numero < 1 || numero > 100) {
        	throw new NumFueraDeRango("El n�mero est� fuera de rango.");
        } else {
        	System.out.println("�N�mero correcto!");
        }
	}
}
