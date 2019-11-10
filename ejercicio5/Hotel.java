package ejercicio5;

import java.util.Scanner;

public class Hotel {
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesDisponibles;
	
	private Scanner input = new Scanner(System.in);
	
	public Hotel() {
		
	}
	
	public Hotel (String nombre, String localidad, int habitacionesTotales, int habitacionesDisponibles ) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.habitacionesTotales = habitacionesTotales;
		this.habitacionesDisponibles = habitacionesDisponibles;
	}
	
	public void mostrar(String msg) {
		System.out.println(msg);
	}
	
	public char validarChar() {
		char rta = input.nextLine().charAt(0);
		while(rta != 'S' && rta != 'N') {
			mostrar("Ingrese 'S' o 'N'");
			rta = input.nextLine().charAt(0);
		}
		return rta;
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}
	public void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
	}
	public int getHabitacionesDisponibles() {
		return habitacionesDisponibles;
	}
	public void setHabitacionesDisponibles(int habitacionesDisponibles) {
		if (habitacionesDisponibles <= getHabitacionesTotales()) {
			this.habitacionesDisponibles = habitacionesDisponibles;
		} else {
			mostrar("El número de habitaciones es " + getHabitacionesTotales() + "\n"
					+  "Cargue un número de habitaciones menor o igual al de las habitaciones totales.");
		}
		
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habitacionesTotales=" + habitacionesTotales
				+ ", habitacionesDisponibles=" + habitacionesDisponibles + "]";
	}
	
	
	public boolean ocuparHabitaciones(int cantidad) {
		boolean answer = false;
		int aux;
		if( getHabitacionesDisponibles() != 0) {
			if(cantidad < getHabitacionesDisponibles()) {
				aux = getHabitacionesDisponibles() - cantidad;
				setHabitacionesDisponibles(aux);
				answer = true;
			} else if (cantidad > getHabitacionesDisponibles()) {
				int resto = cantidad - getHabitacionesDisponibles();
				int a_ocupar = getHabitacionesDisponibles();
				char respuesta;
				mostrar("Usted quiere ocupar " + cantidad + " habitaciones. "+"La cantidad de habitaciones a ocupar supera la disponibilidad actual." + "\n"
				+ "Actualmente hay " + getHabitacionesDisponibles() + " habitaciones disponibles. \n "
				+ "Si desea ocupar esa cantidad de habitaciones le estarían sobrando " + resto + " habitaciones para ocupar. \n"
				+ "¿Desea proceder? Presione 'S'. Si desea cancelar y no ocupar ninguna habitación, presione 'N'")	;
				respuesta = validarChar();
				if(respuesta == 'S') {
					aux = getHabitacionesDisponibles() - a_ocupar;
					setHabitacionesDisponibles(aux);
					answer = true;
				} 
			} else if (cantidad == getHabitacionesDisponibles()) {
				mostrar("De las " + getHabitacionesTotales() + " del hotel. quedan  " + getHabitacionesDisponibles()  + "habitaciones");
				setHabitacionesDisponibles(0);
				answer = true;
			} 
		} else {
			System.out.println("No hay habitaciones disponibles para ocupar");
		}
			return answer;
	}
	
	public boolean desocuparHabitaciones(int cantidad) {
		boolean answer = false;
		int hab_ocupadas, aux;
		hab_ocupadas = getHabitacionesTotales() - getHabitacionesDisponibles();
		if (cantidad < hab_ocupadas) {
			aux = getHabitacionesDisponibles() + cantidad;
			setHabitacionesDisponibles(aux);
		} else if (cantidad > hab_ocupadas) {
			char rta;
			mostrar("Sólo hay " + hab_ocupadas + "\n" + 
					"¿Desea desocupar las " + hab_ocupadas + "\n"
					+ "Presione 'S' para desocuparlas o 'N' para terminar");
			rta = validarChar();
			if (rta == 'S') {
				aux = getHabitacionesDisponibles() + cantidad;
				setHabitacionesDisponibles(rta);
				answer = true;
			} 
			
		} else {
			aux = getHabitacionesTotales();
			setHabitacionesDisponibles(aux);
			answer = true;
		}
		
		return answer;
	}
	
	
}
