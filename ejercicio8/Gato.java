package ejercicio8;

import java.util.*;

public class Gato {
	private int energia;
	private static int  CONSUMO_POR_METRO = 1;
	public int correr(int metros) {
		int metrosCorridos = 0;
		if (getEnergia() > 0) {
			int gastoDelViaje = metros *  CONSUMO_POR_METRO;
			int capacidad = getEnergia() / CONSUMO_POR_METRO;
			if (metros > capacidad) {
				System.out.println("S�lo puedo correr " + capacidad + " metros");
				metrosCorridos = capacidad;
			} else if (metros < capacidad) {
				System.out.println("Voy a correr los " + metros  + " metros");
				metrosCorridos = metros;
			} else {
				System.out.println("Llego justo. Despu�s voy a descansar. Voy a correr los " + metros + " metros");
				metrosCorridos = metros;
				
			}
			setEnergia(getEnergia() - gastoDelViaje);
		} else {
			System.out.println("No tengo energ�a para correr");
		}
		return metrosCorridos;
	}
	
	public boolean alcanzar(Raton raton, int metros) {
		boolean answer = false;
		if(this.getEnergia() > 0) {
			if (raton.correr(metros) >= this.correr(metros)) {
				System.out.println("No pude alcanzar al rat�n");
	
			} else {
				System.out.println("Alcanc� y me com� al rat�n");
				answer = true;
			}
		} else {
			System.out.println("No tengo energ�a para correr. Estoy matado.");
		}
			return answer;
	}
	
	public int getEnergia(){
		return energia;
	}
	public void setEnergia(int energia) {
		if (energia <= 0) {
			this.energia = 0;
		} else {
			this.energia = energia;
		}
	}
}
