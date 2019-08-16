package trabajoPr�ctico2;

import java.util.Scanner;

public class MediaPosicionesPares {
	
	/*Ejercicio 2: Media en posiciones pares del Array
    En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por consola. 
    Los n�meros se almacenar�n en un array y el programa calcular� la media de los n�meros 
    introducidos en las posiciones pares del array. (Debes utilizar el operador m�dulo �%�).*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteros[]= new int[10];
		int pares = 0;
		int media = 0;
		
		System.out.println("Por favor, ingrese los n�meros enteros:");
		
		Scanner input = new Scanner(System.in);		
		
		//bucle que toma los datos ingresados por el usuario y los almacena en el array
		for(int i=0; i<10; i++){					
			System.out.println("Ingrese el n�mero para la posici�n "+i+":");
			enteros[i] = input.nextInt();
		}
		input.close();
		
		//�ste bucle recorre el array y eval�a los datos que se almacenar�n en las variables
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
