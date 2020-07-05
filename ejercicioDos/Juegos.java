package ejercicioDos;

import java.util.ArrayList;

public class Juegos {
	private String edicion;
	private int year;
	private ArrayList<Carrera> l_carreras;
	private ArrayList<Atleta> l_atletas;
	
	Juegos(){
		this.edicion = "Undefined";
		this.year = 99999;
		this.l_carreras = new ArrayList<Carrera>();
		this .l_atletas = new ArrayList<Atleta>();
	}
	
	Juegos(String edicion, int year){
		this.l_carreras = new ArrayList<Carrera>();
		this.l_atletas = new ArrayList<Atleta>();
		this.edicion = edicion;
		this.year = year;
	}
	
	public void anotarAtletaEnCarrera(Atleta atl, Disciplina disc) {
		boolean success = false;
		// Buscamos la primer carrera disponible que haya en esa disciplina
		Carrera disponible = primerCarreraDisponible(disc);
		if(disponible != null) {
			success = !(disponible.atletaEstaAnotado(atl));
			System.out.println("success es:" + success);
		} else {
			System.out.println("No hay carreras de esa disciplina disponibles por el momento");
		}
		if (success) {
			System.out.println("Anotado");
		} else {
			System.out.println("No se pudo anotar");
		}
	}

	public String getEdicion() {
		return this.edicion;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public ArrayList<Carrera> getL_carreras() {
		return l_carreras;
	}

	public void setL_carreras(ArrayList<Carrera> l_carreras) {
		this.l_carreras = l_carreras;
	}

	public ArrayList<Atleta> getL_atletas() {
		return l_atletas;
	}

	public void setL_atletas(ArrayList<Atleta> l_atletas) {
		this.l_atletas = l_atletas;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	
	public Carrera primerCarreraDisponible(Disciplina disc) {
		Carrera car = null;
		Carrera aux_car = null;
		int index = 0;
		
		while(car == null && index < this.getL_carreras().size()) {
			aux_car = this.getL_carreras().get(index);
			if(aux_car.getDisc() == disc) {
				car = aux_car;
			} else {
				index++;
			}
		}
		return car;
	}
	
	public void agregarNuevaCarrera(Carrera car) {
		this.getL_carreras().add(car);
	}

	public int getCantidadAtletas() {
		int cant;
		cant = this.l_atletas.size();
		return cant;
	}
}
