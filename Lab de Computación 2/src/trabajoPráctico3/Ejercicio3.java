package trabajoPr�ctico3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.
 *El esquema de la matriz ser� el siguiente:
	 * NOMBRE
	 * DNI
	 * EDAD
 *Los datos para rellenar la matriz deben ser proporcionados por el usuario.
 *Una vez que se llene todo el arreglo de arreglos se debe mostrar la informaci�n en la consola de una forma clara.
 *BONUS: ordenar alfab�ticamente el arreglo.*/

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String [][] datos = new String[3][3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("EJERCICIO N� 3\n");
		
		for(int fila = 0; fila < 3; fila++) {
			System.out.println("NOMBRE: ");
			datos[fila][0]=input.next();
			System.out.println("DNI: ");
			datos[fila][1]=input.next();
			System.out.println("EDAD:");
			datos[fila][2]=input.next();
		}		
		input.close();
		
		Arrays.sort(datos, new Comparator<String[]>() {
			@Override
	        //arguments to this method represent the arrays to be sorted   
			public int compare(String[] e1, String[] e2) {
				//get the item ids which are at index 0 of the array
				String item1 = e1[0];
				String item2 = e2[0];
				// sort on item id
				return item1.compareTo(item2);
			}
		});
        System.out.println("---------------------------------");        
        System.out.println("Arreglo ordenado alfab�ticamente:\n");
        System.out.println("---------------------------------");
        for(String fila[]:datos) {
			System.out.println("NOMBRE: "+fila[0]);
			System.out.println("DNI: "+fila[1]);
			System.out.println("EDAD: "+fila[2]);
			System.out.println("---------------------------------");
			
        }
	}
}
