package recorrerPila;

import java.util.Stack;

public class Garage {

	private Stack<Auto> lugares;

	public Garage() {
		// TODO Auto-generated constructor stub
		this.lugares = new Stack<Auto>();
	}

	public void recorrerAutos() {
		Stack<Auto> pila_aux = new Stack<Auto>();
		Auto auto_aux;
		System.out.println("Primer elemento del stack:" + getLugares().peek().getMarca());
		while (!getLugares().isEmpty()) {
			auto_aux = getLugares().pop();
			System.out.println(auto_aux.getMarca());
			pila_aux.push(auto_aux);
		}
		System.out.println("Terminé primer while");
		while (!pila_aux.isEmpty()) {
			auto_aux = pila_aux.pop();
			System.out.println(auto_aux.getMarca());
			getLugares().push(auto_aux);
		}
		System.out.println("Terminé segundo while");
		System.out.println("Primer elemento del stack después de agregado todo:" + getLugares().peek().getMarca());
	}

	public Auto encontrarAuto(String a_encontrar) {
		Auto encontrado = null;
		Stack<Auto> pila_aux = new Stack<Auto>();
		Auto auto_aux;
		while (encontrado == null && !getLugares().isEmpty()) {
			auto_aux = getLugares().pop();
			if (auto_aux.getMarca().equals(a_encontrar)) {
				encontrado = auto_aux;
			}
			;
			pila_aux.push(auto_aux);
		}
		while (!pila_aux.isEmpty()) {
			auto_aux = pila_aux.pop();
			getLugares().push(auto_aux);
		}
		return encontrado;
	}

	public Auto sacarAuto(String a_encontrar) {
		Auto encontrado = null;
		Stack<Auto> pila_aux = new Stack<Auto>();
		Auto auto_aux;
		while (encontrado == null && !getLugares().isEmpty()) {
			auto_aux = getLugares().pop();
			if (auto_aux.getMarca().equals(a_encontrar)) {
				encontrado = auto_aux;
			}
			;
			pila_aux.push(auto_aux);
		}
		while (!pila_aux.isEmpty()) {

			auto_aux = pila_aux.pop();
			if (!auto_aux.getMarca().equals(encontrado.getMarca())) {
				getLugares().push(auto_aux);
			}
		}
		return encontrado;
	}

	public Stack<Auto> getLugares() {
		return lugares;
	}

	public void setLugares(Auto auto) {
		this.getLugares().push(auto);
	}

}
