package ejercicioDos;

import java.util.ArrayList;

public class Carrera {
	private ArrayList<Atleta> l_anotados;
	private Disciplina disc;
	
	Carrera(Disciplina disciplina){
		this.l_anotados = new ArrayList<Atleta>();
		this.disc = disciplina;
	}
	
	Carrera(){
		this.l_anotados = new ArrayList<Atleta>();
		this.disc = null;
	}
	
	public void agregarAtletaAcarrera(Atleta atl) {
		this.getL_anotados().add(atl);
	}
	
	public boolean atletaEstaAnotado(Atleta atl) {
		boolean result = false;
		int index = 0;
		while(result == false && index < this.getL_anotados().size()) {
			if(atl.getDni() == this.getL_anotados().get(index).getDni()) {
				result = true;
				System.out.println("El atleta ya se encuentra anotado.");
			}
		}
		if(!result) {
			this.agregarAtletaAcarrera(atl);
			System.out.println("Atleta correctamente anotado.");
		}
		return result;
	}
	
	
	public ArrayList<Atleta> getL_anotados() {
		return l_anotados;
	}

	public void setL_atletas(ArrayList<Atleta> l_anotados) {
		this.l_anotados = l_anotados;
	}

	public Disciplina getDisc() {
		return disc;
	}

	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	
	

}
