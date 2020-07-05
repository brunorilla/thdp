package tp3.ejercicioTres;

public class Heladera extends Producto {

	private double capacidad;
	private boolean nofrost;
	
	
	
	public Heladera() {
		super();
		this.capacidad = 999999;
		this.nofrost = false;
	}
	
	public Heladera(String marca, String modelo, int n_serie, double voltaje, boolean estado, double precio, double capacidad, boolean nofrost) {
		super(marca, modelo, n_serie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.nofrost = nofrost;
	}
	
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isNofrost() {
		return nofrost;
	}
	public void setNofrost(boolean nofrost) {
		this.nofrost = nofrost;
	}
	
	
	
}
