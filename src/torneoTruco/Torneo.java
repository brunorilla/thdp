package torneoTruco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Torneo {
	Queue<Jugador> cola_jugadores;
	Queue<Pareja> cola_parejas;
	ArrayList<Mesa> lista_mesas;

	public Torneo() {
		// TODO Auto-generated constructor stub
		this.cola_jugadores = new LinkedList<Jugador>();
		this.cola_parejas = new LinkedList<Pareja>();
		this.lista_mesas = new ArrayList<Mesa>();
	}

	public Queue<Jugador> getCola_jugadores() {
		return cola_jugadores;
	}

	public void setCola_jugadores(Queue<Jugador> cola_jugadores) {
		this.cola_jugadores = cola_jugadores;
	}

	public Queue<Pareja> getCola_parejas() {
		return cola_parejas;
	}

	public void setCola_parejas(Queue<Pareja> cola_parejas) {
		this.cola_parejas = cola_parejas;
	}

	public ArrayList<Mesa> getLista_mesas() {
		return lista_mesas;
	}

	public void setLista_mesas(ArrayList<Mesa> lista_mesas) {
		this.lista_mesas = lista_mesas;
	}

}
