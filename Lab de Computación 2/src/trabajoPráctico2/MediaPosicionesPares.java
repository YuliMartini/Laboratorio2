package trabajoPr�ctico2;

import java.util.Scanner;

public class MediaPosicionesPares {
	
	/*Ejercicio 2: Media en posiciones pares del Array
      En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por consola. 
      Los n�meros se almacenar�n en un array y el programa calcular� la media de los n�meros 
      introducidos en las posiciones pares del array. (Debes utilizar el operador m�dulo �%�).*/

	public static void main(String[] args) {
		
		int enteros[]= new int[10];
		int pares = 0;
		int media = 0;
		
		System.out.println("Por favor, ingrese los n�meros enteros:");
		
		Scanner input = new Scanner(System.in);		
		
		for(int i=0; i<10; i++) {					
			System.out.println("Ingrese el n�mero para la posici�n "+(i+1)+":");
			enteros[i] = input.nextInt();
		}
		input.close();
		
		/*for(int i=0; i<10; i++) {
			System.out.println("Ingrese el n�mero"+i);
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
