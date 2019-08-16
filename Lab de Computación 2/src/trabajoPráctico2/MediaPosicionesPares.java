package trabajoPráctico2;

import java.util.Scanner;

public class MediaPosicionesPares {
	
	/*Ejercicio 2: Media en posiciones pares del Array
    En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
    Los números se almacenarán en un array y el programa calculará la media de los números 
    introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteros[]= new int[10];
		int pares = 0;
		int media = 0;
		
		System.out.println("Por favor, ingrese los números enteros:");
		
		Scanner input = new Scanner(System.in);		
		
		//bucle que toma los datos ingresados por el usuario y los almacena en el array
		for(int i=0; i<10; i++){					
			System.out.println("Ingrese el número para la posición "+i+":");
			enteros[i] = input.nextInt();
		}
		input.close();
		
		//éste bucle recorre el array y evalúa los datos que se almacenarán en las variables
		for(int i=0; i<enteros.length; i++){		
			if(i%2 == 0 && i != 0){
				pares++;
				media = media + enteros[i];					
			}
		}		
		//mostrar los resultados por consola
		System.out.print("La media de las posiciones pares del arreglo es: " + media/pares);
	}


}
