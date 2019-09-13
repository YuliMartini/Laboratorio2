package trabajoPráctico6;

/*Ejercicio 01:  Crear Contraseñas
 	* Crear una clase que genera contraseñas aleatorias compuestas por letras mayúsculas, minúsculas y números.
 	* Dichas contraseñas serán de la longitud que quiera el usuario y dicha longitud se le pedirá por teclado.
 	* Las contraseñas se almacenarán en un Array cuyo tamaño también se le pedirá al usuario por teclado.
 	* Por ejemplo, al ejecutar el programa este pedirá al usuario el tamaño del Array (imaginemos que el usuario introduce 4)
 	* y la longitud de las contraseñas (imaginemos que el usuario introduce 7).
 	* El programa deberá generar entonces 4 contraseñas de 7 caracteres cada una.
 	* El programa imprimirá en consola todas las contraseñas generadas,
 	* el nº de caracteres de cada una de ellas y si la contraseña es segura o débil en función de la siguiente condición:
 	* Se considerará contraseña segura aquella que esté formada por más de cinco números, tenga más de una letra minúscula
 	* y más de dos letras mayúsculas.
 	* Se pide que el programa tenga:
 		* Una clase que construya las contraseñas y una clase principal.
 		* La clase que construya las contraseñas deberá tener:
 			* Un constructor (diferente del constructor por defecto)
 			* Dos métodos getters. Uno devolverá la contraseña generada y el otro la longitud de la misma.
 			* Un método encargado de generar (construir) la contraseña.
 			* Un método que evalúe y devuelva si la contraseña es segura o débil en función de las condiciones antes descritas.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CrearContraseñas {

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private boolean usoMinusc;
    private boolean usoMayusc;
    private boolean usoNum;
    private String contraseña;
    
	//Constructor
    public CrearContraseñas() {
        this.usoMinusc = true;
        this.usoMayusc = true;
        this.usoNum = true;
    }
    
    public String getContraseña() {
		return contraseña;
	}

    public CrearContraseñas usoMinusculas(boolean usoMinusculas) {
        this.usoMinusc = usoMinusculas;
        return this;
    }

    public CrearContraseñas usoMayusculas(boolean usoMayusculas) {
        this.usoMayusc = usoMayusculas;
        return this;
    }

    public CrearContraseñas usoNumeros(boolean usoNumeros) {
        this.usoNum = usoNumeros;
        return this;
    }
    
    //método que genera la contraseña
    public String generar(int longitud) {
        
        if (longitud <= 0) {
            return this.contraseña = "";
        }
        
        //Variables.
        StringBuilder contraseña = new StringBuilder(longitud);
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

        //Crea la contaseña
        for (int i = 0; i < longitud; i++) {
            String charCategory = charCategorias.get(random.nextInt(charCategorias.size()));
            int posicion = random.nextInt(charCategory.length());
            contraseña.append(charCategory.charAt(posicion));
        }
        return this.contraseña = new String(contraseña);
    }
    
    //método para verificar nivel de seguridad de la clave
    public String nivelSeguridad(String clave) {
    	
    	//no funciona aún    	
    	String nivel = null;
    	String esSeguro = "^(?=.*[a-z]){2,}(?=.*[A-Z]){3,}(?=.*[0-9]){6,}";
    	String esMedio = "^(?=.*[a-z]){1}(?=.*[A-Z]){2}(?=.*[0-9]){3,5}";
    	String esDebil = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])";
    	
       	if (clave.matches(esSeguro)){
    		nivel = "Seguro";
    	} else if (clave.matches(esMedio)){
    		nivel = "Medio";
    	} else if (clave.matches(esDebil)){
    		nivel = "Débil";
    	}
    	return nivel;
    }
}