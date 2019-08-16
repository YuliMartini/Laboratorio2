package trabajoPráctico2;

import java.util.Scanner;

public class AlmacenarenArrays {
	
/*Ejercicio 1: Almacenar en Array
Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
Los números introducidos se almacenarán en un array. 
El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.*/

	public static void main(String[] args) {
				
		int enteros[] = new int [10];
		int positivos = 0; 
		int negativos = 0;
		int ceros = 0;
			
		//mensaje que se muestra en cosola
		System.out.println("Por favor, ingrese los números enteros:");
		Scanner input = new Scanner(System.in);
		
		//bucle que toma los datos ingresados por el usuario y los almacena en el array
		for(int i=0; i<10; i++) {					
			System.out.println("Ingrese el número para la posición "+(i+1)+":");
			enteros[i] = input.nextInt();
		}
		input.close();
		
		//éste bucle recorre el array y evalúa los datos que se almacenarán en las variables
		for (int entero:enteros) {
			if(entero > 0) {
				positivos++;
			}else if(entero < 0) {
				negativos++;
			}else {
				ceros++;
			}
		}
		//mostrar los resultados por consola
		System.out.print("Ha ingresado una cantidad de "+ceros+ " ceros, "+ positivos+" números positivos y "+negativos+" números negativos");
	}
		
}


