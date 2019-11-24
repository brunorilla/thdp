package ejercicio8;

public class Raton {
	private int energia;
	private static int  CONSUMO_POR_METRO = 2;
	public int correr(int metros) {
		int metrosCorridos = 0;
		if (getEnergia() > 0) {
			int gastoDelViaje = metros *  CONSUMO_POR_METRO;
			int capacidad = getEnergia() / CONSUMO_POR_METRO;
			if (metros > capacidad) {
				System.out.println("Sólo puedo correr " + capacidad + " metros");
				metrosCorridos = capacidad;
			} else if (metros < capacidad) {
				System.out.println("Voy a correr los " + metros  + " metros");
				metrosCorridos = metros;
			} else {
				System.out.println("Llego justo. Después voy a descansar. Voy a correr los " + metros + " metros");
				metrosCorridos = metros;
			}
			setEnergia(getEnergia() - gastoDelViaje);
		} else {
			System.out.println("No tengo energía para correr");
		}
		return metrosCorridos;
	}
	
	public int getEnergia(){
		return energia;
	}
	public void setEnergia(int energia) {
		if (energia <= 0) {
			this.energia = 0;
		} else {
			this.energia = energia;
		}
	}
}
