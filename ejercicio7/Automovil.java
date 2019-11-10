package ejercicio7;

import java.util.Scanner;

public class Automovil {
	private String marca;
	private String patente;
	private String modelo;
	private double capacidadTotalCombustible;
	private double cantidadCombustible;
	private double kmPorLitro;
	
	private Scanner input = new Scanner(System.in);
	
	Automovil(String marca, String modelo, String patente){
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}
	
	public char validarChar() {
		char rta = input.nextLine().charAt(0);
		while(rta != 'S' && rta != 'N') {
			mostrar("Ingrese 'S' o 'N'");
			rta = input.nextLine().charAt(0);
		}
		return rta;
		
	}
	
	public void mostrar(String msg) {
		System.out.println(msg);
	}
	
	public boolean viajar(double km) {
		boolean answer = false;
		double gastoPorViaje = km * (1 / getKmPorLitro());;
		double capacidadActual = getCantidadCombustible() * getKmPorLitro();
		if (capacidadActual > km) {
			setCantidadCombustible(getCantidadCombustible() - gastoPorViaje);
			answer = true;
		} else if (capacidadActual < km && capacidadActual > 0) {
			System.out.println("Su capacidad le permite realizar un viaje de " + capacidadActual + "km \n"
					+ "Le estarían sobrando  " + (km - capacidadActual)  +"km \n"
					+ "¿Desea realizar el viaje y cargar en el camino? S/N");
			char respuesta = validarChar();
			if (respuesta == 'S') {
				setCantidadCombustible(getCantidadCombustible() - gastoPorViaje);
				answer = true;
			}
		} else if (capacidadActual == km) {
			setCantidadCombustible(0);
			mostrar("Tiene la cantidad justa de combustible para realizar este viaje. Recuerde repostar");
			answer = true;
		} else {
			mostrar("La cantidad de combustible es: " + getCantidadCombustible() + " No tiene capacidad para viajar. Reposte inmediatamente");
		}
		return answer;
		
	}
	
	private boolean verificarCantidadCombustible(double litros) {
		boolean answer = false;
		char rta;
		double resto = getCapacidadTotalCombustible() - getCantidadCombustible();
		if ((litros < getCapacidadTotalCombustible() && litros < resto) || (litros == getCapacidadTotalCombustible() && litros == resto)) {
			answer = true;
		} else if ( litros > getCapacidadTotalCombustible()) {
			System.out.println("Usted quiere cargar " +  litros + "l. pero sólo hay espacio para cargar " + resto +
					"\n ¿Desea cargar solamente " + resto + "l ?");
			rta = validarChar();
			if (rta == 'S') {
				answer = true;
			}
		} else {
			mostrar("No hay espacio para cargar combustible");
		}
		return answer;
	}
	
	public boolean cargarCombustible(double litros) {
		boolean answer = false;
		boolean respuesta = this.verificarCantidadCombustible(litros);
		if (respuesta) {
			double resto = getCapacidadTotalCombustible() - getCantidadCombustible();
			if (litros <= resto) {
				setCantidadCombustible(litros);
				
			} else if (litros > resto) {
				mostrar("Sólo hay espacio para cargar " + resto + ". Se cargará esa cantidad.");
				setCantidadCombustible(resto);
			}
			answer = true;
		}
		return answer;
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", patente=" + patente + ", modelo=" + modelo
				+ ", capacidadTotalCombustible=" + capacidadTotalCombustible + ", cantidadCombustible="
				+ cantidadCombustible + ", kmPorLitro=" + kmPorLitro +"]";
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCapacidadTotalCombustible() {
		return capacidadTotalCombustible;
	}
	public void setCapacidadTotalCombustible(double capacidadTotalCombustible) {
		if (capacidadTotalCombustible < 0) {
			this.capacidadTotalCombustible = 0;
		} else {
		this.capacidadTotalCombustible = capacidadTotalCombustible;
		}
	}
	public double getCantidadCombustible() {
		return cantidadCombustible;
	}
	public void setCantidadCombustible(double cantidadCombustible) {
		if (cantidadCombustible < 0) {
			this.cantidadCombustible = 0;
		} else {
			this.cantidadCombustible = cantidadCombustible;
		}
	}
	public double getKmPorLitro() {
		return kmPorLitro;
	}
	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	
	
}
