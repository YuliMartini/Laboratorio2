package trabajoPráctico3;

/*Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.
 *Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.*/

public class Ejercicio2 {

	public static void main(String[] args) {
		
       int[][] matriz = new int[3][3];
       
       System.out.println("EJERCICIO N° 2\n");
       //después de ser inicializada, se carga la matriz con la función "random"
       for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = (int) (Math.random() * 10);
            }
        }
       //se muestra por consola la matriz creada
        System.out.println("Forma matricial:");
        
        for (int[] fila : matriz) {
        	for (int elemento : fila) {
                System.out.print(elemento + "\t");
        }
            System.out.println("");
            
        }
    }
}
