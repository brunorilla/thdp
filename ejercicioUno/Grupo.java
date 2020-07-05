package ejercicioUno;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre, ArrayList<String> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();
	}

	public Grupo(ArrayList<String> integrantes) {
		this.nombre = "sin nombre";
		this.integrantes = integrantes;
	}

	public Grupo() {
		this.nombre = "sin nombre";
		this.integrantes = new ArrayList<String>();
	}

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		int cantidad = 0;
		cantidad = this.integrantes.size();
		return cantidad;
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int value = -1;
		for (String el : this.integrantes) {
			if (el.equals(nombreIntegrante)) {
				value = integrantes.indexOf(nombreIntegrante);
			}
		}
		return value;

	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (this.integrantes != null) {
			String encontrado = null;
			encontrado = this.buscarIntegrante(nombreIntegrante);
			if (encontrado != null && encontrado.equals(nombreIntegrante)) {
				System.out.println("No se puede agregar un integrante ya agregado.");
			} else {
				System.out.println("Agregando nombre integrante");
				this.integrantes.add(nombreIntegrante);
			}
		}
	}

	public String obtenerIntegrante(int posicion) {
		posicion += -1;
		String integrante = null;
		integrante = this.integrantes.get(posicion);
		System.out.println(integrante);
		return integrante;
	}

	public String buscarIntegrante(String nombre) {
		String value = null;
		for (String el : this.integrantes) {
			if (el.equals(nombre)) {
				value = nombre;
			}
		}
		if (value == null) {
			System.out.println("buscarIntegrante retorna null");
		}
		return value;
	}

	public String removerIntegrante(String nombreIntegrante) {
		String intg = null;
		int index = 0;
		index = this.obtenerPosicionIntegrante(nombreIntegrante);
		System.out.println("Obtener posicion integrante" + this.obtenerPosicionIntegrante(nombreIntegrante));
		if (index > -1) {
			this.integrantes.remove(index);
			intg = nombreIntegrante;
		}
		return intg;
	}


	private void mostrarIntegrantes() {
		int cantidad = this.getCantidadIntegrantes();
		if (cantidad > 0) {
			System.out.println("La cantidad de integrantes actual es de " + this.getCantidadIntegrantes());
			for (int i = 0; i < this.integrantes.size(); i++) {
				System.out.println("Número de integrante: " + i + " || " + "Nombre del integrante: " + this.integrantes.get(i));
			}
		}

	}

	public void mostrar() {
		
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| \n El nombre del grupo es: " + this.nombre + " \n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		this.mostrarIntegrantes();
	}

	public void vaciar() {
		this.integrantes.removeAll(integrantes);
	}

}
