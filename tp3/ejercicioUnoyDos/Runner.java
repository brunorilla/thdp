package tp3.ejercicioUnoyDos;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			 * RESPUESTA AL EJERCICIO 1 Asalariado prueba = new Asalariado("Jose", 30,
			 * 10000f); Subcontratado prueba2 = new Subcontratado("Carlos", 23, 50, 100);
			 * 
			 * System.out.println(prueba.getClass().getSimpleName() + " " +
			 * prueba.getNombre() + " gana: " + prueba.calcularPago());
			 * System.out.println(prueba2.getClass().getSimpleName() + " " +
			 * prueba2.getNombre() + " gana: " + prueba2.calcularPago());
			 */

			/* RESPUESTA AL EJERCICIO 2 */

			ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
			Vendedor vendedor1 = new Vendedor("Pedro", 25, 100, 200, 5);
			Vendedor vendedor2 = new Vendedor("María", 30, 100, 200, 10);

			vendedores.add(vendedor1);
			vendedores.add(vendedor2);

			int index = 1;
			for (Vendedor vend : vendedores) {

				System.out.println(vend.getClass().getSimpleName() + " " + index + " " + vend.getNombre() + " gana:"
						+ vend.calcularPago());
				;
				index++;
			}

			// System.out.println(vend.calcularPago());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
