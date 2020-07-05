package guarderiaBarcos;

import java.util.LinkedList;
import java.util.Queue;

public class Anillo implements Estacionamiento {

	private int id_anillo;
	private Queue<Embarcacion> cola_lanchas;
	private int capacidad;

	public Anillo(int capacidad, int id_anillo) {
		// TODO Auto-generated constructor stub
		this.capacidad = capacidad;
		this.setId_anillo(id_anillo);
		this.cola_lanchas = new LinkedList<Embarcacion>();
	}

	@Override
	public boolean estacionar(Embarcacion e) {
		// TODO Auto-generated method stub
		boolean retorno = false;
		if (lugaresLibres() <= getCapacidad()) {
			getCola_lanchas().add(e);
			System.out.println("Lancha estacionada correctamente");
		} else {
			System.out.println("No hay capacidad suficiente");
		}
		return retorno;
	}

	@Override
	public Embarcacion retirar(String id) {
		// TODO Auto-generated method stub
		Embarcacion retorno = null;
		Embarcacion centinela = new Embarcacion("-1");
		if (lugaresLibres() > 0) {
			Embarcacion aux = getCola_lanchas().poll();
			getCola_lanchas().add(centinela);
			while (!aux.getPatente().equals(centinela.getPatente())) {
				if (aux.getPatente().equals(id)) {
					retorno = aux;
				}
				getCola_lanchas().add(aux);
				aux = getCola_lanchas().poll();

			}
		}

		return retorno;

	}

	@Override
	public int lugaresLibres() {
		// TODO Auto-generated method stub
		return getCapacidad() - getCola_lanchas().size();

	}

	public Queue<Embarcacion> getCola_lanchas() {
		return cola_lanchas;
	}

	public void setCola_lanchas(Queue<Embarcacion> cola_lanchas) {
		this.cola_lanchas = cola_lanchas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getId_anillo() {
		return id_anillo;
	}

	public void setId_anillo(int id_anillo) {
		this.id_anillo = id_anillo;
	}

}
