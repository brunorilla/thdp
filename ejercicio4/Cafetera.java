package ejercicio4;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public Cafetera(int capacidad_max) {
		this.capacidadMaxima = capacidad_max;
		this.cantidadActual = capacidad_max;
	}
	
	public Cafetera(int capacidad_max, int cantidad_act) {
		this.capacidadMaxima = capacidad_max;
		if(cantidad_act >= capacidad_max) {
			this.cantidadActual = capacidad_max;
		} else {
			this.cantidadActual = cantidad_act;
		}		
	}
	

	public String servirTaza(int cantidad) {
		String answer = null;
		int resto = this.getCantidadActual() - cantidad;

		if (cantidad > this.getCantidadActual()){
			answer  = "No alcanza para servir una taza, se sirvieron " +  this.getCantidadActual() +"ml"; 
			this.setCantidadActual(0);
		} else if (cantidad == this.getCantidadActual()) {
			answer = "Alcanzó justo para servir una taza";
			this.setCantidadActual(0);
		} else if (cantidad < this.getCantidadActual()) {
			answer = "Se sirvió una taza y quedan " + resto + "ml";
			this.setCantidadActual(resto);
		}
		return answer;
	
	}
	
	public void vaciarCafetera() {
		this.setCantidadActual(0);
	}
	
	public void agregarCafe(int cantidad) {
		String answer = null;
		int capacidadActual = this.getCapacidadMaxima() - this.getCantidadActual();
		int nueva_cantidad, a_agregar;
		
		if(capacidadActual == 0) {
			answer = "Cafetera llena. No se puede agregar más café";
		} else { 
			if (capacidadActual < cantidad) {
				int sobrante = cantidad - capacidadActual;
				a_agregar = cantidad - sobrante;
				nueva_cantidad = this.getCantidadActual() + a_agregar;
				answer = "Se han agregado " + a_agregar + "ml. La cafetera ahora está llena y le sobran " + sobrante + "ml de la cantidad que quiso agregar";
			} else {
				nueva_cantidad = this.getCantidadActual() + cantidad;
				answer = "Se han agregado " + cantidad + "ml. La cantidad de Café actual de la cafetera es " + nueva_cantidad + "ml";
			}
			this.setCantidadActual(nueva_cantidad);
		}
		System.out.println(answer);
	}
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
}
