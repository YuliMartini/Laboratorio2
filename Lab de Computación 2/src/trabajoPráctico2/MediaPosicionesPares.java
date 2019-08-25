package trabajoPráctico2;

import java.util.Scanner;

public class MediaPosicionesPares {
	
	/*Ejercicio 2: Media en posiciones pares del Array
      En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
      Los números se almacenarán en un array y el programa calculará la media de los números 
      introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).*/

	public static void main(String[] args) {
		
		int enteros[]= new int[10];
		int pares = 0;
		int media = 0;
		
		System.out.println("Por favor, ingrese los números enteros:");
		
		Scanner input = new Scanner(System.in);		
		
		for(int i=0; i<10; i++) {					
			System.out.println("Ingrese el número para la posición "+(i+1)+":");
			enteros[i] = input.nextInt();
		}
		input.close();
		
		/*for(int i=0; i<10; i++) {
			System.out.println("Ingrese el número"+i);
			enteros[i] = input.nextInt();
		}*/
		
		for (int entero:enteros) {
			if(i%2 == 0 && i != 0) {
				pares++;
				media = media + enteros[i];					
			}
		}
		
		/*for(int i=0; i<enteros.length; i++) {		
			if(i%2 == 0 && i != 0) {
				pares++;
				media = media + enteros[i];					
			}
		}*/
				
		System.out.print("La media de las posiciones pares del array es: "+media/pares);
	}
	
}
