package trabajoPr�ctico1;
//Deben realizar un programa que pida al usuario el nombre y su edad, y le informe si es mayor de 18 a�os o menor
//con un mensaje por consola que diga: "Fulanito es mayor de edad" o "Fulanito es menor de edad"
//Esta operaci�n se repetir� indefinidamente hasta que el usuario ingrese el n�mero 0 en edad.

import javax.swing.*;

public class EntradaySalidaJOptionPane {
	
	public static void main (String[] args) {
		
			
		String nombre;			
		int edad;
			
		do{
			nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
			
			edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
			
			if(edad >= 18) {
				
			System.out.println(nombre + " es mayor de edad");
			
		   }else {
			   
			System.out.println(nombre + " es menor de edad");
			
		   }	
			
		}while(edad !=0);
	}
}
