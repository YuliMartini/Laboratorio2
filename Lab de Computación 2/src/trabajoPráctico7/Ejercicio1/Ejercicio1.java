package trabajoPr�ctico7.Ejercicio1;

import java.util.Scanner;
/*
Crea un programa que pida al usuario introducir un n�mero. El programa debe devolver un mensaje
especificando si el n�mero introducido por el usuario es par o impar.
Adem�s, el programa debe controlar la excepci�n si el usuario introduce texto en lugar de un
valor num�rico. En caso de introducir texto, se debe advertir al usuario que
�El valor introducido no es num�rico. El programa se cerrar�, terminando la ejecuci�n del
programa sin hacer nada m�s.*/

public class Ejercicio1 {	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("TRABAJO PR�CTICO N� 7: EJERCICIO 1 ");
		System.out.println("----------------------------------");
		
		try {
			System.out.println("Ingrese un n�mero: ");
			int numero = entrada.nextInt();
			
			if (numero % 2 == 0){				
				System.out.print("El n�mero es PAR");
				} else {
				System.out.println("El n�mero es IMPAR");
				}
			
		} catch (Exception InputMismatchException) {
			
			System.out.println("El valor introducido no es num�rico. El programa se cerrar�.");
			
		}
	}
}
