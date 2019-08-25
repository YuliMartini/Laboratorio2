package trabajoPráctico3;

import java.util.Arrays;

/*Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.
 * Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int [] array = new int[9];
	       
		System.out.println("EJERCICIO N° 4\n");
		//después de ser inicializada, se carga la matriz con la función "random"
		//y simulatáneamente un arreglo de una dimensión
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = (int) (Math.random() * 50);
				array[(i*3) + j] = matriz[i][j];
			}
		}
		
		//Se muestra por consola la matriz creada
        System.out.println("------------------------------------");
		System.out.println("Matriz Original:\n");	      
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println("");
		}
		
		//Se ordena el arreglo
        Arrays.sort(array);

        //Se carga la matriz con el arreglo ordenado
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = array[(i*3) + j];
            }
        }
				
        System.out.println("------------------------------------");
		System.out.println("Matriz Ordenada de forma ascendente:\n");        
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println("");	            
		}
	}
}
