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

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("TRABAJO PRACTICO N� 6\n");
		System.out.println("---------------------\n");
		
		System.out.println("Ingrese la cantidad de contrase�as que desea crear: ");
		int cantidad = input.nextInt();
		
		System.out.println("Ingrese la longitud que desea: ");
		int longitud = input.nextInt();
		
		CrearContrase�as [] passwords = new CrearContrase�as[cantidad];
		
		for(int i = 0; i < passwords.length; i++) {
			CrearContrase�as passwordGenerator = new CrearContrase�as();
			String contrase�a = passwordGenerator.generar(longitud);
			System.out.println("- Contrase�a "+(i+1)+": "+contrase�a+" - Nivel de seguridad: "+passwordGenerator.nivelSeguridad(contrase�a));
		}
		
	}

}
