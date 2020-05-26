package tp3.ejercicioTres;

public class Licuadora extends Producto {
	
	private double potencia;
	private int cant_vel;
	
	public Licuadora() {
		super();
		this.potencia = 999999;
		this.cant_vel = 99;
	}
	
	public Licuadora(String marca, String modelo, int n_serie, double voltaje, boolean estado, double precio, double potencia, int cant_vel) {
		super(marca, modelo, n_serie, voltaje, estado, precio);
		this.potencia = potencia;
		this.cant_vel = cant_vel;

	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getCant_vel() {
		return cant_vel;
	}

	public void setCant_vel(int cant_vel) {
		this.cant_vel = cant_vel;
	}
	
	
	
}
