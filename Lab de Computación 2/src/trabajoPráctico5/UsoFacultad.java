package trabajoPráctico5;

/*
INTEGRANTES:
			o	BAEZ MOLINAS, Valeria
			o	BURGOS, Gabriel
			o	MARTINI, Giuliana
			o	SOTELO, Emmanuel
*/

import java.util.Scanner;

public class UsoFacultad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
		boolean salir = false;
		int opcion;

		System.out.print("Ingrese el Nombre de la Facultad: ");
		String nomFacu = entrada.next();
		System.out.print("Ingrese la Cantidad de Estudiantes: ");
		int cantidad = entrada.nextInt();

		Facultad f1 = new Facultad(nomFacu, cantidad);

		Estudiantes estudiantes[] = new Estudiantes[cantidad];
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        while (!salir)
		{
            System.out.println("\n:::::::::::::::::::::::::::::::::\n"+nomFacu+"\n:::::::::::::::::::::::::::::::::");
			System.out.println("1. Agregar Estudiantes");
			System.out.println("2. Listar Estudiantes");
			System.out.println("3. Buscar Estudiante");
			System.out.println("4. Borrar Estudiante");
			System.out.println("5. Modificar Estudiante");
			System.out.println("6. Salir");
            System.out.println(":::::::::::::::::::::::::::::::::");

			System.out.print("Elija una opcion: ");
			opcion = entrada.nextInt();

			switch (opcion)
			{
				case 1:
					f1.AgregarEstudiantes(estudiantes, cantidad);
					break;

				case 2:
					f1.ListarEstudiantes(estudiantes);
					break;

				case 3:
					System.out.print("\nNOMBRE DEL ESTUDIANTE QUE DESEA BUSCAR: ");
					String buscar = input.next();
					f1.BuscarEstudiante(estudiantes, buscar);
					break;

				case 4:
					System.out.print("\nNOMBRE DEL ESTUDIANTE QUE DESEA BORRAR: ");
					String borrar = input.next();
					f1.BorrarEstudiante(estudiantes, borrar);
					break;

				case 5:
					System.out.print("\nNOMBRE DEL ESTUDIANTE QUE DESEA MODIICAR SU PROMEDIO: ");
					String modNom = input.next();
					System.out.print("NUEVO PROMEDIO: ");
					double modProm = input.nextDouble();
					f1.ModificarPromedio(estudiantes, modNom, modProm);
					break;

				case 6:
					salir = true;
					break;

				default:
					System.out.println("\n*** ERROR!: Opción Invalida ***");
					break;
			}
		}
	}
}
