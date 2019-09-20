package trabajoPráctico7.Ejercicio2;

/*Crea un programa que pida al usuario introducir un número entre 1 y 100.
 * Si el usuario introduce un número fuera de ese rango el programa lanzará una excepción propia.
 * El mensaje de la excepción será “El nº está fuera de rango”.*/

public class NumFueraDeRango extends RuntimeException{
	
    public NumFueraDeRango() {
    	
    }

    public NumFueraDeRango(String msjError){
    	
        super(msjError);
        
    }

}
