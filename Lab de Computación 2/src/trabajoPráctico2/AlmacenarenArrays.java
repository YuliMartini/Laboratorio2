package trabajoPr�ctico2;

import javax.swing.JOptionPane;

public class AlmacenarenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[] = new int [10];
				
		for (int i=0; i < enteros.length; i++) {
			enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero: "));
			while(i % 1 != 0) {
				JOptionPane.showMessageDialog(null, "El n�mero ingresado no es un entero.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
				enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero: "));
			}
		}
		
		for (int entero:enteros) {
			System.out.print(entero);
		}

	}

}
