package trabajoPr�ctico7.Ejercicio2;

/*Crea un programa que pida al usuario introducir un n�mero entre 1 y 100.
 * Si el usuario introduce un n�mero fuera de ese rango el programa lanzar� una excepci�n propia.
 * El mensaje de la excepci�n ser� �El n� est� fuera de rango�.*/

public class NumFueraDeRango extends RuntimeException{
	
    public NumFueraDeRango() {
    	
    }

    public NumFueraDeRango(String msjError){
    	
        super(msjError);
        
    }

}
