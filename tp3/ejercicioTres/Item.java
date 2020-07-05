package tp3.ejercicioTres;

public class Item {
	
	private Producto prod;
	private int cantidad;
	
	public Item() {
		this.prod = null;
		this.cantidad = 0;
	}
	
	public Item(Producto prod, int cantidad) {
		this.prod = prod;
		this.cantidad = cantidad;
	}
	
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
