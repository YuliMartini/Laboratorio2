package trabajoPráctico4;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
				
		/*CuentaCorriente cuenta1 = new CuentaCorriente("Giuliana Martini", 1500.0 );		
		cuenta1.getInfo();
		cuenta1.getSaldo();*/
		
		System.out.print("Cantidad de cuentas a ingresar: ");
		Scanner input = new Scanner(System.in);
		int cantidad = input.nextInt();		
		
		CuentaCorriente cuentas [] = new CuentaCorriente [cantidad];
		
		CuentaCorriente.cargarCuentas(cuentas);
		
		CuentaCorriente.listarCuentas(cuentas);
		
		input.close();


	}

}
