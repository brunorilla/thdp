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
				System.out.println("Sólo puedo correr " + capacidad + " metros");
				metrosCorridos = capacidad;
			} else if (metros < capacidad) {
				System.out.println("Voy a correr los " + metros  + " metros");
				metrosCorridos = metros;
			} else {
				System.out.println("Llego justo. Después voy a descansar. Voy a correr los " + metros + " metros");
				metrosCorridos = metros;
				
			}
			setEnergia(getEnergia() - gastoDelViaje);
		} else {
			System.out.println("No tengo energía para correr");
		}
		return metrosCorridos;
	}
	
	public boolean alcanzar(Raton raton, int metros) {
		boolean answer = false;
		if(this.getEnergia() > 0) {
			if (raton.correr(metros) >= this.correr(metros)) {
				System.out.println("No pude alcanzar al ratón");
	
			} else {
				System.out.println("Alcancé y me comí al ratón");
				answer = true;
			}
		} else {
			System.out.println("No tengo energía para correr. Estoy matado.");
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
