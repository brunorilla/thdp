package tp3.ejercicioTres;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Item> l_items;
	private double p_total;
	
	
	public Carrito() {
		this.l_items = new ArrayList<Item>();
		this.p_total = 9999.99;
	}
	
	public Carrito(ArrayList<Item> l_items, double p_total) {
		this.l_items = l_items;
		this.p_total = p_total;
	}
	
	public ArrayList<Item> getL_items() {
		return l_items;
	}
	
	public void setL_items(ArrayList<Item> l_items) {
		this.l_items = l_items;
	}
	
	public double getP_total() {
		return p_total;
	}
	
	public void setP_total(double p_total) {
		this.p_total = p_total;
	}
	
	
}
