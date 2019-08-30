package trabajoPráctico4;

import java.util.Scanner;

/*Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
 * Nombre de clase: CuentaCorriente.
 * Propiedades:
   * saldo (double)
   * nombreTitular (String)
   * numeroCuenta (long)
 * Constructor con dos parámetros:
   * nombreTitular (String)
   * saldo (double)
* Este constructor se encargará de establecer un nombre de titular para la cuenta corriente,
* un saldo inicial y asignará un nº a la cuenta corriente de tipo long de forma aleatoria
* Métodos:
   * 2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo CuentaCorriente.
   * 2 getter: Permitirán obtener saldo de la cuenta y datos generales de una CuentaCorriente.
   * 1 método adicional: permitirá realizar transferencias de dinero de una cuenta a otra.
* Crea una clase principal con el nombre de UsoCuenta.
* Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2.
* Haz una transferencia de Cuenta1 a Cuenta2 por un importe de $200.
* Imprime los datos de las dos cuentas en consola.*/

public class UsoCuenta {

	public static void main(String[] args) {
				
		CuentaCorriente cuenta1 = new CuentaCorriente("Giuliana Martini", 1500.0 );
		CuentaCorriente cuenta2 = new CuentaCorriente("Celeste Martini", 1800.0 );
		
		System.out.println("TRABAJO PRÁCTICO N° 4");
		
		cuenta1.getInfo();
		cuenta2.getInfo();
				
		CuentaCorriente.transferencia(cuenta1, cuenta2, 200);
		
		cuenta1.getInfo();
		cuenta2.getInfo();
		
	}

}
