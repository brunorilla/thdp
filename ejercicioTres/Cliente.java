package ejercicioTres;

public class Cliente extends Persona {
	private Carrito carrito;
	
	public Cliente(){
		super();
		this.setCarrito(new Carrito());
	}
	
	public Cliente(String nombre, int dni, Carrito carrito){
		super(nombre, dni);
		this.setCarrito(carrito);
		
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
}
