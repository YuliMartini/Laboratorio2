package trabajoPráctico7.Ejercicio1;

import java.util.Scanner;
/*
Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje
especificando si el número introducido por el usuario es par o impar.
Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un
valor numérico. En caso de introducir texto, se debe advertir al usuario que
“El valor introducido no es numérico. El programa se cerrará”, terminando la ejecución del
programa sin hacer nada más.*/

public class Ejercicio1 {	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("TRABAJO PRÁCTICO N° 7: EJERCICIO 1 ");
		System.out.println("----------------------------------");
		
		try {
			System.out.println("Ingrese un número: ");
			int numero = entrada.nextInt();
			
			if (numero % 2 == 0){				
				System.out.print("El número es PAR");
				} else {
				System.out.println("El número es IMPAR");
				}
			
		} catch (Exception InputMismatchException) {
			
			System.out.println("El valor introducido no es numérico. El programa se cerrará.");
			
		}
	}
}
