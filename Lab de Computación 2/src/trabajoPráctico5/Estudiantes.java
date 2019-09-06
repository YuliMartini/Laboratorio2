package trabajoPráctico5;

/*/*Ejercicio 01: La Facultad
Crear un programa que conste de tres clases:
  *UsoFacultad: Clase principal
  *Facultad, con los siguientes métodos
      Constructor con nombre del colegio y cantidad máxima de estudiantes.
      Agregar estudiantes a la Facultad. 
      Listar todos los estudiantes que se encuentran en ella. 
      Buscar un estudiante por medio de su nombre. 
      Cada vez que se cree un estudiantes para la Facultad este tendrá un número de estudiantes asignado,
      que debe ser consecutivo y no repetitivo. 
      Borrar Estudiantes.
      Modificar la nota media de un Estudiante, ingresando su nombre y la nueva nota media.
  *Estudiantes, con los siguientes métodos y características
      Constructor con nombre de estudiante, nro de estudiante y nota media. 
      Los Estudiantes deberán asistir a una Facultad, por lo que debe existir un método que exprese dicha relación.*/
/*
INTEGRANTES:
			o	BAEZ MOLINAS, Valeria
			o	BURGOS, Gabriel
			o	MARTINI, Giuliana
			o	SOTELO, Emmanuel
*/

public class Estudiantes {
	
	private String nombre;
	private int nroEst;
	private double promedio;
	
	public Estudiantes(String nombre, int nroEst, double promedio)
	{
		this.nombre = nombre;
		this.nroEst = nroEst;
		this.promedio = promedio;
	}
	
	public Estudiantes(String nombre){ this.nombre = nombre; }

	public String getNombre() {
		return nombre;
	}

	public int getNroEst() {
		return nroEst;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	public String getInfo()
	{
    	return ("\n============================="+
    			"\nNumero de identificacion: "+ nroEst +
    			"\nNombre: " + nombre +
    		  	"\nPromedio: " + promedio) +
				"\n=============================";
	}
}
