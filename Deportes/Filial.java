package Deportes;

import java.util.ArrayList;
import java.util.Random;

public class Filial {
	private String barrio;

	ArrayList<Deporte> l_deportes;
	ArrayList<Socio> l_socios;
	private int id_filial;
	
	public Filial() {
		Random r1 = new Random();
		int id_filial = r1.nextInt(20);
		this.id_filial = id_filial;
	}
	
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public ArrayList<Deporte> getL_deportes() {
		return l_deportes;
	}
	public void setL_deportes(ArrayList<Deporte> l_deportes) {
		this.l_deportes = l_deportes;
	}
	public ArrayList<Socio> getL_socios() {
		return l_socios;
	}
	public void setL_socios(ArrayList<Socio> l_socios) {
		this.l_socios = l_socios;
	}
	public int getId_filial() {
		return id_filial;
	}
	public void setId_filial(int id_filial) {
		this.id_filial = id_filial;
	}
	
	
}
