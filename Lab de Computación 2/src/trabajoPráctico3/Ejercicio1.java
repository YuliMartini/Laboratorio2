package trabajoPráctico3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/*Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
 *El programa debe imprimir en consola todos los valores almacenados en el array.
 *Utiliza un bucle for-each para leer los valores almacenados.
 *(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
 *BONUS: Verificar que el número no se repita.*/

public class Ejercicio1 {

	public static void main(String[] args) {		
		
	    System.out.println("EJERCICIO N° 1\n");
	    
	    //Se crea un set, que no permite elementos duplicados, y se lo rellena utilizando la función "random"            
        Set<Integer> numeros = new HashSet<>();
        for(;numeros.size() < 100;) {
            int numero = (int) (Math.random()*100 + 1);
            numeros.add(numero);              
        }
        //se convierte el set a un arreglo
        Integer[] array = numeros.toArray(new Integer[numeros.size()]);
        
        //se desordena el arreglo utilizando "shuffle"
        Collections.shuffle(Arrays.asList(array));
        
        //se muestra el arreglo por consola
        System.out.println("Arreglo de 100 elementos:");
        for (int arreglo : array) {
            System.out.print(arreglo + " ");
            }               
       }
}

