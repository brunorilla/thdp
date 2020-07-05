package guarderiaBarcos;

import java.util.LinkedList;
import java.util.Queue;

public class Guarderia implements Estacionamiento {
	private static int CANT_ANILLOS = 6;
	private static int CANT_MAX_EMBARCACIONES = 30;
	private Queue<Anillo> cola_anillos;
	private Queue<Embarcacion> cola_embarcaciones;

	public Guarderia() {
		// TODO Auto-generated constructor stub
		cola_anillos = new LinkedList<Anillo>();
		cola_embarcaciones = new LinkedList<Embarcacion>();
		this.crearAnillos();
	}

	@Override
	public boolean estacionar(Embarcacion e) {
		// TODO Auto-generated method stub
		boolean estacionado = false;
		if (lugaresLibres() > 0) {
			Anillo aux_anillo = getCola_anillos().poll();
			Anillo centinela = new Anillo(-1, -1);
			getCola_anillos().add(centinela);
			while (aux_anillo.getId_anillo() != centinela.getId_anillo()) {
				if (aux_anillo.getCapacidad() > 0 && !estacionado) {
					estacionado = aux_anillo.estacionar(e);
				}
				getCola_anillos().add(aux_anillo);
				aux_anillo = getCola_anillos().poll();
			}

		}

		return estacionado;
	}

	public void setCola_anillos(Queue<Anillo> cola_anillos) {
		this.cola_anillos = cola_anillos;
	}

	@Override
	public Embarcacion retirar(String id) {
		// TODO Auto-generated method stub
		Embarcacion retorno = null;
		Anillo centinela = new Anillo(-1,-1);
		Anillo aux = getCola_anillos().poll();
		getCola_anillos().add(centinela);
		while(aux.getId_anillo() != centinela.getId_anillo()) {
			if(aux.retirar(id).equals(id)) {
				retorno = aux.retirar(id);
			}
			getCola_anillos().add(aux);
			aux = getCola_anillos().poll();
		}
		
		return retorno;
	}

	@Override
	public int lugaresLibres() {
		// TODO Auto-generated method stub
		int contador = 0;
		Anillo centinela = new Anillo(-1, -1);
		Anillo aux = getCola_anillos().poll();
		getCola_anillos().add(centinela);
		while (aux.getId_anillo() != centinela.getId_anillo()) {
			contador += aux.getCapacidad();
			getCola_anillos().add(aux);
			aux = getCola_anillos().poll();
		}
		System.out.println("Estos son los lugares libres" + contador);
		return contador;
	}

	private void crearAnillos() {
		int index = 1;
		while (index <= CANT_ANILLOS) {
			Anillo aux = new Anillo(CANT_MAX_EMBARCACIONES, index);
			getCola_anillos().add(aux);
			index++;
		}
	}

	public Queue<Anillo> getCola_anillos() {
		return cola_anillos;
	}

	public Queue<Embarcacion> getCola_embarcaciones() {
		return cola_embarcaciones;
	}

	public void setCola_embarcaciones(Queue<Embarcacion> cola_embarcaciones) {
		this.cola_embarcaciones = cola_embarcaciones;
	}

	@Override
	public String toString() {
		return "Guarderia [cola_anillos=" + cola_anillos + ", cola_embarcaciones=" + cola_embarcaciones + "]";
	}

	
}
