package tp3.ejercicioTres;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Casa {
	private ArrayList<Producto> l_prod;
	private ArrayList<Cliente> l_clientes;
	public Scanner input = new Scanner(System.in);

	Casa() {
		this.l_prod = new ArrayList<Producto>();
		this.l_clientes = new ArrayList<Cliente>();

	}

	public void crearProducto() {
		System.out.println("Por favor, seleccione qué tipo de producto quiere agregar \n" + "0 para Heladera \n"
				+ "1 para Lavarropa \n" + "2 para Licuadora \n" + "3 para Televisor \n");
		int tipo;
		do {
			tipo = validarInt();
		} while (tipo < 0 && tipo > 4);

		switch (tipo) {
		case 0:
			System.out.println("Eligió Heladera");
			Producto h = construirProducto();
			this.l_prod.add(h);
			this.mostrarListaProd();
			break;
		case 1:
			System.out.println("Eligió Lavarropa");
			break;
		case 2:
			System.out.println("Eligió Licuadora");
			break;
		case 3:
			System.out.println("Eligió Televisor");
			break;
		}
		input.close();
	}

	public Producto construirProducto() {
		Producto p = null;
		System.out.println("Defina marca");
		String marca = input.nextLine();
		System.out.println("Defina modelo");
		String model = input.nextLine();
		System.out.println("Defina N° Serie");
		int n_serie = validarInt();
		System.out.println("Defina Voltaje");
		double voltaje = validarDouble();
		System.out.println("Defina estado");
		boolean estado = validarBool();
		System.out.println("Defina precio");
		double precio = validarDouble();
		System.out.println("Defina capacidad");
		double capacidad = validarDouble();
		System.out.println("Defina si es nofrost");
		boolean nofrost = validarBool();
		System.out.println("Gracias por ingresar los datos. Nuevo producto agregado");

		p = new Heladera(marca, model, n_serie, voltaje, estado, precio, capacidad, nofrost);

		return p;
	}

	public void mostrarListaProd() {
		for (int i = 0; i < this.l_prod.size(); i++) {
			System.out.println("Producto número " + i);
			System.out.println("Marca: ");
			System.out.println(this.l_prod.get(i).getMarca());
			System.out.println("Modelo: ");
			System.out.println(this.l_prod.get(i).getModelo());
			System.out.println("N ° Serie: ");
			System.out.println(this.l_prod.get(i).getN_serie());
			System.out.println("Estado: ");
			if (this.l_prod.get(i).isEstado()) {
				System.out.println("Encendido");
			} else {
				System.out.println("Apagado");
			}
			System.out.println("Precio: ");			
			System.out.println(this.l_prod.get(i).getPrecio());
			System.out.println("Voltaje: ");
			System.out.println(this.l_prod.get(i).getVoltaje());
		}
	}

	public int validarInt() {
		boolean hayError;
		int value = 0;
		do {
			try {
				System.out.println("Ingrese un número entero");
				value = Integer.parseInt(input.nextLine());
				hayError = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Error en la carga del dato. Asegúrese de ingresar un número entero.");
				hayError = true;
			}
		} while (hayError);
		return value;
	}

	public double validarDouble() {
		boolean hayError;
		double value = 0;
		do {
			try {
				System.out.println("Ingrese un número decimal");
				value = Double.parseDouble(input.nextLine());
				hayError = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Error en la carga del dato. Asegúrese de ingresar un número decimal");
				hayError = true;
			}
		} while (hayError);
		return value;
	}

	public boolean validarBool() {
		boolean hayError;
		boolean value = false;
		String aux = null;
		do {
			try {
				System.out.println("Ingrese 's' para Sí ó 'n' para No.");
				aux = input.nextLine().toLowerCase();
				hayError = false;
			} catch (InputMismatchException ime) {
				System.out.println("Error en la carga del dato");
				hayError = true;
			} catch (Exception e) {
				System.out.println("Exception:");
				System.out.println(e.getClass());
				hayError = true;
			}
		} while (hayError || (!aux.equals("s") && !aux.equals("n")));
		if (aux.equals("s")) {
			value = true;
		}
		return value;
	}

	public ArrayList<Producto> getL_prod() {
		return l_prod;
	}

	public void setL_prod(ArrayList<Producto> l_prod) {
		this.l_prod = l_prod;
	}

	public ArrayList<Cliente> getL_clientes() {
		return l_clientes;
	}

	public void setL_clientes(ArrayList<Cliente> l_clientes) {
		this.l_clientes = l_clientes;
	}

}
