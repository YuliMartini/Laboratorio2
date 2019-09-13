package trabajoPr�ctico6;

/*Ejercicio 01:  Crear Contrase�as
 	* Crear una clase que genera contrase�as aleatorias compuestas por letras may�sculas, min�sculas y n�meros.
 	* Dichas contrase�as ser�n de la longitud que quiera el usuario y dicha longitud se le pedir� por teclado.
 	* Las contrase�as se almacenar�n en un Array cuyo tama�o tambi�n se le pedir� al usuario por teclado.
 	* Por ejemplo, al ejecutar el programa este pedir� al usuario el tama�o del Array (imaginemos que el usuario introduce 4)
 	* y la longitud de las contrase�as (imaginemos que el usuario introduce 7).
 	* El programa deber� generar entonces 4 contrase�as de 7 caracteres cada una.
 	* El programa imprimir� en consola todas las contrase�as generadas,
 	* el n� de caracteres de cada una de ellas y si la contrase�a es segura o d�bil en funci�n de la siguiente condici�n:
 	* Se considerar� contrase�a segura aquella que est� formada por m�s de cinco n�meros, tenga m�s de una letra min�scula
 	* y m�s de dos letras may�sculas.
 	* Se pide que el programa tenga:
 		* Una clase que construya las contrase�as y una clase principal.
 		* La clase que construya las contrase�as deber� tener:
 			* Un constructor (diferente del constructor por defecto)
 			* Dos m�todos getters. Uno devolver� la contrase�a generada y el otro la longitud de la misma.
 			* Un m�todo encargado de generar (construir) la contrase�a.
 			* Un m�todo que eval�e y devuelva si la contrase�a es segura o d�bil en funci�n de las condiciones antes descritas.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CrearContrase�as {

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private boolean usoMinusc;
    private boolean usoMayusc;
    private boolean usoNum;
    private String contrase�a;
    
	//Constructor
    public CrearContrase�as() {
        this.usoMinusc = true;
        this.usoMayusc = true;
        this.usoNum = true;
    }
    
    public String getContrase�a() {
		return contrase�a;
	}

    public CrearContrase�as usoMinusculas(boolean usoMinusculas) {
        this.usoMinusc = usoMinusculas;
        return this;
    }

    public CrearContrase�as usoMayusculas(boolean usoMayusculas) {
        this.usoMayusc = usoMayusculas;
        return this;
    }

    public CrearContrase�as usoNumeros(boolean usoNumeros) {
        this.usoNum = usoNumeros;
        return this;
    }
    
    //m�todo que genera la contrase�a
    public String generar(int longitud) {
        
        if (longitud <= 0) {
            return this.contrase�a = "";
        }
        
        //Variables.
        StringBuilder contrase�a = new StringBuilder(longitud);
        Random random = new Random(System.nanoTime());

        //Toma las categorias a usar
        List<String> charCategorias = new ArrayList<>(3);
        if (usoMinusc) {
            charCategorias.add(MINUSCULAS);
        }
        if (usoMayusc) {
            charCategorias.add(MAYUSCULAS);
        }
        if (usoNum) {
            charCategorias.add(NUMEROS);
        }

        //Crea la contase�a
        for (int i = 0; i < longitud; i++) {
            String charCategory = charCategorias.get(random.nextInt(charCategorias.size()));
            int posicion = random.nextInt(charCategory.length());
            contrase�a.append(charCategory.charAt(posicion));
        }
        return this.contrase�a = new String(contrase�a);
    }
    
    //m�todo para verificar nivel de seguridad de la clave
    public String nivelSeguridad(String clave) {
    	
    	//no funciona a�n    	
    	String nivel = null;
    	String esSeguro = "^(?=.*[a-z]){2,}(?=.*[A-Z]){3,}(?=.*[0-9]){6,}";
    	String esMedio = "^(?=.*[a-z]){1}(?=.*[A-Z]){2}(?=.*[0-9]){3,5}";
    	String esDebil = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])";
    	
       	if (clave.matches(esSeguro)){
    		nivel = "Seguro";
    	} else if (clave.matches(esMedio)){
    		nivel = "Medio";
    	} else if (clave.matches(esDebil)){
    		nivel = "D�bil";
    	}
    	return nivel;
    }
}