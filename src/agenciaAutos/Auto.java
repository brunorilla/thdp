package agenciaAutos;

import java.util.UUID;
import java.util.Random;

public class Auto {
	private String pat;
	private int tipo;
	private float precio;
	private Random rand = new Random();
	private float vendedor;
	private float zona;

	Auto(float precio) {
		setPat();
		setTipo(rand.nextInt(3));
		setPrecio((rand.nextInt(10)+1)*10000f);
		setVendedor((float)rand.nextInt(10));
		setZona((float) rand.nextInt(5));

	}

	public String getPat() {
		return pat;
	}

	public void setPat() {
		String randomString = usingUUID();
		randomString = randomString.substring(0, 8).toUpperCase();

		this.pat = randomString;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setZona(float zona) {
		this.zona = zona;
	}
	
	public float getZona() {
		return zona;
	}
	
	
	public float getVendedor() {
		return vendedor;
	}

	public void setVendedor(float vendedor) {
		this.vendedor = vendedor;
	}

	static String usingUUID() {
		UUID randomUUID = UUID.randomUUID();
		return randomUUID.toString().replaceAll("-", "");
	}
	

	@Override
	public String toString() {
		return "Auto [pat=" + pat + ", tipo=" + tipo + ", precio=" + precio + ", vendedor="
				+ vendedor + ", zona=" + zona + "]";
	}

	
}
