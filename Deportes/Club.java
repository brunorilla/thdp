package Deportes;

import java.util.ArrayList;

public class Club {
	private ArrayList<Filial> l_filiales;
	
	public Club() {
		this.l_filiales = new ArrayList<Filial>();
	}
	
	public double calcularIngresoManual(int id_filial) {
		double acum;
		acum= 1.1;
		
		return acum;
	}
	
	public Filial getFilialPorId(int id_filial) {
		Filial fil = null;
		for (Filial elemento: this.l_filiales) {
			if (elemento.getId_filial()== id_filial) {
				fil = elemento;
			};
		}
		return fil;
	}

	public ArrayList<Filial> getL_filiales() {
		return l_filiales;
	}

	public void setL_filiales(ArrayList<Filial> l_filiales) {
		this.l_filiales = l_filiales;
	}
}
