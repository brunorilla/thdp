package datacenter;

import java.util.Scanner;

public class Test2Par {

	@SuppressWarnings("unused")
	private static final int MIN_CLIENTE = 1;
	@SuppressWarnings("unused")
	private static final int MAX_CLIENTE = 1000;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Instanciación con nombre NULL
		DataCenter datacenter = null;
		String nombre = null;
		try {
			datacenter = crearDataCenter(nombre);
		} catch (NullPointerException npe) {
			System.out.println("El nombre del data center no puede estar vacio ni ser null");
		}

		// Instanciación con String vacío que genera el usuario

		boolean hayError;
		String nombre2 = null;
		System.out.println("Ingrese el nombre del Data Center");
		do {
			try {
				nombre2 = input.nextLine();
				datacenter = crearDataCenter(nombre2);
				hayError = false;
				System.out.println("Data Center creado con el nombre: '" + nombre2 + "'");
			} catch (IllegalArgumentException iae) {
				hayError = true;
				System.out.println("El nombre del data center no puede estar vacio ni ser null");
			}
		} while (hayError);

		if (datacenter != null) {

			Servidor serv1 = new Servidor(1, "Windoor");
			datacenter.addServidor(serv1);

			datacenter.generarDatos();
			// procesamiento
			System.out.println("--Mostrando todas las actividades--");
			datacenter.mostrarActividades();
			System.out.println("--Mostrando los resultados--");
			datacenter.generarResultados();
			System.out.println("--Mostrando las actualizaciones--");
			datacenter.mostrarActualizaciones(1);
		} else
			System.out.println("no se creo el Centro de datos");
		input.close();
	}

	@SuppressWarnings("unused")
	private static int cargarNroDeCliente(Scanner scanner) {
		int codigo = 0;

		return codigo;
	}

	private static DataCenter crearDataCenter(String nombre) {
		DataCenter dc = null;

		dc = new DataCenter(nombre);
		return dc;
	}
}
