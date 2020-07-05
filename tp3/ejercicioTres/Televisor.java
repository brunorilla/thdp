package tp3.ejercicioTres;

public class Televisor extends Producto {

	private double dimension;
	private boolean smart;

	public Televisor() {
		super();
		this.dimension = 0.0;
		this.smart = false;
	}

	public Televisor(String marca, String modelo, int n_serie, double voltaje, boolean estado, double precio, double dimension, boolean smart) {
		super(marca, modelo, n_serie, voltaje, estado, precio);
		this.dimension = dimension;
		this.smart = smart;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
