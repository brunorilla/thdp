package ejercicioTres;

public abstract class Producto {
	private String marca;
	private String modelo;
	private int n_serie;
	private double voltaje;
	private boolean estado;
	private double precio;

	public Producto() {
		this.marca = "sin marca";
		this.modelo = "sin modelo";
		this.n_serie = 999999;
		this.voltaje = 999999;
		this.estado = false;
		this.precio = 999999.99;
	}

	public Producto(String marca, String modelo, int n_serie, double voltaje, boolean estado, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.n_serie = n_serie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getN_serie() {
		return n_serie;
	}

	public void setN_serie(int n_serie) {
		this.n_serie = n_serie;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
