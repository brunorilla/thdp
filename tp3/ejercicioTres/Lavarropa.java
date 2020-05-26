package tp3.ejercicioTres;

public class Lavarropa extends Producto {
	private double carga_max;
	private TipLavador tipo;
	
	public Lavarropa() {
		super();
		this.carga_max = 999999;
		this.tipo = TipLavador.AUTO;
	}
	
	public Lavarropa(String marca, String modelo, int n_serie, double voltaje, boolean estado, double precio, double carga_max, TipLavador tipo) {
		super(marca, modelo, n_serie, voltaje, estado, precio);
		this.carga_max = carga_max;
		this.tipo = tipo;
	}

	public double getCarga_max() {
		return carga_max;
	}
	public void setCarga_max(double carga_max) {
		this.carga_max = carga_max;
	}
	public TipLavador getTipo() {
		return tipo;
	}
	public void setTipo(TipLavador tipo) {
		this.tipo = tipo;
	}
	
	
}
