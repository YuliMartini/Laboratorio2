package trabajoPráctico7.Ejercicio3;

import java.util.Scanner;

/*Crea un programa que pida al usuario introducir un número.
 * El programa debe devolver un mensaje especificando si el número introducido por el usuario es par o impar.
 * Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un valor numérico
 * y debe pedir que ingrese nuevamente el número. Esta acción se repetirá hasta que el usuario ingrese un número.
 * El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.*/

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("TRABAJO PRÁCTICO N° 7: EJERCICIO 3 ");
		System.out.println("----------------------------------");
		
		do {
			
			try {
				
				flag = true;				
				System.out.println("Ingrese un número: ");
				int numero = input.nextInt();
				
				if (numero % 2 == 0){				
					System.out.println("El número es PAR.");
				} else {
					System.out.println("El número es IMPAR.");
				}

			} catch (Exception InputMismatchException) {
				
				System.out.println("El valor ingresado no es numérico.");
				flag = false;
				input.nextLine();
				
			}
			
		} while(flag == false);
	}
}
