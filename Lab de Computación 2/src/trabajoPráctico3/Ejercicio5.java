package trabajoPráctico3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int [] array = new int[9];
		Scanner input = new Scanner(System.in);
	       
		System.out.println("EJERCICIO N° 5\n");
		
		//después de ser inicializada, se carga la matriz con la función "random"
		//y simulatáneamente también un arreglo de una dimensión
		System.out.println("Por favor, ingrese los elementos: \n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento " +(i+1)+ "," +(j+1)+ ": ");
				matriz[i][j] = input.nextInt();
				array[(i*3) + j] = matriz[i][j];
			}
		}
		input.close();
		
		//Se muestra por consola la matriz creada
        System.out.println("------------------------------------");
		System.out.println("Matriz Original:\n");	      
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println("");	            
		}
		
		//Se ordena el arreglo de menor a mayor
        Arrays.sort(array);
         //Se revierte el orden del arreglo
        for (int i = 0; i < array.length / 2; i++) {
            //intercambiando los elementos
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
       }

        //Se carga la matriz con el arreglo ordenado de mayor a menor
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = array[(i*3) + j];
            }
        }
				
        System.out.println("------------------------------------");
		System.out.println("Matriz Ordenada de forma descendente:\n");        
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println("");	            
		}
	}
}
