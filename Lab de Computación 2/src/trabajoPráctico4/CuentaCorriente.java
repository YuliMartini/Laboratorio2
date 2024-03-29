package trabajoPr�ctico4;

import java.util.Random;

/*Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes caracter�sticas:
  * Nombre de clase: CuentaCorriente.
  * Propiedades:
    * saldo (double)
    * nombreTitular (String)
    * numeroCuenta (long)
  * Constructor con dos par�metros:
    * nombreTitular (String)
    * saldo (double)
* Este constructor se encargar� de establecer un nombre de titular para la cuenta corriente,
* un saldo inicial y asignar� un n� a la cuenta corriente de tipo long de forma aleatoria
* M�todos:
    * 2 setter: permitir�n hacer ingresos y reintegros en un objeto de tipo CuentaCorriente.
    * 2 getter: Permitir�n obtener saldo de la cuenta y datos generales de una CuentaCorriente.
    * 1 m�todo adicional: permitir� realizar transferencias de dinero de una cuenta a otra.
* Crea una clase principal con el nombre de UsoCuenta.
* Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2.
* Haz una transferencia de Cuenta1 a Cuenta2 por un importe de $200.
* Imprime los datos de las dos cuentas en consola.*/

public class CuentaCorriente {
	
	private String nombre;
    private long nroCuenta;
    private double saldo;

    public CuentaCorriente(String nombre, double saldo) {
        
    	Random rand = new Random();        
    	long nroCuenta = rand.nextInt(1000);                
    	this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }        

	public void getInfo() {    	
    	System.out.println("\nNombre de la cuenta: " + nombre +
    		  "\nN�mero de la cuenta: " + nroCuenta +
    		  "\nSaldo disponible: $" + saldo);
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void ingresar(double valor){
        this.saldo += valor;
    }
    
    public void reintegro(double valor){
        this.saldo += valor;
    }

    public void debitar(double valor){
    	this.saldo -= valor;    
    }
    
    public static void transferencia(CuentaCorriente origen, CuentaCorriente destino, double valor) {
		origen.debitar(valor);
		destino.ingresar(valor);
		System.out.println("\nTransferencia realizada por un monto de $"+ valor);
	}
    
}
