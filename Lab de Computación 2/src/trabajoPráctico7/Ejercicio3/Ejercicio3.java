package trabajoPr�ctico7.Ejercicio3;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un n�mero.
 * El programa debe devolver un mensaje especificando si el n�mero introducido por el usuario es par o impar.
 * Adem�s, el programa debe controlar la excepci�n si el usuario introduce texto en lugar de un valor num�rico
 * y debe pedir que ingrese nuevamente el n�mero. Esta acci�n se repetir� hasta que el usuario ingrese un n�mero.
 * El programa se cerrar�, terminando la ejecuci�n del programa sin hacer nada m�s.*/

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("TRABAJO PR�CTICO N� 7: EJERCICIO 3 ");
		System.out.println("----------------------------------");
		
		do {
			
			try {
				
				flag = true;				
				System.out.println("Ingrese un n�mero: ");
				int numero = input.nextInt();
				
				if (numero % 2 == 0){				
					System.out.println("El n�mero es PAR.");
				} else {
					System.out.println("El n�mero es IMPAR.");
				}

			} catch (Exception InputMismatchException) {
				
				System.out.println("El valor ingresado no es num�rico.");
				flag = false;
				input.nextLine();
				
			}
			
		} while(flag == false);
	}
}
